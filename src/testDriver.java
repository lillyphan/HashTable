public class testDriver {
    public static void main(String[] args) {
        //testing constructor
        HashTable ht = new HashTable(10);

        //testing put()
        System.out.println("true: " + ht.put("78", "a"));
        System.out.println("true: " + ht.put("53", "b"));
        System.out.println("false: " + ht.put("78", "c")); //repeat key
        System.out.println("false: " + ht.put("72", "c"));
        System.out.println("true: " + ht.put("26", "d"));
        System.out.println("true: " + ht.put("57", "e"));
        System.out.println("true: " + ht.put("23", "f"));
        System.out.println("false: " + ht.put("64", "g"));
        System.out.println("true: " + ht.put("82", "h"));
        System.out.println("true: " + ht.put("67", "i"));
        System.out.println("false: " + ht.put("47", "j"));
        System.out.println(ht);

        //testing get()
        System.out.println("h: " + ht.get("82"));
        System.out.println("a: " + ht.get("78"));
        System.out.println("d: " + ht.get("26"));
        System.out.println("e: " + ht.get("57"));
        System.out.println("f: " + ht.get("23"));
    }
}
