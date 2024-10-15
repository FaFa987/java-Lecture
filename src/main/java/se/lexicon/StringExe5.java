package se.lexicon;

public class StringExe5 {
    public static void main(String[] args) {
        exercise5();

    }

    public static void exercise5(){
        String str = "Eric Svensson";
        int number = str.length();
        int counter = 0;
        for (int i = 0; i < number; i++) {
            char ch = str.charAt(i);
            if (ch == 'S' || ch == 's') {
               counter += 1;
            }
        }
        System.out.println(counter);
    }
}
