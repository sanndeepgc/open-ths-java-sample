package org.openths.javasamples.inheritance.records;

public record SuccessRecordMessage(String data, String successMessage) implements Status {
    @Override
    public String getServerMessage() {
        return String.format("Success: Data = %s , Message = %s", data, successMessage);
    }

    @Override
    public String toString() {
        return String.format("Success: Data = %s , Message = %s", data, successMessage);
    }
}
