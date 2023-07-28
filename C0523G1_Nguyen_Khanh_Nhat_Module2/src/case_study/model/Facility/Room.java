package case_study.model.Facility;

public class Room extends Facility {
    private String FreeServiceIncluded;

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    public Room(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceID, String serviceName, String usableArea, String rentalCost, String maximumPerson, String rentalType, String freeServiceIncluded) {
        super(serviceID, serviceName, usableArea, rentalCost, maximumPerson, rentalType);
        FreeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "FreeServiceIncluded='" + FreeServiceIncluded + '\'' +
                '}';
    }
}
