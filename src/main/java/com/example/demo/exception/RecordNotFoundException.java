package com.example.demo.exception;

public class RecordNotFoundException extends Exception {

    public RecordNotFoundException() {

    }

    public RecordNotFoundException(String msg) {
        System.out.println(msg);
    }
}