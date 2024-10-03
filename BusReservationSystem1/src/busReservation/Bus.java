package busReservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getCapacity(){//accesor method
        return capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void setCapacity(int cap) {//mutator method
        capacity=cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus no:"+busNo+"Ac:"+ac+"Total Capacity:"+ capacity );

    }
}
