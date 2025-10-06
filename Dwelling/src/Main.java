import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Abitazione abitazione = new Abitazione();
        abitazione.addRoom("soggiorno", 28);
        abitazione.addRoom("camera", 18);
        abitazione.addRoom("cucina", 14);
        abitazione.addRoom("bagno", 7);
        abitazione.addRoom("studio", 11);

        List<String> stanze = new ArrayList<>(Arrays.asList("soggiorno", "camera", "camera", "cucina", "bagno", "bagno", "studio"));

        int mq = abitazione.mQ(stanze);

        System.out.println("L'abitazione ha circa " + mq + " m².");
    }
}