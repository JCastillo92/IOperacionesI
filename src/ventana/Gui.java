package ventana;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import objetos.*;
import operaciones.Disjktra;
import operaciones.ListaNodo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Jcarlosad7
 */
public class Gui extends javax.swing.JFrame {
    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    String imprimircaminos;
    String inicio1;
    String fin1;
    int total;
    /**
     * Creamos el form
     */
    public Gui() {
    	setResizable(false);
    	
    	menuBar = new JMenuBar();
    	setJMenuBar(menuBar);
    	
    	mnDirecciones = new JMenu("Direcciones");
    	menuBar.add(mnDirecciones);
    	
    	mntmQuito = new JMenuItem("Quito");
    	mntmQuito.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			//quito mapa
    			ImageIcon icon = new ImageIcon(".\\imagenes\\quito.jpg");
    	        lblHdsah.setIcon(icon);
    		}
    	});
    	mnDirecciones.add(mntmQuito);
    	
    	mntmSuperpaco = new JMenuItem("Superpaco");
    	mntmSuperpaco.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			//superpaco mapa
    			ImageIcon icon = new ImageIcon(".\\imagenes\\superpaco.jpg");
    	        lblHdsah.setIcon(icon);
    		}
    	});
    	
    	mntmCalles = new JMenuItem("Calles");
    	mntmCalles.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			//calles mapa
    			ImageIcon icon = new ImageIcon(".\\imagenes\\calles.jpg");
    	        lblHdsah.setIcon(icon);
    		}
    	});
    	mnDirecciones.add(mntmCalles);
    	mnDirecciones.add(mntmSuperpaco);
    	
    	mntmFybeca = new JMenuItem("Fybeca");
    	mntmFybeca.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			//fybeca mapa
    			ImageIcon icon = new ImageIcon(".\\imagenes\\fybeca.jpg");
    	        lblHdsah.setIcon(icon);
    		}
    	});
    	mnDirecciones.add(mntmFybeca);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       // jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafo distancia minima DIJKSTRA"));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        
        lblHdsah = new JLabel("");
        ImageIcon icon = new ImageIcon(".\\imagenes\\portada.jpg");
        lblHdsah.setIcon(icon);
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblHdsah, GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblHdsah, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dibujarGrafo(){
        jPanel1.paint(jPanel1.getGraphics());
        dibujarArista();
        dibujarNodos();
    }
    public void dibujarNodos(){
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            nodo.getCirculo().dibujarCirculo(jPanel1.getGraphics());
        }
    }
    public void dibujarArista(){
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            ArrayList<Enlace> listaEnlace = nodo.getListaNodoAdyacente();
            if(listaEnlace != null){
                for(Enlace enlace:listaEnlace){
                    enlace.getArista().getLineaQuebrada().dibujarLineaQuebrada(jPanel1.getGraphics());
                }
            }            
        }
        System.out.println("eeeee");
    }
    private int ingresarPeso(){
        String peso = JOptionPane.showInputDialog("Digite la distancia entre los nodos");
        int intPeso = 0;
        try{
            intPeso = Integer.parseInt(peso);            
        }catch(Exception ex){
            intPeso = ingresarPeso();
        }
        return intPeso;
    }
    
    private void eliminarNodo(int x,int y){
        if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
            Nodo temp = grafo.buscarNodo(x, y);
            grafo.eliminarAristasEntrante(temp);
            if(grafo.eliminarNodo(temp)){
                JOptionPane.showMessageDialog(null,"Eliminado");
                dibujarGrafo();
            }
            
        }
    }
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        int x = evt.getX();
        int y = evt.getY();
        ListaNodo g=new ListaNodo();
        g.buscarMenor();
        if(evt.isMetaDown()){            
//            eliminarNodo(x, y);
//            JOptionPane.showMessageDialog(this,"Clic derecho");
            if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
            if(nodoInicio == null){
                grafo.reiniciarGrafoParaDisjktra();
                grafo.reiniciarColores();
                nodoInicio = grafo.buscarNodo(x, y);//nodoInicio lo pongo a apuntar al nodo donde hice clic
                nodoInicio.getCirculo().setColor(Color.red);//Lo hago cambiar de color
//                JOptionPane.showMessageDialog(null,"Seleccione otro nodo para crear una arista");
            }else{//si nodoInicio ya estaba apunto a un nodo, lo preparo para crear arista             
                nodoFin = grafo.buscarNodo(x, y);
                Disjktra disjktra = new Disjktra(grafo);
                disjktra.ejecutar(nodoInicio);
                disjktra.marcarRutaCorta(nodoFin, Color.blue);
                
                System.out.println("aaaaaaaaaa"+inicio1);
//                crearArista();            
//                                
//                nodoInicio.getCirculo().setColor(Color.yellow);//lo regreso a su color original
//                
                nodoInicio = null;//null para poder crear mas arista
                nodoFin = null;//null para poder crear mas arista
            }
        }
            
            
        }else{
        if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
            if(nodoInicio == null){
                nodoInicio = grafo.buscarNodo(x, y);//nodoInicio lo pongo a apuntar al nodo donde hice clic
                nodoInicio.getCirculo().setColor(Color.red);//Lo hago cambiar de color
//                JOptionPane.showMessageDialog(null,"Seleccione otro nodo para crear una arista");
            }else{//si nodoInicio ya estaba apunto a un nodo, lo preparo para crear arista             
                nodoFin = grafo.buscarNodo(x, y);                
                crearArista();      
                
                                
                nodoInicio.getCirculo().setColor(Color.blue);//lo regreso a su color original
                
                nodoInicio = null;//null para poder crear mas arista
                nodoFin = null;//null para poder crear mas arista
            }
        }else{//Si no he hecho clic sobre un nodo
        		crearNodo(x, y);//creo un nodo apartir de unas coordenadas
        }
        }
        dibujarGrafo();
    }//GEN-LAST:event_jPanel1MouseClicked
   
  
    private void crearArista(){
        int intPeso = ingresarPeso();
        Arista arista = new Arista();
        arista.setPeso(intPeso);
        Coordenadas c = new Coordenadas(100000,100000);
        c.addCoordenada(nodoInicio.getCirculo().getX() + (nodoInicio.getCirculo().getDiametro()/2),nodoInicio.getCirculo().getY() + (nodoInicio.getCirculo().getDiametro()/2));
        c.addCoordenada(nodoFin.getCirculo().getX() + (nodoInicio.getCirculo().getDiametro()/2),nodoFin.getCirculo().getY() + (nodoInicio.getCirculo().getDiametro()/2));
        LineaQuebrada lq = new LineaQuebrada(c);
        arista.setLineaQuebrada(lq);               
        grafo.crearEnlacesNoDirigido(nodoInicio, nodoFin,arista);       
       
    }
    
    private void crearNodo(int x, int y){
        Coordenadas c = new Coordenadas(100000,100000, x, y);
            String dato = JOptionPane.showInputDialog("Crear nombre de nodo");
            if(dato != null){
                dato = dato.toUpperCase();//por que lo quiero todo en mayusculas
                Nodo nodo = new Nodo(dato,c);
                nodo.getCirculo().setDiametro(20);
                nodo.getCirculo().setEtiqueta(nodo.getDato()+"");
                if(grafo.adjuntarNodo(nodo)){
                    nodo.getCirculo().dibujarCirculo(jPanel1.getGraphics());
                }else{
                }
                nodoInicio = null;
                nodoFin = null; 
            }
    }
    
    public void caminos(String ways,String inicio, String fin, int totalkilometros){
    	imprimircaminos=imprimircaminos+ways+"\n";
    	System.out.println("EL NODO INICIAL ES: "+inicio);
    	System.out.println("EL NODO FINAL ES: "+fin);
    	System.out.println("TOTAL RECORRIDO: "+totalkilometros);
    	
    	inicio1=inicio;
    	fin1=fin;
    	total=totalkilometros;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private JLabel lblHdsah;
    private JMenuBar menuBar;
    private JMenu mnDirecciones;
    private JMenuItem mntmQuito;
    private JMenuItem mntmSuperpaco;
    private JMenuItem mntmFybeca;
    private JMenuItem mntmCalles;
    // End of variables declaration//GEN-END:variables
}