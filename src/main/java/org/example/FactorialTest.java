package org.example;
public class FactorialTest {
    public static int factorialCalc(int value) throws IllegalArgumentException {
        int result = 1;
        if (value < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        } else if (value == 0) {
            result = 1;
        } else {
            for (int i = 1; i <= value; i++) {
                result = result * i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(factorialCalc(6));
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}