public class BankDemoApp {
    public static void main(String[] args) {
        Konto max = new Konto("Max Muster");
        //max.setInhaber("Max Mustermann");
        max.print();

        Konto susi = new Konto("Susi Sorglos");

        max.aufbuchen(1000);
        max.print();

        max.abbuchen(800);
        max.print();

        max.abbuchen(300);


        susi.aufbuchen(100_000);
        susi.print();
    }
}
