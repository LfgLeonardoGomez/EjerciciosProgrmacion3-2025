class Cuadrado {
  /*
  atributos
  color;
  ancho;
  alto;
  x;
  y;
  contenedor;
  elemento;
  */
  constructor(color, ancho, alto, x, y, contenedor) {
    //definimos propiedades del objeto
    this.color = color;
    this.ancho = ancho;
    this.alto = alto;
    this.x = x;
    this.y = y;
    //contenedor del padre que es el relativo
    this.contenedor = contenedor;
    //lo ocupamos para crear el objeto en html
    this.elemento = document.createElement("div");
    //creamos el div en base a las propiedades del objeto
    this.elemento.classList.add("cuadrado");
    this.elemento.style.backgroundColor = this.color;
    this.elemento.style.width = this.ancho + "px";
    this.elemento.style.height = this.alto + "px";

    this.dibujar();
    //anadimos evento de click
    this.elemento.addEventListener("click", () => {
      if (Cuadrado.activo === this) {
        Cuadrado.setActivo(null);
      } else {
        Cuadrado.setActivo(this);
      }
    });

    //colocamos el nuevo cuadrado en la caja relativa =>appenchild
    this.contenedor.appendChild(this.elemento);
  }

  dibujar() {
    this.elemento.style.top = this.y + "px";
    this.elemento.style.left = this.x + "px";
  }

  //se tiene que acercar a 0 para mover arriba
  moverArriba() {
    //top 0 es el borde sup de la caja relativa
    if (this.y > 0) {
      this.y -= 10;
      this.dibujar();
    }
  }
  moverAbajo() {
    //alto conenedor padre - alto del cuadrado
    const limite = this.contenedor.clientHeight - this.alto - 4;
    if (this.y < limite) {
      this.y += 10;
      this.dibujar();
    }
  }

  moverDerecha() {
    //ancho conenedor padre - ancho del cuadrado
    const limite = this.contenedor.clientWidth - this.ancho - 4;
    if (this.x < limite) {
      this.x += 10;
      this.dibujar();
    }
  }
  moverIzquierda() {
    //left 0 es el borde izq de la caja relativa
    if (this.x > 0) {
      this.x -= 10;
      this.dibujar();
    }
  }

  //metodo de la clase que permite guardar el activo
  static setActivo(cuadradoActivo) {
    if (Cuadrado.activo) {
      Cuadrado.activo.elemento.classList.remove("activo");
    }
    Cuadrado.activo = cuadradoActivo;
    cuadradoActivo.elemento.classList.add("activo");
  }
}

const $contenedor = document.getElementById("contenedor");

const cuadrado1 = new Cuadrado("green", 60, 60, 300, 0, $contenedor);
const cuadrado2 = new Cuadrado("red", 60, 60, 100, 0, $contenedor);
const cuadrado3 = new Cuadrado("blue", 100, 100, 150, 100, $contenedor);

document.addEventListener("keydown", (e) => {
  switch (e.key) {
    case "ArrowUp":
      Cuadrado.activo.moverArriba();
      break;
    case "ArrowRight":
      Cuadrado.activo.moverDerecha();
      break;
    case "ArrowLeft":
      Cuadrado.activo.moverIzquierda();
      break;
    case "ArrowDown":
      Cuadrado.activo.moverAbajo();
      break;

    default:
      console.log("apretaste otra");
      break;
  }
});
