
console.log("HOla mundo desde javascript");
const boton = document.getElementById("boton");
boton.addEventListener("click",() => {
    console.log("Se hizo click en el boton");
    alert("Boton presionado");

})
let persona = {
    nombre : "Ana" ,
    edad : 25,
    saludar: function(){
        console.log("Hola, soy " + this.nombre);
    }
}
console.log(persona.nombre)
persona.saludar()