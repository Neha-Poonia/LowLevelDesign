import java.sql.Time;

public class Ticket {
    int ticketNumber;
    ParkingSpot parkingSpot;
    Vehicle vehicle;
    Time entryTime;

    public Ticket(int ticketNumber, ParkingSpot parkingSpot, Vehicle vehicle, Time entryTime) {
        this.ticketNumber = ticketNumber;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
    }

    public void print(){
        System.out.println("Ticket No"+ticketNumber);
        System.out.println("parking Spot Id" + parkingSpot.getId());
      //  System.out.println("price"+parkingSpot.getPrice());
        System.out.println("Vechile Number"+ vehicle.getNumber());

    }

}
