package calculator;

public class FindOperationPosition {
    public static int operationPos(String text) throws Exception {
        char [] textArray = text.toCharArray();
        int arrayLength = textArray.length;
        int concurCount = 0;
        int result = -1;
        char [] operations = {'+', '-', '*', '/'};

        for (int ind = 0; ind < arrayLength; ind++) {
            for (int i = 0; i < operations.length; i++) {
                if (textArray[ind] == operations[i]) {
                    concurCount++;
                    result = ind;
                    break;
                }
                if (result == 0 || concurCount > 1) {
                    throw new Exception("Неправильный ввод");
                }
            }
        }
        return result;
    }
}
