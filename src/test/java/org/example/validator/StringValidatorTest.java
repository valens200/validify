package org.example.validator;

import org.example.validators.StringValidator;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringValidatorTest  {

    StringValidator stringValidator = null;
    @Test
   public  void shouldEqualToTrue(){
         stringValidator = new StringValidator();
        assertTrue(stringValidator.areEqual("valens", "valens"));
    }
    @Test
  public   void shouldBeEmail(){
        stringValidator = new StringValidator();
        assertEquals(true,stringValidator.isEmail("uwavalens2003@gmail.com"));
    }
    @Test
    public  void shouldBeUrl(){
        stringValidator = new StringValidator();
        assertTrue(stringValidator.isUrl("https://www.javatpoint.com/java-regex"));
    }


}