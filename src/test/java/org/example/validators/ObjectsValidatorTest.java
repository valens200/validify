package org.example.validators;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectsValidatorTest  {
    ObjectsValidator validator = new ObjectsValidator();
    private  class Person{
        private  String name;
        public Person(String name){
            this.name = name;
        }
        @Override
        public String toString() {
            return super.toString();
        }
    }
    @Test
    public  void shouldBeEqual(){
        Person person = new Person("valens");
        Person person1 = new Person("valens");
        assertEquals(true, validator.areEquals(person1, person1));
    }

}