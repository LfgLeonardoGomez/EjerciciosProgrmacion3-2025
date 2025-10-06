// punto 1
// Se pide al usuario 5 palabras y las mostramos usando un forEach

alert("ingresa 5 palabras...")
let palabras = []
for(let i = 1 ; i<6 ; i++){
    let palabra = prompt("Ingresa palabra numero " + i + ": ")
    palabras.push(palabra)
}
console.log(palabras)
palabras.forEach((palabra,i)=>{
    console.log(`Palabra numero ${i + 1} : ${palabra}`)
})
 // puntos 2 y 3

 //inserta "hola" en la primer posicion
palabras[0] = "Hola"
// inserta en la ultima posicion
palabras.push("???")
// borra los elementos dentro de un rango, en este caso es el elemento en posicion 1
palabras.splice(1,1)

// mostramos el arreglo modificado con la longitud de cada uno
palabras.forEach((palabra,i)=>{
    let resp = `Palabra numero ${i + 1} : ${palabra}`
    let long = palabra.length
    console.log(resp + `, tiene ${long} letras`)
})
console.log("--------------------------------")

// muestro la palabra mas larga del arreglo con su longitud
let palabraMAsLarga = masLarga(palabras)
console.log(`La palabra mas larga es : ${palabraMAsLarga} con ${palabraMAsLarga.length} letras.`)
//muestro si el arreglo incluye la letra "a" en alguno de sus elementos
incluye(palabras,"a")

// punto 4
// tomo cada palabra del arreglo, la transformo en un arreglo con split, uso .reverse para invertir las letras
// y el .join para volver a armar el string. por ultimo el map devuelve un array nuevo
let invertidos = palabras.map(palabra => palabra.split("").reverse().join(""))
const mensajeAlert = invertidos.join(" - ")
alert(`palabras invertidas!!!!! \n ${mensajeAlert}`)

// punto 5
//tomo una respuesta y uso lowerCase.
const resp = prompt("Desea comprobar si las palabras ingresadas son palindromos?").toLowerCase()


if(resp === "si"){
    //llamo al metodo si la respuesta es si
    const palind = comprobarPalindromos(palabras, invertidos)

    //si el arreglo esta vacio
    if(palind.length === 0){
        alert("No hay palindromos en el grupo de palabras")
    }else{
        //si tiene elementos los concatena y los muestra
        let texto = palind.join("\n")
        alert(`Las siguientes palabras son palindromos: \n ${texto}`)
    }
    
}

// punto 6 Extras

    //filtra las palabras que tienen mas de 4 caracteres
    const masDe4 = palabras.filter(palabra => palabra.length > 4)
    //guarda y muestra esas palabras
    let text = masDe4.join("-")
    alert(`Hay ${masDe4.length} palabras con mas de 4 caracteres: \n ${text}`)




// Funciones //
function masLarga(palabras){
    let max = palabras[0]
    palabras.forEach((palabra, i)=>{
        if(palabra.length > max.length){
            max = palabra
        }
    })
    return max
}

function incluye(palabras, a){
    // busco la primer coincidencia
    const existe = palabras.some(palabra => palabra.includes(a))

    if(existe){
          console.log(`Existen palabras en el array que contienen la letra ${a}`);
    }else{
        console.log(`No existen palabras en el array que contengan la letra ${a}`);
    }
}

function comprobarPalindromos(palabras,invertidos){
    const palindromos =[]
    palabras.forEach((palabra, i)=>{
        //compara indice por indice en ambos arrays, si coinciden agrega la palabra a palindromos 
        if(palabra === invertidos[i]){
            palindromos.push(palabra)
        }
    })
    return palindromos
}

//funcion mas reducida para comprobar palindromos
function comprobarPalindromos2(palabras) {
  return palabras.filter(p => p === p.split("").reverse().join(""));
}

