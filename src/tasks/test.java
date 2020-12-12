package tasks;

import java.util.SortedMap;

public class test {
    public static void main(String[] args) {
        ArrayQueueModule arr1 = new ArrayQueueModule();
        ArrayQueueADT arr2 = new ArrayQueueADT();
        LinkedQueue arr3 = new LinkedQueue();

        for (int i=0;i<10;i++){
            arr1.enqueue(i);
            ArrayQueueADT.enqueue(arr2, i);
            arr3.enqueue(i);
        }
        for (int i=0;i < 3;i++){
            System.out.println(arr1.dequeue());
        }

        System.out.println("arr1 size: " + arr1.size());
        System.out.println(arr1);
        arr1.clear();
        System.out.println("is arr1 empty? " + arr1.isEmpty());
        System.out.println("arr1 size: " + arr1.size());

        System.out.println(arr2);

        arr3.dequeue();
        System.out.println(arr3.element());
        System.out.println(arr3);

    }
}
