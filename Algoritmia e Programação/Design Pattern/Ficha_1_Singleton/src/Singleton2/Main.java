import Singleton2.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("application_log.txt");
        logger.log("Mensagem de log 1");
        Logger logger2 = Logger.getInstance("application_log.txt");
        logger2.log("Mensagem de log 2");
    }
}
