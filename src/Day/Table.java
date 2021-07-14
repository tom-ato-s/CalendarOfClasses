package Day;

import java.util.ArrayList;


public class Table {

    ArrayList<String> arr = new ArrayList<String>();


    public void addToArr(String s) {
        if (!arr.contains(s))
            arr.add(s);
        else
            System.out.println("Массив уже сожержит значение: " + s);
    }


    public void dellToArr(String s) {
            if (arr.contains(s)) {
                arr.remove(s);
            } else
                System.out.println("В данном массиве нет элемента " + s + " - нечего удалять");
    }

    public void replaceToArr(String sNew, String s) {
        if (arr.contains(s)) {
            int index = arr.indexOf(s);
            arr.set(index, sNew);
        } else System.out.println("Не удалось заменить элемент, данного элемента нет в массиве");
    }

public void printArr () {
        System.out.println(arr);
}

}

