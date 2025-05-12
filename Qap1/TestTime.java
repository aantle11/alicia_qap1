public class TestTime {
    public static void main(String[] args) {
        // Creating the time objects
        Time t1 = new Time(0,0,0);
        Time t2 = new Time(0,0,0);

        // Setting the times
        t1.setTime(21,10,15);
        t2.setTime(10,20,25);

        // Display the time before the change
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());

        // Next and Previous seconds
        t1.nextSecond();
        t2.previousSecond();

        // Time after changes
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());

    }
}
