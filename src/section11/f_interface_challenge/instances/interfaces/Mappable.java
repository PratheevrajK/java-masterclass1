package section11.f_interface_challenge.instances.interfaces;

import section11.f_interface_challenge.enums.GeometryType;

public interface Mappable {
    String JSON_PROPERTY = """
            "properties":{%s}%n""";
    String getLabel();
    GeometryType getType();
    String getMarker();
    default String toJSON() {
        return String.format("""
                "type": "%s", "label": "%s", "marker": "%s\"""", getType().name(), getLabel(), getMarker());
    }
    static void printProperties(Mappable obj) {
        System.out.printf(JSON_PROPERTY, obj.toJSON());
    }
}
