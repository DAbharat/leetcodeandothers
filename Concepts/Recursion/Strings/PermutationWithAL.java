package Recursion.Strings;

import java.util.ArrayList;

public class PermutationWithAL {
    public static void main(String[] args) {
        ArrayList<String> ans = permutationAL("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> permutationAL(String fh, String sh) {
        if(sh.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(fh);
            return list;
        }

        char ch = sh.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= fh.length(); i++) {
            String first = fh.substring(0,i);
            String second = fh.substring(i,fh.length());
            ans.addAll(permutationAL(first + ch + second, sh.substring(1)));
        }
        return ans;
    }
}
