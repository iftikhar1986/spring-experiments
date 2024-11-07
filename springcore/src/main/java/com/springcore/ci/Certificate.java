package com.springcore.ci;

public class Certificate {

    private String certificate;

    // Constructor with parameter for dependency injection
    public Certificate(String certificate) {
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Certificate{name='" + certificate + "'}";
    }
}
