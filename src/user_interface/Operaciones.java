package user_interface;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Operaciones {
	double[][] multiplicacion= null;
	double[][] A={
			{1.0, 	0.5,	 3.0},
			{2.0, 	1.0, 		4.0},
			{0.33, 0.25, 	1.0}
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
			  for (int y=0; y < multiplicacion[x].length; y++){
			    for (int z=0; z<col_m1; z++) {
			    	if(x!=y){
			    		multiplicacion [x][y] += A[x][z]*A[z][y];	
			    	}else{
			    		multiplicacion [x][y] += Math.round(A[x][z]*A[z][y]);
			    	}
			    }//z
			  }//y
			}//x
		
		
		int i,j;
		for(i=0;i<multiplicacion.length;i++){
			for(j=0;j<multiplicacion[i].length;j++){
				System.out.print(multiplicacion[i][j]+"\t");
			}
			System.out.println();
		}

		
		
	}//fin metodo operacion1
	
	public static void main(String[] args){
		Operaciones obj=new Operaciones();
		obj.operacion1();
	}
}
