package DomZad;
import java.util.List;

/*
Реализация интерфейса используя локальный класс
*/

public class SJR_31_6_1 {
    public static void main(String[] args) {
        List<Pet2> pet = Util2.getPets();
        List<Sayable> pets = Util2.convertPetToSayable(pet);
        Util2.printDialog(pets);
    }
}