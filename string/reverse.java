import java.util.Scanner;

public class reverse {
    String func(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev+=ch;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverse obj = new reverse();
        obj.func(s);
    }
}