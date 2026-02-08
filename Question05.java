class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }
}

public class Question05 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int exp1 = calc.square(calc.add(calc.multiply(3, 4), calc.multiply(5, 7)));
        System.out.println("Result of Expression 1: " + exp1);

        int exp2 = calc.add(calc.square(calc.add(4, 7)), calc.square(calc.add(8, 3)));
        System.out.println("Result of Expression 2: " + exp2);
    }
}