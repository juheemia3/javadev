package oop.exam2;

public class Point3D extends Point2D{
private int z;

public int getZ() {
	return z;
}

public void setZ(int z) {
	this.z = z;
}
/* 다시 해보기 pr만 치고 overriding 하는 방법
 * public void print() {
	super.print();
	System.out.println("z =" + getZ());
}*/

}
