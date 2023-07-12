const valor1 = prompt("Ingresa el primer numero");
var v1 = parseInt(valor1);

const valor2 = prompt("Ingresa el segundo numero");
var v2 = parseInt(valor2);

const valor3 = prompt("Ingresa el tercer numero");
var v3 = parseInt(valor3);

const sorted = [v3,v2,v1].sort((a,b) => a - b);
console.log(sorted);

const sorteddesc = [v3,v2,v1].sort((a,b) => b - a);
console.log(sorteddesc);





