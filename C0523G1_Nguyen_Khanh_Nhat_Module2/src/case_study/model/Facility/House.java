package case_study.model.Facility;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloor;

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public House(String roomStandard, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceID, String serviceName, String usableArea, String rentalCost, String maximumPerson, String rentalType, String roomStandard, int numberOfFloor) {
        super(serviceID, serviceName, usableArea, rentalCost, maximumPerson, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
