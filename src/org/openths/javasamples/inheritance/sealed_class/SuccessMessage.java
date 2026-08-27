package org.openths.javasamples.inheritance.sealed_class;

public non-sealed class SuccessMessage implements Status {

    private String data;
    private String message;

    public SuccessMessage(String data, String message) {
        this.data = data;
        this.message = message;
    }

    @Override
    public String getServerMessage() {
        return "Server says its successfully processed";
    }

    public String data() {
        return data;
    }

    public String message() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("Success[data=%s, message=%s]", data, message);
    }
}
