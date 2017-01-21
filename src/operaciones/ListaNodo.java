package operaciones;

import java.util.ArrayList;

import objetos.Arista;
import objetos.Nodo;

public class ListaNodo extends ArrayList<Nodo>{

    public ListaNodo(){
        super();
    }
    public Nodo buscarMenor(){
        Nodo aux = new Nodo();
        Arista arista = new Arista();
        aux.setLongitudCamino(9999999);

        for(Nodo nodo:this){
            if(nodo.getLongitudCamino() < aux.getLongitudCamino()){
                aux = nodo;                
                System.out.println(nodo.getLongitudCamino()+""+nodo.getDato());
            }}
        
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