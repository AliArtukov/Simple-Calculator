import service.Calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String a = "";
        String b = "";
        char operator = 0;

        while (true) {
            System.out.println("\nCalculator   0=>Exit");
            System.out.print("Input: ");
            input = scanner.nextLine();
            System.out.print("Output: ");
            if (input.equals("0")) {
                System.out.println("The end");
                return;
            }

            input = input.replaceAll(" ", "");
            boolean isOperator = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
                    isOperator = true;
                    a = input.substring(0, i);
                    b = input.substring(i + 1);
                    operator = input.charAt(i);
                    break;
                }
            }

            if ((isOperator && !a.contains(".") && !a.contains(",")) &&
                    (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") ||
                    a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("10")) &&
                    (b.equals("1") || b.equals("2") || b.equals("3") || b.equals("4") || b.equals("5") ||
                    b.equals("6") || b.equals("7") || b.equals("8") || b.equals("9") || b.equals("10"))) {
                System.out.println(calculation.arabicTotal(operator, a, b));
            }else if ((isOperator && !a.contains(".") && !a.contains(",")) &&
                    (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") ||
                    a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) &&
                    (b.equals("I") || b.equals("II") || b.equals("III") || b.equals("IV") || b.equals("V") ||
                            b.equals("VI") || b.equals("VII") || b.equals("VIII") || b.equals("IX") || b.equals("X"))) {
                    System.out.println(calculation.romanTotal(operator, a, b));
            }else {
                System.out.println("Incorrect command !!!");
            }


        }
    }
}
