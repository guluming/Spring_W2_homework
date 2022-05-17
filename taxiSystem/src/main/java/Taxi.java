class Taxi {
    int taxiNumber;
    int fuel;
    int speed;
    int passenger;
    String state;
    String destination;
    int basicDistance;
    int destinationDistance;
    int basicFare;
    int distanceFare;
    int totalFare;

    public Taxi(int taxiNumber, int fuel, int speed, int passenger, String state, String destination, int basicDistance, int destinationDistance, int basicFare, int distanceFare, int totalFare) {
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

    public Taxi(int taxiNumber) {this(taxiNumber, 0, 0, 0, "parking", "", 1000, 0, 1500, 100,0);}

    void startOn(int fuel){
        if(fuel>=10){
            this.state = "emptyTaxi";
            this.fuel = fuel;
            System.out.println("have a good day");
        } else {
            this.fuel = fuel;
            System.out.println("plz fuel cheak");
        }
    }

    void takeTaxi(int passenger){
        if(state.equals("emptyTaxi")){
            System.out.println("boarding available");
            this.passenger = passenger;
            if(passenger>0){
                this.state = "race";
                System.out.println("taxi raceing");
            } else {
                System.out.println("boarding available");
            }
        } else {
            System.out.println("No boarding");
        }
    }

    void setSpeed(int speed){
        if(speed>=0){
            this.speed += speed;
            System.out.println("speed up");
        } else {
            this.speed += speed;
            System.out.println("speed down");
        }
    }

    int setFare(int destinationDistance){
        this.destinationDistance = destinationDistance;
        if(destinationDistance > basicDistance){
            totalFare = basicFare + distanceFare*((destinationDistance-basicDistance)/100);
        } else {
            totalFare = basicFare;
        }
        return totalFare;
    }

    void payment(){
        System.out.println("Total Fare is " + this.totalFare);
    }
}
