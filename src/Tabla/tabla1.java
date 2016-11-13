package Tabla;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tabla1 extends JPanel {

	private JTable tabla;
	  private JScrollPane panelScroll;
	  private String titColumna[];
	  private String datoColumna[][];
	public tabla1() {
		setLayout( new BorderLayout() );
	    // Creamos las columnas y las cargamos con los datos que van a
	    // aparecer en la pantalla
	    CreaColumnas();
	    CargaDatos();
	    // Creamos una instancia del componente Swing
	    tabla = new JTable( datoColumna,titColumna );
	    // Aquí se configuran algunos de los parámetros que permite 
	    // variar la JTable
	    tabla.setShowHorizontalLines( true );
	    tabla.setRowSelectionAllowed( true );
	    tabla.setColumnSelectionAllowed( true );
	    // Cambiamos el color de la zona seleccionada (rojo/blanco)
	    tabla.setSelectionForeground( Color.white );
	    tabla.setSelectionBackground( Color.WHITE );
	    // Incorporamos la tabla a un panel que incorpora ya una barra
	    // de desplazamiento, para que la visibilidad de la tabla sea
	    // automática
	    panelScroll = new JScrollPane( tabla );
	    add( panelScroll, BorderLayout.CENTER );
	  }
	  
	  
	  // Creamos las etiquetas que sirven de título a cada una de
	  // las columnas de la tabla
	  public void CreaColumnas() {
		  ArrayList<String> Columna = new ArrayList<String>();
	    titColumna = new String[4];
	    
	    for( int i=0; i < 4; i++ ) {
	      titColumna[i] = "Carrito: "+i;
	    }
	  }
	  
	  // Creamos los datos para cada uno de los elementos de la tabla
	  public void CargaDatos() {
	    datoColumna = new String[4][4];
	    
	    for( int iY=0; iY < 4; iY++ ) {
	      for( int iX=0; iX < 4; iX++ ) {
		datoColumna[iY][iX] = "";
	      }
	    }
	  }
	  
	  
	  public static void main( String args[] ) {
	    JFrame ventana = new JFrame( "Tablita" );
	    
	    ventana.addWindowListener( new WindowAdapter() {
	      public void windowClosing( WindowEvent evt ){
		System.exit( 0 );
	      }
	    } );
	    ventana.getContentPane().add( new tabla1(),BorderLayout.CENTER );
	    ventana.setSize( 400,400 );
	    
	    ventana.setVisible( true );
	  }
}
