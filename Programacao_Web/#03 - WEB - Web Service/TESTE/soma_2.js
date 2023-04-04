var scan = require('readline-sync');

var  soma = 0;
do{
    
    var num = Number(scan.question("Digite um numero "));
    var soma = soma + num;
    console.log("A soma é: " + soma);

   
}while(num!=0);