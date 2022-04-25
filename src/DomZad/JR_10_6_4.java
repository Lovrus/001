package DomZad;


    /*
Конструктор
*/

class JR_10_6_4 {
    public Color color;

    public JR_10_6_4() {
        color = new Color();
    }

    public static void main(String[] args) {
        JR_10_6_4 circle = new JR_10_6_4();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

