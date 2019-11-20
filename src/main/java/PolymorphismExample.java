public class PolymorphismExample {

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.x = 1;
        point3D.y = 1;
        point3D.z = 1;

        Point2D point2D = point3D;
        point2D.x = 2;

        Point1D point1D = point2D;

//        Point3D point3D1 = (Integer) point1D;
    }
}

class Point1D {

    int x;
}

class Point2D extends Point1D {

    int y;
}

class Point3D extends Point2D {

    int z;
}
