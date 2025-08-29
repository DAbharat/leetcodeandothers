package OOPS.Abstraction.AbstractClassnMethods;

public class Main {
    public static void main(String[] args) {
        GamingApp app1 = new GamingApp("BGMI", 3.9f);
        SocialMediaApp app2 = new SocialMediaApp("Instagram", true);

        app1.open();
        app1.currentVerison();
        app1.close();

        System.out.println("-------------");

        app2.requiresLogin();
        app2.open();
        app2.close();
    }
}
