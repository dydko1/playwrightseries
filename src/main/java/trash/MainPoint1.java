package trash;

public class MainPoint1 {
	public static void main(String[] args) {
		System.out.println(Point.count());

		Point pa = new Point(5, 7);
		Point pb = new Point(2, 78);

		System.out.println(Point.count());
	}
}