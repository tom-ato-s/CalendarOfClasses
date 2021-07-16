package Day;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DayVew {
     Day day;
     Table table;
     Mutable mutable;

     // Создание элементов окна "День"

    private final JFrame jframe = new JFrame("Калегндарь занятий на день");

    JPanel panel = new JPanel();
    JPanel panelOfDay = new JPanel();
    JPanel panelButton = new JPanel();
    JButton buttonSave = new JButton("Сохранить");
    JScrollPane jScrollPane = new JScrollPane();
    int intClass = 3; //количество занятий в день


    protected void initFrameDay() {

        //Добавление кнопок хакрытия окна
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(800, 800);

        //НИЖНЯЯ ПАНЕЛЬ с кнопкой, добавление
        panelButton.add(buttonSave);
        jframe.add(panelButton, BorderLayout.SOUTH);

        // panelOfDay добавление элементов в
        //вставка даты и ня недели в окно panelOfDay
        String nowDay = CalculationDeyOfWeek.NowDayClass();
        String nowWeek = CalculationDeyOfWeek.NawWeek();
        panelOfDay.setBorder(BorderFactory.createTitledBorder(nowWeek + " " + nowDay));
        panelOfDay.setLayout(new GridLayout(intClass, 2));
        for (int i = 0; i < intClass; i++) {
            int in = i + 1;
            panelOfDay.add(new Label("Занятие " + in));

            //добавление в ComboBox

            Table table = new Table();
            ArrayList<String> li = new ArrayList<>(table.getList());
            JComboBox comboBox = new JComboBox();
            for (int j = 0; j < li.size(); j++)
            {
                comboBox.addItem(li.get(j));
            }


            // обработка события выбора елемента из списка
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s = (String) comboBox.getSelectedItem();

                    if (s.equals("Добавить вид занятий")) {
                        // System.out.println("нажата строка " + s);
                        String newTipOfClass = getClassOfOptionPanel();


//    ???               newTipOfClass add to ComBox and add to ArrayList
  //                      comboBox.addItem(newTipOfClass);


                        //проверочная печать листа
                        Table table = new Table();
                        table.addToList(newTipOfClass);
                        table.printList();
//                        comboBox.removeAllItems();
//                        for (int j = 0; j < li.size(); j++)
//                        {
//                            comboBox.addItem(li.get(j));
//                        }

                    }
                }
            });

            panelOfDay.add(comboBox);

        };

        // ВЕРХНЯЯ ПАНЕЛЬ добавление panelOfDay в panel
        //в будещем сделать цикл добавдения нескольких panelOfDay
        panel.add(panelOfDay);
        panel.add(panelOfDay);

        jScrollPane.add(panel);
        jframe.add(jScrollPane, BorderLayout.CENTER);

        jframe.add(panel);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }

    protected  String getClassOfOptionPanel() {

        String newTipOfClass = JOptionPane.showInputDialog(jframe,
                "Введите новый вид занятий (Рисование, Лепка)",
                "Новое значение",
                JOptionPane.QUESTION_MESSAGE);

        return (newTipOfClass.trim());
    }
}