
public class Vector extends Matrix {

	private Vector(int r, int c) {
		super(r, c);
		// TODO Auto-generated constructor stub
	}
	
	public Vector(int elems[]){
		super(1,elems.length);
		super.set(elems, 0);;
	}
	
	public double innerProduct(Vector v2){
		return this.multiply(v2.transpose()).data[0][0];
	}
	
	public Matrix outterProduct(Vector v2){
		return this.transpose().multiply(v2);
	}
	
	public double norm(){
		return this.multiply(this.transpose()).data[0][0];
	}
	
	public double cosine(Vector v2){
		double nr = this.innerProduct(v2);
		double dr = this.norm() * v2.norm();
		return nr/dr;
	}
}
