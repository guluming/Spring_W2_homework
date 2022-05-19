import TransportStatePkg.StateType;

class Taxi {
    int taxiNumber;
    int fuel;
    int speed;
    int passenger;
    StateType state;
    String destination;
    int basicDistance;
    int destinationDistance;
    int basicFare;
    int distanceFare;
    int totalFare;

    public Taxi(int taxiNumber, int fuel, int speed, int passenger, StateType state, String destination, int basicDistance, int destinationDistance, int basicFare, int distanceFare, int totalFare) {
        this.taxiNumber = taxiNumber;
        this.fuel = fuel;
        this.speed = speed;
        this.passenger = passenger;
        this.state = state;
        this.destination = destination;
        this.basicDistance = basicDistance;
        this.destinationDistance = destinationDistance;
        this.basicFare = basicFare;
        this.distanceFare = distanceFare;
        this.totalFare = totalFare;
    }

    public Taxi(int taxiNumber) {this(taxiNumber, 0, 0, 0, StateType.P, "", 1000, 0, 1500, 100,0);}

    public StateType startOn(int fuel){
        if(fuel>=10){
            this.state = StateType.W;
            this.fuel = fuel;
            System.out.println("오늘도 힘쎄고 굳센 하루!");
        } else {
            this.fuel = fuel;
            System.out.println("주유량을 체크해주세요");
        }
        return state;
    }

    public void takeTaxi(int passenger){
        if(passenger>0){
            if(state.equals(StateType.W)){
                this.state = StateType.R;
                System.out.println(state.getName());
            }
        } else {
            this.state = StateType.W;
            System.out.println(state.getName());
        }
        this.passenger = passenger;
    }

    public int setSpeed(int speed){
        if(speed>=0){
            this.speed += speed;
            System.out.println("속도 증가");
        } else {
            this.speed += speed;
            System.out.println("속도 감소");
        }
        return speed;
    }

    public int setFare(int destinationDistance){
        this.destinationDistance = destinationDistance;
        if(destinationDistance > basicDistance){
            totalFare = basicFare + distanceFare*((destinationDistance-basicDistance)/100);
        } else {
            totalFare = basicFare;
        }
        return totalFare;
    }

    public void payment(){
        System.out.println("최종 요금은 " + this.totalFare);
    }
}
