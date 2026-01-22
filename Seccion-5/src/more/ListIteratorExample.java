import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ana", "Juan", "Carlos", "Alberto", "Miguel"));

        System.out.println("names = " + names);

        addName(names, "Sofía");

        System.out.print("names =  ");
        readNames(names);

        updateName(names, "Carlos", "Carla");

        removeName(names, "Miguel");

        System.out.println("names = " + names);
    }

    public static void addName(List<String> names, String newName) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Juan")) {
                iterator.add(newName);
                break;
            }
        }
    }

    public static void updateName(List<String> names, String oldName, String newName) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(oldName)) {
                iterator.set(newName);
                break;
            }
        }
    }

    public static void removeName(List<String> names, String oldName) {
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(oldName)) {
                iterator.remove();
                break;
            }
        }
    }

    public static void readNames(List<String> names) {
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
