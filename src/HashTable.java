import java.util.ArrayList;
import java.lang.Math;

public class HashTable<E>{
    private ArrayList<E> table;

    //initializes an array of size capacity
    public HashTable(int capacity){
        table = new ArrayList<>(capacity);
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        return true;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        return "";
    }

    //returns the unique int in the range of the [0, array length)
    public int hashCode(String key){
        int hash = 0;
        int index = 0;
        while (key.length() != index) {
            hash += key.charAt(index) * Math.pow(2, index);
            index++;
        }
        return hash % 2027;
    }
}
