package Singleton2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance; // Instância única da classe Singleton2.Logger
    private File fileName; // Nome do arquivo de log

    /**
     * Construtor
     * @param fileName
     */
    private Logger(String fileName) { // Construtor privado para evitar criação de instâncias diretas
        File file = new File(fileName);
    }


    /**
     * Singleton
     * @param fileName
     * @return
     */
    public static synchronized Logger getInstance(String fileName) { // Método estátiv  co para obter a instância única da classe Singleton2.Logger
        if (instance == null) { // Verifica se a instância ainda não foi criada
            instance = new Logger(fileName); // Cria uma nova instância
        }
        return instance; // Retorna a instância existente ou a recém-criada
    }

    public void log(String message) {                   // Método para gravar uma linha de log no arquivo
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(message);                    // Grava a mensagem no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
