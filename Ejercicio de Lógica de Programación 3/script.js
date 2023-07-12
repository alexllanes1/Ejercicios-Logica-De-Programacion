const numero = prompt("Ingresa un numero");
var valor = parseInt(numero);

console.log("El número que ustes escogio es: ", valor);

function factorial(valor){
    if(valor < 0){
        console.log("El número debe ser positivo");
    }
    if(valor == 0 || valor == 1){
        return 1;
    }else{
        return valor * factorial(valor-1);
    }
}

answer = factorial(valor)
console.log("El factorial es", answer);