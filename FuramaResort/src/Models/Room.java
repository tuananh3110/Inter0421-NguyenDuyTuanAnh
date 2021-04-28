package Models;

public class Room extends Services {
    private String freeService;


    public Room(String id, String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String rentType, String freeService) {
        super(id, serviceName, areaUsed, rentalCosts, maxNumberOfPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfo() {
        System.out.println("1. Id Service: " + super.getId() +
                "\n2. Name Service: " + super.getServiceName() +
                "\n3. areaUsed: " + super.getAreaUsed() +
                "\n4. rentalCost: " + super.getRentalCosts() +
                "\n5. maxNumberOfCustomer: " + super.getMaxNumberOfPeople() +
                "\n6. typeRent: " + super.getRentType() +
                "\n7.free service"+this.getFreeService());
    }
}



