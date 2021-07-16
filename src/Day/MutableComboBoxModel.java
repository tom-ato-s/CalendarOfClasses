package Day;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public interface MutableComboBoxModel extends ComboBoxModel {


//добавленье елемента в Box
 //  void addElement(E item);

   //вставлять елемент по индексу в Box
//    void insertElementAt(E item, int index);

    //удаление елемента из Box по имени и индексу
    void removeElement(Object obj);
    void removeElementAt(int index);

//получить выбранный элемент
    Object 	getSelectedItem();
//установить выбранный злемент
    void 	setSelectedItem(Object anItem);


        //добавление данных из списка l
    void addListDataListener(ArrayList list);
//удаление данных из списка l
    void removeListDataListener(ListDataListener l);

    //получить элемент по индексу
//    E getElementAt(int index);
    //получить размер листа
    int getSize();



}
