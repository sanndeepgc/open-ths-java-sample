package org.openths.javasamples.inheritance.records;

public sealed interface Status permits FailureRecordMessage, SuccessRecordMessage {
    public String getServerMessage();
}
