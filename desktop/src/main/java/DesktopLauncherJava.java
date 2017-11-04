/**
 * Created by noncom on 11/4/17.
 */

public class DesktopLauncherJava {

    /**    Launching this class yields: */
//    Exception in thread "main" java.lang.NoClassDefFoundError: SomeKotlin
//    at DesktopLauncherJava.main(DesktopLauncherJava.java:8)
//    Caused by: java.lang.ClassNotFoundException: SomeKotlin
//    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
//    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
//    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
//    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
//            ... 1 more
//
//    Process finished with exit code 1

    public static void main(String[] args) {
        SomeKotlin sk = new SomeKotlin();
    }

}
