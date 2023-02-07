package org.example.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringValidator {
    boolean isNumber(Number number){
        if(number instanceof Integer || number instanceof Long || number instanceof  Float){
            return true;
        }else {
            return false;
        }
    }
    boolean areEqual(String stringOne, String stringTwo){
        if(stringTwo.hashCode() == stringOne.hashCode()){
            return true;
        }else{
            return false;
        }
    }
    boolean isEmail(String email){
        if(email == null || email == "" || email == null ){
            throw  new IllegalArgumentException("The email to test should be not empty or null");
        }else {
            Pattern pattern = Pattern.compile("@");
            String[] emailParts = pattern.split(email);
            System.out.println(emailParts[0]);
            System.out.println(emailParts[1]);
            if(emailParts.length < 1){
                return  false;
            }else if(emailParts[1].hashCode() != "gmail.com".hashCode()){
                return false;
            }else {
                return true;
            }
        }
    }
    boolean isIpV4(String ipv4){
        Pattern pattern = Pattern.compile(".");
        List<Integer> octetsNumbers = new ArrayList<Integer>();
        String[] octets = pattern.split(ipv4);
        Arrays.stream(octets).forEach(octet ->{
            octetsNumbers.add(Integer.parseInt(octet));
        });
    }
}
