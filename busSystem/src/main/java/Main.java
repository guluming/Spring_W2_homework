public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(6);
//        bus1.takePassenger(Bus.StateType.R);
        bus1.setSpeed(1, 5);
        bus1.setSpeed(11, 5);
        bus1.setSpeed(11, -2);
//        bus1.setState(11, Bus.StateType.R);
//        bus1.setState(19, Bus.StateType.P);


        System.out.println(bus1.busNum +"/"+bus1.state+"/"+ bus1.passenger +"/"+ bus1.maxPassenger +"/"+ bus1.fuel +"/"+ bus1.speed +"/"+ bus1.fare);
    }
}