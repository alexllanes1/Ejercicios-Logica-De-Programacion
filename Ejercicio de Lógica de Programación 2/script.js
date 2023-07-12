const temperatura = prompt("Ingresa la temperatura en grados celcius");
var valor = parseInt(temperatura);

console.log("La temperatura en grados celcius es: ", valor);

function fahrenheit(){
    const f=(valor*1.8)+32;
    console.log("La temperatura en grados fahrenheit es: ", f);
}

function kelvin(){
    const k=valor+273.15;
    console.log("La temperatura en grados kelvin es: ", k);
}

fahrenheit();
kelvin();