package module6;

public class SystemProperties {
    static {
        System.out.println("static init block");
        String osName = System.getProperty("os.name");
        OS = osName;
    }
    public static final String OS;
}
