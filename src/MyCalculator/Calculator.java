package MyCalculator;

public class Calculator {
    public static double result;

    public static void calculator(int num1, int num2, char operator) throws Exception { // производит арифметические выражения согласно оператору
        if ((num1 < 1) || (num1 > 10) || (num2 < 1) || (num2 > 10)) {
            throw new Exception("Число не входит в диапазон");
        } else {
            switch (operator) {
                case '+' : result = num1 + num2;
                    break;
                case '-' : result = num1 - num2;
                    break;
                case '*' : result = num1 * num2;
                    break;
                case '/' : result = (double) num1 / num2;
                    break;
            }
        }
    }
}
