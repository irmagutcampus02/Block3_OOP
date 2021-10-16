public class BankDemoApp {
    public static void main(String[] args) {
        Konto max = new Konto();
        max.setInhaber("Max Mustermann");
        max.print();

        max.aufbuchen(1000);
        max.print();

        max.abbuchen(800);
        max.print();

        max.abbuchen(300);

    }
}
