package org.oopsConcepts.inheritanceDemo;

public class MountainBike extends Bicycle {
    int seatHeight;

    MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }

     public static void main(String[] args) {
         MountainBike mountainBike = new MountainBike(3, 20, 5);
         System.out.println(mountainBike);
     }

}
