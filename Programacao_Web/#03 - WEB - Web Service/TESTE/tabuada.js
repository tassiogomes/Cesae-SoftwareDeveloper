const prompt=require("prompt-sync")({sigint:true});

const num1 = Number(prompt("Digite a tabuada que quer: "));

for(let i=0; i <= 10; i++){
    let resultado = num1 * i;
    console.log(num1 + " * " + i + " = " + resultado)
}
