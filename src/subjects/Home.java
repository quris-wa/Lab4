package subjects;

import abstracts.*;

public class Home extends Location {
    public Home(String name, Time time, Point point) {
        super(name, time,point);
    }
    @Override
    public String getLocationName() {
        return super.getLocationName();
    }

    @Override
    public int hashCode() {
        int result = this.getLocationName() == null ? 0 : this.getLocationName().hashCode();
        return (result) * 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Road) obj).getLocationName().equals(this.getLocationName());
    }

    @Override
    public String toString() {
        return "Subjects.Home: " + this.getLocationName();
    }
}
