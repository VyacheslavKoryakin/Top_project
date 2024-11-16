package HomeWork.ArrayLinkedList;

import java.util.ArrayList;
import java.util.List;

import static HomeWork.ArrayLinkedList.Methods.*;

public class Students {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        List<String> newStudents = new ArrayList<>();
        String[] studentNames = {"John", "Will", "Anna", "Sam", "Roy"};
        String[] newStudentNames = {"Igor", "Sasha", "Artem", "Egor", "Vadim"};
        String[] namesForCheck = {"Igor", "Misha", "Valera", "Sam", "Nelly"};

        addStudents(studentNames, students);
        System.out.println(students);

        addNewStudents(newStudentNames, students, newStudents);
        System.out.println(students);

        removeStudentsByIndex(students, 2);
        System.out.println(students);

        removeStudentsByObject(students, students.get(1));
        System.out.println(students);

        checkNameInList(students, "Artem");

        checkListNamesInList(namesForCheck, students);

        checkAllNamesInList(namesForCheck, students);

        System.out.println("Размер списка : " + getSize(students));
        System.out.println("Список пуст? " + isEmpty(students));

        clearList(students);
        System.out.println(students);

    }
}
