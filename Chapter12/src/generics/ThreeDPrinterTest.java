package generics;

import java.util.ArrayList;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(printer);

        ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic = printerPlastic.getMaterial();
        System.out.println(printerPlastic);

        printerPlastic.printing();

        //ThreeDPrinter<Water> Material 클래스를 상속받지 않기 때문에 사용할 수 없음 / 잘못된 값이 도출되는 것을 방지




    }
}
