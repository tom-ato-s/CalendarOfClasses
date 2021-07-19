package Day;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DayVew {
     Day day;
     Table table= new Table();
     Mutable mutable;

     // Создание элементов окна "День"

    private final JFrame jframe = new JFrame("Калегндарь занятий на день");

    JPanel panel = new JPanel();
    JPanel panelOfDay = new JPanel();
    JPanel panelButton = new JPanel();
    JButton buttonSave = new JButton("Сохранить");
 //   JScrollPane jScrollPane = new JScrollPane();
    int intClass= 3; //количество занятий в день
    int intday = 7;



    protected void initFrameDay() {

        //Добавление кнопок закрытия окна
  //      jframe.setLayout(new FlowLayout());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(100, 100);

        // ВЕРХНЯЯ ПАНЕЛЬ добавление panelOfDay в panel
        //в будещем сделать цикл добавдения нескольких panelOfDay
        panel.setLayout(new FlowLayout());
        panel.add(panelOfDay());
        panel.add(panelOfDay());
        jframe.add(panel);

        //НИЖНЯЯ ПАНЕЛЬ с кнопкой, добавление
        panelButton.setLayout(new FlowLayout());
        panelButton.add(buttonSave);
        jframe.add(panelButton, BorderLayout.SOUTH);

        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }

    JPanel panelOfDay() {

        // panelOfDay добавление элементов в
        //вставка даты и ня недели в окно panelOfDay
        String nowDay = CalculationDeyOfWeek.NowDayClass();
        String nowWeek = CalculationDeyOfWeek.NawWeek();
        panelOfDay.setBorder(BorderFactory.createTitledBorder(nowWeek + " " + nowDay));
        panelOfDay.setLayout(new GridLayout(intClass, 2));
        int in = 0;
        for (int j = 0; j < intClass; j++) {
            in = j + 1;
            panelOfDay.add(new Label("Занятие " + in));

            panelOfDay.setSize(20, 20);
            panelOfDay.add(addComboBox());
        } in = 0;
        return panelOfDay;
    }

    //создание JComboBox
    //оброботчик событий JComboBox Выбор элемента из списка
    JComboBox addComboBox() {
        ArrayList<String> li = new ArrayList<>(table.getList());
        JComboBox comboBox = new JComboBox(li.toArray());
        // обработка события выбора елемента из списка
        comboBox.addActionListener(new ActionListener() {
            //              @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) comboBox.getSelectedItem();

                if (s.equals("Добавить вид занятий")) {
                    // System.out.println("нажата строка " + s);
                    String newTipOfClass = getClassOfOptionPanel();

//    ???          newTipOfClass add to ComBox and add to ArrayList
//                 comboBox.addItem(newTipOfClass);

                    //проверочная печать листа
                    table.addToList(newTipOfClass);
                    table.printList();
//                        comboBox.removeAllItems();
//                        for (int j = 0; j < li.size(); j++)
//                        { comboBox.addItem(li.get(j)); }
                }

            }
        });
        return comboBox;
    }




    protected  String getClassOfOptionPanel() {

        String newTipOfClass = JOptionPane.showInputDialog(jframe,
                "Введите новый вид занятий (Рисование, Лепка)",
                "Новое значение",
                JOptionPane.QUESTION_MESSAGE);

        return (newTipOfClass.trim());
    }
}