// Exibe uma mensagem de boas-vindas no console
console.log("Bem-vindo formador");

// Importa o módulo "fs" para manipulação de arquivos
const fs = require('fs');

async function  CountWords(filePath){
    const text = String(await fs.readFile(filePath))
}

async function writeFile(content){
    await fs.writeFile("src/resultados.txt", content+'\r\n', {flag})
}