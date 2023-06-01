package Singleton3;

public class UserSessionManager {
    private static UserSessionManager instance; // Declaração da variável estática que armazenará a única instância da classe
    private String log; // Variável de instância para armazenar o log

    private UserSessionManager(String connectionString) { // Construtor privado para impedir a criação direta de instâncias
        this.log = connectionString; // Inicializa a variável de log com a conexão fornecida
    }

    public static synchronized UserSessionManager getInstance(String connectionString) {
        // Método estático para obter a instância única da classe
        if (instance == null) {
            instance = new UserSessionManager(connectionString); // Cria uma nova instância se ainda não existir
        }
        return instance; // Retorna a instância existente ou a recém-criada
    }

    public void log(String message) {
        // Método para registrar uma mensagem de log
        System.out.println("log message: " + message);
    }
}
