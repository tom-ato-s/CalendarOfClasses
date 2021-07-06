package Day;

import javax.swing.*;

public class DayVew {
    private JFrame jframe = new JFrame("Калегндарь занятий на день");
    private JPanel panelDay = new JPanel();
    private JLabel dayTitle = new JLabel("Расписание занятий на день");
    private JTextArea data = new JTextArea("День недели/дата занятия");
    private JTextArea class1 = new JTextArea("Выберите вид занятий");
    private JTextArea class2 = new JTextArea("Выберите вид занятий");
    private JTextArea class3 = new JTextArea("Выберите вид занятий");
    private JButton tuMonthButton = new JButton("На главную страницу");
    private final Day day;

    public DayVew(Day day) {
        this.day = day;
    }

    protected void initFrameDay() {
        panelDay.add(dayTitle);
        panelDay.add(data);
        panelDay.add(class1);
        panelDay.add(class2);
        panelDay.add(class3);
        jframe.add(panelDay);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}
