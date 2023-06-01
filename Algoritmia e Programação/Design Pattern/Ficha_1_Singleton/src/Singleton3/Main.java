package Singleton3;

public class Main {
    public static void main(String[] args) {
        // Criação da primeira instância do UserSessionManager
        UserSessionManager sessionManager1 = UserSessionManager.getInstance("Connection String 1");
        sessionManager1.log("Log message 1"); // Chama o método log() da instância sessionManager1, imprime "log message: Log message 1"

        // Tentativa de criar uma segunda instância do UserSessionManager
        // Como o Singleton garante apenas uma instância, a mesma instância criada anteriormente será retornada
        UserSessionManager sessionManager2 = UserSessionManager.getInstance("Connection String 2");
        sessionManager2.log("Log message 2"); // Chama o método log() da instância sessionManager2, imprime "log message: Log message 2"

        // Verificação se as duas variáveis referenciam a mesma instância do UserSessionManager
        System.out.println(sessionManager1 == sessionManager2); // Imprime "true" (as duas variáveis referenciam a mesma instância)

        /*
         * A saída esperada é:
         * log message: Log message 1
         * log message: Log message 2
         * true
         */
    }
}
