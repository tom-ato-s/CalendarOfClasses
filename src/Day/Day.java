package Day;

import javax.swing.*;

public class Day {
    private static DayVew dayVew;



    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        Day day = new Day();
                        dayVew = new DayVew(day);
                        dayVew.initFrameDay();
                    }
                }
        );

    }
}
