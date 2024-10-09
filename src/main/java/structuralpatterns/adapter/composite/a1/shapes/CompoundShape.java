package structuralpatterns.adapter.composite.a1.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    protected List<structuralpatterns.adapter.composite.a1.shapes.Shape> children = new ArrayList<>();

    public CompoundShape(structuralpatterns.adapter.composite.a1.shapes.Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(structuralpatterns.adapter.composite.a1.shapes.Shape component) {
        children.add(component);
    }

    public void add(structuralpatterns.adapter.composite.a1.shapes.Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(structuralpatterns.adapter.composite.a1.shapes.Shape child) {
        children.remove(child);
    }

    public void remove(structuralpatterns.adapter.composite.a1.shapes.Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        if (children.size() == 0) {
            return 0;
        }
        int x = children.get(0).getX();
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (children.size() == 0) {
            return 0;
        }
        int y = children.get(0).getY();
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            child.unSelect();
        }
    }

    public boolean selectChildAt(int x, int y) {
        for (structuralpatterns.adapter.composite.a1.shapes.Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (Shape child : children) {
            child.paint(graphics);
        }
    }
}