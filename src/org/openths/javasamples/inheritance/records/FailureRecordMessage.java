package org.openths.javasamples.inheritance.records;

public record FailureRecordMessage(String data, Exception errorMessage) implements Status {

    @Override
    public String getServerMessage() {
        return errorMessage.getLocalizedMessage();
    }

    @Override
    public String toString() {
        return String.format("Failure: Data = %s , Cause = %s", data, errorMessage.getLocalizedMessage());
    }
}
