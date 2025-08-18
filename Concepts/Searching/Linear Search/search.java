package linearsearch;

public class search {
    public static void main(String[] args) {
        String name = "wwuifwvfwvjygriqyho";
        char target = 'z';
        System.out.println(linearSearch(name, target));
    }
    static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for(int i=0; i<str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
