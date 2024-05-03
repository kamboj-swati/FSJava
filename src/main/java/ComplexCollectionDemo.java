import java.util.ArrayList;
import java.util.List;

public class ComplexCollectionDemo {

    public static void main(String[] args) {

        List<String> row1 = new ArrayList<String>();
        row1.add("Swati");
        row1.add("Female");
        row1.add("Melbourne");

        List<String> row2 = new ArrayList<String>();
        row2.add("Tanvi");
        row2.add("Female");
        row2.add("Delhi");

        List<String> row3 = new ArrayList<String>();
        row3.add("Rahat");
        row3.add("Male");
        row3.add("Sydney");

        List<String> row4 = new ArrayList<String>();
        row4.add("Navi");
        row4.add("Male");
        row4.add("LA");

        List<List<String>> table = new ArrayList<List<String>>();
        table.add(row1);
        table.add(row2);
        table.add(row3);
        table.add(row4);

        //print the value from Table
        for(List<String> l : table){
            System.out.println(l.get(0)+ " | " + l.get(1)+ " | " + l.get(2));
        }

    }
}
