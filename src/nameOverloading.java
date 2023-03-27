public class nameOverloading {
    public static void myMethod () {
        System.out.println("Any name is a good name.");
    }

    public static void myMethod (String fName){
        System.out.println(fName + " " + "Potter");
    }

    public static void myMethod (String fName, String lName){
        System.out.println(fName + " " + lName);
    }
    public static void myMethod (String fName,String mName, String lName){
        System.out.println(fName + " " + mName +" " + lName);
    }
    public static void main(String[] args) {
        myMethod();
        myMethod ("Harry");
        myMethod ("Lilly");
        myMethod ("Draco", "Lucius", "Malfoy");
        myMethod ("Harmony", "Grainger");
    }
}
