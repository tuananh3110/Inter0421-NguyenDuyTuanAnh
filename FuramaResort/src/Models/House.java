package Models;

public class House extends Services{
    private String standardRoom;
    private String convenientDescription;
    private int numberOfFloors;


    public House(String id, String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String rentType, String standardRoom, String convenientDescription, int numberOfFloors) {
        super(id, serviceName, areaUsed, rentalCosts, maxNumberOfPeople, rentType);
        this.standardRoom = standardRoom;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setRoomStandard(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public  void showInfo(){
        System.out.println("1. Id Service: " + super.getId() +
                "\n2. Name Service: " + super.getServiceName() +
                "\n3. areaUsed: " + super.getAreaUsed() +
                "\n4. rentalCost: " + super.getRentalCosts() +
                "\n5. maxNumberOfCustomer: " + super.getMaxNumberOfPeople() +
                "\n6. typeRent: " + super.getRentType() +
                "\n7. standardRoom: " + this.getStandardRoom() +
                "\n8.convenient: " + this.getConvenientDescription() +
                "\n9. numberOfFloor: " + this.getNumberOfFloors());
    }

}
}
