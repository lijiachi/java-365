package com.java365;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day005 {
    public static String greeting(){
        return "java-365第5天";
    }
    @Test
    public void testgreeting(){
        assertEquals("java-365第5天",Day005.greeting());
    }
}
