package OOPS.Abstraction.AbstractClassnMethods;

public class GamingApp extends App{
    String appName;
    float version;

    GamingApp(String appName, float version) {
        this.appName = appName;
        this.version = version;
    }
    @Override
    void open() {
        System.out.println("Opened: " + appName);
    }

    @Override
    void close() {
        System.out.println("Closed: " + appName);
    }

    void currentVerison() {
        System.out.println("Playing: " + appName + " Version: " + version );
    }
}
