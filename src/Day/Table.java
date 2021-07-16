package Day;

import java.util.ArrayList;


public class Table {

    ArrayList<String> list = new ArrayList<String>();

    Table() {
        list.add(" ");
        list.add("Добавить вид занятий");
        list.add("Рисование");
        list.add("Лепка");
        list.add("Физическое виспитание");
        list.add("Окружающий мир");
    }


    public ArrayList getList() {
        return list;
}

    public void addToList(String s) {
        if (!list.contains(s))
            list.add(s);
        else
            System.out.println("Массив уже сожержит значение: " + s);
    }


    public void dellToList(String s) {
            if (list.contains(s)) {
                list.remove(s);
            } else
                System.out.println("В данном массиве нет элемента " + s + " - нечего удалять");
    }

    public void replaceToList(String sNew, String s) {
        if (list.contains(s)) {
            int index = list.indexOf(s);
            list.set(index, sNew);
        } else System.out.println("Не удалось заменить элемент, данного элемента нет в массиве");
    }

    public void printList () {
        System.out.println(list);
    }

    void addListDataListener(ArrayList list) {
        addListDataListener(list);
    }

}

