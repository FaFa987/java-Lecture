package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(LearnStatic.staticVar);
        LearnStatic fafa = new LearnStatic();
        System.out.println(fafa.instanceVar);
        LearnStatic.staticMethod();
        fafa.instanceMethod();
    }
}