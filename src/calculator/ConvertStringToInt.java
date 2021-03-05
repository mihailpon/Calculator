package calculator;


import java.util.List;

/**
 * С помощью данного класса происходит конвертация римских цифр в арабские
 */

public class ConvertStringToInt {
    public int ConvertToInt(String str) throws Exception {
        return toArabic(str);
    }
    public static int toArabic(String num) throws Exception {
        if (num.equals("X")) {
            return 10;
        } if (num.equals("IX")) {
            return 9;
        } if (num.equals("VIII")) {
            return 8;
        } if (num.equals("VII")) {
            return 7;
        } if (num.equals("VI")) {
            return 6;
        } if (num.equals("V")) {
            return 5;
        } if (num.equals("IV")) {
            return 4;
        } if (num.equals("III")) {
            return 3;
        } if (num.equals("II")) {
            return 2;
        } if (num.equals("I")) {
            return 1;
        }
        return 0;
    }
}
