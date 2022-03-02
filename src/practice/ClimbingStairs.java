package practice;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int currentSum = 0;
        int previousSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                currentSum = 1;
            } else if (i == 2) {
                currentSum = 2;
                previousSum = 1;
            } else {
                int temp = currentSum;
                currentSum = currentSum + previousSum;
                previousSum = temp;
            }
        }
        return currentSum;
    }

    public static void main(String[] args) {
        System.out.println(ClimbingStairs.climbStairs(2));
        System.out.println(ClimbingStairs.climbStairs(3));
        System.out.println(ClimbingStairs.climbStairs(5));
        System.out.println(ClimbingStairs.climbStairs(45));
    }
}
