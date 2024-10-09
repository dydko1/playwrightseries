package structuralpatterns.adapter.a1.adapters;

import structuralpatterns.adapter.a1.round.RoundPeg;
import structuralpatterns.adapter.a1.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
