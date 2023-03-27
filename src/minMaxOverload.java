import java.util.Scanner;

public class minMaxOverload {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your numbers.");
        double Num1 = obj.nextDouble();
        double Num2 = obj.nextDouble();
        double Num3 = obj.nextDouble();


        if ((Num1 % 1 ==0) && (Num2 % 1 ==0) && (Num3 % 1 == 0)) {
           //integer numbers
            System.out.println("Your numbers are: " + (int)Num1 + " " + (int)Num2 + " " + (int)Num3);
            System.out.println("The smallest number is: " + minimum((int)Num1, (int)Num2, (int)Num3));
            System.out.println("The highest number is: " + maximum((int)Num1, (int)Num2, (int)Num3));
        } else { //double numbers
            System.out.println("Your numbers are: " + Num1 + " " + Num2 + " " + Num3);
            System.out.println("The smallest number is: " + minimum(Num1, Num2, Num3));
            System.out.println("The highest number is: " + maximum(Num1, Num2, Num3));
        }
    }
    public static int minimum (int num1, int num2, int num3) {
        int min = num1;
        if (num2<min){
            min = num2;
        }
        if (num3<min){
            min = num3;
        }
        return min;
    }
    public static double minimum (double num1, double num2, double num3) {
        double min = num1;
        if (num2<min){
            min = num2;
        }
        if (num3<min){
            min = num3;
        }
        return min;
    }
    public static double maximum (double num1, double num2, double num3) {
        double max = num1;
        if (num2>max){
            max = num2;
        }
        if (num3>max){
            max = num3;
        }
        return max;
    }
    public static int maximum (int num1, int num2, int num3) {
        int max = num1;
        if (num2>max){
            max = num2;
        }
        if (num3>max){
            max = num3;
        }
        return max;
    }
}
