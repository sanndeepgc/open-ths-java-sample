package org.openths.javasamples.inheritance.sealed_class;

public sealed interface Status permits SuccessMessage, FailureMessage {
    public String getServerMessage();
}
