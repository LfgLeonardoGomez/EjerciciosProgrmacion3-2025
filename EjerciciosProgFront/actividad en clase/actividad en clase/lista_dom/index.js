const formulario = document.getElementById("formulario"),
  input = document.getElementById("item"),
  lista = document.getElementById("lista");

formulario.addEventListener("submit", (e) => {
  e.preventDefault(); // evita que recargue
  
  const inputItem = input.value.trim()
  
    if(inputItem === ""){
        alert("Esto esta vacio")
        return null
    }

    const nuevoItem = document.createElement("li")
    nuevoItem.textContent = inputItem

    nuevoItem.addEventListener("click",()=>{
        lista.removeChild(nuevoItem)
    })


    lista.appendChild(nuevoItem)

    input.value = ""

});
