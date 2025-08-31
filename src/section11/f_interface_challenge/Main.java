package section11.f_interface_challenge;

import section11.f_interface_challenge.color_marker.Color;
import section11.f_interface_challenge.color_marker.ColoredMarker;
import section11.f_interface_challenge.color_marker.LineMarker;
import section11.f_interface_challenge.color_marker.PointMarker;
import section11.f_interface_challenge.enums.*;
import section11.f_interface_challenge.instances.Building;
import section11.f_interface_challenge.instances.MetroLine;
import section11.f_interface_challenge.instances.interfaces.Mappable;

public class Main {
    public static void main(String[] args) {
        ColoredMarker coloredMarker1 = new ColoredMarker(Color.RED, PointMarker.STAR);
        Mappable map1 = new Building(coloredMarker1, "Butterfly Building", UsageType.BUSINESS);

        ColoredMarker coloredMarker2 = new ColoredMarker(Color.GREEN, LineMarker.SOLID);
        Mappable map2 = new MetroLine(coloredMarker2, "BLR Purple Line", UtilityType.METRO);

        ColoredMarker coloredMarker3 = new ColoredMarker(Color.WHITE, LineMarker.DOTTED);
        Mappable map3 = new MetroLine(coloredMarker3, "KA network", UtilityType.OPTICAL_FIBRE);

        Mappable.printProperties(map1);
        Mappable.printProperties(map2);
        Mappable.printProperties(map3);
        //"properties":{"type": "POINT", "label": "Butterfly Building (BUSINESS)", "marker": "RED STAR", "name":"Butterfly Building", "usage":"BUSINESS"}
        //"properties":{"type": "LINE", "label": "BLR Purple Line (METRO)", "marker": "GREEN SOLID", "name":"BLR Purple Line", "utility":"METRO"}
        //"properties":{"type": "LINE", "label": "KA network (OPTICAL FIBRE)", "marker": "WHITE DOTTED", "name":"KA network", "utility":"OPTICAL FIBRE"}
    }
}
