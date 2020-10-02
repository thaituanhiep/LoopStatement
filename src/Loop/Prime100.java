package Loop;

import java.util.stream.IntStream;

public class Prime100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100");
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        else if (number == 2 || number == 3 || number == 5) return true;
        else if (number % 2 == 0) return false;
        else {
//            for (int i = 3; i <= Math.sqrt(number); i += 2) {
//                if (number % i == 0) return false;
//            }
            return IntStream.iterate(3, i -> i + 2).limit(Math.round(Math.sqrt(number) - 3) / 2 + 1).allMatch(i -> number % i != 0);
        }
    }
}
