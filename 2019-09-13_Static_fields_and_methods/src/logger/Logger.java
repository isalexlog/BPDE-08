package logger;

public class Logger {

    private Class clazz;

    public static Logger getLogger(Class clazz) {
        return new Logger(clazz);
    }

    private Logger(Class clazz) {
        this.clazz = clazz;
    }

    public void info(String msg) {
        printClassName();
        System.out.print("info: ");
        System.out.println(msg);
    }

    public void error(String msg) {
        printClassName();
        System.out.print("error: ");
        System.out.println(msg);
    }

    private void printClassName() {
        System.out.print(clazz + ":");
    }
}
