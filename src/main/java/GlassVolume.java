public class GlassVolume {

    public static void main(String[] args) {

        final int glassVolume = 300;
        System.out.println("Объем стакана в миллилитрах: " + glassVolume);

        final double persentGlassVolume = 0.5;
        System.out.println("Стакан заполнен на " + persentGlassVolume * 100 + " процентов");

        final double glassIsFull = glassVolume * persentGlassVolume;
        System.out.println("Стакан заполнен на " + glassIsFull + " мл.");

    }
}

