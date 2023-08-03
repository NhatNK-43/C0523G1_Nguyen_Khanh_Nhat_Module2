package case_study.repository.sub_repository;

import case_study.model.facility.Facility;
import java.util.Map;

public interface IFacilityRepository {

    Map<Facility,Integer> display();
    void add(Facility facility);
    Map<Facility,Integer> displayMaintenance();
    void delete(String serviceID);
}
