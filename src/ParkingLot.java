import java.util.*;

public class ParkingLot {
    private Map<ParkingSpotType,List<ParkingSpot>> spotMap= new HashMap<>();
   // private Map<ParkinSpotType,List<Integer>> emptySpots= new HashMap<>();
    private Map<Integer,ParkingSpot> spots= new HashMap<>();
    private static ParkingLot parkingLot;
    private String name;

    private ParkingLot(String name){
        this.name=name;
    }

    public static ParkingLot getInstanceOfparkingLot(){
        if(parkingLot==null) {
            parkingLot= new ParkingLot("MallParking") ;
        }
        return parkingLot;
    }


    public  void addParkingSpot(ParkingSpot spot, ParkingSpotType type){
        spotMap.computeIfAbsent(type,k->new ArrayList<>()).add(spot);
        spots.put(spot.getId(), spot);
      //  emptySpots.computeIfAbsent(type,k->new ArrayList<>()).add(spot.getId());
    }

    public  void removeParkingSpot(ParkingSpot spot, ParkingSpotType type){
        spotMap.get(type).remove(spot);
        spots.remove(spot.getId());
       // emptySpots.get(type).remove(spot.getId());
    }

    public void parkVechicle(ParkingSpot spot, Vehicle vehicle)
    {
        spot.parkVechicle(vehicle);
       // emptySpots.get(spot.getType()).remove(spot.getId());
    }
    public void unparkVehicle(ParkingSpot spot){
        spot.removeVehicle();
        //emptySpots.computeIfAbsent(spot.getType(),k->new ArrayList<>()).add(spot.getId());
    }
    public List<ParkingSpot> getParkingSpots(ParkingSpotType type){
        return spotMap.get(type);
    }
    public ParkingSpot getSpotbyId(int id){
        return spots.get(id);
    }
}
