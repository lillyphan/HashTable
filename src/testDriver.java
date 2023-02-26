public class testDriver {
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        System.out.println(ht.put("1", "a"));
        System.out.println(ht.put("2", "b"));
        System.out.println(ht.put("1", "a"));
        System.out.println(ht.put("3", "c"));
        System.out.println(ht.put("4", "d"));
        System.out.println(ht.put("5", "e"));
        System.out.println(ht.put("6", "f"));
        System.out.println(ht.put("7", "g"));
        System.out.println(ht.put("8", "h"));
        System.out.println(ht.put("9", "i"));
        System.out.println(ht.put("10", "j"));
        System.out.println(ht);
    }
}
