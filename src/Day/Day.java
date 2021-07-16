package Day;

import javax.swing.*;


public class Day {
    private static DayVew dayVew;
    private static DayModel dayModel;


    public static void main(String[] args) {
        dayVew = new DayVew();
        dayModel = new DayModel();
        dayVew.initFrameDay();

//        SwingUtilities.invokeLater(
//                new Runnable() {
//                    @Override
//                    public void run() {
//
//                        new  dayVew.initFrameDay();
//                    }
//                }



//        );





        }
    }



////        //создать фрейм в потоке деспетчеризации событий
////        SwingUtilities.invokeLater(
////                new Runnable() {
////                    public void run() {
////                        Day day = new Day();
////                        dayVew = new DayVew(day);
////                        dayVew.initFrameDay();
////                    }
////                }
////        );
////
////    }
//}
