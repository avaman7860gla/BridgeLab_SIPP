class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 500.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
            ", Days: " + rentalDays + ", Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Emma Watson", "Honda City", 4);
        cr.display();
    }
}
