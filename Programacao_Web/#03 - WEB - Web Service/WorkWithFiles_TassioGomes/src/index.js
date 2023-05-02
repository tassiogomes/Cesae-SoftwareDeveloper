// Exibe uma mensagem de boas-vindas no console
console.log("Bem-vindo formador");

// Importa o módulo "fs" para manipulação de arquivos
const fs = require('fs');

// Define o nome do arquivo a ser lido
const filename = 'test.txt';

// Lê o conteúdo do arquivo e armazena na variável "content"
const content = fs.readFileSync(filename, 'utf-8');

// Divide o conteúdo em palavras usando o caractere espaço como separador
const words = content.split(' ');

// Inicializa a variável "wordCount" com zero
let wordCount = 0;

// Percorre todas as palavras e incrementa o contador "wordCount" para cada palavra que não seja uma string vazia
for (let i = 0; i < words.length; i++) {
  if (words[i] !== '') {
    wordCount++;
  }
}

// Cria uma string com o resultado contendo o nome do arquivo e o número de palavras encontradas
const result = `O arquivo ${filename} contém ${wordCount} palavras.`;

// Escreve o resultado no arquivo "resultados.txt"
fs.writeFileSync('resultados.txt', result);

// Exibe o resultado no console
console.log(result);
