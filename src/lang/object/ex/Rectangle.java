package lang.object.ex;

import java.util.Objects;

public class Rectangle {

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return x == rectangle.x && y == rectangle.y;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }
}
