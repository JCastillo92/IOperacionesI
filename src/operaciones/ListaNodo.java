package operaciones;

import java.util.ArrayList;

import objetos.Arista;
import objetos.Nodo;
import ventana.Gui;

public class ListaNodo extends ArrayList<Nodo>{
String imprimircaminos="";
    public ListaNodo(){
        super();
    }
    public Nodo buscarMenor(){
    	Gui obj=new Gui();
        
        Nodo aux = new Nodo();
        Arista arista = new Arista();
        aux.setLongitudCamino(9999999);

        for(Nodo nodo:this){
            if(nodo.getLongitudCamino() < aux.getLongitudCamino()){
                aux = nodo;                
                System.out.println(nodo.getLongitudCamino()+"..."+nodo.getDato());
                imprimircaminos=imprimircaminos+nodo.getLongitudCamino()+""+nodo.getDato()+"\n";
            }}
        obj.caminos(imprimircaminos);
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