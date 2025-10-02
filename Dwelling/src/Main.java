import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Abitazione abitazione = new Abitazione();
        abitazione.aggiungiStanza("soggiorno", 28);
        abitazione.aggiungiStanza("camera", 18);
        abitazione.aggiungiStanza("cucina", 14);
        abitazione.aggiungiStanza("bagno", 7);
        abitazione.aggiungiStanza("studio", 11);

        List<String> stanze = new ArrayList<>(Arrays.asList("soggiorno", "camera", "camera", "cucina", "bagno", "bagno", "studio"));

        int mq = abitazione.mQ(stanze);

        System.out.println("L'abitazione ha circa " + mq + " m².");
    }
}