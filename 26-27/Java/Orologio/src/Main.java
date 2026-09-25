public class Main {
    public static void main(String[] args) {
        // Istanze della classe Orologio
        Orologio orologio1 = new Orologio("Rolex", "Datejust", 7500.00f);
        Orologio orologio2 = new Orologio("Casio", "F-91W", 20.00f);

        // Istanze della classe OrologioSubacqueo
        OrologioSubacqueo subacqueo1 = new OrologioSubacqueo("Omega", "Seamaster", 6000.00f, 300);
        OrologioSubacqueo subacqueo2 = new OrologioSubacqueo("Seiko", "Prospex", 500.00f, 200);

        // Test della corretta inizializzazione stampando alcuni valori
        System.out.println("Orologio 1: " + orologio1.getMarca() + " " + orologio1.getModello() + " - Prezzo: €" + orologio1.getPrezzo());
        System.out.println("Subacqueo 1: " + subacqueo1.getMarca() + " (Profondità max: " + subacqueo1.getProfonditaMassima() + "m)");

        // Test dei metodi
        System.out.println("\n--- Test Metodi ---");
        orologio2.mostraOrario();
        subacqueo2.attivaModalitaImmersione();
    }
}