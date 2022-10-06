package DomZad;
/*
Selectable и Updatable
*/

public class JR_19_2_4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    class Screen implements Selectable, Updatable {

        public void onSelect() {
        }

        public void refresh() {
        }
    }
}
