package user_interface;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Operaciones{
	PersonalF obj =new PersonalF();
	String[] vector=null;
	String[][] matriz={};
	DefaultTableModel mod=null;
	
	//aqui abajo veo el tamano de los criterios y alternativas
	int Criterio_size, Alternativas_size;
	//matriz criterio x criterio
	//las ALTERNATIVAS son N y van en una matriz de NxN pero se las realiza C veces de acorde a los Criterios
	
	double[][] multiplicacion_criterios=null;
	
	//double[][] A= new double[Criterio_size][Criterio_size];
	//borrar todo el double de aqui abajo
	
	/*double[][] A={
			{1.0, 	0.5,	 3.0},
			{2.0, 	1.0, 		4.0},
			{0.33, 0.25, 	1.0}
			};
	*/
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////// P    R    O    C     E    S   O/////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void matriz_principal(double[][] A, int cri, int alt){
		Criterio_size=cri;
		Alternativas_size=alt;
		
		
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
		
		System.out.println("matriz cuadrada CRITERIOS principal");
		int i,j;
		vector=new String[Criterio_size];
		mod=new DefaultTableModel(matriz,vector);
		
		for(i=0;i<multiplicacion_criterios.length;i++){
			String a[]=new String[20];
			for(j=0;j<multiplicacion_criterios[i].length;j++){
				a[j]=""+multiplicacion_criterios[i][j];
				System.out.print(multiplicacion_criterios[i][j]+"\t");
			}
			mod.addRow(a);
			System.out.println();
		}
		
		suma_filas(multiplicacion_criterios);
	}//fin metodo matriz principal
	
	public void suma_filas(double[][] suma_filas){
		//debo recibir aqui la matriz
		double[] vector_suma_filas=new double[Alternativas_size];
		for (int i = 0; i < suma_filas.length; i++) {
			double acumula_suma=0;
			for (int j = 0; j < suma_filas[i].length; j++) {
				acumula_suma+=suma_filas[i][j];
			}
			vector_suma_filas[i]=acumula_suma;
		}
		
		
		System.out.println("suma FILAS de la matriz cuadrada principal");
		for (int i = 0; i < vector_suma_filas.length; i++) {
			System.out.println(vector_suma_filas[i]);
		}
		
		
		
	}

	
	public DefaultTableModel recibirmodelo(){
		return mod;
	}
	/*
	public String[][] recibirmodelo(){
		String[][] aa=new String[Criterio_size][Criterio_size];
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j]=""+multiplicacion_criterios[i][j];
			}
		}
		return aa;
	}
	*/
	
	
	
	
	
	
	
	public void Solucion_final(){
		//aqui ARRIBA debo recibir armada la matriz AxC o FILASxCOLUMNAS
		
		//MATRIZ FINAL FxC AxC
				double[][] Matriz_Alt_Crite={
						{0.11, 	0.37,	 0.20},
						{0.26, 	0.29,	 0.20},
						{0.05, 	0.07,	 0.40},
						{0.58, 	0.26,	 0.20}
						};
				
				double[] Vector_criterios={0.32, 0.56, 0.12};
				
				//borrar donde esta el 4 poner el tamano de ALTERNATIAS
				double[] Vector_respuesta_tamanoALT=new double[4];
				
				for (int i = 0; i < Matriz_Alt_Crite.length; i++) {
					double acum=0;
					for (int j = 0; j < Matriz_Alt_Crite[i].length; j++) {
						acum=acum+Matriz_Alt_Crite[i][j]*Vector_criterios[j];
					}
					Vector_respuesta_tamanoALT[i]=acum;
				}
				
				for (int i = 0; i < Vector_respuesta_tamanoALT.length; i++) {
					System.out.println(Vector_respuesta_tamanoALT[i]);
				}
	}
	
<<<<<<< HEAD

	
	
	public static void main(String[] args){
		Operaciones obj=new Operaciones();
<<<<<<< HEAD
//		obj.matriz_principal();
=======
		//obj.matriz_principal();
>>>>>>> 907eddbf500e0b24693766355837aeb545f91564
	}
=======
>>>>>>> 80f900c68d042af87e38ce6bf68ee05d4630ecc8
}