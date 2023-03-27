
import java.util.Scanner;
public class myCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 numbers.");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int add = plus(num1,num2);
        int min = subs(num1, num2);
        int mul = multiply(num1, num2);
        int div = divide(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + min);
        System.out.println(num1 + " * " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);

    }
public static int plus (int a, int b) {
        return a+b;
}

public static int subs (int a, int b){
        return a-b;
}
public static int multiply (int a, int b){
        return a*b;
}
public static int divide (int a, int b){
        return a/b;
}
}
