package Tabla;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tablita extends JPanel {

	/**
	 * Create the panel.
	 */
	public tablita() {
		 setLayout( new BorderLayout() );
		    JTable tabla = new JTable( new ModeloDatos() );
		    // La tabla se añade a un ScrollPane para que sea éste el
		    // que controle automáticamente en tamaño de la tabla,
		    // presentando una barra de desplazamiento cuando sea
		    // necesario
		    JScrollPane panel = new JScrollPane( tabla );
		    add( panel,BorderLayout.CENTER );
		  }
		  
		  public static void main(String args[]) {
		    JFrame frame = new JFrame( "Tutorial de Java, Swing" );
		    frame.addWindowListener( new WindowAdapter() {
		      public void windowClosing( WindowEvent evt ) {
		        System.exit( 0 );
		      }
		    } );
		    frame.getContentPane().add( new tablita(),BorderLayout.CENTER );
		    frame.setSize( 200,200 );
		    frame.setVisible( true );
		  }

}
