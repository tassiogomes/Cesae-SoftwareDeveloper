const prompt=require("prompt-sync")({sigint:true});

const num1 = Number(prompt("Insert a number: "));
const num2 = Number(prompt("Insert a number: "));
const sum = num1 + num2;
const mult = num1 * num2;
console.log(sum);

for(i = 1, i<=10, i++){
    console.log()
}
