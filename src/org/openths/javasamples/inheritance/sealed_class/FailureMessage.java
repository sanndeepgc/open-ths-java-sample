package org.openths.javasamples.inheritance.sealed_class;

public final class FailureMessage implements Status {

    FailureMessage(String data, String message) {
        this.data = data;
        this.ex = new Exception(message);
    }
    private String data;
    private Exception ex;

    @Override
    public String getServerMessage() {
        return "Server found its an exception";
    }

    public String data() {
        return this.data;
    }

    public Exception exception() {
        return this.ex;
    }

    @Override
    public String toString() {
        return String.format("Failure[data=%s, cause=%s]", data, ex.getMessage());
    }
}
