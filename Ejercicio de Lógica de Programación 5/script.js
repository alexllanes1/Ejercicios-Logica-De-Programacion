var resultado;
var arr=[];
var i=0;
var key=12;
var x=0;

    do{
        const numero = prompt("Ingresa un numero del 1 al 100");
        const valor = parseInt(numero);

        if(valor>0 && valor<100){
            if(valor == 12){
                console.log("Felicidades, adivinaste el número secreto.");
                console.log(arr);
                resultado=true;
            }else{
                console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
                arr[i]=valor;
                i++;
                resultado=false;
            }

        } else{
            console.log("Ingresa un valor entre el 1 y el 100.");
            arr[i]=valor;
            i++;
            resultado=false;
        }

    }

    while(resultado==false);