public class Main {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(6);
//        Taxi taxi2 = new Taxi(6);

//        taxi2.startOn(11);
        taxi1.startOn(11);
        taxi1.takeTaxi(4);
        taxi1.setFare(3000);
        taxi1.payment();
        taxi1.takeTaxi(0);
//        taxi1.setSpeed(5);
//        taxi1.setSpeed(5);
//        taxi1.setSpeed(-2);


        //System.out.println(Taxi.StateType.getName());
        //System.out.println(taxi1.taxiNumber +"/"+ taxi1.fuel +"/"+ taxi1.speed +"/"+ taxi1.passenger +"/"+ taxi1.state +"/"+ taxi1.destination +"/"+ taxi1.basicDistance +"/"+ taxi1.destinationDistance +"/"+ taxi1.basicFare +"/"+ taxi1.distanceFare +"/"+ taxi1.totalFare);
    }
}