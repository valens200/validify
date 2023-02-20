package org.example.exceptions;

public class EmptyParameterException extends RuntimeException {
    public EmptyParameterException(String message){
        super(message);
    }
}
