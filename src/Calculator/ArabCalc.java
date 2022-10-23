package Calculator;

import java.io.IOException;

class ArabCalc {

    int n;

    String ResRoman() throws IOException {

        int[] arab = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String resRom = "";
        if (n < 0){
            throw new IOException("т.к. в римской системе нет отрицательных чисел");
        }
        for (int i = 0; i < roman.length; i++) {
            int whole = n / arab[i];
            if (whole == 0) {
                continue;
            }
            for (int j = 0; j < whole; j++) {
                resRom += roman[i];
            }
            n = n % arab[i];
        }
        return resRom;
    }
}