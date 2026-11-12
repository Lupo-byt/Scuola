document.addEventListener('DOMContentLoaded', () => {
  const themeToggle = document.getElementById('themeToggle');
  const body = document.body;

  // Recupera il tema salvato, di default imposta 'light'
  const savedTheme = localStorage.getItem('app-theme') || 'light';

  // Inizializza l'interfaccia in base al tema salvato
  if (savedTheme === 'dark') {
    body.classList.replace('light', 'dark');
    themeToggle.textContent = '☀️ Tema Light';
  }

  // Gestione click sul pulsante
  themeToggle.addEventListener('click', () => {
    if (body.classList.contains('light')) {
      body.classList.replace('light', 'dark');
      themeToggle.textContent = '☀️ Tema Light';
      localStorage.setItem('app-theme', 'dark');
    } else {
      body.classList.replace('dark', 'light');
      themeToggle.textContent = '🌙 Tema Dark';
      localStorage.setItem('app-theme', 'light');
    }
  });
});