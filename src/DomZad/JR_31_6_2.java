package DomZad;
import java.util.List;

/*
Как избежать Copy+Paste
*/

public class JR_31_6_2 {
    public static void main(String[] args) {
        List<Pet3> pet = Util3.getPets();
        List<Sayable2> pets = Util3.convertPetToSayable(pet);
        Util3.printDialog(pets);
    }
}