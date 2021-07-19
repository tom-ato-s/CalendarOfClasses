package Day;

import javax.swing.*;


public class Day {
    private static DayVew dayVew = new DayVew();
    private static DayModel dayModel = new DayModel();


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
//                               @Override
            public void run() {
                dayVew.initFrameDay();
                    }
                }
        );
    }
}