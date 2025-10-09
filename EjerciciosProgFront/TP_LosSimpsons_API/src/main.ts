
interface irespuestaApi{
    count : number
    results : ipersonaje[]
}
interface ipersonaje {
    name : string
    age : number
    phrases : string[]
    portrait_path : string
}
const url = "https://thesimpsonsapi.com/api/characters"
// Funciones //

function sleep(ms: number) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

function ocultarBoton() {
  const boton = document.getElementById("boton_cargar");
  boton?.classList.add("boton_cargar_hidden");
}

function mostrarBoton() {
  const boton = document.getElementById("boton_cargar");
  boton?.classList.remove("boton_cargar_hidden");
}

function showLoading(){
    const seccionLoading = document.getElementById("seccion_loading")
    seccionLoading?.classList.remove("seccion_loading_hidden")
    seccionLoading?.classList.add("seccion_loading")
    ocultarBoton()
    setTimeout(()=>{
        hideLoading()
    mostrarBoton()
    },4000)
    
}
function hideLoading(){
    
    const seccionLoading = document.getElementById("seccion_loading")
    seccionLoading?.classList.add("seccion_loading_hidden")
    
}
function mostrarError(){
    const seccionError = document.getElementById("contenedor_error")
    seccionError?.classList.remove("contenedor_error_hidden")
    
    ocultarBoton()
    
    setTimeout(()=>{
        seccionError?.classList.add("contenedor_error_hidden")
        mostrarBoton()
    },4000)
    
}


function createCharacter(character : ipersonaje) : HTMLElement{
    let frases = character.phrases
        const card = document.createElement("div")
        card.classList.add("contenedor_character-card")
        card.innerHTML = `
            <h2 class = "card_nombre_personaje">${character.name}</h2>
            <img class = "card_imagen" src = "https://cdn.thesimpsonsapi.com/500${character.portrait_path}" alt = "${character.name}">
            <p class = "card_frases">Frases: ${frases[0]}</P>
            `;
            return card
}

function limpiarContenedorCharacters(){
    const contenedor = document.getElementById("contenedor")
    //  if(contenedor) {
    //     contenedor.innerHTML = ""
    //    }
    contenedor?.replaceChildren()
}

const renderCharacters = (characters : ipersonaje[])=>{
    const contenedor = document.getElementById("contenedor")
    characters.forEach(element =>{
            const card = createCharacter(element)
            contenedor?.appendChild(card)
     })
}
const fetchCharacter = async()=> {
    try{
        limpiarContenedorCharacters()
        showLoading()
        await sleep(4000)
        
        const res = await fetch(url)
        if(!res.ok){mostrarError();
            console.error()
            return} 
        const data : irespuestaApi = await res.json()
        renderCharacters(data.results) 


    }catch(error){
        console.log("ocurrio un error:", error)
        mostrarError()
    }
    
}


const botoncito = document.getElementById("boton_cargar")
botoncito?.addEventListener("click",fetchCharacter)
// llamadas a las funciones para pruebas 
//fetchCharacter()
//showLoading()
//setTimeout(()=>hideLoading(),4000)

 //hideLoading()
 //mostrarError()
