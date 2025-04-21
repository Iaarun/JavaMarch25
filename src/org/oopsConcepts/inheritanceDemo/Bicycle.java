package org.oopsConcepts.inheritanceDemo;

import javax.sound.sampled.BooleanControl;

public class Bicycle {
     int gear;
     int speed;
     Bicycle(int gear, int speed) {
            this.gear = gear;
            this.speed = speed;
        }

    public void applyBrake(int decrement) {
        speed -= decrement;
        }

     public void speedUp(int increment) {
            speed += increment;
        }
        public String toString() {
                return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
     }

//    public static void main(String[] args) {
//        Bicycle bicycle = new Bicycle(3, 20);
//        System.out.println(bicycle);
//    }
}
