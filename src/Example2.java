public class Example2 {
    public static void main(String[] args) { //main method

        fName(); // passing no parameter
        fName("William"); // passing 1  argument
        fName ("Diana", "Spencer"); // passing 2 arguments
    }
    // methods to pass on first name
    static void fName() {
        System.out.println("Your name is Ada Lovelace");
    }
    static void fName(String firstName) { // passing fname  parameter
        System.out.println(firstName + " Smith");
    }

    static void fName (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}
