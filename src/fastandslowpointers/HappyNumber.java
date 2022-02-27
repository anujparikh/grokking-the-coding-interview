package fastandslowpointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {
    public static boolean find(int num) {
        Set<Integer> distinctSums = new HashSet<>();
        int sum = num;
        while (!distinctSums.contains(sum) && sum != 1) {
            distinctSums.add(sum);
            List<Integer> listOfDigits = intToArrayOfDigits(sum);
            sum = listOfDigits.stream().map(digits -> digits * digits).reduce(0, Integer::sum);
            if (sum == 1) return true;
        }
        return false;
    }

    public static boolean find2(int num) {
        int slow = num, fast = num;
        do {
            slow = calculateSquareOfDigits(slow);
            fast = calculateSquareOfDigits(calculateSquareOfDigits(fast));
        } while (slow != fast);
        return slow == 1;
    }

    static int calculateSquareOfDigits(int input) {
        int sum = 0, digit;
        do {
            digit = input % 10;
            sum += (digit * digit);
            input /= 10;
        } while (input > 0);
        return sum;
    }

    static List<Integer> intToArrayOfDigits(int input) {
        List<Integer> listOfDigits = new ArrayList<>();
        while (input > 0) {
            listOfDigits.add(0, input % 10);
            input /= 10;
        }
        return listOfDigits;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.find(23));
        System.out.println(HappyNumber.find(12));
        System.out.println("*********************************************");
        System.out.println(HappyNumber.find2(23));
        System.out.println(HappyNumber.find2(12));
    }
}
