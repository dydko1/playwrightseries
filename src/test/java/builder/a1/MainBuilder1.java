package builder.a1;

public class MainBuilder1 {
    public static void main(String[] args) {
        ComputerBuilder desktopBuilder1 = new DesktopComputerBuilder();
        Computer computerDirector = new ComputerDirector(desktopBuilder1)
                .constructComputer();

        System.out.println(computerDirector);
        //Computer desktop = computerDirector.constructComputer();
    }
}
