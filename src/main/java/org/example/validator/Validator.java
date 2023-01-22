package org.example.validator;

public class Validator {
    boolean isNumber(Number number){
        if(number instanceof Integer || number instanceof Long || number instanceof  Float){
            return true;
        }else {
            return false;
        }
    }

}
