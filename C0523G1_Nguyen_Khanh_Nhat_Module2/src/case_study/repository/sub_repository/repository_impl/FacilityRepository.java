package case_study.repository.sub_repository.repository_impl;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.sub_repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        Facility villa = new Villa("SVVL-0001", "Villa", 200,
                7000000, 10, "day", "Normal", 80, 2);

        Facility house = new House("SVHO-0001", "House", 160,
                10000000, 8, "month", "Normal", 2);

        Facility room = new Room("SVRO_0001", "Room", 100, 3000000,
                4, "day", "Free food");

        facilityMap.put(villa, 7);
        facilityMap.put(house, 2);
        facilityMap.put(room, 5);
    }


    @Override
    public Map<Facility, Integer> display() {
        return facilityMap;
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    @Override
    public Map<Facility, Integer> displayMaintenance() {
        Map<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
//        facilityMap.forEach((Facility, Integer) -> {
//            if (Integer >= 5) {
//                facilityMaintenance.put(Facility, Integer);
//            }
//        });
        for (Map.Entry<Facility,Integer> entry : facilityMap.entrySet()){
            if (entry.getValue()>=5){
                facilityMaintenance.put(entry.getKey(),entry.getValue());
            }
        }
        return facilityMaintenance;
    }

    @Override
    public void delete(String serviceID) {
        facilityMap.remove(new Facility(serviceID));
    }
}
