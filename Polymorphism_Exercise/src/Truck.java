public class Truck implements Vehicle{
    private String type;
    private int week;

    public Truck(){

    }
    public Truck(String type, int week){
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return (double) week * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + this.getType()
                + "\nWeekly Rental Rate: $500 "
                +"\nRental Cost: $" + this.calculateRentalCost());
    }
}
