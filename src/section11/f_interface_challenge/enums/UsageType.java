package section11.f_interface_challenge.enums;

public enum UsageType {
    BUSINESS, FUN_PARK, ENTERTAINMENT, TOWERS;
    public String getName() {
        return this.name().replaceAll("_", " ");
    }
}
