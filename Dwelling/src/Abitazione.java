public class Abitazione extends Stanza {
    private String address;
    private double surface;
    private int roomsNumb;
    private String cadastralCategory;

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


    public static int mQ(int numRooms) {

        for (int i = 0; i < numRooms; i++) {

        }
        
        return 0;
    }

}
