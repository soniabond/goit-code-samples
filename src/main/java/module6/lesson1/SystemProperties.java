package module6.lesson1;

public class SystemProperties {
    static {
        System.out.println("static init block");
        String osName = System.getProperty("os.name");
        OS = osName;
    }
    public static final String OS;
}
