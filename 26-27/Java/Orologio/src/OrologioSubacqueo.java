public class OrologioSubacqueo extends Orologio {
    // Attributo privato specifico della sottoclasse
    private int profonditaMassima;

    // Costruttore che richiama anche quello della superclasse
    public OrologioSubacqueo(String marca, String modello, float prezzo, int profonditaMassima) {
        super(marca, modello, prezzo);
        this.profonditaMassima = profonditaMassima;
    }

    // Metodo pubblico definito nell'UML
    public void attivaModalitaImmersione() {
        System.out.println("Modalità immersione attivata! Profondità massima supportata: " + profonditaMassima + "m.");
    }

    // Getter e Setter
    public int getProfonditaMassima() {
        return profonditaMassima;
    }

    public void setProfonditaMassima(int profonditaMassima) {
        this.profonditaMassima = profonditaMassima;
    }
}