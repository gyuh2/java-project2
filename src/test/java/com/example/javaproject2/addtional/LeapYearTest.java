package com.example.javaproject2.addtional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    @Test
    void checkLearYear() {
        assertEquals(false, LeapYear.checkLearYear(1700));
    }
}