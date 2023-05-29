public class DatabaseConnection {
    private static DatabaseConnection instance; // Instância única da classe DatabaseConnection
    private String connectionString; // String de conexão com a base de dados


    private DatabaseConnection(String connectionString) {       // Construtor privado para evitar criação de instâncias diretas
        this.connectionString = connectionString;
    }

    public static synchronized DatabaseConnection getInstance(String connectionString) {    // Método estático para obter a instância única da classe DatabaseConnection
        if (instance == null) {                                                             // Verifica se a instância ainda não foi criada
            instance = new DatabaseConnection(connectionString);                            // Cria uma nova instância
        }
        return instance;                                                                    // Retorna a instância existente ou a recém-criada
    }


    public void connect() {                                                                 // Método para conectar à base de dados
        System.out.println("Conectado à base de dados: " + connectionString);               // Código para estabelecer a conexão com a base de dados usando a connectionString
    }

    public void disconnect() {                                                              // Método para desconectar da base de dados
        System.out.println("Desconectado da base de dados: " + connectionString);           // Código para encerrar a conexão com a base de dados
    }


}
