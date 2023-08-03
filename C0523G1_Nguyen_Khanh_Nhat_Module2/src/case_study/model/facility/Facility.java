package case_study.model.facility;

public class Facility {
    private String serviceId;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int numberOfPeople;
    private String rentalType;

    public String getServiceID() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCosts;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCosts = rentalCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public Facility(String serviceId) {
        this.serviceId = serviceId;
    }

    public Facility(String serviceId, String serviceName, double usableArea, double rentalCost, int numberOfPeople, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCost='" + rentalCosts + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                ", rentalType='" + rentalType + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;

        Facility facility = (Facility) o;

        return serviceId.equals(facility.serviceId);
    }

    @Override
    public int hashCode() {
        return serviceId != null ? serviceId.hashCode() : 0;
    }
}
