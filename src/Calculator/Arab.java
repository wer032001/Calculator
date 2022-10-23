package Calculator;

class Arab {

    String number;

    int First() {

        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int first = 0;
        for (int i = 0; i < arab.length; i++) {
            boolean k = arab[i].equals(number);
            if (k) {
                first = i + 1;
            }
        }
        return first;
    }
}


