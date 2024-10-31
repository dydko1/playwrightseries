package behaviourpatterns.strategy.strategy4;

import lombok.extern.slf4j.Slf4j;

public class MeleeStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}