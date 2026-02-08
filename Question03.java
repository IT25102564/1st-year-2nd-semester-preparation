class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0; // true if even, false if odd
    }
}

public class Question03 {
    public static void main(String[] args) {
        EvenOddNumber checker = new EvenOddNumber();

        int[] numbers = {5, 12, 17, 36};
        for (int num : numbers) {
            if (checker.findEvenOrOdd(num)) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }
}