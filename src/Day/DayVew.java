package Day;

import javax.swing.*;
import java.awt.*;

public class DayVew extends JPanel{


    //   private JLabel dayTitle = new JLabel("Расписание занятий на день");
    //   private JTextArea data = new JTextArea("День недели/дата занятия");
//    private JButton toWeekButton = new JButton("На главную страницу Расписание на неделю");
  //  private final Day day;

//    private static void choosingClasses() {
//        JComboBox<String> class = new JComboBox<String>();
//        class.addItem("Рисование");
//
//    }



    public DayVew(int n) {
  //      this.day = day;

         JPanel panelDay = new JPanel();
         JLabel namber1 = new JLabel("Занятие 1");
         JLabel namber2 = new JLabel("Занятие 2");
         JLabel namber3 = new JLabel("Занятие 3");
         JComboBox<String> class1 = new JComboBox<String>();
        class1.addItem("Рисование");
        class1.addItem("Лепка");
        class1.addItem("Физическое виспитание");
        class1.addItem("Ознакомление с окружающей стредой");
        class1.addItem("Вырезание");
        class1.addItem("Разукрашивание");
        add(class1);


         JComboBox<String> class2 = new JComboBox<String>();
        class2.addItem("Рисование");
        class2.addItem("Лепка");
        class2.addItem("Физическое виспитание");
        class2.addItem("Ознакомление с окружающей стредой");
        class2.addItem("Вырезание");
        class2.addItem("Разукрашивание");
        add(class2);

        JComboBox<String> class3 = new JComboBox<String>();
        class3.addItem("Рисование");
        class3.addItem("Лепка");
        class3.addItem("Физическое виспитание");
        class3.addItem("Ознакомление с окружающей стредой");
        class3.addItem("Вырезание");
        class3.addItem("Разукрашивание");
        add(class2);

        this.setBorder(BorderFactory.createTitledBorder("panel" + n));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(namber1)
                        .addComponent(namber2)
                        .addComponent(namber3))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(class1)
                        .addComponent(class2)
                        .addComponent(class3))
        );
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(namber1)
                        .addComponent(class1))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(namber2)
                        .addComponent(class2))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(namber3)
                        .addComponent(class3))
        );
    }

//    public GroupPanelDay (int n) {
//
//    }

    private static void initFrameDay() {
        JFrame jframe = new JFrame("Калегндарь занятий на день");
        jframe.setLayout(new BoxLayout(jframe.getContentPane(), BoxLayout.Y_AXIS));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(new DayVew(1));
        jframe.add(new DayVew(1));
        jframe.add(new DayVew(1));
       // jframe.add(Box.createVerticalGlue());
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

        //        panelDay.add(dayTitle, BorderLayout.NORTH);
//        panelDay.add(data);
//        panelDay.add(class1);
//        panelDay.add(class2);
//        panelDay.add(class3);
//        jframe.add(panelDay);
        // jframe.add(new DayVew(1));

    }


    public static void main(String[] args) {
        //создать фрейм в потоке деспетчеризации событий
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
//                        Day day = new Day();
//                        dayVew = new DayVew(day);
                       initFrameDay();
                    }
                }
        );

    }
}
