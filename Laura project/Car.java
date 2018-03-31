
public class Car {
 private int speed;
 private String make;
 
 // this is a constructor. You can initialize the speed
 public Car() {
   speed = 0;
   make = "unknown";
  
 }
 public Car (int sp, String mak) {
   speed= sp;
   make=mak;
 }
 
public int getSpeed () {
 return speed;
 }
public void setSpeed (int speedofacar) {
 speed = speedofacar;
}
 public String getMake() {
   return make;
 }
 public void setMake(String newmake) {
   make = newmake;
 }
}




