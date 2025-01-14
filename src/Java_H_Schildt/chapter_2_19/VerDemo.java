package Java_H_Schildt.chapter_2_19;

// демонстрация использования счетчиков выпусков Runtime.Version.
public class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();
        // Отобразить индивидуальные счетчики.
        System.out.println("Счетчик выпусков функциональных средств: "
                + ver.feature());
        System.out.println("Счетчик промежуточных выпусков: "
                + ver.interim());
        System.out.println("Счетчик выпусков обновлений: " + ver.update());
        System.out.println("Счетчик  выпусков исправлений: " + ver.patch());
    }
}
