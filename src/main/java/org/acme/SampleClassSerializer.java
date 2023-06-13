package org.acme;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class SampleClassSerializer extends StdSerializer<SampleClass> {


    protected SampleClassSerializer() {
        super(SampleClass.class);
    }

    @Override
    public void serialize(
            final SampleClass value,
            final JsonGenerator gen,
            final SerializerProvider provider
    ) throws IOException {
        gen.writeString(value.getMyString());
    }
}
