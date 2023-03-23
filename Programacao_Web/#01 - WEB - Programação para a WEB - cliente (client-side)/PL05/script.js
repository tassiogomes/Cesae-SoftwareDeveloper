const navLinks = document.querySelectorAll('nav ul li a');

for (const link of navLinks) {
  link.addEventListener('click', (event) => {
    event.preventDefault();
    removeActiveClass();
    link.classList.add('active');
    const target = event.target.getAttribute('href');
    const section = document.querySelector(target);
    section.scrollIntoView({ behavior: 'smooth' });
  });
}

function removeActiveClass() {
  const activeLinks = document.querySelectorAll('.active');
  for (const link of activeLinks) {
    link.classList.remove('active');
  }
}



