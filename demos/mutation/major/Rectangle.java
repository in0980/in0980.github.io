package rectangle;

public class Rectangle {

	public static enum RectangleType {
		SQUARE, 
        RECTANGLE,
        INVALID;
	};
	
	public static RectangleType classify(int a, int b, int c, int d) {
		if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
			return RectangleType.INVALID;
		
        if (a == b && b == c && c == d) {
            return RectangleType.SQUARE;
        }
        else if (a == c && b == d) {
            return RectangleType.RECTANGLE;
        }
        else {
			return RectangleType.INVALID;
        }
	}
}
