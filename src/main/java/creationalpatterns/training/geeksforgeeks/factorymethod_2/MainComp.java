package creationalpatterns.training.geeksforgeeks.factorymethod_2;

public class MainComp {
    public static void main(String[] args) {
        ComputerFactory computerPC = new ComputerPC(); //ComputerPC().createComputer();
        Computer computerA= computerPC.createComputer();
        System.out.println(computerA.toString());

        Computer computerServer = new ComputerSever().createComputer();
        System.out.println(computerServer);
    }
}