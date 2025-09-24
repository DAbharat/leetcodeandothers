package Recursion.Strings;

public class SubSequence {
    public static void main(String[] args) {
        seq("", "abc");
    }

    static void seq(String fh, String sh) {
        if(sh.isEmpty()) {
            System.out.println(fh);
            return;
        }

        char ch = sh.charAt(0);

        seq(fh+ch, sh.substring(1));
        seq(fh,sh.substring(1));
    }
}
