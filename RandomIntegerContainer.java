import java.util.ArrayList; //imports arraylist
public class RandomIntegerContainer
{
    private ArrayList<Integer> arr; //private arraylist to hold Integers
    
    public static void main(String[] args) { //main method
        RandomIntegerContainer demo = new RandomIntegerContainer(); //create new instance of RandomIntegerContainer
    }

    public RandomIntegerContainer() { //method to create empty arraylist
        arr = new ArrayList<Integer>(); //creates empty arraylist
    }
    
    public ArrayList addToFront(Integer num) { //adds num to the beginning of the arraylist
        arr.add(0, num); //adds num to position 0, beginning
        return arr; //returns arraylist
    }

    public ArrayList addSorted(Integer num) { //adds number to a sorted arraylist
        int i = 0; //start at the beginning
        while(i < arr.size() && arr.get(i).compareTo(num) == -1) { //loops while position is smaller than length and if the number is larger than current
            i++; //add one to position
        }
        arr.add(i, num); //add number to position i
        return arr; //returns arraylist
    }

    //PG 354
    public ArrayList insertionSort() { //sorts arraylist using insertion sort
        for(int i = 1; i < arr.size(); i++) { //loops through the array starting at i = 1
            Integer key = arr.get(i); //stores current element
            for(int j = i - 1; j >= 0; j--) { //loops through the array backwards
                if(key.compareTo(arr.get(j)) < 0){ //compares stored element to current element
                    arr.set(j + 1, arr.get(j)); //if true, it will shift to the right
                    if(j == 0) { //if it reaches the beginning
                        arr.set(0, key); //set key to the beginning
                    }
                }
                else { //if above if statement is false
                    arr.set(j + 1, key); //set key to the position
                    break; //escape from for looop
                }
            }
        }    
        return arr; //return arraylist
    }

    public ArrayList insertionSortUnique() { //removes duplicate elements
        insertionSort(); //first sorts arraylist using insertionSort() method
        for(int i = 0; i < arr.size() - 1; i++) { //loops through arraylist
            if(arr.get(i).equals(arr.get(i + 1))) { //checks to see if current element is equal to element after it
                arr.remove(i); //if above is true, it removes the duplicate
                i--; //goes back one element
            }
        }
        return arr; //returns arraylist
    }

    public Integer[] returnArray() { //converts arraylist to array
        Integer[] arrayInt = new Integer[arr.size()]; //sets length of array to size of arraylist
        for(int i = 0; i < arr.size(); i++) { //loops through arraylist
            arrayInt[i] = Integer.valueOf(arr.get(i)); //assigns Integer from arraylist to array
        }
        return arrayInt; //return array
     }
}