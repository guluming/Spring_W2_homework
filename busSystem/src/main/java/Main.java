import BusStatePkg.StateType;
public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(1);
        Bus bus3 = new Bus(1);
        Bus bus4 = new Bus(1);

        bus1.setSpeed(5);
        bus1.setFuel(6);
        bus1.setFuel(3);
//        bus1.busClose();
        bus1.setFuel(6);
//        bus1.busClose();
        bus1.setSpeed(5);
        bus1.takePassenger(4);
        bus1.takePassenger(1);
        bus1.takePassenger(3);
        bus1.takePassenger(3);
        bus1.takePassenger(5);
//        bus1.busClose();
//        bus1.takePassenger(Bus.StateType.P);

        System.out.println(bus1.serialNum + "/" + bus2.serialNum + "/" + bus3.serialNum + "/" + bus4.serialNum);
        System.out.println(bus1.busNum +"/"+bus1.state+"/"+ bus1.nowPassenger +"/"+ bus1.maxPassenger +"/"+ bus1.fuel +"/"+ bus1.speed +"/"+ bus1.fare);
    }
}