public class numberOverloading {
    static int num(int x, int y) {
    return x+y;
}
static double num (double x, double y){
        return x+y;
}

    public static void main(String[] args) {
        System.out.println(num(15489,8455));
        System.out.println(num(1589.14, 15496.225));
        System.out.println(num(5459,24568));
        System.out.println(num(44755.25, 45544.74));
    }
}
