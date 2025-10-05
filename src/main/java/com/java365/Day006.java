package com.java365;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day006 {
    public static String greeting(){
        return "java-365第6天";
    }
    @Test
    public void testGreeting(){
        assertEquals("java-365第6天",Day006.greeting());
    }
}
