package calculator;

/**
 * С помощью данного класса происходит конвертация арабских цифр в римские.
 */

public class ConvertIntToString {
    int num;
    public ConvertIntToString(int value) {
        num = value;
    }
    public String ConvertToString() {
        int number = num;
        StringBuilder builder = new StringBuilder();
        while (number > 0) {
            if (number >= 100) {
                builder.append("C");
                number-= 100;
                continue;
            }
            if (number >= 90) {
                builder.append("XC");
                number-= 90;
            }
            if (number >= 50) {
                builder.append("L");
                number-= 50;
            }
            if (number >= 40) {
                builder.append("XL");
                number-=40;
            }
            if (number >= 10) {
                builder.append("X");
                number-= 10;
                continue;
            }
            if (number >= 9) {
                builder.append("IX");
                number-= 9;
                continue;
            }
            if (number >= 5) {
                builder.append("V");
                number-= 5;
                continue;
            }
            if (number >= 4) {
                builder.append("IV");
                number-= 4;
                continue;
            }
            if (number >= 1) {
                builder.append("I");
                number-= 1;
            }
        }
        return builder.toString();
    }
}
