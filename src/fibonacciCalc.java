import java.math.BigInteger;
public class fibonacciCalc {
    public static void main(String[] args) {
        fibonacci(100);
    }
    public static void fibonacci (long counter){
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;
        System.out.println(num1 + " " + num2);
        BigInteger nextNum = BigInteger.ZERO;

        for (int i = 0; i<counter-2; i++){
             nextNum = num1.add(num2);
            System.out.println(nextNum+" ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}
