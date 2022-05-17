import BusStatePkg.StateType;

class Bus {
    static int count = 0;
    int serialNum;
    {
        count++;
        serialNum = count;
    }
    int busNum;
    StateType state;
    int passenger;
    int nowPassenger;
    int maxPassenger;
    int fuel;
    int speed;
    int fare;

    public Bus(int busNum, StateType state, int passenger, int nowPassenger, int maxPassenger, int fuel, int speed, int fare) {
        this.busNum = busNum;
        this.state = state;
        this.passenger = passenger;
        this.nowPassenger = nowPassenger;
        this.maxPassenger = maxPassenger;
        this.fuel = fuel;
        this.speed = speed;
        this.fare = fare;
    }

    public Bus(int busNum) {
        this(busNum, StateType.R, 0, 0, 10, 0, 0, 500);
    }

    public void busClose(){
        this.state = StateType.P;
        if(fuel<10){
            System.out.println("주유가 필요하다");
        }
    }

    public void setFuel(int fuel){
        this.fuel += fuel;
        if(this.fuel<10){
            this.state = StateType.P;
            System.out.println("주유가 필요하다");
        } else {
            this.state = StateType.R;
        }
    }

    public void setSpeed(int speed){
        if(fuel>=10){
            if(speed>=0){
                this.speed += speed;
                System.out.println("속도 증가");
            } else {
                this.speed += speed;
                System.out.println("속도 감소");
            }
        } else {
            this.state = StateType.P;
            System.out.println("주유량을 확인해 주세요");
        }
    }

   public void takePassenger(int passenger){
        if(state.equals(StateType.R)){
            this.nowPassenger = nowPassenger + passenger;
            if((nowPassenger)>maxPassenger){
                System.out.println("승객이 최대치 입니다");
            }
                if((maxPassenger-nowPassenger)>0){
                    System.out.println("탑승 가능한 승객 " + (maxPassenger-nowPassenger));
                }else{
                    System.out.println("탑승 가능한 승객 " + 0 );
                    System.out.println("탑승 못한 승객 " + Math.abs(maxPassenger-nowPassenger));
                    this.nowPassenger = maxPassenger;
                 }
        }else{
            System.out.println(state.getName());
         }
   }
}