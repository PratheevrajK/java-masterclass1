package section11.f_interface_challenge.enums;

public enum UtilityType {
    PIPELINE, METRO, OPTICAL_FIBRE, ELECTRICAL;
    public String getName() {
        return this.name().replaceAll("_", " ");
    }
}
