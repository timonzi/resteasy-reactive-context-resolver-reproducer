package org.acme;

public class SampleClass {

    private final String myString;

    private final Integer myIntValue;

    public SampleClass(
            final String myString,
            final Integer myIntValue
    ) {
        this.myString = myString;
        this.myIntValue = myIntValue;
    }

    public String getMyString() {
        return myString;
    }

    public Integer getMyIntValue() {
        return myIntValue;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "myString='" + myString + '\'' +
                ", myIntValue=" + myIntValue +
                '}';
    }
}
