package HashMap;

import java.util.*;

public class HashMapEx {
    public void hashMapEx(){
        HashMap<Integer,String > hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Samsung");
        hashMap.put(2,"Apple");
        hashMap.put(3,"Xaiomi");
        hashMap.put(4,"Samsung2");
        hashMap.put(5,"Apple2");
        hashMap.put(6,"Xaiomi2");
        System.out.println(hashMap);

        hashMap.remove(3,"Xaiomi");
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        HashMapEx res = new HashMapEx();
        res.hashMapEx();
    }
}