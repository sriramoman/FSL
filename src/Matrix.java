
public class Matrix {
	int[][] data;
	int rows,columns;
	public Matrix(int r,int c){
		this.rows=r;
		this.columns=c;
		this.data=new int[rows][columns];
	}
	public void reset(int r,int c){
		this.rows=r;
		this.columns=c;
		this.data=new int[rows][columns];
	}
	public void set(int[] row,int rowIndex){
		data[rowIndex]=row;
	}
	public void set(int val,int rowIndex,int colIndex){
		data[rowIndex][colIndex]=val;
	}
	
	public Matrix multiply(Matrix m2){
		Matrix resultMatrix  = new Matrix(this.rows,m2.columns);
		for(int i=0;i<this.rows;i++){
			for(int j=0;j<m2.columns;j++){
				int val=0;
				for(int n=0;n<this.columns;n++){
					val+=this.data[i][n]*m2.data[n][j];
				}
				resultMatrix.set(val, i, j);
			}
		}
		return resultMatrix;
	}
	public Matrix transpose(){
		Matrix resultMatrix = new Matrix(this.columns,this.rows);
		for(int i=0;i<this.rows;i++){
			for(int j=0;j<this.columns;j++){
				resultMatrix.data[j][i]=this.data[i][j];
			}
		}
		return resultMatrix;
	}
	public String toString(){
		String s=new String("");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				s+=String.valueOf(data[i][j])+"\t";
			}
			s+="\n";
		}
		return s;
	}
	
	public Boolean isSymmetric(){
		return this.rows==this.columns;
	}
}
