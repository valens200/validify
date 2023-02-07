package org.example.validator;

import junit.framework.TestCase;
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

}