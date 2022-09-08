package CreationalPatterns.Singleton;

public class Program {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().showLogInfo();
        ProgramLogger.getProgramLogger().addLogInfo("first log");
        ProgramLogger.getProgramLogger().addLogInfo("second log");
        ProgramLogger.getProgramLogger().showLogInfo();
    }
}
