// Seleziono tutti gli elementi con la classe "luce" e il bottone
const luci = document.querySelectorAll('.luce');
const bottone = document.getElementById('bottone-cambia');

// Array con la sequenza dei colori richiesta
const colori = ['red', 'yellow', 'green'];

// Inizializzo lo stato a -1 (che corrisponde al semaforo tutto bianco)
let statoCorrente = -1; 

bottone.addEventListener('click', () => {
    // 1. Resetta tutte le luci al colore bianco di default
    luci.forEach(luce => luce.style.backgroundColor = 'white');

    // 2. Incrementa lo stato corrente (passa da -1 a 0, poi 1, 2 e ricomincia da 0)
    statoCorrente = (statoCorrente + 1) % colori.length;

    // 3. Applica il colore corretto alla luce corrispondente all'indice attuale
    luci[statoCorrente].style.backgroundColor = colori[statoCorrente];
});