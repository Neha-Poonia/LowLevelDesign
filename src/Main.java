//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("1",VehicleType.FourWheeler);
        Vehicle fortuner = new Vehicle("8989",VehicleType.FourWheeler);
        Vehicle pulser = new Vehicle("1234",VehicleType.TwoWheeler);
        Admin admin = new Admin();
        ParkingLot parkingLot= ParkingLot.getInstanceOfparkingLot();
        admin.addParkingSpots(parkingLot);

        ParkingLotService service= new ParkingLotService();
        service.createParkingLot(parkingLot,new NaturalOrderingParkingStrategy());
        service.parkVechicle(vehicle);
        service.parkVechicle(fortuner);
        service.parkVechicle(pulser);

        System.out.println(fortuner.getSpotId());
        service.unParkVehicle(fortuner.getSpotId());

        service.parkVechicle(new Vehicle("0000",VehicleType.FourWheeler));

        service.unParkVehicle(vehicle.getSpotId());

        service.parkVechicle(new Vehicle("1111",VehicleType.FourWheeler));
    }
}