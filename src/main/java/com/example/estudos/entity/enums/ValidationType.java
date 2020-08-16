package com.example.estudos.entity.enums;

public enum ValidationType {

    ANNONYMOUS ("Online");

    String value;

    ValidationType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
