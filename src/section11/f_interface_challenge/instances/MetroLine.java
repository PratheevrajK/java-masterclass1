package section11.f_interface_challenge.instances;

import section11.f_interface_challenge.instances.interfaces.Mappable;
import section11.f_interface_challenge.color_marker.ColoredMarker;
import section11.f_interface_challenge.enums.GeometryType;
import section11.f_interface_challenge.enums.UtilityType;

public class MetroLine implements Mappable {
    public ColoredMarker marker;
    public String name;
    public String utility;

    public MetroLine(ColoredMarker marker, String name, UtilityType utility) {
        this.marker = marker;
        this.name = name;
        this.utility = utility.getName();
    }

    @Override
    public String getLabel() {
        return "%s (%s)".formatted(name, utility);
    }

    @Override
    public GeometryType getType() {
        return GeometryType.LINE;
    }

    @Override
    public String getMarker() {
        return marker.getColoredMarker();
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name":"%s", "utility":"%s""".formatted(this.name, this.utility);
    }
}
