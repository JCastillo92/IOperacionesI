package user_interface;

public class Operaciones{
	//las de aqui abajo solo se siguen agregando
	double[][] matriz_ponderacion= new double[1][2];
	
	//aqui abajo veo el tamano de los criterios y alternativas
	int Criterio_size, Alternativas_size;
	//matriz criterio x criterio
	//las ALTERNATIVAS son N y van en una matriz de NxN pero se las realiza C veces de acorde a los Criterios
	
	double[][] multiplicacion_criterios=null;
	
	//double[][] A= new double[Criterio_size][Criterio_size];
	//borrar todo el double de aqui abajo
	double[][] A={
			{1.0, 	0.5,	 3.0},
			{2.0, 	1.0, 		4.0},
			{0.33, 0.25, 	1.0}
			};
	double[] vector_suma_criterios=new double[Criterio_size];	
	
	public void recibo_tamano_criterio_alternativa(int a,int b){
		Criterio_size=a;
		Alternativas_size=b;
		
		//borrar la linea de aqui abajo
		Criterio_size=3;
	}
	public void recibo_principal_filas_columnas(double[][] recibo_matriz){
		
	}//fin void matriz_vv
	
	public void matriz_principal(){
		int fil_m1 = A.length;
		int col_m1 = A[0].length;

		int fil_m2 = A.length;
		int col_m2 = A[0].length;
		
		multiplicacion_criterios = new double[fil_m1][col_m2];

		for (int x=0; x < multiplicacion_criterios.length; x++) {
			  for (int y=0; y < multiplicacion_criterios[x].length; y++){
			    for (int z=0; z<col_m1; z++) {
			    	if(x!=y){
			    		multiplicacion_criterios [x][y] += A[x][z]*A[z][y];	
			    	}else{
			    		multiplicacion_criterios [x][y] += Math.round(A[x][z]*A[z][y]);
			    	}
			    }//z
			  }//y
			}//x
		
		int i,j;
		for(i=0;i<multiplicacion_criterios.length;i++){
			for(j=0;j<multiplicacion_criterios[i].length;j++){
				System.out.print(multiplicacion_criterios[i][j]+"\t");
			}
			System.out.println();
		}
	}//fin metodo matriz principal
	
	public void suma_filas(){
		//debo recibir aqui la matriz
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				vector_suma_criterios[i]+=A[i][j];
			}
		}
	}
	
	public static void main(String[] args){
		Operaciones obj=new Operaciones();
		obj.matriz_principal();
	}
}
