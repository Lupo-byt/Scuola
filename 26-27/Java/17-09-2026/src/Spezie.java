public class Spezie {
    private String nome;
    private String intensita;

    public Spezie(String nome, String intensita) {
        this.nome = nome;
        this.intensita = intensita;
    }

    public String getNome() { return nome; }
    public String getIntensita() { return intensita; }

    @Override
    public String toString() {
        return nome + " (Intensita': " + intensita + ")";
    }
}