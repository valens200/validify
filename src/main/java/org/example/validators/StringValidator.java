package org.example.validators;

import org.example.exceptions.EmptyParameterException;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringValidator {
   public boolean isNumber(Number number){
        if(number instanceof Integer || number instanceof Long || number instanceof  Float){
            return true;
        }else {
            return false;
        }
    }
   public  boolean areEqual(String stringOne, String stringTwo){
        if(stringTwo.hashCode() == stringOne.hashCode()){
            return true;
        }else{
            return false;
        }
    }
   public boolean isEmail(String email) throws  EmptyParameterException{
        if(email == null || email == "" || email == null ){
            throw  new EmptyParameterException(" Error: The email to test should be not empty or null");
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
    //checking if it is url using jdk URL class
    public  boolean isUrl(String url) throws  EmptyParameterException{
       if(url == "" || url == null){
           throw new EmptyParameterException("Error : Url can not be empty!");
       }
       try {
           new URL(url).toURI();
           return true;
       }catch (Exception exception){
           return false;
       }
    }

//    boolean isIpV4(String ipv4){
//        Pattern pattern = Pattern.compile(".");
//        List<Integer> octetsNumbers = new ArrayList<Integer>();
//        String[] octets = pattern.split(ipv4);
//        Arrays.stream(octets).forEach(octet ->{
//            octetsNumbers.add(Integer.parseInt(octet));
//        });
//    }
}
