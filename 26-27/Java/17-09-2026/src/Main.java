import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        GeneratorePietanze chef = new GeneratorePietanze();

        // --- Piatto 1: Un Risotto ---
        Pietanza piatto1 = chef.creaPiatto(
                BasePiatto.RISO,
                Arrays.asList(Verdura.ZUCCHINA, Verdura.FIOR_DI_ZUCCA), // FIOR_DI_ZUCCA lo immaginiamo se espandi l'enum
                Arrays.asList(Spezia.ZAFFERANO, Spezia.PEPE_NERO),
                TipoCottura.PADELLA
        );

        // --- Piatto 2: Un Filetto di Pesce ---
        Pietanza piatto2 = chef.creaPiatto(
                BasePiatto.PESCE,
                Arrays.asList(Verdura.PATATA, Verdura.POMODORO),
                Arrays.asList(Spezia.ZENZERO, Spezia.CORIANDOLO),
                TipoCottura.FORNO
        );

        // Stampiamo i risultati
        System.out.println("IL MENÙ DI OGGI:\n");
        piatto1.stampaRicetta();
        piatto2.stampaRicetta();
    }
}