import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //--------------Array List------------//

        ArrayList arrayList1 = new ArrayList();
        /*declare ArrayList type object and initialize ArrayList type reference variable*/

        arrayList1.add(10);
        arrayList1.add("Array List");
        arrayList1.add(true);
        arrayList1.add(10.5);

        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(10);

        /*Illegal - Because the data type of arrayList2 is Integer*/

        /*arrayList2.add("Array List");
        arrayList2.add(true);
        arrayList2.add(10.5);*/

    }
}
