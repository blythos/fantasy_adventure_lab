package weapons;

public enum WeaponType {
    SWORD(false),
    AXE(false),
    CLUB(false),
    STAFF(false),
    WAND(false),
    BOW(true),
    JAVELIN(true);

    private final boolean ranged;

    WeaponType(boolean ranged){
        this.ranged = ranged;
    }
}
