package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //System.out.println(MethodOverLoading.multiply(5,2));
        //System.out.println(MethodOverLoading.multiply(5.1,3.8));
        Car volvo = new Car();
        volvo.regId = "uh123";
        volvo.color = "red";
        volvo.model = "S5041";
        volvo.releaseDate = 1987;
        System.out.println(volvo.getInformation());

        Car bmw = new Car();
        bmw.regId = "gh125";
        bmw.color = "blue";
        System.out.println(bmw.getInformation());




        /*
        Person user = new Person();
        user.name = "fafa";
        user.age = 22;
        user.last = "kh";
        System.out.println("your name is: " + user.name);
        System.out.println("your age is: " + user.age);
        System.out.println("your last is: " + user.last);
        System.out.println("your hobby is: " + user.hobby);
        System.out.println("your id is: " + user.idNumber);
         */



        /*
        System.ou t.println(LearnStatic.staticVar);
        LearnStatic fafa = new LearnStatic();
        System.out.println(fafa.instanceVar);
        LearnStatic.staticMethod();
        fafa.instanceMethod();
        */
    }
}