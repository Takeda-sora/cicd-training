package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    
    @Test
    public void testMethod(){

        String a = "ABC";
        String b = "ABC";

        Assertions.assertEquals(a, b);

    }

}
