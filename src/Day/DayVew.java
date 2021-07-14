package Day;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

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
           // Создание элементов окна "День"
         JPanel panelDay = new JPanel();
         JLabel namber1 = new JLabel("1");
         JLabel namber2 = new JLabel("2");
         JLabel namber3 = new JLabel("3");

         JComboBox<String> class1 = new JComboBox<String>();
        class1.addItem("  ");
        class1.addItem("Рисование");
        class1.addItem("Лепка");
        class1.addItem("Физическое виспитание");
        class1.addItem("Окружающий мир");
        class1.addItem("Вырезание");
        class1.addItem("Разукрашивание");
        add(class1);

         JComboBox<String> class2 = new JComboBox<String>();
        class2.removeAllItems();
        for (int t = 0; t < class1.getItemCount(); t++)
        {
            class2.addItem(class1.getItemAt(t));
        }

        JComboBox<String> class3 = new JComboBox<String>();
        class3.removeAllItems();
        for (int t = 0; t < class1.getItemCount(); t++)
        {
            class3.addItem(class1.getItemAt(t));
        }


            //вставка даты и ня недели в окно "День"
        String nowDay = CalculationDeyOfWeek.NowDayClass();
        String nowWeek = CalculationDeyOfWeek.NawWeek();
        //       CalculationDeyOfWeek.calculationDeyOfWeek()


        this.setBorder(BorderFactory.createTitledBorder(nowWeek + " " + nowDay));
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
        JPanel panel = new JPanel();

// add something to you panel...
// panel.add(...);



        panel.add(new DayVew(1));
//        panel.add(new DayVew(2));
//        panel.add(new DayVew(3));
//        panel.add(new DayVew(4));
//        panel.add(new DayVew(5));
//        panel.add(new DayVew(6));
//        panel.add(new DayVew(7));


// add the panel to a JScrollPane
        JScrollPane jScrollPane = new JScrollPane(panel);
// only a configuration to the jScrollPane...
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

// Then, add the jScrollPane to your frame
        jframe.getContentPane().add(jScrollPane);



        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


 // panel.setLayout(new BoxLayout(jframe.getContentPane(), BoxLayout.Y_AXIS));
     //   panel.add(Box.createVerticalGlue());

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
 //                      initFrameDay();
                    }
                }
        );



        Table table = new Table();
        table.addToArr("Лепка");
        table.addToArr("Рисование");
        table.addToArr("Английский");
        table.printArr();
        table.addToArr("Лепка");

        table.replaceToArr("Физическое воспитание","Рисование");
        table.printArr();
    }
}
