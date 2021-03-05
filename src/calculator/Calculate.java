package calculator;

public class Calculate {
    public String calculate(String firstNum, String secondNum, String operation) throws Exception {
        ConvertStringToInt sti = new ConvertStringToInt();
        int result = 0;

      int first = sti.ConvertToInt(firstNum);
      int second = sti.ConvertToInt(secondNum);

      if (first == 0 && second == 0) {
          first = Integer.parseInt(firstNum.trim());
          second = Integer.parseInt(secondNum.trim());
      }


        if (first < 1 || second < 1 || first > 10 || second > 10 ) {
            throw new Exception("В качестве аргументов используйте либо два арабских числа от 1 до 10 либо два римских числа от I до X");
        }

        switch (operation) {
            case "+" -> result = first + second;
            case "-" -> result = first - second;
            case "*" -> result = first * second;
            case "/" -> result = first / second;
            default -> throw new Exception("Вы ввели неверную операцию");
        }
        if (sti.ConvertToInt(firstNum) != 0 && sti.ConvertToInt(secondNum) != 0) {
           return new ConvertIntToString(result).ConvertToString();
        }
        return String.valueOf(result);
    }
}
