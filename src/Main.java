import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello world!");
        StringBuilder result = new StringBuilder();
// VAR 1
        char[] array = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        System.out.println(result);

        // VAR 2.
//        result= s.reverse();
//        System.out.println(result);
    }
}
