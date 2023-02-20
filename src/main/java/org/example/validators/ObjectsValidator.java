package org.example.validators;

public class ObjectsValidator {
    public boolean areEquals(Object object1, Object object2){
        if(object1.getClass() != object2.getClass() || object1.hashCode() != object2.hashCode()){
            return false;
        }else{
            System.out.println("fields" + object1.getClass().getDeclaredFields());
            return true;
        }
    }
}
