package Models;

public class Villa extends Services {
    private String standardRoom;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa(String id, String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String rentType, String standardRoom, String convenientDescription, double areaPool,int numberOfFloors) {
        super(id, serviceName, areaUsed, rentalCosts, maxNumberOfPeople, rentType);
        this.standardRoom = standardRoom;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfo() {

            System.out.println("1. Id Service: " + super.getId() +
                    "\n\t2. Name Service: " + super.getServiceName() +
                    "\n\t3. areaUsed: " + super.getAreaUsed() +
                    "\n\t4. rentalCost: " + super.getRentalCosts() +
                    "\n\t5. maxNumberOfCustomer: " + super.getMaxNumberOfPeople() +
                    "\n\t6. typeRent: " + super.getRentType() +
                    "\n\t7. standardRoom: " + this.getStandardRoom() +
                    "\n\t8.convenient: " + this.getConvenientDescription() +
                    "\n\t9. poolArea: " + this.getAreaPool() +
                    "\n\t10. numberOfFloor: " + this.getNumberOfFloors());

    }
}
