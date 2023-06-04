package Singleton2;


import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class Logger {
    private static Logger instance; // Instância única da classe Singleton2.Logger
    private String connectionString; // Nome do arquivo de log

    /**
     * Construtor privado
     * @param connectionString
     */
    private Logger(String connectionString) { // Construtor privado para evitar criação de instâncias diretas
        this.connectionString = connectionString;
    }


    /**
     * Singleton
     * @param connectionString
     * @return
     */
    public static synchronized Logger getInstance(String connectionString) { // Método estátiv  co para obter a instância única da classe Singleton2.Logger
        if (instance == null) { // Verifica se a instância ainda não foi criada
            instance = new Logger(connectionString); // Cria uma nova instância
        }
        return instance; // Retorna a instância existente ou a recém-criada
    }

        public void log(String String) {
        // Código para conectar à base de dados usando a connectionString
            System.out.println("log message: " + log);
        }
}
