import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class NaturalOrderingParkingStrategy extends ParkingStrategy {
    private Map<ParkingSpotType,TreeSet<Integer>> slots= new HashMap<>();

 /*   public NaturalOrderingParkingStrategy(ParkingLot parkingLot) {
        super(parkingLot);
    }
*/
    @Override
    public int getNextSlot(ParkingSpotType type) {
        if(slots.get(type).isEmpty())
            throw new RuntimeException("No new slot available");
        return slots.get(type).first();
    }

    @Override
    public void addSlot(int slotId, ParkingSpotType type) {
        slots.computeIfAbsent(type,k->new TreeSet<>()).add(slotId);
    }

    @Override
    public void removeSlot(int slotId, ParkingSpotType type) {
        slots.get(type).remove(slotId);
    }

}
