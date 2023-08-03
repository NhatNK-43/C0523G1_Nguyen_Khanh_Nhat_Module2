package case_study.model.facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }


    public Room(String freeServiceIncluded) {
        freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceID, String serviceName, double usableArea, double rentalCost, int maximumPerson, String rentalType, String freeServiceIncluded) {
        super(serviceID, serviceName, usableArea, rentalCost, maximumPerson, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
