import java.util.*;
class demo {
    /* Java program to design a data structure that support following operations in O(N) time
a) Insert
b) Delete
c) Search
d) getRandom */
    //no need to worry about the duplicated
    //reasonable input

        ArrayList<String> arr; // A resizable array
        HashSet<String> set;

        public demo() {
            arr = new ArrayList<String>();
            set = new  HashSet<String> ();
        }

        public void add(String s) {
           set.add(s);
           arr.add(s);
        }

        public void remove(String s) {
            if(set.contains(s)){
                set.remove(s);
                arr.remove(s);
            }
        }

        String getRandom() {
            Random rand = new Random();
            int index = rand.nextInt(arr.size());
            return arr.get(index);
        }

        boolean search(String s) {
            return set.contains(s);
        }

        public static void main (String[] args) {
            demo ds = new demo();
            ds.add("a");
            ds.add("aa");
            ds.add("aaa");
            ds.add("abc");
            System.out.println(ds.search("x"));
            ds.remove("aaa");
            ds.add("catherine");
            System.out.println(ds.search("a"));
            System.out.println(ds.getRandom());
        }

}