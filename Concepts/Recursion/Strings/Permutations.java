package Recursion.Strings;

public class Permutations {
    public static void main(String[] args) {
        permutation("", "abc");
    }

    static void permutation(String fh, String sh) {
        if(sh.isEmpty()) {
            System.out.println(fh);
            return;
        }

        char ch = sh.charAt(0);

        for (int i = 0; i <= fh.length(); i++) {
            String first = fh.substring(0,i);
            String second = fh.substring(i,fh.length());
            permutation(first + ch + second, sh.substring(1));
        }
    }
}
