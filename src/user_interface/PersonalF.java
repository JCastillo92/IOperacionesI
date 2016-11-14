package user_interface;

import java.awt.EventQueue;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.util.*;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.UIManager;

public class PersonalF extends JFrame {

	private JPanel contentPane;
	public JTextField txt_criterio;
	private JTextField txt_alternativa;
	public JTextField txt_alt;
	public String titColumna[];

	public String titColumna1[];
	public String titColumna11[];
	public String titColumna2[];

	public String titColumna3[];
	public String titColumna31[];
	

	public String titColumna4[];

	public String titColumna5[];
	public String datoColumna2[][];
	  public String datoColumna[][];
	  public String datoColumna1[][];
	  public String datoColumna11[][];

	  public String datoColumna3[][];
	  public String datoColumna31[][];
	  public String datoColumna4[][];

	  public String datoColumna5[][];
	  private JTable table;
	 private JTable table_1;
	 private JTable table_b1;
	 private JTable table_b2;
	 private JTable table_b3;
	public ArrayList<String> array1;
	public ArrayList<String> array2;
	public ArrayList<String> numeros1;
	
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	private JScrollPane scrollPane_2;

	private JScrollPane scrollPane_3;

	private JScrollPane scrollPane_4;

	private JScrollPane scrollPane_5;
	private ArrayList<String> lista_tabla;

	private ArrayList<String> lista_tabla1;
	private JTable table_2;
	private JTable table_3;
	//private JTable table_31;
	private JTable table_4;

	private JTable table_k5;
	private JTable table_k6;
	private JTable table_5;
	private JScrollPane scrollPane_6;

	private JScrollPane scrollPane_k13;

	private JScrollPane scrollPane_k14;
	private JScrollPane scrollPane_k15;

	private JScrollPane scrollPane_k16;

	private JTable table_7;
	private String[] vector={""};
	private String[][] matriz={};
	private DefaultTableModel mod7=new DefaultTableModel(matriz,vector);
	private DefaultTableModel mod8=new DefaultTableModel(matriz,vector);

	private DefaultTableModel modk1=new DefaultTableModel(matriz,vector);
	private DefaultTableModel modk2=new DefaultTableModel(matriz,vector);
	private JScrollPane scrollPane_7;
	private JTable table_8;
	private JScrollPane scrollPane_8;

	private JScrollPane scrollPane_k10;
	private JScrollPane scrollPane_k9;

	private int total_alternativas;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;

	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JTabbedPane tabbedPane_1;
	private JTable table_k10;
	private JTable table_k11;

	private JTable table_k13;
	private JTable table_k14;
	private JTable table_k15;
	private JTable table_k16;
	private JTable table_k17;

	private JScrollPane scrollPane_b1;
	private JScrollPane scrollPane_b2;
	private JScrollPane scrollPane_b3;
	private JScrollPane scrollPane_b4;
	private JTable table_31;
	private JButton IGUAL;
	private JButton MARY;
	private JScrollPane scrollPane_k18;
	private JScrollPane scrollPane_k19;
	private JTable table_k18;
	private JTable table_k19;

	private JScrollPane scrollPane_20j;
	private JScrollPane scrollPane_21j;
	private JScrollPane scrollPane_22j;
	private JScrollPane scrollPane_23j;
	private JScrollPane scrollPane_24j;
	private JScrollPane scrollPane_25j;
	private JScrollPane scrollPane_26j;
	private JScrollPane scrollPane_27j;
	private JScrollPane scrollPane_28j;
	private JButton button_20j;
	private JTable table_20j;
	private JTable table_21j;
	private JTable table_22j;
	private JTable table_23j;
	private JTable table_24j;
	private JTable table_25j;
	private JTable table_26j;
	private JTable table_27j;
	private JTable table_28j;

	private JScrollPane scrollPane_jh9;
	private JScrollPane scrollPane_jh10;
	private JScrollPane scrollPane_jh11;
	private JButton button_jh12;
	private JButton button_jh13;
	private JScrollPane scrollPane_jh12;
	private JScrollPane scrollPane_jh13;
	private JScrollPane scrollPane_jh14;
	private JButton button_jh14;
	private JScrollPane scrollPane_jh15;
	private JScrollPane scrollPane_jh16;
	private JScrollPane scrollPane_jh17;




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
		setBounds(100, 100, 1239, 715);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//INICIALIZO ARRAYS
		array1 = new ArrayList<String>();
		array2 = new ArrayList<String>();
		lista_tabla = new ArrayList<String>();
		lista_tabla1 = new ArrayList<String>();
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		tabbedPane.setForeground(new Color(75, 0, 130));
		tabbedPane.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.setBounds(10, 11, 1209, 666);
		contentPane.add(tabbedPane);
		JPanel panel_0 = new JPanel();
		panel_0.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Principal", null, panel_0, null);
		panel_0.setLayout(null);
		
		JLabel lblIngenieriaDeSistemas = new JLabel("INGENIERIA DE SISTEMAS");
		lblIngenieriaDeSistemas.setBounds(336, 42, 397, 50);
		lblIngenieriaDeSistemas.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIngenieriaDeSistemas.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel_0.add(lblIngenieriaDeSistemas);
		
		
		
		JLabel lblUniversidadPolitcnicaSalesiana = new JLabel("UNIVERSIDAD POLIT\u00C9CNICA SALESIANA");
		lblUniversidadPolitcnicaSalesiana.setBounds(134, 11, 828, 35);
		lblUniversidadPolitcnicaSalesiana.setForeground(Color.BLACK);
		lblUniversidadPolitcnicaSalesiana.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 40));
		lblUniversidadPolitcnicaSalesiana.setBackground(Color.LIGHT_GRAY);
		panel_0.add(lblUniversidadPolitcnicaSalesiana);
		
		JLabel lblInvestigacinDeOperaciones = new JLabel("INVESTIGACI\u00D3N DE OPERACIONES");
		lblInvestigacinDeOperaciones.setVerticalAlignment(SwingConstants.BOTTOM);
		lblInvestigacinDeOperaciones.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblInvestigacinDeOperaciones.setBounds(275, 103, 458, 35);
		panel_0.add(lblInvestigacinDeOperaciones);
		
		JLabel lblIntegrantesKarenAchig = new JLabel("Integrantes: ");
		lblIntegrantesKarenAchig.setForeground(Color.DARK_GRAY);
		lblIntegrantesKarenAchig.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIntegrantesKarenAchig.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblIntegrantesKarenAchig.setBounds(21, 186, 152, 35);
		panel_0.add(lblIntegrantesKarenAchig);
		
		JLabel lblKarenAchig = new JLabel("Karen Achig");
		lblKarenAchig.setVerticalAlignment(SwingConstants.BOTTOM);
		lblKarenAchig.setForeground(Color.BLACK);
		lblKarenAchig.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblKarenAchig.setBounds(149, 240, 126, 16);
		panel_0.add(lblKarenAchig);
		
		JLabel lblJhonCastillo = new JLabel("Jhon Castillo");
		lblJhonCastillo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJhonCastillo.setForeground(Color.BLACK);
		lblJhonCastillo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblJhonCastillo.setBounds(149, 283, 126, 16);
		panel_0.add(lblJhonCastillo);
		
		JLabel lblJairoFlores = new JLabel("Jairo Flores");
		lblJairoFlores.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJairoFlores.setForeground(Color.BLACK);
		lblJairoFlores.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblJairoFlores.setBounds(149, 328, 126, 16);
		panel_0.add(lblJairoFlores);
		
		JLabel lblBryanTorres = new JLabel("Bryan Torres");
		lblBryanTorres.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBryanTorres.setForeground(Color.BLACK);
		lblBryanTorres.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblBryanTorres.setBounds(149, 375, 126, 16);
		panel_0.add(lblBryanTorres);
		
		JLabel lblMarilZambonino = new JLabel("Maril\u00FA Zambonino");
		lblMarilZambonino.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMarilZambonino.setForeground(Color.BLACK);
		lblMarilZambonino.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblMarilZambonino.setBounds(149, 416, 126, 16);
		panel_0.add(lblMarilZambonino);
		
		JLabel lblNivel = new JLabel("Nivel:");
		lblNivel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNivel.setForeground(Color.DARK_GRAY);
		lblNivel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNivel.setBounds(21, 458, 75, 40);
		panel_0.add(lblNivel);
		
		JLabel lblno = new JLabel("9no");
		lblno.setVerticalAlignment(SwingConstants.BOTTOM);
		lblno.setForeground(Color.BLACK);
		lblno.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblno.setBounds(106, 467, 126, 31);
		panel_0.add(lblno);
		
		JLabel lblIngWalterGaibor = new JLabel("Ing. Walter Gaibor");
		lblIngWalterGaibor.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIngWalterGaibor.setForeground(Color.BLACK);
		lblIngWalterGaibor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblIngWalterGaibor.setBounds(96, 555, 258, 27);
		panel_0.add(lblIngWalterGaibor);
		
				JButton btnPDF = new JButton("");
				btnPDF.setIcon(new ImageIcon(".\\imagenes\\logo.png")); 
				btnPDF.setBounds(21, 11, 103, 102);
				panel_0.add(btnPDF);
				
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
					
					}
				});
				button.setIcon(new ImageIcon(".\\imagenes\\principal.jpg"));
				button.setBounds(383, 270, 404, 319);
				panel_0.add(button);
				
				JLabel lblAnalytic = new JLabel("ANALYTIC");
				lblAnalytic.setForeground(SystemColor.activeCaption);
				lblAnalytic.setFont(new Font("Dialog", Font.PLAIN, 59));
				lblAnalytic.setBackground(Color.LIGHT_GRAY);
				lblAnalytic.setBounds(797, 292, 329, 50);
				panel_0.add(lblAnalytic);
				
				JLabel lblHierarchy = new JLabel("HIERARCHY");
				lblHierarchy.setForeground(new Color(255, 160, 122));
				lblHierarchy.setFont(new Font("Dialog", Font.PLAIN, 59));
				lblHierarchy.setBackground(Color.LIGHT_GRAY);
				lblHierarchy.setBounds(846, 377, 348, 57);
				panel_0.add(lblHierarchy);
				
				JLabel lblProcess = new JLabel("PROCESS");
				lblProcess.setForeground(new Color(144, 238, 144));
				lblProcess.setFont(new Font("Dialog", Font.PLAIN, 59));
				lblProcess.setBackground(Color.LIGHT_GRAY);
				lblProcess.setBounds(890, 467, 304, 57);
				panel_0.add(lblProcess);
				
				JButton btnNewButton = new JButton("");
				
					
				btnNewButton.setIcon(new ImageIcon(".\\imagenes\\gif.gif"));
				btnNewButton.setBounds(944, 11, 250, 170);
				panel_0.add(btnNewButton);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Añadir Información", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblIngresoDeAlternativas = new JLabel("INGRESO DE ALTERNATIVAS");
		lblIngresoDeAlternativas.setBounds(118, 24, 311, 31);
		lblIngresoDeAlternativas.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 34));
		panel.add(lblIngresoDeAlternativas);
		
		JLabel lblEscribaLaAlternativa = new JLabel("Escriba la alternativa:");
		lblEscribaLaAlternativa.setBounds(10, 66, 189, 45);
		lblEscribaLaAlternativa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		panel.add(lblEscribaLaAlternativa);
		
				txt_criterio = new JTextField();
				txt_criterio.setBounds(196, 283, 212, 45);
				txt_criterio.setFont(new Font("Times New Roman", Font.ITALIC, 25));
				txt_criterio.setEditable(true);
				txt_criterio.setColumns(10);
				panel.add(txt_criterio);
				
						
						Button btn_anadir_crite = new Button("A\u00D1ADIR");
						btn_anadir_crite.setFont(new Font("Dialog", Font.PLAIN, 25));
						btn_anadir_crite.setBounds(268, 350, 140, 45);
						btn_anadir_crite.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								
						            ReproducirSonido("imagenes/sound.wav");
						            if(!txt_criterio.getText().equals("")){
								String alternativa = txt_criterio.getText();
								array1.add(alternativa);
								
								for(int x=0;x<array1.size();x++) {
									  System.out.println(array1.get(x));
									}
										
								txt_criterio.setText("");
								txt_criterio.requestFocus();
											
								System.out.println("Paso");
									
								}else{
									JOptionPane.showMessageDialog(null, "Caja de texto vacia!!!", "Error Datos", JOptionPane.ERROR_MESSAGE); 
							         
									txt_criterio.requestFocus();
									System.out.println("no valido ... esta vacio");
								}
							}
						});
						
						btn_anadir_crite.setForeground(Color.WHITE);
						btn_anadir_crite.setBackground(Color.BLACK);
						panel.add(btn_anadir_crite);
						
						txt_alternativa = new JTextField();
						txt_alternativa.setBounds(209, 66, 199, 45);
						txt_alternativa.setFont(new Font("Times New Roman", Font.ITALIC, 25));
						txt_alternativa.setColumns(10);
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
						panel.add(txt_alternativa);
						
						JLabel lblEscribaElCriterio = new JLabel("Escriba el criterio:");
						lblEscribaElCriterio.setBounds(10, 283, 176, 45);
						lblEscribaElCriterio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
						panel.add(lblEscribaElCriterio);
						
						JLabel lblIngresoDeCriterio = new JLabel("INGRESO DE CRITERIO");
						lblIngresoDeCriterio.setBounds(118, 239, 311, 31);
						lblIngresoDeCriterio.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 34));
						panel.add(lblIngresoDeCriterio);
						
						Button btn_anadir_alter = new Button("A\u00D1ADIR");
						btn_anadir_alter.setFont(new Font("Dialog", Font.PLAIN, 25));
						btn_anadir_alter.setBounds(268, 130, 140, 45);
						btn_anadir_alter.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
								
								ReproducirSonido("imagenes/sound.wav");
								if(!txt_alternativa.getText().equals("")){
								String criterio = txt_alternativa.getText();
								array2.add(criterio);
								
								for(int x=0;x<array2.size();x++) {
									  System.out.println(array2.get(x));
									}
										
								txt_alternativa.setText("");
								txt_alternativa.requestFocus();
								}else{
									JOptionPane.showMessageDialog(null, "Caja de texto vacia!!!", "Error Datos", JOptionPane.ERROR_MESSAGE); 
									txt_alternativa.requestFocus();
								}
							}
						});
						btn_anadir_alter.setForeground(Color.WHITE);
						btn_anadir_alter.setBackground(Color.BLACK);
						panel.add(btn_anadir_alter);
						
						JButton button_1 = new JButton("");
						button_1.setBounds(753, 130, 353, 318);
						button_1.setBackground(new Color(224, 255, 255));
						
							
						button_1.setIcon(new ImageIcon(".\\imagenes\\INFORMA.png"));
						panel.add(button_1);
						
						Button btn_procesar = new Button("PROCESAR");
						btn_procesar.setFont(new Font("Dialog", Font.PLAIN, 30));
						btn_procesar.setBounds(444, 449, 229, 54);
						btn_procesar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								ReproducirSonido("imagenes/sound2.wav");
								
								
								
								System.out.println(array1.size());
								//JHON TOTAL ALTERNATIVAS
								 total_alternativas = array1.size();
								 controlTabedPanes();//FIN
								
								CreaColumnas();
								    CargaDatos();
								    
								    CreaColumnas2();
								    CargaDatos2();
								    crearTabla();
								 crearTabla2();
								
								 CargaDatos3();
								   CreaColumnas3();
								   CargaDatos4();
								   CreaColumnas4();
								
								    crearTabla9();


								    crearTabla11();
												 

									    
									 CargaDatos4();
									   CreaColumnas4();
									    crearTabla11();
									    
									    CargaDatos31();
										   CreaColumnas31();
										   crearTabla91();
										   
										   
										   CargaDatos5();
										   CreaColumnas5();
										   crearTabla12();  
										   
										   crearTabla12_B();
										   
										   crearTabla41();
										   CreaColumnas11();
										   CargaDatos11();
									    
									 

							}
							
							
						});
						btn_procesar.setForeground(Color.WHITE);
						btn_procesar.setBackground(new Color(0, 0, 255));
						panel.add(btn_procesar);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Tabla C", null, panel_2, null);
		panel_2.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(304, 68, 510, 274);
		scrollPane.setBackground(new Color(224, 255, 255));
		
				panel_2.add(scrollPane);
				
				
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(123, 68, 137, 274);
				panel_2.add(scrollPane_1);
				
				Button button_2 = new Button("GUARDAR");
				button_2.setBounds(481, 447, 192, 69);
				button_2.setFont(new Font("Dialog", Font.PLAIN, 25));
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						guardar_array();

					CargaDatos1();
					CreaColumnas1();
					crearTabla3();
					
					crearTabla4();
				crearTabla5();
				
				crearTabla6();
				//	de_array_a_tabla();
				
				//CONTROL TABBEDPANE SEGUN ALTERNATIVAS
				

					}
				});
				button_2.setForeground(Color.WHITE);
				button_2.setBackground(Color.BLUE);
				panel_2.add(button_2);
				
				JLabel lblMatrizDeAlternativas = new JLabel("MATRIZ DE CRITERIOS");
				lblMatrizDeAlternativas.setBounds(420, 26, 311, 31);
				lblMatrizDeAlternativas.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 41));
				panel_2.add(lblMatrizDeAlternativas);
				
				JButton button_5 = new JButton("");
				button_5.setBackground(new Color(224, 255, 255));
				
	button_5.setIcon(new ImageIcon(".\\imagenes\\op.png"));
	button_5.setBounds(870, 380, 311, 247);
	panel_2.add(button_5);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Tabla Llena", null, panel_3, null);
		panel_3.setLayout(null);
		
		table_2 = new JTable();
		table_2.setBounds(415, 5, 0, 0);
		panel_3.add(table_2);
		
				scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(128, 245, 40, 268);
				panel_3.add(scrollPane_2);
				
				table_4 = new JTable();
				scrollPane_2.setViewportView(table_4);
				
				scrollPane_3 = new JScrollPane();
				scrollPane_3.setBounds(178, 245, 261, 268);
				panel_3.add(scrollPane_3);
				
				table_3 = new JTable();
				scrollPane_3.setColumnHeaderView(table_3);
				
				JLabel lblMatricesParaObtener = new JLabel("MATRICES PARA OBTENER LA MATRIZ CUADRADA");
				lblMatricesParaObtener.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 50));
				lblMatricesParaObtener.setBounds(165, 130, 718, 55);
				panel_3.add(lblMatricesParaObtener);
				
				scrollPane_4 = new JScrollPane();
				scrollPane_4.setBounds(587, 245, 40, 268);
				panel_3.add(scrollPane_4);
				
				table_k5 = new JTable();
				scrollPane_4.setViewportView(table_k5);
				
				 scrollPane_5 = new JScrollPane();
				 scrollPane_5.setBounds(671, 245, 261, 268);
				 panel_3.add(scrollPane_5);
				 
				 table_k6 = new JTable();
				 scrollPane_5.setViewportView(table_k6);
				 
				 JButton button_3 = new JButton("");
				 
				  button_3.setIcon(new ImageIcon(".\\imagenes\\multi.png"));
				  button_3.setBounds(482, 346, 75, 78);
				  panel_3.add(button_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Matriz Cuadrada", null, panel_4, null);
		panel_4.setLayout(null);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(41, 300, 406, 256);
		panel_4.add(scrollPane_6);
		
		table_5 = new JTable();
		scrollPane_6.setColumnHeaderView(table_5);
		
		JLabel lblMatrizCuadrada = new JLabel("MATRIZ CUADRADA");
		lblMatrizCuadrada.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 34));
		lblMatrizCuadrada.setBounds(118, 228, 198, 31);
		panel_4.add(lblMatrizCuadrada);
		
		JLabel lblSumaDeFilas = new JLabel("SUMA DE FILAS");
		lblSumaDeFilas.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 34));
		lblSumaDeFilas.setBounds(568, 234, 160, 31);
		panel_4.add(lblSumaDeFilas);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(601, 305, 114, 251);
		panel_4.add(scrollPane_7);
		
		table_7 = new JTable();
		scrollPane_7.setColumnHeaderView(table_7);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(814, 299, 167, 257);
		panel_4.add(scrollPane_8);
		
		table_8 = new JTable();
		scrollPane_8.setColumnHeaderView(table_8);
		
		JLabel lblPonderacin = new JLabel("PONDERACI\u00D3N");
		lblPonderacin.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 34));
		lblPonderacin.setBounds(821, 234, 148, 31);
		panel_4.add(lblPonderacin);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		button_4.setBounds(476, 406, 62, 54);
		panel_4.add(button_4);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(new Color(224, 255, 255));
		button_6.setIcon(new ImageIcon(".\\imagenes\\op2.png"));
		button_6.setBounds(948, 0, 246, 187);
		panel_4.add(button_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Alternativas", null, panel_1, null);
		panel_1.setLayout(null);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(UIManager.getColor("Button.background"));
		tabbedPane_1.setForeground(new Color(255, 99, 71));
		tabbedPane_1.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 16));
		tabbedPane_1.setBounds(22, 11, 1155, 528);
		panel_1.add(tabbedPane_1);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(240, 248, 255));
		panel_5.setVisible(false);
		panel_5.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 1", null, panel_5, null);
		panel_5.setLayout(null);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(270, 240, 75, 78);
		 button_10.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_5.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(703, 82, 75, 78);
		button_11.setIcon(new ImageIcon(".\\imagenes\\multi.png"));
		panel_5.add(button_11);
		
		
		
		 scrollPane_k9 = new JScrollPane();
		scrollPane_k9.setBounds(10, 11, 78, 149);
		panel_5.add(scrollPane_k9);
		
		table_k10 = new JTable();
		scrollPane_k9.setViewportView(table_k10);
		
		scrollPane_k10 = new JScrollPane();
		scrollPane_k10.setBounds(116, 11, 257, 149);
		panel_5.add(scrollPane_k10);
		
		table_k11 = new JTable();
		scrollPane_k10.setViewportView(table_k11);
		
		 scrollPane_k13 = new JScrollPane();
		scrollPane_k13.setBounds(399, 11, 49, 149);
		panel_5.add(scrollPane_k13);
		
		table_k13 = new JTable();
		scrollPane_k13.setViewportView(table_k13);
		
		 scrollPane_k14 = new JScrollPane();
		scrollPane_k14.setBounds(463, 11, 257, 149);
		panel_5.add(scrollPane_k14);
		
		table_k14 = new JTable();
		scrollPane_k14.setViewportView(table_k14);
		
		scrollPane_k15 = new JScrollPane();
		scrollPane_k15.setBounds(788, 11, 49, 149);
		panel_5.add(scrollPane_k15);
		
		table_k15 = new JTable();
		scrollPane_k15.setViewportView(table_k15);
		
		 scrollPane_k16 = new JScrollPane();
		scrollPane_k16.setBounds(867, 11, 257, 149);
		panel_5.add(scrollPane_k16);
		
		table_k16 = new JTable();
		scrollPane_k16.setViewportView(table_k16);
		
		JButton button_8;
		IGUAL = new JButton("=");
		IGUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar_array1();
				 CargaDatos4();
				   CreaColumnas4();
				    crearTabla13();
				  
				    crearTabla15();
			
				CargaDatos3();
				CreaColumnas3();
				  crearTablak14();

				  crearTablak16();
				  
				  cuadrada();
				  
				  
				  
			}
		});
		
		IGUAL.setBounds(323, 70, 89, 23);
		panel_5.add(IGUAL);
		
		JScrollPane scrollPane_k17 = new JScrollPane();
		scrollPane_k17.setBounds(28, 205, 384, 186);
		panel_5.add(scrollPane_k17);
		
		table_k17 = new JTable();
		scrollPane_k17.setViewportView(table_k17);
		
		scrollPane_k18 = new JScrollPane();
		scrollPane_k18.setBounds(527, 205, 107, 186);
		panel_5.add(scrollPane_k18);
		
		table_k18 = new JTable();
		scrollPane_k18.setViewportView(table_k18);
		
		scrollPane_k19 = new JScrollPane();
		scrollPane_k19.setBounds(707, 205, 107, 186);
		panel_5.add(scrollPane_k19);
		
		table_k19 = new JTable();
		scrollPane_k19.setViewportView(table_k19);
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(240, 248, 255));
		panel_7.setVisible(false);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 248, 255));
		panel_6.setVisible(false);
		panel_6.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 2", null, panel_6, null);
		tabbedPane_1.setEnabledAt(1, false);
		panel_6.setLayout(null);
		
		scrollPane_b1 = new JScrollPane();
		scrollPane_b1.setBounds(10, 11, 76, 156);
		panel_6.add(scrollPane_b1);
		
		scrollPane_b2 = new JScrollPane();
		scrollPane_b2.setBounds(109, 11, 304, 156);
		panel_6.add(scrollPane_b2);
		
		scrollPane_b3 = new JScrollPane();
		scrollPane_b3.setBounds(477, 11, 76, 156);
		panel_6.add(scrollPane_b3);
		
		scrollPane_b4 = new JScrollPane();
		scrollPane_b4.setBounds(563, 11, 304, 156);
		panel_6.add(scrollPane_b4);
		
		table_31 = new JTable();
		scrollPane_b4.setViewportView(table_31);
		panel_7.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 3", null, panel_7, null);
		panel_7.setLayout(null);
		
		scrollPane_20j = new JScrollPane();
		scrollPane_20j.setBounds(10, 11, 78, 149);
		panel_7.add(scrollPane_20j);
		
		table_20j = new JTable();
		scrollPane_20j.setColumnHeaderView(table_20j);
		
		scrollPane_21j = new JScrollPane();
		scrollPane_21j.setBounds(116, 11, 257, 149);
		panel_7.add(scrollPane_21j);
		
		table_21j = new JTable();
		scrollPane_21j.setColumnHeaderView(table_21j);
		
		scrollPane_22j = new JScrollPane();
		scrollPane_22j.setBounds(399, 11, 49, 149);
		panel_7.add(scrollPane_22j);
		
		table_22j = new JTable();
		scrollPane_22j.setColumnHeaderView(table_22j);
		
		scrollPane_23j = new JScrollPane();
		scrollPane_23j.setBounds(463, 11, 257, 149);
		panel_7.add(scrollPane_23j);
		
		table_23j = new JTable();
		scrollPane_23j.setColumnHeaderView(table_23j);
		
		scrollPane_24j = new JScrollPane();
		scrollPane_24j.setBounds(788, 11, 49, 149);
		panel_7.add(scrollPane_24j);
		
		table_24j = new JTable();
		scrollPane_24j.setColumnHeaderView(table_24j);
		
		scrollPane_25j = new JScrollPane();
		scrollPane_25j.setBounds(867, 11, 257, 149);
		panel_7.add(scrollPane_25j);
		
		table_25j = new JTable();
		scrollPane_25j.setColumnHeaderView(table_25j);
		
		scrollPane_26j = new JScrollPane();
		scrollPane_26j.setBounds(28, 205, 384, 186);
		panel_7.add(scrollPane_26j);
		
		table_26j = new JTable();
		scrollPane_26j.setColumnHeaderView(table_26j);
		
		scrollPane_27j = new JScrollPane();
		scrollPane_27j.setBounds(527, 205, 107, 186);
		panel_7.add(scrollPane_27j);
		
		table_27j = new JTable();
		scrollPane_27j.setColumnHeaderView(table_27j);
		
		scrollPane_28j = new JScrollPane();
		scrollPane_28j.setBounds(707, 205, 107, 186);
		panel_7.add(scrollPane_28j);
		
		table_28j = new JTable();
		scrollPane_28j.setColumnHeaderView(table_28j);
		
		button_20j = new JButton("=");
		button_20j.setBounds(323, 70, 89, 23);
		panel_7.add(button_20j);
		
		panel_8 = new JPanel();
		panel_8.setBackground(new Color(240, 248, 255));
		panel_8.setVisible(false);
		panel_8.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 4", null, panel_8, null);
		panel_8.setLayout(null);
		
		scrollPane_jh9 = new JScrollPane();
		scrollPane_jh9.setBounds(12, 13, 78, 149);
		panel_8.add(scrollPane_jh9);
		
		scrollPane_jh10 = new JScrollPane();
		scrollPane_jh10.setBounds(118, 13, 257, 149);
		panel_8.add(scrollPane_jh10);
		
		scrollPane_jh11 = new JScrollPane();
		scrollPane_jh11.setBounds(30, 207, 384, 186);
		panel_8.add(scrollPane_jh11);
		
		button_jh12 = new JButton("");
		button_jh12.setBounds(272, 242, 75, 78);
		panel_8.add(button_jh12);
		
		button_jh13 = new JButton("=");
		button_jh13.setBounds(325, 72, 89, 23);
		panel_8.add(button_jh13);
		
		scrollPane_jh12 = new JScrollPane();
		scrollPane_jh12.setBounds(401, 13, 49, 149);
		panel_8.add(scrollPane_jh12);
		
		scrollPane_jh13 = new JScrollPane();
		scrollPane_jh13.setBounds(465, 13, 257, 149);
		panel_8.add(scrollPane_jh13);
		
		scrollPane_jh14 = new JScrollPane();
		scrollPane_jh14.setBounds(529, 207, 107, 186);
		panel_8.add(scrollPane_jh14);
		
		button_jh14 = new JButton("");
		button_jh14.setBounds(705, 84, 75, 78);
		panel_8.add(button_jh14);
		
		scrollPane_jh15 = new JScrollPane();
		scrollPane_jh15.setBounds(709, 207, 107, 186);
		panel_8.add(scrollPane_jh15);
		
		scrollPane_jh16 = new JScrollPane();
		scrollPane_jh16.setBounds(790, 13, 49, 149);
		panel_8.add(scrollPane_jh16);
		
		scrollPane_jh17 = new JScrollPane();
		scrollPane_jh17.setBounds(869, 13, 257, 149);
		panel_8.add(scrollPane_jh17);
		
		panel_9 = new JPanel();
		panel_9.setBackground(new Color(240, 248, 255));
		panel_9.setVisible(false);
		panel_9.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 5", null, panel_9, null);
		panel_9.setLayout(null);
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(240, 248, 255));
		panel_10.setVisible(false);
		panel_10.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 6", null, panel_10, null);
		panel_10.setLayout(null);
		
		

		panel_11 = new JPanel();
		panel_11.setBackground(new Color(240, 248, 255));
		panel_11.setVisible(false);
		panel_11.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 7", null, panel_11, null);
		panel_11.setLayout(null);
		
	
		
		
		
		
		//TABBEDPANES

		panel_12 = new JPanel();
		panel_12.setBackground(new Color(240, 248, 255));
		panel_12.setVisible(false);
		panel_12.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 8", null, panel_12, null);
		panel_12.setLayout(null);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(240, 248, 255));
		panel_13.setVisible(false);
		panel_13.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 9", null, panel_13, null);
		panel_13.setLayout(null);
		
		
		panel_14 = new JPanel();
		panel_14.setBackground(new Color(240, 248, 255));
		panel_14.setVisible(false);
		panel_14.setEnabled(false);
		tabbedPane_1.addTab("Alternativa N...", null, panel_14, null);
		panel_14.setLayout(null);
		
		
		tabbedPane_1.setEnabledAt(0, false);
		tabbedPane_1.setEnabledAt(2, false);
		tabbedPane_1.setEnabledAt(3, false);
		tabbedPane_1.setEnabledAt(4, false);
		tabbedPane_1.setEnabledAt(5, false);
		tabbedPane_1.setEnabledAt(6, false);
		tabbedPane_1.setEnabledAt(7, false);
		tabbedPane_1.setEnabledAt(8, false);
		tabbedPane_1.setEnabledAt(9, false);
		
		Button button_7 = new Button("PROCESAR");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Dialog", Font.PLAIN, 25));
		button_7.setBackground(Color.BLUE);
		button_7.setBounds(548, 557, 192, 69);
		panel_1.add(button_7);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(new Color(220, 220, 220));
		tabbedPane.addTab("Resultado", null, panel_15, null);
		
		JLabel lblResultados = new JLabel("RESULTADOS OBTENIDOS");
		lblResultados.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 55));
		lblResultados.setBounds(391, 53, 441, 48);
		panel_15.add(lblResultados);
		
		MARY = new JButton("");
		MARY.setEnabled(false);
		MARY.setBackground(new Color(220, 220, 220));
		MARY.setBounds(869, 49, 295, 170);
		
		MARY.setIcon(new ImageIcon(".\\imagenes\\fin.gif"));
		panel_15.add(MARY);
		
		JButton button_9 = new JButton("");
		button_9.setEnabled(false);
		button_9.setForeground(Color.WHITE);
		button_9.setBackground(new Color(220, 220, 220));
		button_9.setBounds(10, 49, 295, 170);
		button_9.setIcon(new ImageIcon(".\\imagenes\\fin.gif"));
		panel_15.add(button_9);
	}
	public void CreaColumnas() {
		 int arr = array1.size(); 
	    titColumna = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumna[i] = array1.get(i);
	    }
	  }
	public void CreaColumnas11() {
		 int arr = array1.size(); 
	    titColumna11 = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumna11[i] = array1.get(i);
	    }
	  }
	
	public void CreaColumnas3() {
		 int arr = array2.size(); 
	    titColumna3 = new String[arr];
	    titColumna5 = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumna3[i] = array2.get(i);

	      titColumna5[i] = array2.get(i);
	    }
	  }
	
	public void CreaColumnas31() {
		 int arr = array2.size(); 
	    titColumna31 = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumna31[i] = array2.get(i);
	    }
	  }
	
	public void CreaColumnas1() {
		 int arr = array1.size(); 
		  ArrayList<String> Columna = new ArrayList<String>();
	    titColumna1 = new String[1];
	    
	    for( int i=0; i < 1; i++ ) {
	      titColumna1[i] = "C";
	    }
	  }
	public void CreaColumnas2() {
	    titColumna2 = new String[1];
	    
	    for( int i=0; i < 1; i++ ) {
	      titColumna2[i] = "Criterios:";
	    }
	  }
	
	public void CreaColumnas4() {
	    titColumna4 = new String[1];
	    
	    for( int i=0; i < 1; i++ ) {
	      titColumna4[i] = "A:";
	    }
	  }
	
	public void CreaColumnas5() {
	    titColumna5 = new String[1];
	    
	    for( int i=0; i < 1; i++ ) {
	      titColumna5[i] = "Criterios:";
	    }
	  }
	  // Creamos los datos para cada uno de los elementos de la tabla
	  public void CargaDatos() {
		  int arr2 = array1.size(); 
	    datoColumna = new String[arr2][arr2];
	  }
	  public void CargaDatos3() {
		  int arr2 = array2.size(); 
	    datoColumna3 = new String[arr2][arr2];

	    datoColumna5 = new String[arr2][arr2];
	  }
	  public void CargaDatos31() {
		  int arr2 = array2.size(); 
	    datoColumna31 = new String[arr2][arr2];
	  }
	  
	  public void CargaDatos1() {
		  int arr2 = array1.size(); 
	    datoColumna1 = new String[arr2][arr2];
	    
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < arr2; iX++ ) {
		datoColumna1[iY][iX] = "";
	      }
	    }
	  }
	  
	  public void CargaDatos11() {
		  int arr2 = array1.size(); 
	    datoColumna11 = new String[arr2][arr2];
	    
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < arr2; iX++ ) {
		datoColumna11[iY][iX] = "";
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
	  public void CargaDatos4() {
		  int arr2 = array2.size(); 
	    datoColumna4 = new String[arr2][1];
	   
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < 1; iX++ ) {
		datoColumna4[iY][iX] = array2.get(iY);
	      }
	    }
	  }
	  
	  public void CargaDatos5() {
		  int arr2 = array2.size(); 
	    datoColumna5 = new String[arr2][1];
	   
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < 1; iX++ ) {
		datoColumna5[iY][iX] = array2.get(iY);
	      }
	    }
	  }
	  
	  
	  
	  
	  
	  
	
	  //alternativassss 
	  public void crearTabla11(){ 
			table_k10 = new JTable(datoColumna4,titColumna4);
			 table_k10.setShowHorizontalLines( true );
			    table_k10.setRowSelectionAllowed( true );
			    table_k10.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    table_k10.setSelectionForeground( Color.white );
			    table_k10.setSelectionBackground( Color.WHITE );
			    table_k10.setEnabled(false);
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			scrollPane_k9.setViewportView(table_k10);
			}
	
	  public void crearTabla9(){ 
			table_k11 = new JTable(datoColumna3,titColumna3){
				public boolean isCellEditable(int row, int column){
				    if(row ==column ) return false;
				    return true;
				  }
			};
			 table_k11.setShowHorizontalLines( true );
			    table_k11.setRowSelectionAllowed( true );
			    table_k11.setColumnSelectionAllowed( true );

			    
			scrollPane_k10.setViewportView(table_k11);
			
			//LISTENER TABLA
			table_k11.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					int tam_col=table_k11.getColumnCount();
					int tam_fil=table_k11.getRowCount();
					//System.out.println(tam_col+" "+tam_fil);
					cambiar_celdask3(tam_col, tam_fil);
				}
				
			});
			setear1entabla_k();
			
			}
	  
	  public void crearTabla91(){ 
			table_b2 = new JTable(datoColumna31,titColumna31){
				public boolean isCellEditable(int row, int column){
				    if(row ==column ) return false;
				    return true;
				  }
			};
			table_b2.setShowHorizontalLines( true );
			table_b2.setRowSelectionAllowed( true );
			table_b2.setColumnSelectionAllowed( true );
			   
			    
			scrollPane_b2.setViewportView(table_b2);
			
			//LISTENER TABLA
			table_b2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					int tam_col=table_b2.getColumnCount();
					int tam_fil=table_b2.getRowCount();
					//System.out.println(tam_col+" "+tam_fil);
					cambiar_celdask3(tam_col, tam_fil);
				}
				
			});
			setear1entabla_b();
			
			}
	  
	  
	  
	  
	  
	  public void crearTabla13(){ 
			table_k13 = new JTable(datoColumna4,titColumna4);
			 table_k13.setShowHorizontalLines( true );
			    table_k13.setRowSelectionAllowed( true );
			    table_k13.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    table_k13.setSelectionForeground( Color.white );
			    table_k13.setSelectionBackground( Color.WHITE );
			    table_k13.setEnabled(false);
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			scrollPane_k13.setViewportView(table_k13);
			}
	
	  public void crearTablak14(){ 

			table_k14 = new JTable(datoColumna5,titColumna5);
				
			 table_k14.setShowHorizontalLines( true );
			    table_k14.setRowSelectionAllowed( true );
			    table_k14.setColumnSelectionAllowed( true );
			    
			  
				scrollPane_k14.setViewportView(table_k14);
				
				
							int micorredor=0;
							
							for(int y=0;y<datoColumna5.length;y++){
								  for(int W=0;W<datoColumna5.length;W++){

									  datoColumna5[y][W]=String.valueOf(valor(lista_tabla1).get(micorredor));
									  micorredor++;
								  }   }			}

	  
	  public void crearTabla15(){ 
			table_k15 = new JTable(datoColumna4,titColumna4);
			 table_k15.setShowHorizontalLines( true );
			    table_k15.setRowSelectionAllowed( true );
			    table_k15.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    table_k15.setSelectionForeground( Color.white );
			    table_k15.setSelectionBackground( Color.WHITE );
			    table_k15.setEnabled(false);
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			scrollPane_k15.setViewportView(table_k15);
			}
	  
	  
	  public void crearTablak16(){ 

			table_k16 = new JTable(datoColumna5,titColumna5);
				
			 table_k16.setShowHorizontalLines( true );
			    table_k16.setRowSelectionAllowed( true );
			    table_k16.setColumnSelectionAllowed( true );
			    
			  
				scrollPane_k16.setViewportView(table_k16);
				
				
							int micorredor=0;
							
							for(int y=0;y<datoColumna5.length;y++){
								  for(int W=0;W<datoColumna5.length;W++){

									  datoColumna5[y][W]=String.valueOf(valor(lista_tabla1).get(micorredor));
									  micorredor++;
								  }  
							  }	
			}
	  
	  
	  
	  public void cambiar_celdask3(int columnas, int filas){
			String valor_alterado;
			int columna_seleccionada=table_k11.getSelectedColumn();
			int fila_seleccionada=table_k11.getSelectedRow();
			System.out.println(columna_seleccionada+" "+fila_seleccionada);
			try {
				//table_1.getModel().addTableModelListener(table_1);
				table_k11.getCellEditor().stopCellEditing();
				String valor_cambiado = String.valueOf(table_k11.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
				//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
				System.out.println("Valor "+valor_cambiado);
				valor_alterado=invertirString(valor_cambiado);
				table_k11.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}

	  
	  public void setear1entabla_k(){
			int columna_seleccionada=table_k11.getColumnCount();
			for (int i = 0; i < columna_seleccionada; i++) {
				System.out.println(i);
				table_k11.setValueAt("1/1", i, i);
			}
			
		}
	  
	  


	  public void cuadrada(){
		
		  Operaciones obj=new Operaciones();
			obj.matriz_principal(valore_real1(lista_tabla1,table_k16.getColumnCount(), table_k16.getRowCount()),table_k16.getColumnCount(), table_k16.getRowCount());
			table_k17.setModel(obj.recibirmodelo());
			ponderacion_k(obj.suma_filas());
			
		  
		  
	  }
	 
	  
	  public void ponderacion_k(double[] A){
			for (int i = 0; i < A.length; i++) {
				String vectnew[]={""+A[i]};
				modk1.addRow(vectnew);
			}
			table_k18.setModel(modk1);
			
			
			double [] B=ponderacion(A, A.length);
			for (int i = 0; i < B.length; i++) {
				String vectnew[]={""+B[i]};
				modk2.addRow(vectnew);
			}
			table_k19.setModel(modk2);
					
		}
	  
	  
	  
	  
	  //alternativas
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
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
			    // automática
			scrollPane_1.setViewportView(table_1);
			}
	  
	   
	  
	  public void crearTabla12(){ 
			table_b1 = new JTable(datoColumna5,titColumna5);
			 table_b1.setShowHorizontalLines( true );
			 table_b1.setRowSelectionAllowed( true );
			 table_b1.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			 table_b1.setSelectionForeground( Color.white );
			 table_b1.setSelectionBackground( Color.WHITE );
			 table_b1.setEnabled(false);
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			 scrollPane_b1.setViewportView(table_b1);
			 
			}
	  
	  public void crearTabla12_B(){ 
			table_b3 = new JTable(datoColumna5,titColumna5);
			table_b3.setShowHorizontalLines( true );
			table_b3.setRowSelectionAllowed( true );
			table_b3.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			table_b3.setSelectionForeground( Color.white );
			table_b3.setSelectionBackground( Color.WHITE );
			table_b3.setEnabled(false);
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			 scrollPane_b3.setViewportView(table_b3);
			 
			}
	  
	  
	  
	  
	  public void crearTabla5(){ 
			table_k5 = new JTable(datoColumna2,titColumna1);
			 table_k5.setShowHorizontalLines( true );
			    table_k5.setRowSelectionAllowed( true );
			    table_k5.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    table_k5.setSelectionForeground( Color.white );
			    table_k5.setSelectionBackground( Color.WHITE );
			    table_k5.setEnabled(false);
			// Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			scrollPane_4.setViewportView(table_k5);
			}
	  
	  public void crearTabla_7j(){ 
			table_7 = new JTable(datoColumna1,titColumna);
			 table_7.setShowHorizontalLines( true );
			    table_7.setRowSelectionAllowed( true );
			    table_7.setColumnSelectionAllowed( true );
				scrollPane_7.setViewportView(table_7);
							int micorredor=0;
							for(int y=0;y<datoColumna1.length;y++){
								  for(int W=0;W<datoColumna1.length;W++){
									  datoColumna1[y][W]=String.valueOf(valor(lista_tabla).get(micorredor));
									  micorredor++;
								  }  
							  }
			}
	  
	
	  public void crearTabla6(){ 
  
			table_k6 = new JTable(datoColumna1,titColumna);
				
			 table_k6.setShowHorizontalLines( true );
			    table_k6.setRowSelectionAllowed( true );
			    table_k6.setColumnSelectionAllowed( true );
			    
			
				scrollPane_5.setViewportView(table_k6);
				
				
							int micorredor=0;
							
							for(int y=0;y<datoColumna1.length;y++){
								  for(int W=0;W<datoColumna1.length;W++){
									  datoColumna1[y][W]=String.valueOf(valor(lista_tabla).get(micorredor));
									  micorredor++;
								  }  
							  }
							
			}
	  
	  
	  
	  public void crearTabla3(){ 
			table_4 = new JTable(datoColumna2,titColumna1);
			 table_4.setShowHorizontalLines( true );
			    table_4.setRowSelectionAllowed( true );
			    table_4.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    table_4.setSelectionForeground( Color.white );
			    table_4.setSelectionBackground( Color.WHITE );
			    table_4.setEnabled(false);
			// Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			scrollPane_2.setViewportView(table_4);
			}
	  
	
	  public void crearTabla4(){ 

			table_3 = new JTable(datoColumna1,titColumna);
				
			 table_3.setShowHorizontalLines( true );
			    table_3.setRowSelectionAllowed( true );
			    table_3.setColumnSelectionAllowed( true );
			    
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
			    //table.setSelectionForeground( Color.white );
			    //table.setSelectionBackground( Color.WHITE );
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática

				scrollPane_3.setViewportView(table_3);
				
				
							int micorredor=0;
							
							for(int y=0;y<datoColumna1.length;y++){
								  for(int W=0;W<datoColumna1.length;W++){
									  datoColumna1[y][W]=String.valueOf(valor(lista_tabla).get(micorredor));
									  micorredor++;
								  }  
							  }
					
							
						
			
			}
	  
	  public void crearTabla41(){ 

			table_31 = new JTable(datoColumna11,titColumna11);
				
			 table_31.setShowHorizontalLines( true );
			    table_31.setRowSelectionAllowed( true );
			    table_31.setColumnSelectionAllowed( true );
			    
			    scrollPane_b4.setViewportView(table_31);
				
			
					
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
	  

			  
	  public void setear1entabla_b(){
			int columna_seleccionada=table_k11.getColumnCount();
			for (int i = 0; i < columna_seleccionada; i++) {
				System.out.println(i);
				table_b2.setValueAt("1/1", i, i);
			}
			
		}
	  

	  public void guardar_array(){
		  ReproducirSonido("imagenes/sound2.wav");
		  for (int i = 0; i < table.getColumnCount(); i++) {
				for (int j = 0; j < table.getRowCount(); j++) {
					lista_tabla.add(String.valueOf(table.getValueAt(i, j)));
					System.out.print(String.valueOf(table.getValueAt(i, j))+" ");
				}
				System.out.println();
			}
			Operaciones obj=new Operaciones();
			obj.matriz_principal(valore_real1(lista_tabla,table.getColumnCount(), table.getRowCount()),table.getColumnCount(), table.getRowCount());
			table_5.setModel(obj.recibirmodelo());
			recibo_vec_suma(obj.suma_filas());
			
		}
	  public void guardar_array1(){
		  ReproducirSonido("imagenes/sound2.wav");
			for (int i = 0; i < table_k11.getColumnCount(); i++) {
				for (int j = 0; j < table_k11.getRowCount(); j++) {
					lista_tabla1.add(String.valueOf(table_k11.getValueAt(i, j)));
					System.out.print(String.valueOf(table_k11.getValueAt(i, j))+" ");
				}
				System.out.println();
			}


		}

		//USAR ESTE METODO PARA LAS OTRAS MATRICES DE ARRAY A TABLA
		public void de_array_a_tabla(){
			int mirecorredor=0;
			for (int i = 0; i <table_3.getColumnCount(); i++) {
				for (int j = 0; j < table_3.getRowCount(); j++) {
					
					table_3.setValueAt(valor(lista_tabla).get(mirecorredor), j, i);
					mirecorredor++;
					
				}
				
	
			}
		}
//valores reales para la matriz cuadrada
		
	

		public ArrayList<Double> valor(ArrayList<String> nu ){
			ArrayList<Double> valor=new ArrayList<Double>();
			
			double a = 0;
			char[] c;
			double n1,n2;

			for(int p=0;p<nu.size();p++){
				
				c = nu.get(p).toCharArray();
				
				

				n1=Double.parseDouble(String.valueOf(c[0]));

				n2=Double.parseDouble(String.valueOf(c[2]));
				a= (double)Math.round((n1/n2)*100)/100;
			valor.add(a);

				}

			return valor;
		}
		
public double[][] valore_real1(ArrayList<String> nu, int filas,int columnas){
			ArrayList<Double> numeros1 = new ArrayList<Double>();
			
			double a = 0;
			char[] c;
			double m[][]=new double[filas][columnas];
			double n1,n2;

			for(int p=0;p<nu.size();p++){
				c = nu.get(p).toCharArray();
				n1=Double.parseDouble(String.valueOf(c[0]));
				n2=Double.parseDouble(String.valueOf(c[2]));
				a= (n1/n2);
			numeros1.add(a);
				}
			//System.out.println(numeros1);
			int y,k,w;
			w=0;
			for( y=0;y<m.length;y++){
				for( k=0;k<m[y].length;k++){
					m[y][k]=numeros1.get(w);
					w=w+1;
				}
			}
			return m;
		}

public double [] ponderacion(double [] vector,int lon){
	double d,acum=0;
	double [] resp =new double[lon];
	
	for(int w=0;w<vector.length;w++){
		acum=acum+vector[w];	
	}
	
for(int s=0;s<vector.length;s++){
	d=Double.parseDouble(String.valueOf(vector[s]));
	resp[s]=(d/acum);	
	}
	return resp;
}

public void recibo_vec_suma(double[] A){
	for (int i = 0; i < A.length; i++) {
		String vectnew[]={""+A[i]};
		mod7.addRow(vectnew);
	}
	table_7.setModel(mod7);
	
	
	double [] B=ponderacion(A, A.length);
	for (int i = 0; i < B.length; i++) {
		String vectnew[]={""+B[i]};
		mod8.addRow(vectnew);
	}
	table_8.setModel(mod8);
			
}



		// METODO SONIDO
		 public void ReproducirSonido(String nombreSonido){
		       try {
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		       } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
		         System.out.println("Error al reproducir el sonido.");
		       }
		     }
		 
		 public void controlTabedPanes(){
			 
			 for (int i = 0; i < total_alternativas; i++) {
				
				 switch(i){
				 case 0:
					 tabbedPane_1.setEnabledAt(0, true);
					 tabbedPane_1.setTitleAt(0, array1.get(0));
					 break;
				 case 1:
					 tabbedPane_1.setEnabledAt(1, true);
					 tabbedPane_1.setTitleAt(1, array1.get(1));
					 break;
				 case 2:
					 tabbedPane_1.setEnabledAt(2, true);
					 tabbedPane_1.setTitleAt(2, array1.get(2));
					 break;
				 case 3:
					 tabbedPane_1.setEnabledAt(3, true);
					 tabbedPane_1.setTitleAt(3, array1.get(3));
					 break;
				 case 4:
					 tabbedPane_1.setEnabledAt(4, true);
					 tabbedPane_1.setTitleAt(4, array1.get(4));
					 break;
				 case 5:
					 tabbedPane_1.setEnabledAt(5, true);
					 tabbedPane_1.setTitleAt(5, array1.get(5));
					 break;
				 case 6:
					 tabbedPane_1.setEnabledAt(6, true);
					 tabbedPane_1.setTitleAt(6, array1.get(6));
					 break;
				 case 7:
					 tabbedPane_1.setEnabledAt(7, true);
					 tabbedPane_1.setTitleAt(7, array1.get(7));
					 break;
					 
				 case 8:
					 tabbedPane_1.setEnabledAt(8, true);
					 tabbedPane_1.setTitleAt(8, array1.get(8));
					 break;
					 
				 case 9:
					 tabbedPane_1.setEnabledAt(9, true);
					 tabbedPane_1.setTitleAt(9, array1.get(9));
					 break;
				 default:
						 break;
				 }
				 
			}
		 }
}