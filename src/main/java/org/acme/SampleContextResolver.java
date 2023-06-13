package org.acme;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ext.ContextResolver;
import jakarta.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
@ApplicationScoped
@Unremovable
public class SampleContextResolver implements ContextResolver<ObjectMapper> {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public ObjectMapper getContext(final Class<?> type) {
        logger.info(">> org.acme.SampleContextResolver.getContext is called");

        final SimpleModule mod = new SimpleModule("My-Module");
        mod.addSerializer(SampleClass.class, new SampleClassSerializer());
        mod.addDeserializer(SampleClass.class, new SampleClassDeserializer());

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(mod);

        return objectMapper;
    }


}
