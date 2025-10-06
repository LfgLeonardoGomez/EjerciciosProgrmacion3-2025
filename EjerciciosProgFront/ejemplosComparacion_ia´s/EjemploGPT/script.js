

const canvas = document.getElementById('bg');
const ctx = canvas.getContext('2d');

let w = window.innerWidth;
let h = window.innerHeight;
canvas.width = w;
canvas.height = h;

window.addEventListener('resize', () => {
  w = window.innerWidth;
  h = window.innerHeight;
  canvas.width = w;
  canvas.height = h;
});

const particles = [];

document.addEventListener('mousemove', e => {
  // Menos partículas por movimiento
  for (let i = 0; i < 2; i++) {
    particles.push({
      x: e.clientX + (Math.random() - 0.5) * 25,
      y: e.clientY + (Math.random() - 0.5) * 25,
      radius: 35 + Math.random() * 30,
      // opacidad inicial más baja y variable
      alpha: 0.1 + Math.random() * 0.25,
      decay: 0.004 + Math.random() * 0.008
    });
  }
});

function animate() {
  // Fondo gris sólido en cada frame para evitar “manchas”
  ctx.fillStyle = '#2b2b2b';
  ctx.fillRect(0, 0, w, h);

  // Dibujar partículas
  for (let i = particles.length - 1; i >= 0; i--) {
    const p = particles[i];

    const g = ctx.createRadialGradient(p.x, p.y, 0, p.x, p.y, p.radius);
    g.addColorStop(0, `rgba(255,255,255,${p.alpha})`);
    g.addColorStop(1, `rgba(255,255,255,0)`);

    ctx.fillStyle = g;
    ctx.beginPath();
    ctx.arc(p.x, p.y, p.radius, 0, Math.PI * 2);
    ctx.fill();

    p.alpha -= p.decay;
    if (p.alpha <= 0) particles.splice(i, 1);
  }

  requestAnimationFrame(animate);
}

animate();
