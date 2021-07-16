package Day;

import javax.swing.event.ListDataListener;
import java.util.ArrayList;

abstract class Mutable {
    MutableComboBoxModel mutableComboBoxModel = new MutableComboBoxModel() {
        @Override
        public void removeElement(Object obj) {

        }

        @Override
        public void removeElementAt(int index) {

        }

        @Override
        public Object getSelectedItem() {
            return null;
        }

        @Override
        public void setSelectedItem(Object anItem) {

        }

        @Override
        public void addListDataListener(ArrayList list) {

        }

        @Override
        public void removeListDataListener(ListDataListener l) {

        }

        @Override
        public int getSize() {
            return 0;
        }

        @Override
        public Object getElementAt(int index) {
            return null;
        }

        @Override
        public void addListDataListener(ListDataListener l) {

        }
    };
}
