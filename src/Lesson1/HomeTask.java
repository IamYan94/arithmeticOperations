package Lesson1;

public class homeTask {
    public static void main(String[] args) {
        byte b = 4;
        short s = 122;
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        float f = 3.3f;
        long l = 201;
        double result;
        result = i2 / i1 + d1 - f + l * b;
        System.out.println("Result arithmetic operations = " + result + "" + '\n' + "Addition result =  " + (i2 + i1) + "" + '\n' + "The result of division = " + (d1 / f) + '\n' + "The result of multiplication = " + (b * s) + '\n' + "Subtraction result = " + (l - i2));

    }
}