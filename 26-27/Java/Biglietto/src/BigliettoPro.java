import java.time.LocalDate;

public class BigliettoPro extends Biglietto{
    private LocalDate dataScadenza;
    private double prezzoFisso;

    public BigliettoPro(String idBiglietto, double prezzoFisso, LocalDate dataScadenza) {
        // Passiamo parametri dummy per numeroCorse e prezzoBiglietto
        // in quanto non verranno usati nella logica di questa specifica sottoclasse
        super(idBiglietto, 1, 0.0);
        this.prezzoFisso = prezzoFisso;
        this.dataScadenza = dataScadenza;
    }

    @Override
    public double getCosto() {
        return this.prezzoFisso;
    }

    @Override
    public boolean usaCorsa() {
        if (LocalDate.now().isAfter(dataScadenza)) {
            System.out.println("Il biglietto Pro " + idBiglietto + " è scaduto!");
            return false;
        } else {
            System.out.println("Corsa effettuata. (Biglietto Pro, corse illimitate)");
            return true;
        }
    }
}
