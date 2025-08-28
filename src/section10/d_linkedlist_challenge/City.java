package section10.d_linkedlist_challenge;

public class City {
    private String name;
    private int distanceFromDelhi;
    public City(String name, int distanceFromDelhi) {
        this.name = name;
        this.distanceFromDelhi = distanceFromDelhi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceFromDelhi() {
        return distanceFromDelhi;
    }

    public void setDistanceFromDelhi(int distanceFromDelhi) {
        this.distanceFromDelhi = distanceFromDelhi;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", distanceFromDelhi=" + distanceFromDelhi +
                '}';
    }
}
