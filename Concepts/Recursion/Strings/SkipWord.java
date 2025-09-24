package Recursion.Strings;

public class SkipWord {
    public static void main(String[] args) {
        System.out.println(skipWord("hihellobharat"));
    }

    static String skipWord(String str) {
        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("hello")) {
            return skipWord(str.substring(5));
        } else {
            return str.charAt(0) + skipWord(str.substring(1));
        }
    }
}
