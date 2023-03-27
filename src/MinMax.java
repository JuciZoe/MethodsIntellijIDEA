import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your numbers.");
        int Num1 = obj.nextInt();
        int Num2 = obj.nextInt();
        int Num3 = obj.nextInt();
        System.out.println("Your numbers are: " + Num1 + " " + Num2 + " " + Num3);
        System.out.println("The smallest number is: " + minimum(Num1, Num2, Num3));
        System.out.println("The highest number is: " + maximum(Num1, Num2, Num3));
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


