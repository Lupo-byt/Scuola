public class Biglietto {
    // Utilizziamo protected per permettere l'accesso diretto alle sottoclassi
    // (oppure potremmo usare private e fornire i metodi getter/setter)
    protected String idBiglietto;
    protected int numeroCorse;
    protected double prezzoBiglietto;
    protected int corseUtilizzate;

    public Biglietto(String idBiglietto, int numeroCorse, double prezzoBiglietto) {
        this.idBiglietto = idBiglietto;
        this.numeroCorse = numeroCorse;
        this.prezzoBiglietto = prezzoBiglietto;
        this.corseUtilizzate = 0; // Inizialmente 0 corse utilizzate
    }

    public double getCosto() {
        return prezzoBiglietto * numeroCorse;
    }

    public boolean usaCorsa() {
        if (corseUtilizzate < numeroCorse) {
            corseUtilizzate++;
            System.out.println("Corsa utilizzata. Corse rimanenti: " + (numeroCorse - corseUtilizzate));
            return true;
        } else {
            System.out.println("Attenzione: Corse esaurite per il biglietto " + idBiglietto);
            return false;
        }
    }
}
