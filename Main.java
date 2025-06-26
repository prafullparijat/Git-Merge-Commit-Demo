package MyPkg;

public class Main {
    public static void main(String[] args) {
        int a = 38;
        int b = 19;
        int sum, diff, mul;
        Main calc = new Main();
        sum = calc.addition(a, b);
        System.out.println("Sum of A and B is "+sum);
        //diff = calc.substract(a, b);
        //System.out.println("Difference of A and B is "+ diff);
        //mul = calc.multiply(a, b);
        //System.out.println("Multiplication of A and B is "+ mul);
    }

    public int addition(int a, int b)
    {
        return a+b;
    }

}

