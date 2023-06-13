package org.acme;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class SampleClassDeserializer extends StdDeserializer<SampleClass> {


    protected SampleClassDeserializer() {
        super(SampleClass.class);
    }

    @Override
    public SampleClass deserialize(
            final JsonParser p,
            final DeserializationContext ctxt
    ) {
        return new SampleClass("new class created by the deserializer", 123);
    }
}
