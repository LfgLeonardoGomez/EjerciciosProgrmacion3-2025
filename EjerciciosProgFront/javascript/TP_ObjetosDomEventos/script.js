// Punto 1

// funcion declarativa, es la forma clasica de definir una funcion
//gracias al hoisting se pueden llamar antes de ser declaradas.
function numCuadrado(num){
    return num*num
}
// funcion expresada, se guardan en una variables, para poder ser utilizadas
// en diferentes funciones durante la ejecucion. NEcesitan ser declaradas antes
// de ser utilizadas
const numCubo = function(num){
    return num**3
}

// Punto 2

const mensaje = (nombre, edad = 18)=>{ return `Hola ${nombre}, tienes ${edad} años`}

// Punto 3
// las propiedades son pares clave-valor dentro de un objeto, mientras que los metodos
// son acciones que puede realizar dicho objeto

let persona = {
    nombre : "Juan",
    edad : 28,

    presentar(){
        return `Hola soy ${this.nombre} y tengo ${this.edad} años`
    }
}

// Punto 4
// Usar desestrcturacion permite una sintaxis mas consisa para
// obtener datos de un objeto
let {nombre,edad} = persona
console.log(`nombre: ${nombre}, edad: ${edad}`)

// Punto 5
//spread agrega los elementos de un objeto o array cuando se 
//esperan multiples elementos
 let array1 = ["juan", "carlos", "leo"]
 let array2 = [...array1, "Nahir", "leito"]

 //rest nos sirve en funciones, cuando no se sabe qué cantidad
 //de parametros vamos a recibir. y en desestructuracion para 
 //agrupar
 function sumar(...nums){
    return nums.reduce((a,b)=> a+b,0)
 }
 console.log(sumar(1,2,3,4,5))

 // Punto 6
// tomo el h1 del DOM y lo guardo en una variable
 const titulo  = document.getElementById("tituloH1")

 // modifico el contenido con textContent
 titulo.textContent = "Hola, ahora soy un titulo modificado"

// agrego elementos a la lista
//tomo la lista desde el DOM por su ID
const lista = document.getElementById("lista")

//creo 2 nuevos items
let nuevoItem1 = document.createElement("li")
let nuevoItem2 = document.createElement("li")

//modifico el contenido de los items
nuevoItem1.textContent = "Contacto"
nuevoItem2.textContent = "Copyright"

//agrego los items al elemento padre
lista.appendChild(nuevoItem1)
lista.appendChild(nuevoItem2)

//agrego clases al titulo TituloH1
titulo.classList.add("tituloResaltado")
//con toggle, si la clase no existe la agrega, y si ya existe la
//elimina

//titulo.classList.toggle("tituloResaltado")


// Punto 7 y 8
const inputList = document.getElementById("inputID")
const boton = document.getElementById("btn-1")
const formulario = document.getElementById("formulario")
//previene que la pagina se recargue
formulario.addEventListener("submit", (evento)=>{
    evento.preventDefault();

    
})

//uso el evento click, al escuchar el evento se captura el valor
// que tiene el input,si no esta vacio, y agrego un item adicional
boton.addEventListener("click",()=>{
    agregarItem()
})

// Punto 9

//con el evento keydown comparo para validar si se presiono Enter
//si es asi, agrego el item
inputList.addEventListener("keydown",(evento)=>{
    if(evento === "Enter"){
        agregarItem()
    }
})

// tomo el select del DOM
const select = document.getElementById("seleccionar")

//creo los elementos div y parrafo fuera del evento para que no se
// cree uno nuevo vada vez que se seleccione una accion
const div = document.getElementById("eleccion")
const parrafo = document.createElement("p")

//capturo el evento change, guardo la seleccion en una variable
// y muestro la seleccion en un <p>
select.addEventListener("change", ()=>{
    let seleccion = select.value
    console.log("elegiste " + seleccion)
    parrafo.textContent = `Seleccionaste ${seleccion} como tu lenguaje favorito`
    div.appendChild(parrafo)
})


// Funciones

function agregarItem(){
    const textoLabel = inputList.value.trim()
    if(textoLabel === ""){
        alert("No se puede guardar si esta vacio...")
        return
    }
    const nuevoItem = document.createElement("li")
    nuevoItem.textContent = textoLabel
    lista.appendChild(nuevoItem)
    alert("se agrego el item: " + textoLabel)
    inputList.value = ""
}


