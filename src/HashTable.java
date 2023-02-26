import java.util.ArrayList;
import java.lang.Math;

public class HashTable{
    private ArrayList<String> table;
    private int size;

    //initializes an array of size capacity
    public HashTable(int capacity){
        table = new ArrayList<>();
        size = capacity;
        for (int i = 0; i < capacity; i++) {
            table.add(null);
        }
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        if (get(key) == null){
            System.out.println(hashCode(key) % size);
            table.set(hashCode(key) % size, value);
            return true;
        } else {
            return false;
        }
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        return table.get(hashCode(key) % size);
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

    public String toString(){
        return table.toString();
    }
}
