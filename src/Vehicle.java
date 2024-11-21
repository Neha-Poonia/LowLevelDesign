public class Vehicle {
    String vechicleNumber;
    VehicleType type;
    int spotId=-1;

    public Vehicle(String vehicleNumber, VehicleType type){
        this.vechicleNumber= vehicleNumber;
        this.type= type;
    }

    public String getNumber() {
        return vechicleNumber;
    }
    public void setSpotId(int id){
        spotId=id;
    }
    public int getSpotId(){
        return spotId;
    }

}
