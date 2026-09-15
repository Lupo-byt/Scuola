function MediaVoti (voti) {
    let somma = 0
    for (let i = 0; i < voti.length; i++) {
        somma += voti[i];
    }
    return somma / voti.length;
}

console.log(MediaVoti([8, 7, 9, 6, 10, 4, 2])); // Restituisce la media dei voti