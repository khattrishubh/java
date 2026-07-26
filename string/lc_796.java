import java.util.Scanner;
class lc_796 {
    boolean rotateString(String s, String goal) {
        String t1=" ";
        String t2=" ";
        String t=" ";
        int i=0;
        while( s.charAt(i) != goal.charAt(0) ) {
            t1 = s.substring(0,i);
            t2 = s.substring(i,(s.length()-1));
            t  = t2 + t1;
            i++;
            if(t.equals(goal))
            {
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal= sc.nextLine();
        lc_796 obj = new lc_796();
        boolean result = obj.rotateString(s, goal);
        System.out.println( result );
    }
}