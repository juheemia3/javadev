package oop.exam7;

public class Point3D extends Point2D {
	int z;
	
	public Point3D() {
		this(100,200,300);
		 //파라미터가 없는 생성자는 x=100, y=200, z=300이 나오게 함!
		System.out.println("Point3D()");
	}

	public Point3D(int x, int y, int z) {
		super(x,y); //means: this.x = x;
		            //       this.y = y;
		this.z = z;
		System.out.println("Point3D(x,y,z)");
	}
}
