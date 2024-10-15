package se.lexicon;

public class LearnStatic {

    static String staticVar = "static_variable";
    String instanceVar = "instance_variable";

    public static void staticMethod() {
        System.out.println("this is static method!");
        String localVar = "local_variable";
        System.out.println(localVar);
        System.out.println(staticVar);
    }

    public void instanceMethod() {
        System.out.println("this is instance method");
        System.out.println(instanceVar);
        System.out.println(staticVar);
    }

}
