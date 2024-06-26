public class MyFirstJavaApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hallo hh-java-24-3");

        String name = "Daniel";

        System.out.println(name);

        name = "Florian";

        System.out.println(name);



        int age = 27;
        double myDouble = 5.94;
        boolean myBoolean = false;

        System.out.println(age);
        System.out.println(myDouble);
        System.out.println(myBoolean);

        System.out.println(name + " Weber");
        System.out.println(age + 12);
        System.out.println(age - 12);
        System.out.println(age * 12);
        System.out.println(age / 12);

        int doubleMyAge = age * 2;

        System.out.println("My Age: " + doubleMyAge);

        boolean isEighteenYearsOld = false;

        System.out.println(!isEighteenYearsOld || false);

        System.out.println(10 == 11);

        float f = 0.5f;
        double d = 0.5;

        String s = d + f + "abc";
    }
}
