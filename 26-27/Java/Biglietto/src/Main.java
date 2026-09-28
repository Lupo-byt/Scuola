import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 1. Test Biglietto Standard
        System.out.println("--- TEST BIGLIETTO STANDARD ---");
        // Biglietto da 3 corse a 2.0€ l'una (Totale atteso: 6.0€)
        Biglietto bigliettoStandard = new Biglietto("STD-123", 3, 2.0);
        System.out.println("Costo totale biglietto standard: €" + bigliettoStandard.getCosto());

        // Usiamo le corse per testare l'esaurimento
        bigliettoStandard.usaCorsa(); // Restano 2
        bigliettoStandard.usaCorsa(); // Resta 1
        bigliettoStandard.usaCorsa(); // Restano 0
        bigliettoStandard.usaCorsa(); // Deve dare errore (Corse esaurite)


        // 2. Test Biglietto Residenti
        System.out.println("\n--- TEST BIGLIETTO RESIDENTI ---");
        // Biglietto da 10 corse a 2.0€ l'una.
        // Totale base = 20.0€. Sconto 15% = 3.0€. Totale atteso: 17.0€
        BigliettoResidenti bigliettoResidenti = new BigliettoResidenti("RES-456", 10, 2.0, "Mario", "Rossi");
        System.out.println("Costo totale per il residente Mario Rossi: €" + bigliettoResidenti.getCosto());

        // Usiamo una corsa per verificare che il comportamento di base sia intatto
        bigliettoResidenti.usaCorsa();


        // 3. Test Biglietto Pro (Valido)
        System.out.println("\n--- TEST BIGLIETTO PRO (VALIDO) ---");
        // Creiamo una data di scadenza nel futuro (tra un mese)
        LocalDate scadenzaFutura = LocalDate.now().plusMonths(1);
        BigliettoPro bigliettoProValido = new BigliettoPro("PRO-789", 50.0, scadenzaFutura);

        // Il prezzo atteso è fisso: 50.0€
        System.out.println("Costo abbonamento PRO mensile: €" + bigliettoProValido.getCosto());

        // Usiamo due corse per dimostrare che non si esauriscono
        bigliettoProValido.usaCorsa();
        bigliettoProValido.usaCorsa();


        // 4. Test Biglietto Pro (Scaduto)
        System.out.println("\n--- TEST BIGLIETTO PRO (SCADUTO) ---");
        // Creiamo una data di scadenza nel passato (ieri)
        LocalDate scadenzaPassata = LocalDate.now().minusDays(1);
        BigliettoPro bigliettoProScaduto = new BigliettoPro("PRO-999", 50.0, scadenzaPassata);

        // Cerchiamo di usare il biglietto scaduto (Deve dare errore)
        bigliettoProScaduto.usaCorsa();
    }
}