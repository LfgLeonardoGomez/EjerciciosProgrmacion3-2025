console.log("Soy un console.log")

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


const traerInfo = async()=> {
    const res = await fetch(url)
    const data : irespuestaApi = await res.json()
    showCharacters(data.results)
    console.log(data)
}

const showCharacters = (characters : ipersonaje[])=>{
    const contenedor = document.getElementById("contenedor")
    
    characters.forEach(element =>{
        let frases = element.phrases
        const card = document.createElement("div")
        card.classList.add("contenedor_character-card")
        card.innerHTML = `
            <h2 class = "card_nombre_personaje">${element.name}</h2>
            <img class = "card_imagen" src = "https://cdn.thesimpsonsapi.com/500${element.portrait_path}" alt = "${element.name}">
            <p class = "card_frases">Frases: ${frases[0]}</P>
            `;
        
        contenedor?.appendChild(card)
        


    })
}

traerInfo()


