const numero = prompt("Ingresa un numero");
const valor = parseInt(numero);
const fibonacci = new Array(valor); 
fibonacci.fill(0);   
      
    // Seed value for 1st element
    fibonacci[0] = 0; 
      
    // Seed value for 2nd element
    fibonacci[1] = 1;  
      
    for(let i = 2; i < valor; i++) {
  
        // Apply basic Fibonacci formulae
        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];  
    }
  
    // Print the series
    console.log(fibonacci);