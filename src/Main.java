
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix m1 = new Matrix(3,4);
		int[][] elems1={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<m1.rows;i++)
			m1.set(elems1[i],i);
		System.out.println(m1);

		Matrix m2 = new Matrix(4,2);
		int[][] elems2={{13,14},{15,16},{17,18},{19,20}};
		for(int i=0;i<m2.rows;i++)
			m2.set(elems2[i],i);
		System.out.println(m2);
		
		Matrix m3=m1.multiply(m2);
		System.out.println(m3);
		int elems[] = {1,2,3};
		int elemz[] = {4,5,6};
		Vector v1 = new Vector(elems);
		Vector v2 = new Vector(elemz);
		System.out.println(v1.cosine(v2));
		System.out.println(v1.innerProduct(v2));
		System.out.println(v1.outterProduct(v2));
	}
}
