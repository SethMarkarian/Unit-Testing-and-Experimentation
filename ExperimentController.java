import java.util.*;
public class ExperimentController
{
    private int seed, numel;

    public ExperimentController() { //constructor method
        seed = 25; //gives seed a value
        numel = 10000; //gives numel a value
    }

    public static void main(String[] args) { //main method
        ExperimentController exp1 = new ExperimentController(); //creates new ExperimentController instance
        exp1.run(); //runs run()
    }

    public void run() { //for obtaining data
        System.out.println("timeAddToFront: " + timeAddToFront(numel, seed));
        System.out.println("timeAddSorted: " + timeAddSorted(numel, seed));
        System.out.println("timeSortedOfList: " + timeSortedOfList(numel, seed));
        System.out.println("timeSortUniqueOfList: " + timeSortUniqueOfList(numel, seed));
        System.out.println("timeSortOfSortedList: " + timeSortOfSortedList(numel, seed));
    }

    public long timeAddToFront(int numberOfItems, int seed) { //calculates the amount of time it takes to add an element to the front
        RandomIntegerContainer ric = new RandomIntegerContainer(); //creates a new RandomIntegerContainer() instance
        Random random = new Random(seed); //creates a new Random instance
        long t0 = System.currentTimeMillis(); //stores starting time
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            Integer val = random.nextInt(); //gets integer
            ric.addToFront(val); //inserts to front
        }
        long t1 = System.currentTimeMillis(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeAddSorted(int numberOfItems, int seed) { //calculates the amount of time it takes to add an element in sorting order
        RandomIntegerContainer ric = new RandomIntegerContainer(); //creates a new RandomIntegerContainer() instance
        Random random = new Random(seed); //creates a new Random instance
        long t0 = System.currentTimeMillis(); //stores starting time
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            Integer val = random.nextInt(); //gets integer
            ric.addSorted(val); //adds value in incrimenting order
        }
        long t1 = System.currentTimeMillis(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeSortedOfList(int numberOfItems, int seed) { //calculates the amount of time it takes to sort elements using insertion sort
        RandomIntegerContainer ric = new RandomIntegerContainer(); //creates a new RandomIntegerContainer() instance
        Random random = new Random(seed); //creates a new Random instance
        int arg = 5; //used for multiplying random number
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            Integer val = random.nextInt(arg * 40); //gets integer
            ric.addToFront(val); //inserts to front
        }
        long t0 = System.currentTimeMillis(); //stores starting time
        ric.insertionSort(); //completes insertion sort
        long t1 = System.currentTimeMillis(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeSortUniqueOfList(int numberOfItems, int seed) { //calculates the amount of time it takes to sort and remove duplicate elements
        RandomIntegerContainer ric = new RandomIntegerContainer(); //creates a new RandomIntegerContainer() instance
        Random random = new Random(seed); //creates a new Random instance
        int arg = 5; //used for multiplying random number
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            Integer val = random.nextInt(arg * 40); //gets integer
            ric.addToFront(val); //inserts to front
        }
        long t0 = System.currentTimeMillis(); //stores starting time
        ric.insertionSortUnique(); //sorts and removes duplicates
        long t1 = System.currentTimeMillis(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeSortOfSortedList(int numberOfItems, int seed) { //calculates the amount of time it takes to sort an already sorted arraylist
        RandomIntegerContainer ric = new RandomIntegerContainer(); //creates a new RandomIntegerContainer() instance
        Random random = new Random(seed); //creates a new Random instance
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            Integer val = random.nextInt(); //gets integer
            ric.addToFront(val); //inserts to front
        }
        ric.insertionSort(); //completes insertion sort
        long t0 = System.currentTimeMillis(); //stores starting time
        ric.insertionSort(); //completes insertion sort
        long t1 = System.currentTimeMillis(); //stores ending time
        return t1 - t0; //calculates total time
    }
    
    /* When you multiply all of the values in the arraylist by 40, the time it takes to sort them is the same as the original.
     * This is because the value of the numbers don't change in reference to the others. It is like 40 * (1, 2, 3, 4, 5)
     * It will still be (40, 80, 120, 160, 200). 
     */
}
