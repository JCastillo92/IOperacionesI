package user_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.*;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class PersonalF extends JFrame {

	private JPanel contentPane;
	public JTextField txt_alternativa;
	private JTextField txt_criterio;
	public JTextField txt_alt;
	public String titColumna[];
	public String titColumna2[];
	public String datoColumna2[][];
	  public String datoColumna[][];
	 private JTable table;
	 private JTable table_1;
	public ArrayList<String> array1;
	public ArrayList<String> array2;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private List<String> lista_tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalF frame = new PersonalF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PersonalF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//INICIALIZO ARRAYS
		array1 = new ArrayList<String>();
		array2 = new ArrayList<String>();
		lista_tabla = new ArrayList<String>();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(47, 52, 836, 392);
		contentPane.add(tabbedPane);
		JPanel panel_0 = new JPanel();
		panel_0.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Principal", null, panel_0, null);
		panel_0.setLayout(null);
		
		JLabel lblIngenieriaDeSistemas = new JLabel("INGENIERIA DE SISTEMAS");
		lblIngenieriaDeSistemas.setBounds(275, 35, 256, 29);
		lblIngenieriaDeSistemas.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIngenieriaDeSistemas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		panel_0.add(lblIngenieriaDeSistemas);
		
		
		
		JLabel lblUniversidadPolitcnicaSalesiana = new JLabel("UNIVERSIDAD POLIT\u00C9CNICA SALESIANA");
		lblUniversidadPolitcnicaSalesiana.setBounds(106, 11, 601, 35);
		lblUniversidadPolitcnicaSalesiana.setForeground(Color.BLACK);
		lblUniversidadPolitcnicaSalesiana.setFont(new Font("Dialog", Font.PLAIN, 27));
		lblUniversidadPolitcnicaSalesiana.setBackground(Color.LIGHT_GRAY);
		panel_0.add(lblUniversidadPolitcnicaSalesiana);
		
		JLabel lblInvestigacinDeOperaciones = new JLabel("INVESTIGACI\u00D3N DE OPERACIONES");
		lblInvestigacinDeOperaciones.setVerticalAlignment(SwingConstants.BOTTOM);
		lblInvestigacinDeOperaciones.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblInvestigacinDeOperaciones.setBounds(275, 73, 256, 16);
		panel_0.add(lblInvestigacinDeOperaciones);
		
		JLabel lblIntegrantesKarenAchig = new JLabel("Integrantes: ");
		lblIntegrantesKarenAchig.setForeground(Color.DARK_GRAY);
		lblIntegrantesKarenAchig.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIntegrantesKarenAchig.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblIntegrantesKarenAchig.setBounds(33, 100, 126, 16);
		panel_0.add(lblIntegrantesKarenAchig);
		
		JLabel lblKarenAchig = new JLabel("Karen Achig");
		lblKarenAchig.setVerticalAlignment(SwingConstants.BOTTOM);
		lblKarenAchig.setForeground(Color.BLACK);
		lblKarenAchig.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblKarenAchig.setBounds(125, 127, 126, 16);
		panel_0.add(lblKarenAchig);
		
		JLabel lblJhonCastillo = new JLabel("Jhon Castillo");
		lblJhonCastillo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJhonCastillo.setForeground(Color.BLACK);
		lblJhonCastillo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblJhonCastillo.setBounds(125, 150, 126, 16);
		panel_0.add(lblJhonCastillo);
		
		JLabel lblJairoFlores = new JLabel("Jairo Flores");
		lblJairoFlores.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJairoFlores.setForeground(Color.BLACK);
		lblJairoFlores.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblJairoFlores.setBounds(125, 177, 126, 16);
		panel_0.add(lblJairoFlores);
		
		JLabel lblBryanTorres = new JLabel("Bryan Torres");
		lblBryanTorres.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBryanTorres.setForeground(Color.BLACK);
		lblBryanTorres.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblBryanTorres.setBounds(125, 204, 126, 16);
		panel_0.add(lblBryanTorres);
		
		JLabel lblMarilZambonino = new JLabel("Maril\u00FA Zambonino");
		lblMarilZambonino.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMarilZambonino.setForeground(Color.BLACK);
		lblMarilZambonino.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblMarilZambonino.setBounds(125, 231, 126, 16);
		panel_0.add(lblMarilZambonino);
		
		JLabel lblNivel = new JLabel("Nivel:");
		lblNivel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNivel.setForeground(Color.DARK_GRAY);
		lblNivel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNivel.setBounds(33, 272, 126, 16);
		panel_0.add(lblNivel);
		
		JLabel lblno = new JLabel("9no");
		lblno.setVerticalAlignment(SwingConstants.BOTTOM);
		lblno.setForeground(Color.BLACK);
		lblno.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblno.setBounds(79, 273, 126, 16);
		panel_0.add(lblno);
		
		JLabel lblIngWalterGaibor = new JLabel("Ing. Walter Gaibor");
		lblIngWalterGaibor.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIngWalterGaibor.setForeground(Color.BLACK);
		lblIngWalterGaibor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblIngWalterGaibor.setBounds(33, 308, 126, 16);
		panel_0.add(lblIngWalterGaibor);

		JButton btnPDF = new JButton("");
		btnPDF.setIcon(new ImageIcon(".\\imagenes\\logo.png")); 
			btnPDF.setBounds(21, 11, 75, 78);
		panel_0.add(btnPDF);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(".\\imagenes\\principal.jpg"));
		button.setBounds(363, 124, 240, 229);
		panel_0.add(button);
		
		JLabel lblAnalytic = new JLabel("ANALYTIC");
		lblAnalytic.setForeground(SystemColor.activeCaption);
		lblAnalytic.setFont(new Font("Dialog", Font.PLAIN, 27));
		lblAnalytic.setBackground(Color.LIGHT_GRAY);
		lblAnalytic.setBounds(613, 134, 132, 35);
		panel_0.add(lblAnalytic);
		
		JLabel lblHierarchy = new JLabel("HIERARCHY");
		lblHierarchy.setForeground(new Color(255, 160, 122));
		lblHierarchy.setFont(new Font("Dialog", Font.PLAIN, 27));
		lblHierarchy.setBackground(Color.LIGHT_GRAY);
		lblHierarchy.setBounds(623, 177, 188, 43);
		panel_0.add(lblHierarchy);
		
		JLabel lblProcess = new JLabel("PROCESS");
		lblProcess.setForeground(new Color(144, 238, 144));
		lblProcess.setFont(new Font("Dialog", Font.PLAIN, 27));
		lblProcess.setBackground(Color.LIGHT_GRAY);
		lblProcess.setBounds(651, 231, 170, 43);
		panel_0.add(lblProcess);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("A�adir Informaci�n", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblIngresoDeAlternativas = new JLabel("INGRESO DE ALTERNATIVAS");
		lblIngresoDeAlternativas.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 34));
		lblIngresoDeAlternativas.setBounds(118, 24, 311, 31);
		panel.add(lblIngresoDeAlternativas);
		
		JLabel lblEscribaLaAlternativa = new JLabel("Escriba la alternativa:");
		lblEscribaLaAlternativa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblEscribaLaAlternativa.setBounds(24, 66, 140, 31);
		panel.add(lblEscribaLaAlternativa);
		
		txt_alternativa = new JTextField();
		txt_alternativa.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		txt_alternativa.setEditable(true);
		txt_alternativa.addKeyListener(new KeyAdapter() {
			@Override
				 public void keyTyped(KeyEvent ke) { 
		             char c=ke.getKeyChar(); 
		          if(Character.isDigit(c)) { 
		              getToolkit().beep(); 
		              ke.consume(); 
		              //Error.setText("Ingresa Solo Letras"); 
		             JOptionPane.showMessageDialog(null, "No puede ingresar Numeros!!!", "Error Datos", JOptionPane.ERROR_MESSAGE); 
		          } 
		        } 
					});
		txt_alternativa.setColumns(10);
		txt_alternativa.setBounds(163, 71, 148, 20);
		panel.add(txt_alternativa);
		
		Button btn_anadir_alt = new Button("A\u00D1ADIR");
		btn_anadir_alt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				String alternativa = txt_alternativa.getText();
				array1.add(alternativa);
				
				for(int x=0;x<array1.size();x++) {
					  System.out.println(array1.get(x));
					}
						
				txt_alternativa.setText("");
			}
		});
		
		btn_anadir_alt.setForeground(Color.WHITE);
		btn_anadir_alt.setBackground(Color.BLACK);
		btn_anadir_alt.setBounds(252, 102, 70, 22);
		panel.add(btn_anadir_alt);
		
		txt_criterio = new JTextField();
		txt_criterio.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		txt_criterio.setColumns(10);
		txt_criterio.addKeyListener(new KeyAdapter() {
			@Override
				 public void keyTyped(KeyEvent ke) { 
		             char c=ke.getKeyChar(); 
		          if(Character.isDigit(c)) { 
		              getToolkit().beep(); 
		              ke.consume(); 
		              //Error.setText("Ingresa Solo Letras"); 
		             JOptionPane.showMessageDialog(null, "No puede ingresar Numeros!!!", "Error Datos", JOptionPane.ERROR_MESSAGE); 
		          } 
		        } 
					});
		txt_criterio.setBounds(163, 248, 148, 20);
		panel.add(txt_criterio);
		
		JLabel lblEscribaElCriterio = new JLabel("Escriba el criterio:");
		lblEscribaElCriterio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblEscribaElCriterio.setBounds(24, 243, 140, 31);
		panel.add(lblEscribaElCriterio);
		
		JLabel lblIngresoDeCriterio = new JLabel("INGRESO DE CRITERIO");
		lblIngresoDeCriterio.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 34));
		lblIngresoDeCriterio.setBounds(118, 201, 311, 31);
		panel.add(lblIngresoDeCriterio);
		
		Button btn_anadir_cri = new Button("A\u00D1ADIR");
		btn_anadir_cri.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
				
				
				String criterio = txt_criterio.getText();
				array2.add(criterio);
				
				for(int x=0;x<array2.size();x++) {
					  System.out.println(array2.get(x));
					}
						
				
			}
		});
		btn_anadir_cri.setForeground(Color.WHITE);
		btn_anadir_cri.setBackground(Color.BLACK);
		btn_anadir_cri.setBounds(252, 279, 70, 22);
		panel.add(btn_anadir_cri);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(new Color(224, 255, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setIcon(new ImageIcon(".\\imagenes\\INFORMA.png"));
		button_1.setBounds(493, 71, 258, 242);
		panel.add(button_1);
		
		Button btn_procesar = new Button("PROCESAR");
		btn_procesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones obj=new Operaciones();
				obj.recibo_tamano_criterio_alternativa(array1.size(), array2.size());
				
				System.out.println(array1.size());
				
				 CreaColumnas();
				    CargaDatos();
				    
				    CreaColumnas2();
				    CargaDatos2();
				    crearTabla();
				 crearTabla2();
			}
			
			
		});
		btn_procesar.setForeground(Color.WHITE);
		btn_procesar.setBackground(new Color(0, 0, 255));
		
		btn_procesar.setBounds(362, 310, 107, 44);
		panel.add(btn_procesar);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Tabla C", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblTablaCriterios = new JLabel("Tabla Criterios");
		lblTablaCriterios.setBounds(302, 11, 69, 14);
		panel_2.add(lblTablaCriterios);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(203, 39, 550, 200);
		panel_2.add(scrollPane);
		
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 39, 163, 200);
		panel_2.add(scrollPane_1);
		
		Button button_2 = new Button("GUARDAR");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar_array();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(Color.BLUE);
		button_2.setBounds(316, 295, 107, 44);
		panel_2.add(button_2);
		 
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Tabla Llena", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Matriz Cuadrada", null, panel_4, null);
		
	
	}
	public void CreaColumnas() {
		  ArrayList<String> Columna = new ArrayList<String>();
		 int arr = array1.size(); 
	    titColumna = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumna[i] = array1.get(i);
	    }
	  }
	
	public void CreaColumnas2() {
		 int arr = array1.size(); 
		  ArrayList<String> Columna = new ArrayList<String>();
	    titColumna2 = new String[1];
	    
	    for( int i=0; i < 1; i++ ) {
	      titColumna2[i] = "Alternativas:";
	    }
	  }
	  
	  // Creamos los datos para cada uno de los elementos de la tabla
	  public void CargaDatos() {
		  int arr2 = array1.size(); 
	    datoColumna = new String[arr2][arr2];
	    
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < arr2; iX++ ) {
		datoColumna[iY][iX] = "";
	      }
	    }
	  }
	  
	  public void CargaDatos2() {
		  int arr2 = array1.size(); 
	    datoColumna2 = new String[arr2][1];
	    
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < 1; iX++ ) {
		datoColumna2[iY][iX] = array1.get(iY);
	      }
	    }
	  }
	  public void crearTabla(){ 
			table = new JTable(datoColumna,titColumna){
				public boolean isCellEditable(int row, int column){
				    if(row ==column ) return false;
				    return true;
				  }
			};
			 table.setShowHorizontalLines( true );
			    table.setRowSelectionAllowed( true );
			    table.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    //table.setSelectionForeground( Color.white );
			    //table.setSelectionBackground( Color.WHITE );
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // autom�tica
			scrollPane.setViewportView(table);
			
			//LISTENER TABLA
			table.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					int tam_col=table.getColumnCount();
					int tam_fil=table.getRowCount();
					//System.out.println(tam_col+" "+tam_fil);
					cambiar_celdas2(tam_col, tam_fil);
					
					
				}
				
			});
			setear1entabla();
			
			}
	  
	  public void crearTabla2(){ 
			table_1 = new JTable(datoColumna2,titColumna2);
			 table_1.setShowHorizontalLines( true );
			    table_1.setRowSelectionAllowed( true );
			    table_1.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    table_1.setSelectionForeground( Color.white );
			    table_1.setSelectionBackground( Color.WHITE );
			    table_1.setEnabled(false);
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // autom�tica
			scrollPane_1.setViewportView(table_1);
			}
	  
	  //METODOS JHON
	  public void cambiar_celdas2(int columnas, int filas){
			String valor_alterado;
			int columna_seleccionada=table.getSelectedColumn();
			int fila_seleccionada=table.getSelectedRow();
			System.out.println(columna_seleccionada+" "+fila_seleccionada);
			try {
				//table_1.getModel().addTableModelListener(table_1);
				table.getCellEditor().stopCellEditing();
				String valor_cambiado = String.valueOf(table.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
				//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
				System.out.println("Valor "+valor_cambiado);
				valor_alterado=invertirString(valor_cambiado);
				table.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	  
	  public String invertirString(String valor_tabla){
			String valor_invertido="";
			int posicionslash;
			String primer_valor="",segundo_valor="";
			try {
				posicionslash = valor_tabla.indexOf("/");
				System.out.println("PosSlash:"+posicionslash);
				primer_valor = valor_tabla.substring(0, posicionslash);
				System.out.println("PrimerPos"+primer_valor);
				segundo_valor = valor_tabla.substring(posicionslash+1, valor_tabla.length());
				System.out.println("Segundo valor"+" "+segundo_valor);
			} catch (Exception e) {
				// TODO: handle exception
			}
			valor_invertido=segundo_valor+"/"+primer_valor;
			return valor_invertido;
		}
	  
	  public void setear1entabla(){
			int columna_seleccionada=table.getColumnCount();
			for (int i = 0; i < columna_seleccionada; i++) {
				System.out.println(i);
				table.setValueAt("1/1", i, i);
			}
			
		}
	  
	  public void guardar_array(){
			
			for (int i = 0; i < table.getColumnCount(); i++) {
				for (int j = 0; j < table.getRowCount(); j++) {
					lista_tabla.add(String.valueOf(table.getValueAt(i, j)));
					System.out.print(String.valueOf(table.getValueAt(i, j))+" ");
				}
				System.out.println();
			}
			
			
		}
	  
		//USAR ESTE METODO PARA LAS OTRAS MATRICES DE ARRAY A TABLA
		public void de_array_a_tabla(){
			int mirecorredor=0;
			for (int i = 0; i < table.getColumnCount(); i++) {
				for (int j = 0; j < table.getRowCount(); j++) {
					
					//CAMBIAR EL NOMBRE DE ESTA TABLA 
					table_1.setValueAt(lista_tabla.get(mirecorredor), j, i);
					mirecorredor++;
					
				}
			}
		}
}
