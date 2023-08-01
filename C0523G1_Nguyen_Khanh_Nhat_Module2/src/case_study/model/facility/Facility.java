package case_study.model.facility;

public abstract class Facility {
    private String serviceID;
    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String maximumPerson;
    private String rentalType;

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCost() {
        return rentalCosts;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCosts = rentalCost;
    }

    public String getMaximumPerson() {
        return maximumPerson;
    }

    public void setMaximumPerson(String maximumPerson) {
        this.maximumPerson = maximumPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public Facility(String serviceID, String serviceName, String usableArea, String rentalCost, String maximumPerson, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCost;
        this.maximumPerson = maximumPerson;
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceID='" + serviceID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCost='" + rentalCosts + '\'' +
                ", maximumPerson='" + maximumPerson + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
