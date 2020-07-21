package service;

public class Calculation {
    String[] baza = {"Zero", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
            "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV","XLV",
            "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII","LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
            "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    
    public int arabicTotal(char operator, String a, String b) {
        int operand1 = Integer.parseInt(a);
        int operand2 = Integer.parseInt(b);
        int total = 0;
        if (operator == '+'){
            total = operand1 + operand2;
        }else if (operator == '-'){
            total = operand1 - operand2;
        }else if (operator == '*'){
            total = operand1 * operand2;
        }else if (operator == '/'){
            total = operand1 / operand2;
        }
        return total;
    }

    public String romanTotal(char operator, String a, String b) {
        int operand1 = 0;
        int operand2 = 0;
        for (int i = 1; i <= 10; i++) {
            if (a.equals(baza[i])){
                operand1 = i;
            }
            if (b.equals(baza[i])){
                operand2 = i;
            }
        }

        int total = 0;
        if (operator == '+'){
            total = operand1 + operand2;
        }else if (operator == '-'){
            total = operand1 - operand2;
        }else if (operator == '*'){
            total = operand1 * operand2;
        }else if (operator == '/'){
            total = operand1 / operand2;
        }
        return convertToRoman(total);
    }

    public String convertToRoman(int total) {
        String totalToRim = "";
        totalToRim = baza[total];
        return totalToRim;
    }
}
