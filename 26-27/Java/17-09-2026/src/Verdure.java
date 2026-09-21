public class Verdure {
    private String nome;
    private int quantitaGrammi;

    public Verdure(String nome, int quantitaGrammi) {
        this.nome = nome;
        this.quantitaGrammi = quantitaGrammi;
    }

    public String getNome() { return nome; }
    public int getQuantitaGrammi() { return quantitaGrammi; }

    // Il metodo toString ci torna comodo per stampare i dettagli in modo leggibile
    @Override
    public String toString() {
        return nome + " (" + quantitaGrammi + "g)";
    }
}