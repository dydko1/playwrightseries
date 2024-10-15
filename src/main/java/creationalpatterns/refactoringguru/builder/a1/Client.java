package creationalpatterns.refactoringguru.builder.a1;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder desktopBuilder = new DesktopComputerBuilder();
        Computer desktop  = new ComputerDirector(desktopBuilder)
                .constructComputer();

        System.out.println(desktop);
    }
}