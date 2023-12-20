package DomZad;
import java.util.LinkedList;
import java.util.List;

public class Util2 {
    //Util отлично работает со всеми классами Cat, Mouse. А ведь Mouse отличается от Cat.
    public static void printDialog(List<Sayable> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).say());
        }
    }

    public static List<Pet2> getPets() {
        List<Pet2> pets = new LinkedList<>();
        pets.add(new Cat21("Мурзик"));
        pets.add(new Cat21("Васька"));
        pets.add(new Cat21("Кошка"));
        pets.add(new Mouse19());
        pets.add(new Cat21("Томас"));
        return pets;
    }

    public static List<Sayable> convertPetToSayable(List<Pet2> pets) {
        List<Sayable> result = new LinkedList<>();
        for (Pet2 pet : pets) {
            int i = (int) (Math.random() * 7) - 2;
            result.add(pet.toSayable(i));
        }
        return result;
    }
}