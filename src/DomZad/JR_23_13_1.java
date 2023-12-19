package DomZad;

/*
Factory method pattern
*/

public class JR_23_13_1 {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
