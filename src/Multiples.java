public class Multiples {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                number++;
            } else {
                if (i % 5 == 0) {
                    number++;
                }
            }

        }
        System.out.println(number);
    }
}
