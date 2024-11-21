import java.util.List;

public class ParkingLotService {
    private ParkingStrategy strategy;
    private ParkingLot parkingLot;

    public void createParkingLot(ParkingLot parkingLot,ParkingStrategy strategy){
      this.parkingLot= parkingLot;
      this.strategy =strategy;
       for(ParkingSpotType type: ParkingSpotType.values())
       {
           for(ParkingSpot spot:parkingLot.getParkingSpots(type))
           {
               strategy.addSlot(spot.getId(), type);
           }
       }
    }
    public void parkVechicle(Vehicle vehicle){
        ParkingSpotType type;
        if(vehicle.type==VehicleType.FourWheeler)
        {
             type = ParkingSpotType.FourWheeler;
        }
        else{
             type = ParkingSpotType.TwoWheeler;
        }
        int  spotId= strategy.getNextSlot(type);
        ParkingSpot spot= parkingLot.getSpotbyId(spotId);
        parkingLot.parkVechicle(spot,vehicle);
        strategy.removeSlot(spotId,type);
    }
    public void unParkVehicle(int spotId){
        ParkingSpot spot= parkingLot.getSpotbyId(spotId);
        parkingLot.unparkVehicle(spot);
        strategy.addSlot(spotId,spot.getType());
    }

}
