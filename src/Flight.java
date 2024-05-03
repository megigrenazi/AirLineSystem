public class Flight {
    String flightNumber;
    String destination;
    int capacity;
    int bookedSeatsEconomy;
    int bookedSeatsBusiness;

    public Flight() {
    }

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeatsEconomy = 0;
        this.bookedSeatsBusiness = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeatsEconomy() {
        return bookedSeatsEconomy;
    }

    public void setBookedSeatsEconomy(int bookedSeatsEconomy) {
        this.bookedSeatsEconomy = bookedSeatsEconomy;
    }

    public int getBookedSeatsBusiness() {
        return bookedSeatsBusiness;
    }

    public void setBookedSeatsBusiness(int bookedSeatsBusiness) {
        this.bookedSeatsBusiness = bookedSeatsBusiness;
    }

    int getAvailableEconomySeats() {
        return capacity - bookedSeatsEconomy;
    }

    int getAvailableBusinessSeats() {
        return capacity - bookedSeatsBusiness;
    }

    boolean bookSeat(int numPassengers, boolean isBusinessClass) {
        if (isBusinessClass) {
            if (bookedSeatsBusiness+numPassengers<=capacity) {
                bookedSeatsBusiness+=numPassengers;
                return true;
            }
        } else {
            if (bookedSeatsEconomy+numPassengers<=capacity) {
                bookedSeatsEconomy+=numPassengers;
                return true;
            }
        }
        return false;
    }
}


























