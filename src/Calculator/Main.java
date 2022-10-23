package Calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] number = input();
        calc(number);
    }

    public static void calc(String[] number) throws IOException {

        Arab arb = new Arab();
        Arab arb1 = new Arab();
        arb.number = number[0];
        arb1.number = number[2];
        int first = arb.First();
        int second = arb1.First();
        ArabCalc arabCalc = new ArabCalc();

        Roman rmn = new Roman();
        Roman rnm1 = new Roman();
        rmn.number = number[0];
        rnm1.number = number[2];
        int firstRoman = rmn.Second();
        int secondRoman = rnm1.Second();

        if (first != 0 && second != 0) {
            int solution = rez(number, first, second);
            System.out.println(solution);
        } else {
            if (firstRoman != 0 && secondRoman != 0) {
                arabCalc.n = rez(number, firstRoman, secondRoman);
                String solution = arabCalc.ResRoman();
                System.out.println(solution);
            } else {
                throw new IOException("т.к. используются одновременно разные системы счисления");
            }
        }
    }

    static String[] input() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expression = scan.nextLine();
        String[] number = expression.split(" ");

        if (number.length <= 2 ) {
            throw new IOException("т.к. строка не является математической операцией");
        } if (number.length > 3){
            throw new IOException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return number;
    }

    static int rez(String[] number, int first, int second) throws IOException {
        return switch (number[1]) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> throw new IOException();
        };
    }
}