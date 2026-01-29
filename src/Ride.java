abstract class Ride {
    double d;
    Ride(double d){this.d=d;}
    abstract double fare();
}
class Car extends Ride {
    Car(double d){super(d);}
    double fare(){return d*15;}
}
class MainRide {
    public static void main(String[] args){
        Ride r=new Car(10);
        System.out.println("Fare = "+r.fare());
    }
}
