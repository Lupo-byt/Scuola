import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Abitazione{
    private String address;
    private double surface;
    private int roomsNumb;
    private String cadastralCategory;
    private Map<String, Integer> metriQuadri;

    public Abitazione() {
        this.metriQuadri = new HashMap<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getRoomsNumb() {
        return roomsNumb;
    }

    public void setRoomsNumb(int roomsNumb) {
        this.roomsNumb = roomsNumb;
    }

    public String getCadastralCategory() {
        return cadastralCategory;
    }

    public void setCadastralCategory(String cadastralCategory) {
        this.cadastralCategory = cadastralCategory;
    }

    public void aggiungiStanza(String tipoStanza, int mQ){
        metriQuadri.put(tipoStanza.toLowerCase(), mQ);
    }

    public int mQ(List<String> stanze) {
        int totale = 0;

        for (String stanza : stanze) {
            Integer mq = metriQuadri.get(stanza.toLowerCase());
            if(mq == null)
                throw new IllegalArgumentException("Tipo di stanza non riconosciuto: " + stanza);
            totale += mq;
        }

        return totale;
    }


}
