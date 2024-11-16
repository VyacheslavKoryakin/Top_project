package HomeWork.ArrayLinkedList;


import java.util.ArrayList;
import java.util.List;

public class Methods {
    private static Students students;

    /**
     * метод принимает лист и массив строк
     * и заполняет лист значениями из массива.
     *
     * @param students String[]
     * @param list     List<E>
     */
    public static void addStudents(String[] students, List list) {
        for (String student : students) {
            list.add(student);
        }
    }

    /**
     * Метод принимает параметры
     *
     * @param students String[]
     * @param list     List<E>
     * @param newList  List<E>
     *                 и добавляет в список list новый список newList
     */
    public static void addNewStudents(String[] students, List list, List newList) {
        addStudents(students, newList);
        list.addAll(newList);
    }

    /**
     * Метод удаляет элемент из списка по имени объекта
     * @param list List<E>
     * @param object Object
     */
    public static void removeStudentsByObject(List list, Object object) {
        list.remove(object);
    }

    /**
     * метод удаляет элемент из списка по индексу
      * @param list List<E>
     * @param index int
     */
    public static void removeStudentsByIndex(List list, int index) {
        list.remove(index);

    }

    /**
     * проверяет есть ли элемент с таким именем в списке
     * @param list List<E>
     * @param name String
     */
    public static void checkNameInList(List list, String name) {
        System.out.println("В списке есть имя " + name + "? -" + list.contains(name));
    }


    /**
     * Метод проверяет есть ли в списке имена из другого списка
     * проверяется каждое имя.
      * @param name String[]
     * @param list List<E>
     */
    public static void checkListNamesInList(String[] name, List list) {
        List<String> names = new ArrayList<>();
        addStudents(name, names);
        for (Object o : names) {
            list.contains(o);
            System.out.println("В списке есть имя " + o + "? -" + list.contains(o));
        }
    }

    /**
     * Метод проверяет совпадают ли имена в 2-х разных списках
     * @param name String[]
     * @param list List<E>
     */
    public static void checkAllNamesInList(String[] name, List list) {
        List<String> names = new ArrayList<>();
        addStudents(name, names);
        System.out.println(list.containsAll(names));
    }

    /**
     * метод проверяет размер списка и возвращает значение типа int
     * @param list List<E>
     * @return int
     */
    public static int getSize(List list) {
        return list.size();
    }

    /**
     * Метод проверяет пуст ли список и возращает true или false
      * @param list List<E>
     * @return boolean
     */
    public static boolean isEmpty(List list) {
        return list.isEmpty();
    }

    /**
     * метод удаляет все элементы из списка
      * @param list List<E>
     */
    public static void clearList(List list) {
        list.clear();
    }
}


