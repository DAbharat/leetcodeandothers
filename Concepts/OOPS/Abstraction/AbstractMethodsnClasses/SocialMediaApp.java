package OOPS.Abstraction.AbstractClassnMethods;

public class SocialMediaApp extends App{
    String appName;
    boolean requiresLogin;

    SocialMediaApp(String appName, boolean requiresLogin) {
        this.appName = appName;
        this.requiresLogin = requiresLogin;
    }
    @Override
    void open() {
        System.out.println("Opened: " + appName);
    }

    @Override
    void close() {
        System.out.println("Closed: " + appName);
    }

    void requiresLogin() {
        if(requiresLogin) {
            System.out.println(appName + " requires login before use");
        } else {
            System.out.println(appName + " allows guest access");
        }
    }
}
