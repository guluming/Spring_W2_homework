public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(6);
        bus1.takePassenger("race");
        bus1.setSpeed(11, 5);
        bus1.setSpeed(11, 5);
        bus1.setSpeed(11, -2);
        bus1.setState(11, "race");
        bus1.setState(9, "race");


        System.out.println(bus1.busNum +"/"+bus1.state+"/"+ bus1.passenger +"/"+ bus1.maxPassenger +"/"+ bus1.Fuel +"/"+ bus1.speed +"/"+ bus1.fare);
    }
}