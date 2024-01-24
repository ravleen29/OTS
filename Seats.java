public class Seats {
    private int maxSeats;
    private int availableSeats;
    private boolean[] seatsArray;
    
    
    public Seats(int maxSeats) {
        this.maxSeats = maxSeats;
        this.availableSeats = maxSeats;
        this.seatsArray = new boolean[maxSeats];
        initializeSeats();
    }

    //  Initializing  (By ravleen)
    private void initializeSeats() {
        for (int i = 0; i < maxSeats; i++) {
            seatsArray[i] = true;
        }
    }

    //  check seats  (By ravleen)
    public void checkAllSeats() {
        System.out.println("Total Seats: " + maxSeats);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Occupied Seats: " + (maxSeats - availableSeats));
    }

    //  purchase seats  (By ravleen)
       public void purchaseSeats(int numSeats) 
       {
        if (numSeats <= availableSeats && numSeats > 0) {
            int seatsPurchased = 0;
            for (int i = 0; i < maxSeats && seatsPurchased < numSeats; i++) {
                if (seatsArray[i]) {
                    seatsArray[i] = false;
                    seatsPurchased++;
                    availableSeats--;
                }
            }
            System.out.println("Successfully purchased " + seatsPurchased + " seat(s) for £20" );
        } else {
            System.out.println("Invalid number of seats requested.");
        }
       }

    public static void main(String[] args) {
       
    }
}
