package Test;

public class Main {
    public static void main(String[] args) {
        Test basic = new BasicTest();
        Test extended = new ExtendedTest();

        System.out.println("----TEST BASIC----");
        basic.run();
        System.out.println("----TEST EXTENDED----");
        extended.run();

    }
}
