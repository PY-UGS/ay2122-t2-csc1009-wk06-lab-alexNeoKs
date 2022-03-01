import java.util.*;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        linklist obj = new linklist();
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(9);
        ll.addLast(11);

        //ll = obj.addAndSort(ll, 2);
        System.out.println("             ");

        obj.swapValues(ll, 3, 11);
        System.out.println("             ");

        Random random = new Random();
        int value = random.nextInt(9999 - 1000) + 1000;

        obj.findValue(ll,value);
    }
}


