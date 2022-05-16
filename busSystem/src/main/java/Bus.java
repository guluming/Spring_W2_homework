class Bus {
    int busNum;
    String state;
    int passenger;
    int maxPassenger;
    int Fuel;
    int speed;
    int fare;

    public Bus(int busNum, String state, int passenger, int maxPassenger, int Fuel, int speed, int fare) {
        this.busNum = busNum;
        this.state = state;
        this.passenger = passenger;
        this.maxPassenger = maxPassenger;
        this.Fuel = Fuel;
        this.speed = speed;
        this.fare = fare;
    }

    public Bus(int busNum) {
        this(busNum, "race", 0, 10, 0, 0, 500);
    }

    void setState(int fuel, String state){
        this.state = "race";
        if(!state.equals("race")){this.state = "parking";}
        if(fuel<10){this.state = "parking"; System.out.println("Bus need fuel");}
    }

    void setSpeed(int fuel, int speed){
        if(fuel>=10){
            this.Fuel = fuel;
            if(speed>=0){
                this.speed += speed;
                System.out.println("speed up");
            } else {
                this.speed += speed;
                System.out.println("speed down");
            }
        } else {
            this.Fuel = fuel;
            System.out.println("plz cheak fuel");
        }

    }

   void takePassenger(String state){
        if(state.equals("race")){
            this.state = state;
            this.passenger++;
            if(passenger>maxPassenger){
                this.passenger--;
                System.out.println("passenger is full");}
        } else {
            this.state = "parking";
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
