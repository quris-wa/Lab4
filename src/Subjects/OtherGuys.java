package Subjects;

import Abstracts.*;
import Subjects.*;

public class OtherGuys {
    private String name;
    private IsSleeping isSleeping;

    public OtherGuys(String name, IsSleeping isSleeping) {
        this.name = name;
        this.isSleeping = isSleeping;
        System.out.println(name + " присоедились к истории");
    }
    public OtherGuys(String name){
        this.name = name;
    }
    public void went(Location location) {
        if (name.equals("Другие коротышки")) {
            System.out.println(name + " приходили вместе с ним на локацию " + location.getLocationName());
        }

    }
    public void toAttent(Person person){
       System.out.println(name + " начали замечать, что персонаж " + person.getName() + " стал задумываться о чем-то" );
    }
    public void notUnderstand(Person person){
        System.out.println(name + " не понимали почему персонаж " + person.getName() + " так радовался");
    }
    public void toSleep() {
        System.out.println(name + " уснули");
    }

    public String getIsSleeping() {
        return isSleeping.toString();
    }

    @Override
    public String toString() {
        return this.getIsSleeping();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((OtherGuys) obj).getIsSleeping().equals(getIsSleeping());
    }

}
