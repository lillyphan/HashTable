public class testDriver {
    public static void main(String[] args) {
        HashTable<String> ht = new HashTable<>(10);
        System.out.println(ht.hashCode("aaaa"));
        System.out.println(ht.hashCode("aaab"));
        System.out.println(ht.hashCode("bbbb"));
        System.out.println(ht.hashCode("cccc"));
        System.out.println(ht.hashCode("dddd"));
        System.out.println(ht.hashCode("House"));
        System.out.println(ht.hashCode("housE"));

        //where it maxes out
        System.out.println(ht.hashCode("superduperduperduperdddd"));
    }
}
