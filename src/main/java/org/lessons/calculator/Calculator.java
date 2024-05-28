package org.lessons.calculator;

public abstract class Calculator {

    // Metodi
    public static float add(float num1, float num2){
        return num1 + num2;
    }
    public static float substract(float num1, float num2){
        return num1 - num2;
    }
    public static float divide(float num1, float num2){
        return num1 / num2;
    }
    public static float multiply(float num1, float num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        return num1 * num2;
    }
}
