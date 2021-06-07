package ru.toroschin.spring.market.error_handling;

import java.util.List;

public class InvalidDataException extends RuntimeException {
    private List<String> messages;

    public InvalidDataException(List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }
}
