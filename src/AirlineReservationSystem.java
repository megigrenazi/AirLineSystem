import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Flight[][] flights = new Flight[3][3];
        flights[0][0] = new Flight("AA101", "New Yorl", 100);
        flights[0][1] = new Flight("AA102", "New York", 80);
        flights[0][2] = new Flight("AA103", "New York2", 120);

        flights[1][0] = new Flight("BA101", "New Yorl", 100);
        flights[1][1] = new Flight("BA102", "New York", 80);
        flights[1][2] = new Flight("BA103", "New York2", 120);

        flights[2][0] = new Flight("CA101", "New Yorl", 90);
        flights[2][1] = new Flight("CA102", "New York", 80);
        flights[2][2] = new Flight("CA103", "New York2", 120);

        while(true){
            System.out.println("Available Flights");
            System.out.println("1.American (AA)");
            System.out.println("2.British (BA)");
            System.out.println("3.Lufthansa (CA)");
            System.out.println("0.Exit");

            System.out.println("Select an airline or 0 to exit");
            int airlineChoice=scanner.nextInt();
            if(airlineChoice==0){
                System.out.println("Goodbye");
                break;
            }else if(airlineChoice>=1 && airlineChoice<=3){
                System.out.println("Avaiable flights dor the selected airline");
                for(int i=0;i<3;i++){
                    //i==0
                    //flights[0][1].flightnumber+flights[0][1].destination
                    System.out.println((i+1)+"."+flights[airlineChoice-1][i].getFlightNumber()+ " to " + flights[airlineChoice - 1][i].getDestination() +
                            "Available economy seat " + flights[airlineChoice - 1][i].getAvailableEconomySeats() + "Available business seat " + flights[airlineChoice - 1][i].getAvailableBusinessSeats());
                }
                System.out.println("Select a flight");
                int flightChoice=scanner.nextInt();
                if(flightChoice>=1 && flightChoice<=3){
                    Flight selectedFlight=flights[airlineChoice-1][flightChoice-1];
                    System.out.println("Enter the number of the passangers");
                    int numPassengers = scanner.nextInt();

                    System.out.println("Select the class(1.economy,2.business");
                    int seatChoice=scanner.nextInt();
                    boolean isBussinesClass=false;
                    if(seatChoice==2){
                        isBussinesClass=true;
                    }
                    if(selectedFlight.bookSeat(numPassengers,isBussinesClass)){
                        System.out.println("booking confirmed to "+selectedFlight.getDestination());
                        int remainingEconomySeats= selectedFlight.getAvailableEconomySeats();
                        int remainingBussinesSeats=selectedFlight.getAvailableBusinessSeats();

                        System.out.println("Remaining economy seats "+remainingEconomySeats);
                        System.out.println("Remaining bussines seats "+remainingBussinesSeats);

                    }else{
                        System.out.println("Sorry,not enough seats");
                    }
                }else{
                    System.out.println("Invalid flight choice");
                }

            }else{
                System.out.println("Invalid airline choice");
            }
        }


    }
}