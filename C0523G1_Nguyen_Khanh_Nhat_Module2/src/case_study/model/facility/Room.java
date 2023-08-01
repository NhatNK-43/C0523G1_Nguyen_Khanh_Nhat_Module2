package case_study.model.facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String freeServiceIncluded) {
        freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceID, String serviceName, String usableArea, String rentalCost, String maximumPerson, String rentalType, String freeServiceIncluded) {
        super(serviceID, serviceName, usableArea, rentalCost, maximumPerson, rentalType);
        freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
