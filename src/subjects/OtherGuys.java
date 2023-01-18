package subjects;

import abstracts.*;

public class OtherGuys extends Person{
    private String name;
    private boolean isSleeping;
    private Location location;
    private Point point;
    private Thoughs thoughs;
    public OtherGuys(String name, Location location, Point point, boolean isSleeping, Thoughs thoughs) {
        super(name, location, point, isSleeping, thoughs);
        this.name = name;
        this.isSleeping = isSleeping;
        this.location = location;
        this.point = point;
        this.thoughs = thoughs;
    };
}

