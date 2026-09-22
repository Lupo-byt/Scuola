// Array globale per memorizzare i voti man mano che vengono inseriti
let arrayVoti = [];

// La tua funzione originale, con un controllo per evitare la divisione per zero
function MediaVoti(voti) {
    if (voti.length === 0) return 0; 
    
    let somma = 0;
    for (let i = 0; i < voti.length; i++) {
        somma += voti[i];
    }
    console.log("Somma dei voti:", somma); // Log della somma per debug
    return somma / voti.length;
}

// Aspettiamo che tutto l'HTML sia caricato prima di cercare gli elementi
document.addEventListener('DOMContentLoaded', () => {
    // Selezioniamo gli elementi dell'interfaccia tramite il loro ID
    const inputVoto = document.getElementById('inputVoto');
    const btnAggiungi = document.getElementById('btnAggiungi');
    const listaVoti = document.getElementById('listaVoti');
    const risultatoMedia = document.getElementById('risultatoMedia');

    // Aggiungiamo un evento al click del bottone
    btnAggiungi.addEventListener('click', () => {
        // Preleviamo il valore dall'input e lo convertiamo in un numero decimale
        const nuovoVoto = parseFloat(inputVoto.value);

        // Verifichiamo che l'utente abbia inserito un numero valido
        if (!isNaN(nuovoVoto) && nuovoVoto > 0) {
            
            // Aggiungiamo il voto all'array
            arrayVoti.push(nuovoVoto);

            // Aggiorniamo il testo sulla pagina web mostrando i voti separati da virgola
            listaVoti.textContent = arrayVoti.join(', ');

            // Calcoliamo la media usando la tua funzione
            const mediaCalcolata = MediaVoti(arrayVoti);

            // Mostriamo la media arrotondata a due cifre decimali
            risultatoMedia.textContent = mediaCalcolata.toFixed(2);

            // Svuotiamo il campo di input per il prossimo voto
            inputVoto.value = '';
            inputVoto.focus();
            
        } else {
            alert("Per favore, inserisci un numero valido.");
        }
    });
});