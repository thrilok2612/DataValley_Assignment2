public class Main {
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = sumDivisibleBy5and2(values);
        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }
    
    public static int sumDivisibleBy5and2(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 5 == 0 && num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}