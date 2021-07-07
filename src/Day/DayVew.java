package Day;

import javax.swing.*;
import java.awt.*;

public class DayVew extends JPanel{

    private JPanel panelDay = new JPanel();
    private JLabel namber1 = new JLabel("1");
    private JLabel namber2 = new JLabel("2");
    private JLabel namber3 = new JLabel("3");
    private JTextArea class1 = new JTextArea("Выберите вид занятий");
    private JTextArea class2 = new JTextArea("Выберите вид занятий");
    private JTextArea class3 = new JTextArea("Выберите вид занятий");
    //   private JLabel dayTitle = new JLabel("Расписание занятий на день");
    //   private JTextArea data = new JTextArea("День недели/дата занятия");
//    private JButton toWeekButton = new JButton("На главную страницу Расписание на неделю");
  //  private final Day day;

    public DayVew(int n) {
  //      this.day = day;

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
        jframe.add(Box.createVerticalGlue());
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
