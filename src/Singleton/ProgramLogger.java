package Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String log = "This is log...\n\n";

    private ProgramLogger() {
    }

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String logInfo) {
        log += logInfo + "\n";
    }

    public void showLogInfo() {
        System.out.println(log);
    }
}
