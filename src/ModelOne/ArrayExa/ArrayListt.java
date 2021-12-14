package ModelOne.ArrayExa;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> arryList = new ArrayList<String>();
        arryList.add("DEEPU");
        arryList.add("PRASAD");
        arryList.add("KUSHWAHA");
        arryList.add("DELL");
        arryList.add("SAMSUNG");
        arryList.add("REDMI");
        arryList.add("RAM");
        arryList.add("SITA");

        System.out.println("NAME is "+ arryList);

        arryList.remove("RAM");
        System.out.println("REMOVED" + arryList);

        arryList.remove(6);
        System.out.println("REMOVED INDEX" + arryList);

        System.out.println("Lsit Size" + " " + arryList.size());

        Collections.sort(arryList);
        System.out.println("Sort  " + arryList);

        Collections.sort(arryList, Collections.reverseOrder());
        System.out.println("RESERVE  " + arryList);

        arryList.set(0,"deepu");
        System.out.println("After Update  " + arryList);
    }
}
