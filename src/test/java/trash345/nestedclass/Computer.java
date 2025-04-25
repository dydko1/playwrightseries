package trash345.nestedclass;

public class Computer {

    class Processor {
        void displayDetails() {
            System.out.println("Processor Brand: Intel");
            System.out.println("Processor Speed: 3.5 GHz");
        }
    }

    void showDetails() {
        Processor processor = new Processor();
        processor.displayDetails();
    }
}
