import java.util.*;

public class linklist {
    
    public LinkedList<Integer> addAndSort(LinkedList<Integer> list , int x){
        System.out.println("Before " + list);
        list.addLast(x);
        list.sort(Comparator.naturalOrder());
        System.out.println("After " + list);
        return list;
    }

    public LinkedList<Integer> swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        System.out.println("Linked List Before Swapping :-" + list);

        // Getting the positions of the elements
        int index1 = list.indexOf(indexOne);
        int index2 = list.indexOf(indexTwo);

        if (index1 == -1 || index2 == -1) {
            System.out.println("NULL");

        }

        // Swapping the elements
        list.set(index1, indexTwo);
        list.set(index2, indexOne);

        System.out.println("Linked List After Swapping :-" + list);

        return list;
    }

    public void findValue(LinkedList<Integer> list,int checkvalue) {
        Random random = new Random();
        boolean status = false;
        for (int i = 0; i < 9999; i++) {
            int value = random.nextInt(9999 - 1000) + 1000;
            list.addLast(value);
        }

       
        
        for (int i = 0; i < list.size(); i++) {
  
            // Eztracting each element in
            // the Linked List
            int llElement = list.get(i);
  
            // Checking if the extracted element is equal to
            // the element to be searched
            if (llElement == checkvalue) {
  
                status = true;
            }
        }

        if (status == true){
            System.out.println("Found");
        }
        else if (status == false){
            System.out.println("-1");
        }

    }

}
