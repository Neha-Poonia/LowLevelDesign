
public class Admin {
    private ParkingLot parkingLot;
    String name;

    public void addParkingSpots(ParkingLot parkingLot)
    {
        this.parkingLot= parkingLot;
        int i;
        for(i=0;i<10;i++)
        {
            ParkingSpot spot = new ParkingSpot(i, ParkingSpotType.TwoWheeler);
            parkingLot.addParkingSpot(spot,spot.getType());
        }
        for(i=10;i<20;i++)
        {
            ParkingSpot spot = new ParkingSpot(i, ParkingSpotType.FourWheeler);
            parkingLot.addParkingSpot(spot,spot.getType());
        }

    }
    public void removeParkingSpot(){

    }
}
