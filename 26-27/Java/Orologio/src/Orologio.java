public class Orologio {
    // Attributi privati
    private String marca;
    private String modello;
    private float prezzo;

    // Costruttore
    public Orologio(String marca, String modello, float prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    // Metodi pubblici definiti nell'UML
    public void mostraOrario() {
        System.out.println("Mostrando l'orario sul " + marca + " " + modello + "...");
    }

    public void impostaOra() {
        System.out.println("Impostando l'ora sul " + marca + " " + modello + "...");
    }

    // Getter e Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
}