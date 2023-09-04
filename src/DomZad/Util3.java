package DomZad;
import java.util.LinkedList;
import java.util.List;

public class Util3 {
    //Util отлично работает со всеми тремя классами Cat, Dog, Mouse. А ведь Mouse отличается от Cat и Dog.
    public static void printDialog(List<Sayable2> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).say());
        }
    }

    public static List<Pet3> getPets() {
        List<Pet> pets = new LinkedList<>();
        pets.add(new Dog("Барбос"));
        pets.add(new Dog("Тузик"));
        pets.add(new Dog("Бобик"));
        pets.add(new Mouse());
        pets.add(new Dog("Шарик"));
        return pets;
    }

    public static List<Sayable2> convertPetToSayable(List<Pet3> pets) {
        List<Sayable2> result = new LinkedList<>();
        for (Pet pet : pets) {
            int i = (int) (Math.random() * 7) - 2;
            result.add(pet.toSayable(i));
        }
        return result;
    }
}