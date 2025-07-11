package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    
    @Test
    public void testMethod(){

        String a = "AB";
        String b = "AB";

        Assertions.assertEquals(a, b);

    }

}
