class Bus {
    int busNum;
    StateType state;
    int passenger;
    int maxPassenger;
    int fuel;
    int speed;
    int fare;

    public Bus(int busNum, StateType state, int passenger, int maxPassenger, int fuel, int speed, int fare) {
        this.busNum = busNum;
        this.state = state;
        this.passenger = passenger;
        this.maxPassenger = maxPassenger;
        this.fuel = fuel;
        this.speed = speed;
        this.fare = fare;
    }

    enum StateType {
        R("RACE"), P("PARKING");
        final private String name;
        public String getName() {
            return name;
            }
        private StateType(String name){
            this.name = name;
            }
    }

    public Bus(int busNum) {
        this(busNum, StateType.R, 0, 10, 0, 0, 500);
    }

    public void setState(int fuel, StateType state){
        this.state = StateType.R;
        if(!state.equals(StateType.R)){
            this.state = StateType.P;
        }
        if(fuel<10){
            this.state = StateType.P;
            System.out.println("Bus need fuel");
        }
        this.fuel = fuel;
    }

    public void setSpeed(int fuel, int speed){
        if(fuel>=10){

            if(speed>=0){
                this.speed += speed;
                System.out.println("speed up");
            } else {
                this.speed += speed;
                System.out.println("speed down");
            }
        } else {

            System.out.println("plz cheak fuel");
        }
        this.fuel = fuel;
    }

   public void takePassenger(StateType state){
        if(state.equals(StateType.R)){
            this.state = state;
            this.passenger++;
            if(passenger>maxPassenger){
                this.passenger--;
                System.out.println("passenger is full");}
        } else {
            this.state = StateType.P;
            this.passenger = 0;
            System.out.println("BUS is not race");
        }
   }
//    public enum busState {
//        RACE(1), PARK(2);
//        private final int value;
//        busState(int value) {this.value = value;}
//        public int getValue(){return value;}
//    }
}
