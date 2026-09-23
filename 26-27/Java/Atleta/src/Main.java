public class Main {
    public static void main(String[] args) {
        // Creazione di almeno 3 atleti diversi
        Atleta atleta1 = new Atleta("Mario", "Rossi", 25, 75.5, 120, 80);
        Atleta atleta2 = new Atleta("Giulia", "Bianchi", 42, 60.0, 145, 95);
        Atleta atleta3 = new Atleta("Luca", "Verdi", 30, 82.0, 130, 85);

        // Istanziazione del calcolatore di prestazioni
        CalcolatorePrestazioni calcolatore = new CalcolatorePrestazioni();

        // Array di atleti per testare le funzionalità
        Atleta[] atleti = {atleta1, atleta2, atleta3};

        System.out.println("=== REPORT PRESTAZIONI ATLETI ===");
        for (Atleta a : atleti) {
            System.out.println("\nAtleta: " + a);

            double freqMax = calcolatore.calcolaFrequenzaMassima(a.getEta());
            String statoPressione = calcolatore.valutaPressione(a.getPressioneMassima(), a.getPressioneMinima());
            double energia = calcolatore.stimaEnergia(a.getPeso(), a.getEta());

            System.out.println("- Frequenza cardiaca massima stimata: " + freqMax + " bpm");
            System.out.println("- Valutazione pressione: " + statoPressione);
            System.out.println("- Stima energia spendibile: " + String.format("%.2f", energia));
        }
    }
}