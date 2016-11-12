package user_interface;

public class Operaciones {
	double[][] multiplicacion= null;
	double[][] A={
			{1, 	0.5,	 3},
			{2, 	1, 		4},
			{0.33, 0.25, 	1}
			};
	
	int FILAS, COLUMNAS;
	
	public void matriz_vv(int F, int C){
		
		FILAS=F;
		COLUMNAS=C;
	 
	}//fin void matriz_vv
	
	public void operacion1(){
		int fil_m1 = A.length;
		int col_m1 = A[0].length;

		int fil_m2 = A.length;
		int col_m2 = A[0].length;
		
		
		multiplicacion = new double[fil_m1][col_m2];
	
		for (int x=0; x < multiplicacion.length; x++) {
			  for (int i=0; i < multiplicacion[x].length; i++) {
			    for (int j=0; j<col_m1; j++) {
			      multiplicacion [x][j] += A[x][j]*A[j][i]; 
			    }
			  }
			}
		
		int p,q;
		for(p=0;p<multiplicacion.length;p++){
			for(q=0;q<multiplicacion[p].length;q++){
				System.out.print(multiplicacion[p][q]+"\t");
			}
			System.out.println();
		}

		
		
	}//fin metodo operacion1
	
	public static void main(String[] args){
		Operaciones obj=new Operaciones();
		obj.operacion1();
	}
}
