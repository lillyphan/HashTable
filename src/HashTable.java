import java.util.ArrayList;
import java.lang.Math;

public class HashTable{
    private ArrayList<String> table; //hash table array
    private int size; //size of hash table

    //initializes an array of size capacity
    public HashTable(int capacity){
        table = new ArrayList<>(); //declare all pieces of instance data
        size = capacity;
        for (int i = 0; i < capacity; i++) { //add empty elements up the capacity
            table.add(null);
        }
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        if (get(key) == null){ //if there is not a pre-existing key with the same name
            table.set(hashCode(key) % size, value); //change the bucket at the index returned by hashCode to the value
            return true;
        } else {
            return false; //returns false because operation failed
        }
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        if (table.contains(key)){
            return table.get(hashCode(key) % size); //the use of mod makes the hash code scalable for different array sizes
        } else {
            return null;
        }
    }

    //returns the unique int in the range of the [0, array length)
    public int hashCode(String key){
        int hash = 0; //hash value
        int index = 0; //index in String key
        while (key.length() != index) { //loop through all characters of string
            hash += key.charAt(index) * Math.pow(2, index); //perform operation
            index++;
        }
        return hash % 2027; //mod by large prime number
    }

    public String toString(){
        return table.toString(); //returns the hash table
    }
}
