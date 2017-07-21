package oop.exam1;

public class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public void print() { //supertype에서 상속받은 기존 print의 기능을 재정의(overriding)
		super.print();
		System.out.println("z = " + getZ());
	}
}

