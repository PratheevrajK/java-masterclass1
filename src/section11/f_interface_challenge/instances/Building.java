package section11.f_interface_challenge.instances;

import section11.f_interface_challenge.instances.interfaces.Mappable;
import section11.f_interface_challenge.color_marker.ColoredMarker;
import section11.f_interface_challenge.enums.GeometryType;
import section11.f_interface_challenge.enums.UsageType;

public class Building implements Mappable {
    protected ColoredMarker marker;
    protected String name;
    protected String usage;

    public Building(ColoredMarker marker, String name, UsageType usage) {
        this.marker = marker;
        this.name = name;
        this.usage = usage.getName();
    }

    @Override
    public String getLabel() {
        return "%s (%s)".formatted(name, usage);
    }

    @Override
    public GeometryType getType() {
        return GeometryType.POINT;
    }

    @Override
    public String getMarker() {
        return marker.getColoredMarker();
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name":"%s", "usage":"%s""".formatted(this.name, this.usage);
    }
}
