public class BigliettoResidenti extends Biglietto{
    private String nome;
    private String cognome;

    public BigliettoResidenti(String idBiglietto, int numeroCorse, double prezzoBiglietto, String nome, String cognome) {
        super(idBiglietto, numeroCorse, prezzoBiglietto);
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public double getCosto() {
        double costoBase = super.getCosto();
        return costoBase - (costoBase * 0.15);
    }
}
