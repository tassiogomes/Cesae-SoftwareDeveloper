var scan = require('readline-sync');

var c = 0;
var f = 0;

do{
    f = Number(scan.question("Digite os graus em Fº: "));
    if(f<2000){
        c= (f-32)/1,8.;
        console.log("Os graus em Cº em Fº é: " + c + " Cº");
    }
}while(f < 20000)  
   
 

