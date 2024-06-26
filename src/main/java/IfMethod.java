public class IfMethod {

    public static String myMethod() {
        System.out.println("My Method!");

        return "My Method";
    }

    public static void main(String[] args) {
        int myAge = 18;
        int yourAge = 36;

        myMethod();

        System.out.println(ageCheck(27));
        boolean isFullAge = ageCheck(18);
        ageCheck(5);
    }

    public static boolean ageCheck(int age) {
        System.out.println("Age: " + age);

        if (age > 18) {
            System.out.println("Ja! Die Person ist volljährig!");
            return true;
        } else if (age == 18) {
            System.out.println("Ja! Die Person ist genau 18 jahre alt!");
            return true;
        } else {
            System.out.println("Nein! Die Person ist nicht volljährig!");
            return false;
        }
    }
}
