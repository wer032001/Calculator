package Calculator;

class Roman {
    String number;

    int Second() {

        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int second = 0;
        for (int i = 0; i < roman.length; i++) {
            boolean k = roman[i].equals(number);
            if (k) {
                second = i + 1;
            }
        }
        return second;
    }
}
