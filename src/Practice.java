import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your numbers.");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();


        System.out.println("The smallest number is " + min(num1, num2, num3));
        System.out.println("The smallest number is " + max(num1, num2, num3));

    }
    public static int min (int x, int y, int z){
        int min = x;
        if (y<min) {
            min = y;
        }
        if (z<min){
            min = z;
        }
        return min;
        }
    public static int max (int x, int y, int z){
        int max = x;
        if (y>max) {
            max = y;
        }
        if (z>max){
            max = z;
        }
        return max;
    }
    }


