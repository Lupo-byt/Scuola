public class Atleta {
    private String nome;
    private String cognome;
    private int eta;
    private double peso;
    private int pressioneMassima;
    private int pressioneMinima;

    // Costruttore
    public Atleta(String nome, String cognome, int eta, double peso, int pressioneMassima, int pressioneMinima) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.peso = peso;
        this.pressioneMassima = pressioneMassima;
        this.pressioneMinima = pressioneMinima;
    }

    // Getter e Setter
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    public int getEta() { return eta; }
    public void setEta(int eta) { this.eta = eta; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public int getPressioneMassima() { return pressioneMassima; }
    public void setPressioneMassima(int pressioneMassima) { this.pressioneMassima = pressioneMassima; }

    public int getPressioneMinima() { return pressioneMinima; }
    public void setPressioneMinima(int pressioneMinima) { this.pressioneMinima = pressioneMinima; }

    @Override
    public String toString() {
        return nome + " " + cognome + " (Età: " + eta + " anni, Peso: " + peso + " kg, Pressione: " + pressioneMassima + "/" + pressioneMinima + " mmHg)";
    }
}