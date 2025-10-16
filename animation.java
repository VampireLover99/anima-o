// JavaScript
window.addEventListener('scroll', () => {
  const alunos = document.querySelectorAll('.animar');
  alunos.forEach(aluno => {
    if (aluno.getBoundingClientRect().top < window.innerHeight) {
      aluno.classList.add('visivel');
    }
  });
});
