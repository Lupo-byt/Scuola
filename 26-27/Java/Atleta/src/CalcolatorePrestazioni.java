public class CalcolatorePrestazioni {

    // Calcola la frequenza cardiaca massima teorica
    public double calcolaFrequenzaMassima(int eta) {
        return 220 - eta;
    }

    // Valuta lo stato della pressione sanguigna
    public String valutaPressione(int max, int min) {
        if (max > 140 || min > 90) {
            return "Pressione Alta";
        } else {
            return "Pressione Regolare";
        }
    }

    // Stima l'energia spendibile in base a peso ed età
    public double stimaEnergia(double peso, int eta) {
        if (eta == 0) {
            throw new IllegalArgumentException("L'età non può essere zero.");
        }
        return (peso * 10.0) / eta;
    }
}