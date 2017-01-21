package operaciones;

import java.util.ArrayList;

import objetos.Arista;
import objetos.Nodo;
import ventana.Gui;

public class ListaNodo extends ArrayList<Nodo>{
String imprimircaminos="";
String imprimirinicio="INICIOJAIRO";
String imprimirfin="";
int totalkilometros=0;

    public ListaNodo(){
        super();
    }
    public Nodo buscarMenor(){
    	Gui obj=new Gui();
        
        Nodo aux = new Nodo();
        Arista arista = new Arista();
        aux.setLongitudCamino(9999999);

        for(Nodo nodo:this){
        	if(imprimirinicio.equals("INICIOJAIRO")){
        		imprimirinicio=""+nodo.getDato();	
        	}
            if(nodo.getLongitudCamino() < aux.getLongitudCamino()){
                aux = nodo;                
                System.out.println(nodo.getLongitudCamino()+"..."+nodo.getDato());
                imprimircaminos=imprimircaminos+nodo.getLongitudCamino()+""+nodo.getDato()+"\n";
                totalkilometros=nodo.getLongitudCamino();
            }
            imprimirfin=""+nodo.getDato();
        }
        obj.caminos(imprimircaminos,imprimirinicio,imprimirfin,totalkilometros);
        return aux;
    }
    public boolean isContenido(Nodo nodo){
        boolean retornado = false;
        for(Nodo n:this){
            if(n == nodo){
                retornado = true;
            }
        }
        return retornado;
    }
}