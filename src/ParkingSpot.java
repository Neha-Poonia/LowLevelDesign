public  class ParkingSpot {
    private ParkingSpotType type;
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot(int id, ParkingSpotType type)
    {
        this.id=id;
        this.type=type;
        isEmpty=true;
    }
    public void parkVechicle(Vehicle vehicle)
    {
        this.vehicle= vehicle;
        vehicle.setSpotId(id);
        isEmpty=false;
        System.out.println("vehicle parked at"+ id);
    }
    public void removeVehicle()
    {
        System.out.println("removing vehicle number"+ vehicle.getNumber()+ "from spot" +id);
        vehicle= null;
        isEmpty=true;
    }
    public boolean isEmpty(){
        return this.isEmpty;
    }

    public int getId() {
        return id;
    }
    public ParkingSpotType getType() {
        return type;
    }

}
