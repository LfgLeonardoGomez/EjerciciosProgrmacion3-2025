document.addEventListener('DOMContentLoaded', () => {
    const canvas = document.getElementById('smoke-canvas');
    const ctx = canvas.getContext('2d');

    // Ajustar el tamaño del canvas a la pantalla
    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;

    let particles = [];
    let isMouseMoving = false;
    let mouseTimeout;

    const mouse = {
        x: null,
        y: null
    };

    // Detectar movimiento del mouse
    window.addEventListener('mousemove', (e) => {
        mouse.x = e.x;
        mouse.y = e.y;
        isMouseMoving = true;

        // Si el mouse se detiene, las partículas dejarán de crearse
        clearTimeout(mouseTimeout);
        mouseTimeout = setTimeout(() => {
            isMouseMoving = false;
        }, 100); // Tiempo de inactividad para considerar que el mouse se detuvo
    });

    class Particle {
        constructor() {
            this.x = mouse.x;
            this.y = mouse.y;
            // Movimiento aleatorio para dispersar el humo
            this.vx = Math.random() * 2 - 1;
            this.vy = Math.random() * 2 - 1;
            // Tamaño y opacidad iniciales
            this.size = Math.random() * 25 + 25; // Tamaño más grande
            this.alpha = 0.5; // Opacidad inicial
            this.life = 0;
        }

        update() {
            this.life += 0.015; // Velocidad de desvanecimiento
            if (this.alpha > this.life) {
                this.alpha -= this.life / 20;
                this.size += 0.2; // La partícula se expande
                this.x += this.vx;
                this.y += this.vy;
            } else {
                // Eliminar la partícula cuando es invisible
                const index = particles.indexOf(this);
                if (index > -1) {
                    particles.splice(index, 1);
                }
            }
        }

        draw() {
            ctx.beginPath();
            // Crear un gradiente radial para el efecto de "luz" o "humo"
            const gradient = ctx.createRadialGradient(this.x, this.y, 0, this.x, this.y, this.size);
            gradient.addColorStop(0, `rgba(255, 255, 255, ${this.alpha * 0.2})`); // Centro más brillante
            gradient.addColorStop(0.4, `rgba(255, 255, 255, ${this.alpha * 0.1})`);
            gradient.addColorStop(1, `rgba(255, 255, 255, 0)`); // Borde transparente

            ctx.fillStyle = gradient;
            ctx.arc(this.x, this.y, this.size, 0, Math.PI * 2);
            ctx.fill();
        }
    }

    function animate() {
        // Limpiar el canvas con un color semi-transparente para un efecto de estela
        ctx.fillStyle = 'rgba(26, 26, 26, 0.2)';
        ctx.fillRect(0, 0, canvas.width, canvas.height);
        
        // Solo crear nuevas partículas si el mouse se está moviendo
        if (isMouseMoving) {
            for (let i = 0; i < 2; i++) { // Crear 2 partículas por frame para un rastro más denso
                particles.push(new Particle());
            }
        }

        // Actualizar y dibujar cada partícula
        for (let i = 0; i < particles.length; i++) {
            particles[i].update();
            particles[i].draw();
        }

        requestAnimationFrame(animate);
    }

    // Iniciar la animación
    animate();

    // Redimensionar el canvas si cambia el tamaño de la ventana
    window.addEventListener('resize', () => {
        canvas.width = window.innerWidth;
        canvas.height = window.innerHeight;
    });
});