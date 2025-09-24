package Recursion.Strings;

public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(character2("bjaggsvauvavatfa"));
    }

    static void character(String fh, String sh) {
        if(sh.isEmpty()) {
            System.out.println(fh);
            return;
        }

        char ch = sh.charAt(0);
        if(ch == 'a') {
            character(fh,sh.substring(1));
        } else {
            character(fh+ch,sh.substring(1));
        }
    }

    //return a String
    static String character2(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if(ch == 'a') {
            return character2(str.substring(1));
        } else {
            return ch + character2(str.substring(1));
        }
    }
}
