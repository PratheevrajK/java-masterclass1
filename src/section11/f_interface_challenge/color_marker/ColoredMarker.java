package section11.f_interface_challenge.color_marker;

public class ColoredMarker {
    private final Color color;
    private final Marker symbol;

    public ColoredMarker(Color color, Marker symbol) {
        this.color = color;
        this.symbol = symbol;
    }

    public String getColoredMarker() {
        return color + " " + symbol;
    }
}
