package section10.g_enums;

public enum Vehicle {
    BIKE,
    SCOOTY,
    AUTO,
    CAR,
    JEEP,
    VAN,
    BUS,
    LORRY;

    public int noOfTyres() {
        return switch(this) {
            case BIKE, SCOOTY -> 2;
            case AUTO -> 3;
            default -> 4;
        };
    }

}
