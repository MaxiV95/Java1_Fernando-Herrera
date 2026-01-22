import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start, end,
                timeArrayListInsercion,
                timeLinkedListInsercion,
                timeArrayListAcceso,
                timeLinkedListAcceso,
                timeArrayListEliminacion,
                timeLinkedListEliminacion;

        int elements = 100_000;

        // Insertar al final
        start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        timeArrayListInsercion = end - start;

        start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        timeLinkedListInsercion = end - start;

        // Acceder a elementos
        start = System.nanoTime();
        arrayList.get(elements / 2);
        end = System.nanoTime();
        timeArrayListAcceso = end - start;

        start = System.nanoTime();
        linkedList.get(elements / 2);
        end = System.nanoTime();
        timeLinkedListAcceso = end - start;

        // Eliminar elementos
        start = System.nanoTime();
        arrayList.remove(elements / 2);
        end = System.nanoTime();
        timeArrayListEliminacion = end - start;

        start = System.nanoTime();
        linkedList.remove(elements / 2);
        end = System.nanoTime();
        timeLinkedListEliminacion = end - start;

        System.out.println();
        System.out.printf("* %8d ns - %s %n", timeArrayListInsercion, "ArrayList insertion time");
        System.out.printf("* %8d ns - %s %n", timeLinkedListInsercion, "LinkedList insertion time");
        System.out.printf("* %8d ns - %s %n", timeArrayListAcceso, "ArrayList access time");
        System.out.printf("* %8d ns - %s %n", timeLinkedListAcceso, "LinkedList access time");
        System.out.printf("* %8d ns - %s %n", timeArrayListEliminacion, "ArrayList removal  time");
        System.out.printf("* %8d ns - %s %n", timeLinkedListEliminacion, "LinkedList removal time");
    }
}
