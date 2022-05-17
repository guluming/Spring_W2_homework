public class Main {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(6);
        taxi1.startOn(11);
        taxi1.takeTaxi(4);
        taxi1.setSpeed(5);
        taxi1.setSpeed(5);
        taxi1.setSpeed(-2);
        taxi1.setFare(1000);
        taxi1.payment();


        System.out.println(taxi1.taxiNumber +"/"+ taxi1.fuel +"/"+ taxi1.speed +"/"+ taxi1.passenger +"/"+ taxi1.state +"/"+ taxi1.destination +"/"+ taxi1.basicDistance +"/"+ taxi1.destinationDistance +"/"+ taxi1.basicFare +"/"+ taxi1.distanceFare +"/"+ taxi1.totalFare);
    }
}