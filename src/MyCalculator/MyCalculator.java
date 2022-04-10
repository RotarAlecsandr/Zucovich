package MyCalculator;

import java.io.IOException;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) throws Exception { // новое
        try {
            System.out.println("Введите выражение например 1+1 или I+I инажмите Enter");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine(); //чтение строки

            if (Process.operatorInd(text)) { //проверка наличия +,-,*,/
                if (Process.isArabic(text)) { // если присутствуют арабские цифры
                    Calculator.calculator(Process.num1, Process.num2, Process.operator); // передаем числа и оператор
                    System.out.println(Calculator.result);
                } else {
                    if (Process.isRoman(text)) { // если присутствуют римские цифры
                        Calculator.calculator(Process.num1, Process.num2, Process.operator); // передаем числа и оператор
                        System.out.println(RomanNumerals.arabRims(Calculator.result));
                    } else {
                        throw new Exception("Введите либо две римские, либо две арабские цифры в диапазоне от 1 до 10");
                    }
                }
            } else {
                throw new Exception("Используйте один из операторов: +, -, *, /");
            }
        }
        catch (IOException a) {
            a.printStackTrace();
        }
    }
}