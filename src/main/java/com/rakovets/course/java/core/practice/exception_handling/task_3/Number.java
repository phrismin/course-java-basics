package com.rakovets.course.java.core.practice.exception_handling.task_3;

public class Number {
    public static boolean checkPositiveNumber(int a) throws ScannerException {
        if (a < 0) {
            throw new ScannerException("Entered a negative number", a);
        }
        return true;
    }
}