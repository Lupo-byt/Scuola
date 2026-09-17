public enum Spezia {
    PEPE_NERO("Pepe Nero", "Frutto", "Piccante"),
    PEPERONCINO("Peperoncino", "Frutto", "Piccante"),
    CANNNELLA("Cannella", "Corteccia", "Dolce"),
    CURCUMA("Curcuma", "Radice/Rizoma", "Terroso"),
    ZENZERO("Zenzero", "Radice/Rizoma", "Fresco/Piccante"),
    CUMINO("Cumino", "Seme", "Aromatico"),
    NOCE_MOSCATA("Noce Moscata", "Seme", "Caldo/Dolce"),
    PAPRIKA("Paprika", "Frutto essiccato", "Affumicato/Dolce"),
    CARDAMOMO("Cardamomo", "Seme", "Agrumato/Balsamico"),
    CHIODO_DI_GAROFANO("Chiodo di Garofano", "Bocciolo floreale", "Intenso/Caldo"),
    CORIANDOLO("Coriandolo", "Seme", "Agrumato/Erbe"),
    ANICE_STELLATO("Anice Stellato", "Frutto", "Dolce/Anice"),
    ZAFFERANO("Zafferano", "Stigma del fiore", "Aromatico/Amaro"),
    SENAPE("Senape", "Seme", "Piccante/Pungente"),
    FINOCCHIETTO("Finocchietto", "Seme", "Dolce/Anice"),
    VANIGLIA("Vaniglia", "Baccello", "Dolce"),
    SOMMACCO("Sommacco", "Frutto essiccato", "Acidulo"),
    CURRY("Curry (Miscela)", "Mix di spezie", "Speziato/Complesso"),
    MACIS("Macis", "Arillo della noce moscata", "Delicato/Speziato"),
    GALANGA("Galanga", "Radice", "Piccante/Citrus");

    private final String nome;
    private final String partePianta;
    private final String profiloAromatico;

    Spezia(String nome, String partePianta, String profiloAromatico) {
        this.nome = nome;
        this.partePianta = partePianta;
        this.profiloAromatico = profiloAromatico;
    }

    public String getNome() {
        return nome;
    }

    public String getPartePianta() {
        return partePianta;
    }

    public String getProfiloAromatico() {
        return profiloAromatico;
    }
}