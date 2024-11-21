public  abstract class ParkingStrategy {
   private ParkingLot parkingLot;

    /*public ParkingStrategy(ParkingLot parkingLot){
        this.parkingLot= parkingLot;
    }*/
    public abstract int getNextSlot(ParkingSpotType type);
    public abstract void addSlot(int slotId, ParkingSpotType type);
    public abstract void removeSlot(int slotId, ParkingSpotType type);
}
