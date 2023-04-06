const prompt = require('prompt-sync')();

let num1 = 0;
let num2 = 0;
let soma = 0;

while (true) {
  num1 = parseInt(prompt("Digite o primeiro número: "));
  if (num1 === 0) {
    break;
  }
  
  num2 = parseInt(prompt("Digite o segundo número: "));
  if (num2 === 0) {
    break;
  }

  soma = num1 + num2;
  console.log("A soma dos dois números é: " + soma);
}