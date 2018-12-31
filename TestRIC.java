import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestRIC
{
    @Test
    public void testAddToFront() { //tests addToFront method
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addToFront(3);
        anRIC.addToFront(-3);
        anRIC.addToFront(9);
        anRIC.addToFront(100);
        anRIC.addToFront(-10);
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {-10, 100, 9, -3, 3};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testAddToFrontDuplicate() { //tests addToFront method with duplicates
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addToFront(3);
        anRIC.addToFront(-3);
        anRIC.addToFront(-3);
        anRIC.addToFront(3);
        anRIC.addToFront(3);
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {3, 3, -3, -3, 3};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testAddSorted() { //tests addSorted method
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addSorted(-3);
        anRIC.addSorted(4);
        anRIC.addSorted(10);
        anRIC.addSorted(-10);
        anRIC.addSorted(-100);
        anRIC.addSorted(0);
        anRIC.addSorted(1);
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {-100, -10, -3, 0, 1, 4, 10};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testAddSortedDuplicate() { //tests addSorted method with duplicates
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addSorted(-3);
        anRIC.addSorted(4);
        anRIC.addSorted(-3);
        anRIC.addSorted(-10);
        anRIC.addSorted(-10);
        anRIC.addSorted(4);
        anRIC.addSorted(-3);
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {-10, -10, -3, -3, -3, 4, 4};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testInsertionSort() { //tests insertionSort
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addToFront(3);
        anRIC.addToFront(5);
        anRIC.addToFront(-3);
        anRIC.addToFront(0);
        anRIC.addToFront(-10);
        anRIC.addToFront(-2);
        anRIC.addToFront(10);
        anRIC.addToFront(-20);
        anRIC.addToFront(20);
        anRIC.addToFront(15);
        anRIC.addToFront(-12);
        anRIC.insertionSort();
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {-20, -12, -10, -3, -2, 0, 3, 5, 10, 15, 20};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testInsertionSortDuplicate() { //tests insertionSort with duplicates
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addToFront(3);
        anRIC.addToFront(5);
        anRIC.addToFront(-3);
        anRIC.addToFront(0);
        anRIC.addToFront(-10);
        anRIC.addToFront(-2);
        anRIC.addToFront(5);
        anRIC.addToFront(-20);
        anRIC.addToFront(20);
        anRIC.addToFront(15);
        anRIC.addToFront(20);
        anRIC.addToFront(-20);
        anRIC.insertionSort();
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {-20, -20, -10, -3, -2, 0, 3, 5, 5, 15, 20, 20};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testInsertionSortUnique() {//tests insertionSortUnique 
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addToFront(3);
        anRIC.addToFront(5);
        anRIC.addToFront(-3);
        anRIC.addToFront(0);
        anRIC.addToFront(-10);
        anRIC.addToFront(-2);
        anRIC.addToFront(10);
        anRIC.addToFront(-20);
        anRIC.addToFront(20);
        anRIC.addToFront(15);
        anRIC.addToFront(-12);
        anRIC.insertionSortUnique();
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {-20, -12, -10, -3, -2, 0, 3, 5, 10, 15, 20};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testInsertionSortUniqueDuplicate() { //tests insertionSortUnique with duplicates
        RandomIntegerContainer anRIC = new RandomIntegerContainer();
        anRIC.addToFront(3);
        anRIC.addToFront(5);
        anRIC.addToFront(-3);
        anRIC.addToFront(0);
        anRIC.addToFront(-10);
        anRIC.addToFront(-2);
        anRIC.addToFront(5);
        anRIC.addToFront(-20);
        anRIC.addToFront(20);
        anRIC.addToFront(15);
        anRIC.addToFront(20);
        anRIC.addToFront(-20);
        anRIC.insertionSortUnique();
        Integer[] theAns = anRIC.returnArray();
        Integer[] trueAns = new Integer[] {-20, -10, -3, -2, 0, 3, 5, 15, 20};
        assertArrayEquals(theAns, trueAns);
    }
}
