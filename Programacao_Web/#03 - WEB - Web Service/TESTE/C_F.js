var scan = require('readline-sync');

var c = 0;
var f = 0;

c = Number(scan.question("Digite os graus em Cº: "));
f= (c*1.8) + 32;
console.log("Os graus em Cº em Fº é: " + f + " Fº");

f = Number(scan.question("Digite os graus em Fº: "));
c= (f-32)/1,8.;
console.log("Os graus em Cº em Fº é: " + c + " Cº");
