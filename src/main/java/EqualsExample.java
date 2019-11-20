
public class EqualsExample {

    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
//        System.out.println(p1 == p2);
//        System.out.println(p1.equals("grdhdrh"));

        System.out.println(p1);
        System.out.println(p2);

//        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        Object o1 = new Point3DExample();
//        Point3D p3d = (Point3D) new Object();
    }
}

class Point {

    int x;
    int y;

//    public boolean equals(Object another) {
////        return x == ((Point) another).x && y == ((Point) another).y;
//
//        if (this == another) {
//            return true;
//        }
//        if (another instanceof Point) {
//            Point anotherP = (Point) another;
//            return this.x == anotherP.x && this.y == anotherP.y;
//        } else {
//            return false;
//        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

class Point3DExample extends Point {

    int z;
}
