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
	public String titColumna3j[];//jairo
	public String titColumna31[];
	
	public String datoColumnaUlt[][];
	public String titColumnaUlt[];

	public String datoColumnaUlt2[][];
	public String titColumnaUlt2[];
	
	public String titColumna4[];
	public String titColumna4j[];//jairo
	public String titColumna5[];
	public String titColumna5j[];//jairo
	public String datoColumna2[][];
	  public String datoColumna[][];
	  public String datoColumna1[][];
	  public String datoColumna11[][];

	  public String datoColumna3[][];
	  public String datoColumna3j[][];//jairo
	  public String datoColumna31[][];
	  public String datoColumna4[][];

	  public String datoColumna4j[][];//jairo
	  
	  public String datoColumna3_m[][];
	  public String datoColumna5_m[][];
	  public String datoColumna4_m[][];
	  
	  public String datoColumna3_b[][];
	  public String datoColumna5_b[][];
	  public String datoColumna4_b[][];
	  public String datoColumna5[][];
	  
	  public String datoColumna5j[][];//jairo
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
	private ArrayList<String> lista_tabla1m;
	private ArrayList<String> lista_ponderaciones;
	private ArrayList<Double> lista_doble_ponderacion;
	
	private ArrayList<Double> vector_AR_ponderacion;

	private ArrayList<String> lista_tabla1b;
	private ArrayList<String> lista_tabla2;//Jhon
	private ArrayList<String> lista_tabla3;//Jairo
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
	
	private DefaultTableModel modk1_ja=new DefaultTableModel(matriz,vector);//jairo
	private DefaultTableModel modk2_ja=new DefaultTableModel(matriz,vector);//jairo

	private DefaultTableModel modm1=new DefaultTableModel(matriz,vector);
	private DefaultTableModel modm2=new DefaultTableModel(matriz,vector);
	private DefaultTableModel modb1=new DefaultTableModel(matriz,vector);
	private DefaultTableModel modb2=new DefaultTableModel(matriz,vector);
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
	private JPanel panel_m9;

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
	private JButton IGUAL;
	private JButton MARY;
	private JScrollPane scrollPane_k18;
	private JScrollPane scrollPane_k19;
	private JTable table_k18;
	private JTable table_k19;

	//VARIABLES JHON
	private double[][] MatPonderaciones;
	private String[][] stringPonderaciones;
	
	private DefaultTableModel modjh1=new DefaultTableModel(matriz,vector);
	private DefaultTableModel modjh2=new DefaultTableModel(matriz,vector);
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
	private JButton button_jh13;
	private JScrollPane scrollPane_jh12;
	private JScrollPane scrollPane_jh13;
	private JScrollPane scrollPane_jh14;
	private JScrollPane scrollPane_jh15;
	private JScrollPane scrollPane_jh16;
	private JScrollPane scrollPane_jh17;
	private JTable table_j10;
	private JTable table_j11;

	private JTable table_j13;
	private JTable table_j14;
	private JTable table_j15;
	private JTable table_j16;
	private JTable table_j17;

	private JTable table_j18;
	private JTable table_j19;
	private JScrollPane scrollPane_m9;
	private JTable table_m10;
	private JScrollPane scrollPane_m13;
	private JScrollPane scrollPane_m14;
	private JScrollPane scrollPane_m15;
	private JScrollPane scrollPane_m16;
	private JScrollPane scrollPane_m19;
	private JScrollPane scrollPane_m18;
	private JScrollPane scrollPane_m17;
	private JButton igual_5;
	private JTable table_66;
	private JTable table_m13;
	private JTable table_m14;
	private JTable table_m15;
	private JTable table_m16;
	private JTable table_m19;
	private JTable table_m18;
	private JTable table_m17;
	public String titColumnaj3[];
	public String titColumnaj4[];
	public String titColumnaj5[];
	

	public String titColumna3_m[];
	public String titColumna4_m[];
	public String titColumna5_m[];
	

	public String titColumna3_b[];
	public String titColumna4_b[];
	public String titColumna5_b[];
	public String datoColumnaj3[][];
	public String datoColumnaj4[][];
	public String datoColumnaj5[][];
	private JScrollPane scrollPane_m10;
	private JTable table_m11;
	private JLabel lblEvaluacinAlternativas;
	private JLabel lblPasarANmeros;
	private JLabel lblObtencinMatrizCuadrada;
	private JLabel lblSumaFilas;
	private JLabel lblPonderacin_1;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton button_20;
	private JLabel label_3;
	private JButton button_19;
	private JButton button_18;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JButton button_22;
	private JButton button_23;
	private JButton button_21;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JButton button_26;
	private JLabel label_14;
	private JButton button_27;
	private JButton button_25;
	private JScrollPane scrollPane_b9;
	private JScrollPane scrollPane_b10;
	private JButton button_12;
	private JScrollPane scrollPane_b13;
	private JScrollPane scrollPane_b14;
	private JScrollPane scrollPane_b17;
	private JScrollPane scrollPane_b18;
	private JScrollPane scrollPane_b19;
	private JScrollPane scrollPane_b15;
	private JScrollPane scrollPane_b16;
	private JTable table_b10;
	private JTable table_b11;
	private JTable table_b13;
	private JTable table_b17;
	private JTable table_b14;
	private JTable table_b15;
	private JTable table_b16;
	private JTable table_b18;
	private JTable table_b19;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JButton button_29;
	private JButton button_28;
	private JButton button_30;
	private JLabel label_18;
	private JLabel label_19;
	private JScrollPane scrollPane_ultima1;
	private JScrollPane scrollPane_ultima2;
	private JTable tableUltima1;
	private JTable tableUltima2;


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
		lista_tabla1m = new ArrayList<String>();
		lista_tabla1b = new ArrayList<String>();
		
		lista_tabla2 = new ArrayList<String>(); // JHON
		lista_tabla3 = new ArrayList<String>(); // JAIRO
		lista_ponderaciones = new ArrayList<String>();;
		lista_doble_ponderacion = new ArrayList<Double>();
		vector_AR_ponderacion= new ArrayList<Double>();
		
		
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
								    
								    
								    
								    
								  
									//METODOS JHONSIN
								    CreaColumnasjh3();
								    CargaDatosjh3();
								    crearTablajh9();
								    crearTablajh11();

								    //FIN JHON
								    
								    //INICIO JAIRO
								    CreaColumnas3j();
								    CargaDatos3j();
								    crearTabla9j();
								    crearTabla11j();
								    
									    

									 CargaDatos4();
									   CreaColumnas4();
									    crearTabla11();
									 
										   
										 
										   
										   
										   CargaDatos5();
										   CreaColumnas5();
										   
										   
										 
										   CreaColumnas11();
										   CargaDatos11();
									    
										   ////maryyyyy 
										   CargaDatos4_m();
										   CreaColumnas4_m();
										       CreaColumnas3_m();
										    CargaDatos3_m();
										    crearTabla9m();
										    crearTabla11m();
										    


											   ////didi
											   CargaDatos4_b();
											   CreaColumnas4_b();
											       CreaColumnas3_b();
											    CargaDatos3_b();
											    crearTabla9b();
											    crearTabla11b();
											      
											    
											 

											
											   
											    ///////////////
											    
											    CargaDatosUlt2();
											    CargaDatosUlt();
											    CreaColumnasUlt2();
											    CreaColumnasUlt();
											    
											    crearTablaUltimaFilas();
											    crearTablaUltimaColumnas();
											    
										    

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
		
		
		
		 scrollPane_k9 = new JScrollPane();
		scrollPane_k9.setBounds(10, 58, 78, 149);
		panel_5.add(scrollPane_k9);
		
		table_k10 = new JTable();
		scrollPane_k9.setViewportView(table_k10);
		
		scrollPane_k10 = new JScrollPane();
		scrollPane_k10.setBounds(98, 58, 257, 149);
		panel_5.add(scrollPane_k10);
		
		table_k11 = new JTable();
		scrollPane_k10.setViewportView(table_k11);
		
		 scrollPane_k13 = new JScrollPane();
		scrollPane_k13.setBounds(437, 58, 49, 149);
		panel_5.add(scrollPane_k13);
		
		table_k13 = new JTable();
		scrollPane_k13.setViewportView(table_k13);
		
		 scrollPane_k14 = new JScrollPane();
		scrollPane_k14.setBounds(496, 58, 257, 149);
		panel_5.add(scrollPane_k14);
		
		table_k14 = new JTable();
		scrollPane_k14.setViewportView(table_k14);
		
		scrollPane_k15 = new JScrollPane();
		scrollPane_k15.setBounds(824, 58, 49, 149);
		panel_5.add(scrollPane_k15);
		
		table_k15 = new JTable();
		scrollPane_k15.setViewportView(table_k15);
		
		 scrollPane_k16 = new JScrollPane();
		scrollPane_k16.setBounds(883, 58, 257, 149);
		panel_5.add(scrollPane_k16);
		
		table_k16 = new JTable();
		scrollPane_k16.setViewportView(table_k16);
		
		JButton button_8;
		IGUAL = new JButton("");
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
		IGUAL.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		IGUAL.setBounds(365, 118, 49, 41);
		panel_5.add(IGUAL);
		
		JScrollPane scrollPane_k17 = new JScrollPane();
		scrollPane_k17.setBounds(129, 291, 384, 186);
		panel_5.add(scrollPane_k17);
		
		table_k17 = new JTable();
		table_j17 = new JTable(); //JHON
		table_m17 = new JTable(); //JHON
		scrollPane_k17.setViewportView(table_k17);
		
		scrollPane_k18 = new JScrollPane();
		scrollPane_k18.setBounds(646, 291, 107, 186);
		panel_5.add(scrollPane_k18);
		
		table_k18 = new JTable();
		table_j18 = new JTable(); //JHON
		table_m18 = new JTable(); //JHON
		
		scrollPane_k18.setViewportView(table_k18);
		
		scrollPane_k19 = new JScrollPane();
		scrollPane_k19.setBounds(850, 281, 107, 186);
		panel_5.add(scrollPane_k19);
		
		table_k19 = new JTable();
		table_j19 = new JTable(); //JHON
		table_m19 = new JTable(); //JHON
		
		scrollPane_k19.setViewportView(table_k19);
		
		label = new JLabel("Evaluaci\u00F3n alternativas:");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(98, 15, 189, 45);
		panel_5.add(label);
		
		label_1 = new JLabel("Obtenci\u00F3n Matriz Cuadrada:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_1.setBounds(217, 239, 249, 45);
		panel_5.add(label_1);
		
		label_2 = new JLabel("Pasar a n\u00FAmeros reales:");
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_2.setBounds(702, 11, 189, 45);
		panel_5.add(label_2);
		
		button_20 = new JButton("");
		button_20.setBounds(763, 114, 49, 45);
		button_20.setIcon(new ImageIcon(".\\imagenes\\multi.png"));
		panel_5.add(button_20);
		
		label_3 = new JLabel("Suma filas:");
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_3.setBounds(646, 239, 107, 45);
		panel_5.add(label_3);
		
		button_19 = new JButton("");
		button_19.setBounds(557, 357, 49, 45);
		button_19.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_5.add(button_19);
		
		button_18 = new JButton("");
		button_18.setBounds(785, 357, 49, 45);
		button_18.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_5.add(button_18);
		
		label_4 = new JLabel("Ponderaci\u00F3n:");
		label_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_4.setBounds(850, 239, 107, 45);
		panel_5.add(label_4);
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
		
		scrollPane_b9 = new JScrollPane();
		scrollPane_b9.setBounds(10, 63, 78, 149);
		panel_6.add(scrollPane_b9);
		
		table_b10 = new JTable();
		scrollPane_b9.setViewportView(table_b10);
		
		scrollPane_b10 = new JScrollPane();
		scrollPane_b10.setBounds(98, 63, 257, 149);
		panel_6.add(scrollPane_b10);
		
		table_b11 = new JTable();
		scrollPane_b10.setViewportView(table_b11);
		
		scrollPane_b13 = new JScrollPane();
		scrollPane_b13.setBounds(438, 63, 49, 149);
		panel_6.add(scrollPane_b13);
		
		table_b13 = new JTable();
		scrollPane_b13.setViewportView(table_b13);
		
		button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar_arrayb1();
				 CargaDatos4_b();
				   CreaColumnas4_b();
				    crearTabla13b();
				    crearTablam14b();
				    crearTabla15b();
				  crearTablak16b();
				  
				  cuadradab();
			}
		});
		button_12.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		button_12.setBounds(365, 119, 55, 39);
		panel_6.add(button_12);
		
		scrollPane_b14 = new JScrollPane();
		scrollPane_b14.setBounds(497, 63, 257, 149);
		panel_6.add(scrollPane_b14);
		
		table_b14 = new JTable();
		scrollPane_b14.setViewportView(table_b14);
		
		scrollPane_b17 = new JScrollPane();
		scrollPane_b17.setBounds(179, 291, 384, 186);
		panel_6.add(scrollPane_b17);
		
		table_b17 = new JTable();
		scrollPane_b17.setViewportView(table_b17);
		
		scrollPane_b18 = new JScrollPane();
		scrollPane_b18.setBounds(669, 291, 107, 186);
		panel_6.add(scrollPane_b18);
		
		table_b18 = new JTable();
		scrollPane_b18.setViewportView(table_b18);
		
		scrollPane_b19 = new JScrollPane();
		scrollPane_b19.setBounds(856, 291, 107, 186);
		panel_6.add(scrollPane_b19);
		
		table_b19 = new JTable();
		scrollPane_b19.setViewportView(table_b19);
		
		scrollPane_b15 = new JScrollPane();
		scrollPane_b15.setBounds(824, 63, 49, 149);
		panel_6.add(scrollPane_b15);
		
		table_b15 = new JTable();
		scrollPane_b15.setViewportView(table_b15);
		
		scrollPane_b16 = new JScrollPane();
		scrollPane_b16.setBounds(883, 63, 257, 149);
		panel_6.add(scrollPane_b16);
		
		table_b16 = new JTable();
		scrollPane_b16.setViewportView(table_b16);
		
		label_15 = new JLabel("Evaluaci\u00F3n alternativas:");
		label_15.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_15.setBounds(108, 15, 189, 45);
		panel_6.add(label_15);
		
		label_16 = new JLabel("Obtenci\u00F3n Matriz Cuadrada:");
		label_16.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_16.setBounds(227, 239, 249, 45);
		panel_6.add(label_16);
		
		label_17 = new JLabel("Suma filas:");
		label_17.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_17.setBounds(669, 232, 107, 45);
		panel_6.add(label_17);
		
		button_29 = new JButton("");
		button_29.setBounds(588, 357, 49, 45);
		button_29.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_6.add(button_29);
		
		button_28 = new JButton("");
		button_28.setIcon(new ImageIcon(".\\imagenes\\multi.png"));
		button_28.setBounds(764, 119, 49, 45);
		panel_6.add(button_28);
		
		button_30 = new JButton("");
		button_30.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		button_30.setBounds(786, 357, 49, 45);
		panel_6.add(button_30);
		
		label_18 = new JLabel("Ponderaci\u00F3n:");
		label_18.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_18.setBounds(849, 232, 107, 45);
		panel_6.add(label_18);
		
		label_19 = new JLabel("Pasar a n\u00FAmeros reales:");
		label_19.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_19.setBounds(712, 11, 189, 45);
		panel_6.add(label_19);
		panel_7.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 3", null, panel_7, null);
		panel_7.setLayout(null);
		
		scrollPane_20j = new JScrollPane();
		scrollPane_20j.setBounds(10, 61, 78, 149);
		panel_7.add(scrollPane_20j);
		
		table_20j = new JTable();
		scrollPane_20j.setColumnHeaderView(table_20j);
		
		scrollPane_21j = new JScrollPane();
		scrollPane_21j.setBounds(98, 61, 257, 149);
		panel_7.add(scrollPane_21j);
		
		table_21j = new JTable();
		scrollPane_21j.setColumnHeaderView(table_21j);
		
		scrollPane_22j = new JScrollPane();
		scrollPane_22j.setBounds(422, 61, 49, 149);
		panel_7.add(scrollPane_22j);
		
		table_22j = new JTable();
		scrollPane_22j.setColumnHeaderView(table_22j);
		
		scrollPane_23j = new JScrollPane();
		scrollPane_23j.setBounds(487, 61, 257, 149);
		panel_7.add(scrollPane_23j);
		
		table_23j = new JTable();
		scrollPane_23j.setColumnHeaderView(table_23j);
		
		scrollPane_24j = new JScrollPane();
		scrollPane_24j.setBounds(824, 61, 49, 149);
		panel_7.add(scrollPane_24j);
		
		table_24j = new JTable();
		scrollPane_24j.setColumnHeaderView(table_24j);
		
		scrollPane_25j = new JScrollPane();
		scrollPane_25j.setBounds(883, 61, 257, 149);
		panel_7.add(scrollPane_25j);
		
		table_25j = new JTable();
		scrollPane_25j.setColumnHeaderView(table_25j);
		
		scrollPane_26j = new JScrollPane();
		scrollPane_26j.setBounds(116, 291, 384, 186);
		panel_7.add(scrollPane_26j);
		
		table_26j = new JTable();
		scrollPane_26j.setColumnHeaderView(table_26j);
		
		scrollPane_27j = new JScrollPane();
		scrollPane_27j.setBounds(615, 291, 107, 186);
		panel_7.add(scrollPane_27j);
		
		table_27j = new JTable();
		scrollPane_27j.setColumnHeaderView(table_27j);
		
		scrollPane_28j = new JScrollPane();
		scrollPane_28j.setBounds(795, 291, 107, 186);
		panel_7.add(scrollPane_28j);
		
		table_28j = new JTable();
		scrollPane_28j.setColumnHeaderView(table_28j);
		
		button_20j = new JButton("");
		button_20j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar_array1ja();
				CargaDatos4j();
				CreaColumnas4j();
				crearTabla13j();
				crearTabla14j();
				crearTabla15j();
				crearTabla16j();
				cuadradaja();
			}
		});
		button_20j.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		button_20j.setBounds(365, 115, 47, 36);
		panel_7.add(button_20j);
		
		label_10 = new JLabel("Evaluaci\u00F3n alternativas:");
		label_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_10.setBounds(63, 11, 189, 45);
		panel_7.add(label_10);
		
		label_11 = new JLabel("Pasar a n\u00FAmeros reales:");
		label_11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_11.setBounds(658, 11, 189, 45);
		panel_7.add(label_11);
		
		label_12 = new JLabel("Obtenci\u00F3n Matriz Cuadrada:");
		label_12.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_12.setBounds(173, 239, 249, 45);
		panel_7.add(label_12);
		
		label_13 = new JLabel("Suma filas:");
		label_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_13.setBounds(615, 232, 107, 45);
		panel_7.add(label_13);
		
		button_26 = new JButton("");
		button_26.setBounds(754, 121, 49, 45);
		button_26.setIcon(new ImageIcon(".\\imagenes\\multi.png"));
		panel_7.add(button_26);
		
		label_14 = new JLabel("Ponderaci\u00F3n:");
		label_14.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_14.setBounds(795, 232, 107, 45);
		panel_7.add(label_14);
		
		button_27 = new JButton("");
		button_27.setBounds(732, 357, 49, 45);
		button_27.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_7.add(button_27);
		
		button_25 = new JButton("");
		button_25.setBounds(526, 357, 49, 45);
		button_25.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_7.add(button_25);
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(240, 248, 255));
		panel_10.setVisible(false);
		
		panel_m9 = new JPanel();
		panel_m9.setBackground(new Color(240, 248, 255));
		panel_m9.setVisible(false);
		
		panel_8 = new JPanel();
		panel_8.setBackground(new Color(240, 248, 255));
		panel_8.setVisible(false);
		panel_8.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 4", null, panel_8, null);
		tabbedPane_1.setEnabledAt(3, false);
		panel_8.setLayout(null);
		
		scrollPane_jh9 = new JScrollPane();
		scrollPane_jh9.setBounds(10, 72, 78, 149);
		panel_8.add(scrollPane_jh9);
		
		scrollPane_jh10 = new JScrollPane();
		scrollPane_jh10.setBounds(98, 72, 257, 149);
		panel_8.add(scrollPane_jh10);
		
		scrollPane_jh11 = new JScrollPane();
		scrollPane_jh11.setBounds(160, 291, 384, 186);
		panel_8.add(scrollPane_jh11);
		
		button_jh13 = new JButton("");
		button_jh13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				calcular_igual_alt4();
				
			}
		});
		button_jh13.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		button_jh13.setBounds(364, 122, 54, 37);
		panel_8.add(button_jh13);
		
		scrollPane_jh12 = new JScrollPane();
		scrollPane_jh12.setBounds(428, 72, 49, 149);
		panel_8.add(scrollPane_jh12);
		
		scrollPane_jh13 = new JScrollPane();
		scrollPane_jh13.setBounds(487, 72, 257, 149);
		panel_8.add(scrollPane_jh13);
		
		scrollPane_jh14 = new JScrollPane();
		scrollPane_jh14.setBounds(659, 291, 107, 186);
		panel_8.add(scrollPane_jh14);
		
		scrollPane_jh15 = new JScrollPane();
		scrollPane_jh15.setBounds(839, 291, 107, 186);
		panel_8.add(scrollPane_jh15);
		
		scrollPane_jh16 = new JScrollPane();
		scrollPane_jh16.setBounds(817, 72, 49, 149);
		panel_8.add(scrollPane_jh16);
		
		scrollPane_jh17 = new JScrollPane();
		scrollPane_jh17.setBounds(883, 72, 257, 149);
		panel_8.add(scrollPane_jh17);
		
		label_5 = new JLabel("Ponderaci\u00F3n:");
		label_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_5.setBounds(839, 232, 107, 45);
		panel_8.add(label_5);
		
		label_6 = new JLabel("Suma filas:");
		label_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_6.setBounds(659, 232, 107, 45);
		panel_8.add(label_6);
		
		label_7 = new JLabel("Obtenci\u00F3n Matriz Cuadrada:");
		label_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_7.setBounds(217, 239, 249, 45);
		panel_8.add(label_7);
		
		button_22 = new JButton("");
		button_22.setBounds(570, 357, 49, 45);
		button_22.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_8.add(button_22);
		
		button_23 = new JButton("");
		button_23.setBounds(776, 357, 49, 45);
		button_23.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_8.add(button_23);
		
		button_21 = new JButton("");
		button_21.setBounds(758, 122, 49, 45);
		button_21.setIcon(new ImageIcon(".\\imagenes\\multi.png"));
		panel_8.add(button_21);
		
		label_8 = new JLabel("Pasar a n\u00FAmeros reales:");
		label_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_8.setBounds(702, 11, 189, 45);
		panel_8.add(label_8);
		
		label_9 = new JLabel("Evaluaci\u00F3n alternativas:");
		label_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label_9.setBounds(98, 15, 189, 45);
		panel_8.add(label_9);
		panel_m9.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 5", null, panel_m9, null);
		tabbedPane_1.setEnabledAt(4, false);
		panel_m9.setLayout(null);
		
		scrollPane_m9 = new JScrollPane();
		scrollPane_m9.setBounds(24, 63, 78, 149);
		panel_m9.add(scrollPane_m9);
		
		table_m10 = new JTable();
		scrollPane_m9.setViewportView(table_m10);
		
		scrollPane_m13 = new JScrollPane();
		scrollPane_m13.setBounds(444, 63, 49, 149);
		panel_m9.add(scrollPane_m13);
		
		table_m13 = new JTable();
		scrollPane_m13.setViewportView(table_m13);
		
		scrollPane_m14 = new JScrollPane();
		scrollPane_m14.setBounds(504, 63, 257, 149);
		panel_m9.add(scrollPane_m14);
		
		table_m14 = new JTable();
		scrollPane_m14.setViewportView(table_m14);
		
		scrollPane_m15 = new JScrollPane();
		scrollPane_m15.setBounds(824, 63, 49, 149);
		panel_m9.add(scrollPane_m15);
		
		table_m15 = new JTable();
		scrollPane_m15.setViewportView(table_m15);
		
		scrollPane_m16 = new JScrollPane();
		scrollPane_m16.setBounds(883, 63, 257, 149);
		panel_m9.add(scrollPane_m16);
		
		table_m16 = new JTable();
		scrollPane_m16.setViewportView(table_m16);
		
		scrollPane_m19 = new JScrollPane();
		scrollPane_m19.setBounds(850, 291, 107, 186);
		panel_m9.add(scrollPane_m19);
		
		table_m19 = new JTable();
		scrollPane_m19.setViewportView(table_m19);
		
		scrollPane_m18 = new JScrollPane();
		scrollPane_m18.setBounds(618, 291, 107, 186);
		panel_m9.add(scrollPane_m18);
		
		table_m18 = new JTable();
		scrollPane_m18.setViewportView(table_m18);
		
		scrollPane_m17 = new JScrollPane();
		scrollPane_m17.setBounds(129, 291, 384, 186);
		panel_m9.add(scrollPane_m17);
		
		table_m17 = new JTable();
		scrollPane_m17.setViewportView(table_m17);
		
		igual_5 = new JButton("");
		igual_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		igual_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				guardar_arraym1();
				 CargaDatos4_m();
				   CreaColumnas4_m();
				    crearTabla13m();
				    crearTablam14m();
				    crearTabla15m();
				  crearTablak16m();
				  
				  cuadradam();
				  
			}
		});
		igual_5.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		igual_5.setBounds(379, 117, 55, 45);
		panel_m9.add(igual_5);
		
		scrollPane_m10 = new JScrollPane();
		scrollPane_m10.setBounds(112, 63, 257, 149);
		panel_m9.add(scrollPane_m10);
		
		table_m11 = new JTable();
		scrollPane_m10.setViewportView(table_m11);
		
		lblEvaluacinAlternativas = new JLabel("Evaluaci\u00F3n alternativas:");
		lblEvaluacinAlternativas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblEvaluacinAlternativas.setBounds(84, 11, 189, 45);
		panel_m9.add(lblEvaluacinAlternativas);
		
		lblPasarANmeros = new JLabel("Pasar a n\u00FAmeros reales:");
		lblPasarANmeros.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblPasarANmeros.setBounds(688, 7, 189, 45);
		panel_m9.add(lblPasarANmeros);
		
		lblObtencinMatrizCuadrada = new JLabel("Obtenci\u00F3n Matriz Cuadrada:");
		lblObtencinMatrizCuadrada.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblObtencinMatrizCuadrada.setBounds(203, 235, 249, 45);
		panel_m9.add(lblObtencinMatrizCuadrada);
		
		lblSumaFilas = new JLabel("Suma filas:");
		lblSumaFilas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblSumaFilas.setBounds(618, 235, 107, 45);
		panel_m9.add(lblSumaFilas);
		
		lblPonderacin_1 = new JLabel("Ponderaci\u00F3n:");
		lblPonderacin_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblPonderacin_1.setBounds(850, 235, 107, 45);
		panel_m9.add(lblPonderacin_1);
		
		button_15 = new JButton("");
		button_15.setBounds(771, 117, 49, 45);
		button_15.setIcon(new ImageIcon(".\\imagenes\\multi.png"));
		panel_m9.add(button_15);
		panel_10.setEnabled(false);
		tabbedPane_1.addTab("Alternativa 6", null, panel_10, null);
		panel_10.setLayout(null);
		
		button_16 = new JButton("");
		button_16.setBounds(543, 353, 49, 45);
		button_16.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
		panel_m9.add(button_16);
		
		button_17 = new JButton("");
		button_17.setBounds(771, 353, 49, 45);
		panel_m9.add(button_17);
		panel_10.setEnabled(false);
		button_17.setIcon(new ImageIcon(".\\imagenes\\igual.png"));
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
		tabbedPane_1.setEnabledAt(5, false);
		tabbedPane_1.setEnabledAt(6, false);
		tabbedPane_1.setEnabledAt(7, false);
		tabbedPane_1.setEnabledAt(8, false);
		tabbedPane_1.setEnabledAt(9, false);
		
		Button button_7 = new Button("PROCESAR");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				leerArrayPonderacion(array1.size());
			}
		});
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
		
		scrollPane_ultima1 = new JScrollPane();
		scrollPane_ultima1.setBounds(235, 351, 137, 214);
		panel_15.add(scrollPane_ultima1);
		
		tableUltima2 = new JTable();
		scrollPane_ultima1.setViewportView(tableUltima2);
		
		scrollPane_ultima2 = new JScrollPane();
		scrollPane_ultima2.setBackground(new Color(224, 255, 255));
		scrollPane_ultima2.setBounds(416, 351, 422, 214);
		panel_15.add(scrollPane_ultima2);
		
		tableUltima1 = new JTable();
		scrollPane_ultima2.setColumnHeaderView(tableUltima1);
	}
	public void CreaColumnas() {
		 int arr = array1.size(); 
	    titColumna = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumna[i] = array1.get(i);
	    }
	  }
	
	public void CreaColumnasUlt() {
		 int arr = array1.size(); 
	    titColumnaUlt = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumnaUlt[i] = array1.get(i);
	    }
	  }
	
	//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
	
	
	 
	 ////////////////////////////////
	 
	public void CreaColumnas11() {
		 int arr = array1.size(); 
	    titColumna11 = new String[arr];
	    
	    for( int i=0; i < arr; i++ ) {
	      titColumna11[i] = array1.get(i);
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
	
	public void CreaColumnasUlt2() {
	    titColumnaUlt2 = new String[1];
	    
	    for( int i=0; i < 1; i++ ) {
	      titColumnaUlt2[i] = "Criterios:";
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
	
	public void CreaColumnas5j(){//jairo
	    titColumna5j = new String[1];
	    
	    for( int i=0; i < 1; i++ ) {
	      titColumna5j[i] = "Criterios:";
	    }
	  }
	  // Creamos los datos para cada uno de los elementos de la tabla
	  public void CargaDatos() {
		  int arr2 = array1.size(); 
	    datoColumna = new String[arr2][arr2];
	  }
	  public void CargaDatosUlt() {
		  int arr2 = array1.size(); 
	    datoColumnaUlt = new String[arr2][arr2];
	  }
	  
	  public void CargaDatos3() {
		  int arr2 = array2.size(); 
	    datoColumna3 = new String[arr2][arr2];

	    datoColumna5 = new String[arr2][arr2];
	  }

	  
	  //VARIABLES JHON
	  public void CargaDatosjh3() {
		  int arr2 = array2.size(); 
	    datoColumnaj3 = new String[arr2][arr2];
	    datoColumnaj5 = new String[arr2][arr2];
	  }
	  
		public void CreaColumnasjh3() {
			 int arr = array2.size(); 
		    titColumnaj3 = new String[arr];
		    titColumnaj5 = new String[arr];
		    
		    for( int i=0; i < arr; i++ ) {
		      titColumnaj3[i] = array2.get(i);
		      titColumnaj5[i] = array2.get(i);
		    }
		  }
		
		public void CreaColumnasjh4() {
		    titColumnaj4 = new String[1];
		    
		    for( int i=0; i < 1; i++ ) {
		      titColumnaj4[i] = "A:";
		    }
		  }
		
		public void CargaDatosjh4() {
			  int arr2 = array2.size(); 
		    datoColumnaj4 = new String[arr2][1];
		   
		    for( int iY=0; iY < arr2; iY++ ) {
		      for( int iX=0; iX < 1; iX++ ) {
			datoColumnaj4[iY][iX] = array2.get(iY);
		      }
		    }
		  }
	  //FIN VARIABLES JHON
		
		  //VARIABLES JAIRO
		  public void CargaDatos3j() {
			  int arr2 = array2.size(); 
		    datoColumna3j = new String[arr2][arr2];
		    datoColumna5j = new String[arr2][arr2];
		  }
		  
			public void CreaColumnas3j() {
				 int arr = array2.size(); 
			    titColumna3j = new String[arr];
			    titColumna5j = new String[arr];
			    
			    for( int i=0; i < arr; i++ ) {
			      titColumna3j[i] = array2.get(i);
			      titColumna5j[i] = array2.get(i);
			    }
			  }
			
			public void CreaColumnas4j() {
			    titColumna4j = new String[1];
			    
			    for( int i=0; i < 1; i++ ) {
			      titColumna4j[i] = "A:";
			    }
			  }
			
			public void CargaDatos4j() {
				  int arr2 = array2.size(); 
			    datoColumna4j = new String[arr2][1];
			   
			    for( int iY=0; iY < arr2; iY++ ) {
			      for( int iX=0; iX < 1; iX++ ) {
				datoColumna4j[iY][iX] = array2.get(iY);
			      }
			    }
			  }
		  //FIN VARIABLES JAIRO	
	  


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
	  
	  public void CargaDatosUlt2() {
		  int arr2 = array2.size(); 
	    datoColumnaUlt2 = new String[arr2][1];
	    
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < 1; iX++ ) {
		datoColumnaUlt2[iY][iX] = array2.get(iY);
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
	  
	  public void CargaDatos5j() {
		  int arr2 = array2.size(); 
	    datoColumna5j = new String[arr2][1];
	   
	    for( int iY=0; iY < arr2; iY++ ) {
	      for( int iX=0; iX < 1; iX++ ) {
		datoColumna5j[iY][iX] = array2.get(iY);
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
	  
	  public void cambiar_celdasb1(int columnas, int filas){
			String valor_alterado;
			int columna_seleccionada=table_b2.getSelectedColumn();
			int fila_seleccionada=table_b2.getSelectedRow();
			System.out.println(columna_seleccionada+" "+fila_seleccionada);
			try {
				//table_1.getModel().addTableModelListener(table_1);
				table_b2.getCellEditor().stopCellEditing();
				String valor_cambiado = String.valueOf(table_b2.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
				//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
				System.out.println("Valor "+valor_cambiado);
				valor_alterado=invertirString(valor_cambiado);
				table_b2.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
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
	  
	   
	  public void crearTablaUltimaColumnas(){ 
			tableUltima1 = new JTable(datoColumnaUlt,titColumnaUlt){
				public boolean isCellEditable(int row, int column){
				    if(row ==column ) return false;
				    return true;
				  }
			};
			tableUltima1.setShowHorizontalLines( true );
			tableUltima1.setRowSelectionAllowed( true );
			tableUltima1.setColumnSelectionAllowed( true );
			   
			    
			    scrollPane_ultima2.setViewportView(tableUltima1);
			
			//LISTENER TABLA
			    tableUltima1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					int tam_col=tableUltima1.getColumnCount();
					int tam_fil=tableUltima1.getRowCount();
					//System.out.println(tam_col+" "+tam_fil);
					cambiar_celdasUlt(tam_col, tam_fil);
				}
				
			});
			setear1entabla();
			
			}
	  
	  
	  public void crearTablaUltimaFilas(){ 
		  tableUltima2 = new JTable(datoColumnaUlt2,titColumnaUlt2);
		  tableUltima2.setShowHorizontalLines( true );
		  tableUltima2.setRowSelectionAllowed( true );
		  tableUltima2.setColumnSelectionAllowed( true );
			    // Cambiamos el color de la zona seleccionada (rojo/blanco)
		  tableUltima2.setSelectionForeground( Color.white );
		  tableUltima2.setSelectionBackground( Color.WHITE );
		  tableUltima2.setEnabled(false);
			    // Incorporamos la tabla a un panel que incorpora ya una barra
			    // de desplazamiento, para que la visibilidad de la tabla sea
			    // automática
			    scrollPane_ultima1.setViewportView(tableUltima2);
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
	  
	  
	  public void cambiar_celdasUlt(int columnas, int filas){
			String valor_alterado;
			int columna_seleccionada=tableUltima1.getSelectedColumn();
			int fila_seleccionada=tableUltima1.getSelectedRow();
			System.out.println(columna_seleccionada+" "+fila_seleccionada);
			try {
				//table_1.getModel().addTableModelListener(table_1);
				tableUltima1.getCellEditor().stopCellEditing();
				String valor_cambiado = String.valueOf(tableUltima1.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
				//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
				System.out.println("Valor "+valor_cambiado);
				valor_alterado=invertirString(valor_cambiado);
				tableUltima1.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
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
////////////////////
	  ///////
	  //////

public void CreaColumnas3_m() {
int arr = array2.size(); 
titColumna3_m = new String[arr];
titColumna5_m = new String[arr];

for( int i=0; i < arr; i++ ) {
titColumna3_m[i] = array2.get(i);

titColumna5_m[i] = array2.get(i);
}
}

public void CreaColumnas4_m() {
titColumna4_m = new String[1];

for( int i=0; i < 1; i++ ) {
titColumna4_m[i] = "A:";
}
}

public void CreaColumnas5_m() {
titColumna5_m = new String[1];

for( int i=0; i < 1; i++ ) {
titColumna5_m[i] = "Criterios:";
}
}
////////////////////
/////////
////////


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
		 
		  public void crearTablajh11(){ 
			  System.out.println("Entro a tablajh11");
				table_j10 = new JTable(datoColumna4,titColumna4);
				 table_j10.setShowHorizontalLines( true );
				    table_j10.setRowSelectionAllowed( true );
				    table_j10.setColumnSelectionAllowed( true );
				    // Cambiamos el color de la zona seleccionada (rojo/blanco)
				    table_j10.setSelectionForeground( Color.white );
				    table_j10.setSelectionBackground( Color.WHITE );
				    table_j10.setEnabled(false);
				    // Incorporamos la tabla a un panel que incorpora ya una barra
				    // de desplazamiento, para que la visibilidad de la tabla sea
				    // automática
				scrollPane_jh9.setViewportView(table_j10);
				}
		  
		  public void crearTablajh9(){ 
				table_j11 = new JTable(datoColumnaj3,titColumnaj3){
					public boolean isCellEditable(int row, int column){
					    if(row ==column ) return false;
					    return true;
					  }
				};
				 table_j11.setShowHorizontalLines( true );
				    table_j11.setRowSelectionAllowed( true );
				    table_j11.setColumnSelectionAllowed( true );

				    
				scrollPane_jh10.setViewportView(table_j11);
				
				//LISTENER TABLA
				table_j11.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						int tam_col=table_j11.getColumnCount();
						int tam_fil=table_j11.getRowCount();
						//System.out.println(tam_col+" "+tam_fil);
						cambiar_celdasjh3(tam_col, tam_fil);
					}
					
				});
				setear1entabla_jh();
				
				}
		  
		  public void cambiar_celdasjh3(int columnas, int filas){
				String valor_alterado;
				int columna_seleccionada=table_j11.getSelectedColumn();
				int fila_seleccionada=table_j11.getSelectedRow();
				System.out.println(columna_seleccionada+" "+fila_seleccionada);
				try {
					//table_1.getModel().addTableModelListener(table_1);
					table_j11.getCellEditor().stopCellEditing();
					String valor_cambiado = String.valueOf(table_j11.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
					//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
					System.out.println("Valor "+valor_cambiado);
					valor_alterado=invertirString(valor_cambiado);
					table_j11.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		  
		  public void setear1entabla_jh(){
				int columna_seleccionada=table_j11.getColumnCount();
				for (int i = 0; i < columna_seleccionada; i++) {
					System.out.println(i);
					table_j11.setValueAt("1/1", i, i);
				}
				
			}
		  
		  public void crearTablajh13(){ 
				table_j13 = new JTable(datoColumna4,titColumna4);
				 table_j13.setShowHorizontalLines( true );
				    table_j13.setRowSelectionAllowed( true );
				    table_j13.setColumnSelectionAllowed( true );
				    // Cambiamos el color de la zona seleccionada (rojo/blanco)
				    table_j13.setSelectionForeground( Color.white );
				    table_j13.setSelectionBackground( Color.WHITE );
				    table_j13.setEnabled(false);
				    // Incorporamos la tabla a un panel que incorpora ya una barra
				    // de desplazamiento, para que la visibilidad de la tabla sea
				    // automática
				scrollPane_jh12.setViewportView(table_j13);
				}
		  
		  public void guardar_arrayjh1(){
			  ReproducirSonido("imagenes/sound2.wav");
				for (int i = 0; i < table_j11.getColumnCount(); i++) {
					for (int j = 0; j < table_j11.getRowCount(); j++) {
						lista_tabla2.add(String.valueOf(table_j11.getValueAt(i, j)));
						System.out.print(String.valueOf(table_j11.getValueAt(i, j))+" ");
					}
					System.out.println();
				}

			}
		  
		  public void crearTablajh14(){ 

				table_j14 = new JTable(datoColumnaj5,titColumnaj5);
					
				 table_j14.setShowHorizontalLines( true );
				    table_j14.setRowSelectionAllowed( true );
				    table_j14.setColumnSelectionAllowed( true );
				    
				  
					scrollPane_jh13.setViewportView(table_j14);
					
					
								int micorredor=0;
								
								for(int y=0;y<datoColumnaj5.length;y++){
									  for(int W=0;W<datoColumnaj5.length;W++){

										  datoColumnaj5[y][W]=String.valueOf(valor(lista_tabla2).get(micorredor));
										  micorredor++;
									  }   
									  
								}			
		  }

		  public void crearTablajh15(){ 
				table_j15 = new JTable(datoColumna4,titColumna4);
				 table_j15.setShowHorizontalLines( true );
				    table_j15.setRowSelectionAllowed( true );
				    table_j15.setColumnSelectionAllowed( true );
				    // Cambiamos el color de la zona seleccionada (rojo/blanco)
				    table_j15.setSelectionForeground( Color.white );
				    table_j15.setSelectionBackground( Color.WHITE );
				    table_j15.setEnabled(false);
				    // Incorporamos la tabla a un panel que incorpora ya una barra
				    // de desplazamiento, para que la visibilidad de la tabla sea
				    // automática
				scrollPane_jh16.setViewportView(table_j15);
				}
		  
		  public void crearTablajh16(){ 

				table_j16 = new JTable(datoColumnaj5,titColumnaj5);
					
				 table_j16.setShowHorizontalLines( true );
				    table_j16.setRowSelectionAllowed( true );
				    table_j16.setColumnSelectionAllowed( true );
				    
				  
					scrollPane_jh17.setViewportView(table_j16);
					
					
								int micorredor=0;
								
								for(int y=0;y<datoColumnaj5.length;y++){
									  for(int W=0;W<datoColumnaj5.length;W++){

										  datoColumnaj5[y][W]=String.valueOf(valor(lista_tabla2).get(micorredor));
										  micorredor++;
									  }  
								  }	
				}
		  
		  public void cuadradajh(){
				
			  Operaciones obj=new Operaciones();
				obj.matriz_principal(valore_real1(lista_tabla2,table_j16.getColumnCount(), table_j16.getRowCount()),table_j16.getColumnCount(), table_j16.getRowCount());
				table_j17.setModel(obj.recibirmodelo());
				ponderacion_jh(obj.suma_filas());
				scrollPane_jh11.setViewportView(table_j17);
				scrollPane_jh14.setViewportView(table_j18);
				scrollPane_jh15.setViewportView(table_j19);
		  }
		  
		  public void ponderacion_jh(double[] A){
				for (int i = 0; i < A.length; i++) {
					String vectnew[]={""+A[i]};
					modjh1.addRow(vectnew);
				}
				table_j18.setModel(modjh1);
				
				
				double [] B=ponderacion(A, A.length);
				for (int i = 0; i < B.length; i++) {
					String vectnew[]={""+B[i]};
					modjh2.addRow(vectnew);
				}
				table_j19.setModel(modjh2);
						
			}
		  
		  
		  public void calcular_igual_alt4(){
			  guardar_arrayjh1();
			  CargaDatosjh4();
			  CreaColumnasjh4();
			  crearTablajh13();
			  crearTablajh14();
			  crearTablajh15();
			  crearTablajh16();
			  cuadradajh();
			  /*
			   CargaDatos4();
				   CreaColumnas4();
				    crearTabla13();
				    crearTabla15();
			
				CargaDatos3();
				CreaColumnas3();
				  crearTablak14();

				  crearTablak16();
				  
				  cuadrada();
			   */
		  }
		  
		  ////////////////////////////////////////////////////////////////////////////////////////////////////////
		  ///////////////////////////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////////////////////
		  ////////////////////////////////////////////////////////////////////////////////////////////////////////
		  /////////////////////////////////////////////////////////////////////////////////////////////////////////
		  public void crearTabla11j(){ 
			  System.out.println("Entro a tablajairo11");
				table_20j = new JTable(datoColumna4,titColumna4);
				table_20j.setShowHorizontalLines( true );
				table_20j.setRowSelectionAllowed( true );
				table_20j.setColumnSelectionAllowed( true );
				    // Cambiamos el color de la zona seleccionada (rojo/blanco)
				table_20j.setSelectionForeground( Color.white );
				table_20j.setSelectionBackground( Color.WHITE );
				table_20j.setEnabled(false);
				    // Incorporamos la tabla a un panel que incorpora ya una barra
				    // de desplazamiento, para que la visibilidad de la tabla sea
				    // automática
				scrollPane_20j.setViewportView(table_20j);
				}
		  
		  public void crearTabla9j(){ 
				table_21j = new JTable(datoColumna3j,titColumna3j){
					public boolean isCellEditable(int row, int column){
					    if(row ==column ) return false;
					    return true;
					  }
				};
				table_21j.setShowHorizontalLines( true );
				table_21j.setRowSelectionAllowed( true );
				table_21j.setColumnSelectionAllowed( true );
				scrollPane_21j.setViewportView(table_21j);
				
				//LISTENER TABLA
				table_21j.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						int tam_col=table_21j.getColumnCount();
						int tam_fil=table_21j.getRowCount();
						//System.out.println(tam_col+" "+tam_fil);
						cambiar_celdas3j(tam_col, tam_fil);
					}
					
				});
				setear1entabla_ja();
				
				}
		  
		  public void cambiar_celdas3j(int columnas, int filas){
				String valor_alterado;
				int columna_seleccionada=table_21j.getSelectedColumn();
				int fila_seleccionada=table_21j.getSelectedRow();
				System.out.println(columna_seleccionada+" "+fila_seleccionada);
				try {
					//table_1.getModel().addTableModelListener(table_1);
					table_21j.getCellEditor().stopCellEditing();
					String valor_cambiado = String.valueOf(table_21j.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
					//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
					System.out.println("Valor "+valor_cambiado);
					valor_alterado=invertirString(valor_cambiado);
					table_21j.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		  
		  public void setear1entabla_ja(){
				int columna_seleccionada=table_21j.getColumnCount();
				for (int i = 0; i < columna_seleccionada; i++) {
					System.out.println(i);
					table_21j.setValueAt("1/1", i, i);
				}
				
			}
		  
		  
		  public void crearTabla13j(){ 
				table_22j = new JTable(datoColumna4j,titColumna4j);
				table_22j.setShowHorizontalLines( true );
				table_22j.setRowSelectionAllowed( true );
				table_22j.setColumnSelectionAllowed( true );
				    // Cambiamos el color de la zona seleccionada (rojo/blanco)
				table_22j.setSelectionForeground( Color.white );
				table_22j.setSelectionBackground( Color.WHITE );
				table_22j.setEnabled(false);
				    // Incorporamos la tabla a un panel que incorpora ya una barra
				    // de desplazamiento, para que la visibilidad de la tabla sea
				    // automática
				scrollPane_22j.setViewportView(table_22j);
				}
		  
		  public void guardar_array1ja(){
			  ReproducirSonido("imagenes/sound2.wav");
				for (int i = 0; i < table_21j.getColumnCount(); i++) {
					for (int j = 0; j < table_21j.getRowCount(); j++) {
						lista_tabla3.add(String.valueOf(table_21j.getValueAt(i, j)));
						System.out.print(String.valueOf(table_21j.getValueAt(i, j))+" ");
					}
					System.out.println();
				}

			}
		  
		  public void crearTabla14j(){ 

				table_23j = new JTable(datoColumna5j,titColumna5j);
					
				table_23j.setShowHorizontalLines( true );
				table_23j.setRowSelectionAllowed( true );
				table_23j.setColumnSelectionAllowed( true );
					scrollPane_23j.setViewportView(table_23j);
								int micorredor=0;
								for(int y=0;y<datoColumna5j.length;y++){
									  for(int W=0;W<datoColumna5j.length;W++){
										  datoColumna5j[y][W]=String.valueOf(valor(lista_tabla3).get(micorredor));
										  micorredor++;
									  }   
									  
								}			
		  }
		  
		  
		  public void crearTabla15j(){ 
				table_24j = new JTable(datoColumna4,titColumna4);
				table_24j.setShowHorizontalLines( true );
				table_24j.setRowSelectionAllowed( true );
				table_24j.setColumnSelectionAllowed( true );
				    // Cambiamos el color de la zona seleccionada (rojo/blanco)
				table_24j.setSelectionForeground( Color.white );
				table_24j.setSelectionBackground( Color.WHITE );
				    table_24j.setEnabled(false);
				    // Incorporamos la tabla a un panel que incorpora ya una barra
				    // de desplazamiento, para que la visibilidad de la tabla sea
				    // automática
				scrollPane_24j.setViewportView(table_24j);
				}
		  
		  public void crearTabla16j(){ 

			  table_25j = new JTable(datoColumna5j,titColumna5j);
					
			  table_25j.setShowHorizontalLines( true );
			  table_25j.setRowSelectionAllowed( true );
			  table_25j.setColumnSelectionAllowed( true );
					scrollPane_25j.setViewportView(table_25j);
								int micorredor=0;
								for(int y=0;y<datoColumna5j.length;y++){
									  for(int W=0;W<datoColumna5j.length;W++){
										  datoColumna5j[y][W]=String.valueOf(valor(lista_tabla3).get(micorredor));
										  micorredor++;
									  }  
								  }	
				}
		  public void cuadradaja(){
				
			  Operaciones obj=new Operaciones();
				obj.matriz_principal(valore_real1(lista_tabla3,table_25j.getColumnCount(), table_25j.getRowCount()),table_25j.getColumnCount(), table_25j.getRowCount());
				table_26j.setModel(obj.recibirmodelo());
				ponderacion_ja(obj.suma_filas());
				scrollPane_26j.setViewportView(table_26j);
				scrollPane_27j.setViewportView(table_27j);
				scrollPane_28j.setViewportView(table_28j);
		  }
		  
		  public void ponderacion_ja(double[] A){
				for (int i = 0; i < A.length; i++) {
					String vectnew[]={""+A[i]};
					modk1_ja.addRow(vectnew);
				}
				table_27j.setModel(modk1_ja);
				
				
				double [] B=ponderacion(A, A.length);
				for (int i = 0; i < B.length; i++) {
					String vectnew[]={""+B[i]};
					modk2_ja.addRow(vectnew);
				}
				table_28j.setModel(modk2_ja);
						
			}


		  
///////////////////////////////////////////////////////
///////////////
///////
/////



//alternativa 55555 
public void crearTabla11m(){ 
table_m10 = new JTable(datoColumna4_m,titColumna4_m);
table_m10.setShowHorizontalLines( true );
table_m10.setRowSelectionAllowed( true );
table_m10.setColumnSelectionAllowed( true );
// Cambiamos el color de la zona seleccionada (rojo/blanco)
table_m10.setSelectionForeground( Color.white );
table_m10.setSelectionBackground( Color.WHITE );
table_m10.setEnabled(false);
// Incorporamos la tabla a un panel que incorpora ya una barra
// de desplazamiento, para que la visibilidad de la tabla sea
// automática
scrollPane_m9.setViewportView(table_m10);
}

public void crearTabla9m(){ 
table_m11 = new JTable(datoColumna3_m,titColumna3_m){
public boolean isCellEditable(int row, int column){
if(row ==column ) return false;
return true;
}
};
table_m11.setShowHorizontalLines( true );
table_m11.setRowSelectionAllowed( true );
table_m11.setColumnSelectionAllowed( true );


scrollPane_m10.setViewportView(table_m11);

//LISTENER TABLA
table_m11.addKeyListener(new KeyAdapter() {
@Override
public void keyReleased(KeyEvent e) {
int tam_col=table_m11.getColumnCount();
int tam_fil=table_m11.getRowCount();
//System.out.println(tam_col+" "+tam_fil);
cambiar_celdasm3(tam_col, tam_fil);
}

});
setear1entabla_m();

}







public void crearTabla13m(){ 
table_m13 = new JTable(datoColumna4_m,titColumna4_m);
table_m13.setShowHorizontalLines( true );
table_m13.setRowSelectionAllowed( true );
table_m13.setColumnSelectionAllowed( true );
// Cambiamos el color de la zona seleccionada (rojo/blanco)
table_m13.setSelectionForeground( Color.white );
table_m13.setSelectionBackground( Color.WHITE );
table_m13.setEnabled(false);
// Incorporamos la tabla a un panel que incorpora ya una barra
// de desplazamiento, para que la visibilidad de la tabla sea
// automática
scrollPane_m13.setViewportView(table_m13);
}

public void crearTablam14m(){ 

table_m14 = new JTable(datoColumna5_m,titColumna5_m);

table_m14.setShowHorizontalLines( true );
table_m14.setRowSelectionAllowed( true );
table_m14.setColumnSelectionAllowed( true );


scrollPane_m14.setViewportView(table_m14);


int micorredor=0;

for(int y=0;y<datoColumna5_m.length;y++){
for(int W=0;W<datoColumna5_m.length;W++){

datoColumna5_m[y][W]=String.valueOf(valor(lista_tabla1m).get(micorredor));
micorredor++;
}   }			}


public void crearTabla15m(){ 
table_m15 = new JTable(datoColumna4_m,titColumna4_m);
table_m15.setShowHorizontalLines( true );
table_m15.setRowSelectionAllowed( true );
table_m15.setColumnSelectionAllowed( true );
// Cambiamos el color de la zona seleccionada (rojo/blanco)
table_m15.setSelectionForeground( Color.white );
table_m15.setSelectionBackground( Color.WHITE );
table_m15.setEnabled(false);
// Incorporamos la tabla a un panel que incorpora ya una barra
// de desplazamiento, para que la visibilidad de la tabla sea
// automática
scrollPane_m15.setViewportView(table_m15);
}


public void crearTablak16m(){ 

table_m16 = new JTable(datoColumna5_m,titColumna5_m);

table_m16.setShowHorizontalLines( true );
table_m16.setRowSelectionAllowed( true );
table_m16.setColumnSelectionAllowed( true );


scrollPane_m16.setViewportView(table_m16);


int micorredor=0;

for(int y=0;y<datoColumna5_m.length;y++){
for(int W=0;W<datoColumna5_m.length;W++){

datoColumna5_m[y][W]=String.valueOf(valor(lista_tabla1m).get(micorredor));
micorredor++;
}  
}	
}



public void cambiar_celdasm3(int columnas, int filas){
String valor_alterado;
int columna_seleccionada=table_m11.getSelectedColumn();
int fila_seleccionada=table_m11.getSelectedRow();
System.out.println(columna_seleccionada+" "+fila_seleccionada);
try {
//table_1.getModel().addTableModelListener(table_1);
table_m11.getCellEditor().stopCellEditing();
String valor_cambiado = String.valueOf(table_m11.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
System.out.println("Valor "+valor_cambiado);
valor_alterado=invertirString(valor_cambiado);
table_m11.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
} catch (Exception e) {
// TODO: handle exception
}


}


public void setear1entabla_m(){
int columna_seleccionada=table_m11.getColumnCount();
for (int i = 0; i < columna_seleccionada; i++) {
System.out.println(i);
table_m11.setValueAt("1/1", i, i);
}

}




public void cuadradam(){

Operaciones obj=new Operaciones();
obj.matriz_principal(valore_real1(lista_tabla1m,table_m16.getColumnCount(), table_m16.getRowCount()),table_m16.getColumnCount(), table_m16.getRowCount());
table_m17.setModel(obj.recibirmodelo());
ponderacion_m(obj.suma_filas());



}


public void ponderacion_m(double[] A){
for (int i = 0; i < A.length; i++) {
String vectnew[]={""+A[i]};
modm1.addRow(vectnew);
}
table_m18.setModel(modm1);


double [] B=ponderacion(A, A.length);
for (int i = 0; i < B.length; i++) {
String vectnew[]={""+B[i]};
modm2.addRow(vectnew);
}
table_m19.setModel(modm2);

}




//alternativas


public void CargaDatos3_m() {
int arr2 = array2.size(); 
datoColumna3_m = new String[arr2][arr2];

datoColumna5_m = new String[arr2][arr2];
}





public void CargaDatos4_m() {
int arr2 = array2.size(); 
datoColumna4_m = new String[arr2][1];

for( int iY=0; iY < arr2; iY++ ) {
for( int iX=0; iX < 1; iX++ ) {
datoColumna4_m[iY][iX] = array2.get(iY);
}
}
}



public void CargaDatos5_m() {
int arr2 = array2.size(); 
datoColumna5_m = new String[arr2][1];

for( int iY=0; iY < arr2; iY++ ) {
for( int iX=0; iX < 1; iX++ ) {
datoColumna5_m[iY][iX] = array2.get(iY);
}
}
}




public void guardar_arraym1(){
ReproducirSonido("imagenes/sound2.wav");
for (int i = 0; i < table_m11.getColumnCount(); i++) {
for (int j = 0; j < table_m11.getRowCount(); j++) {
lista_tabla1m.add(String.valueOf(table_m11.getValueAt(i, j)));
System.out.print(String.valueOf(table_m11.getValueAt(i, j))+" ");
}
System.out.println();
}


}





////////////////////////////////////////////////////
//////////////////
///////////
////


////////////////////didi/////////////////////////////////////////





//alternativa 55555 
public void crearTabla11b(){ 
		table_b10 = new JTable(datoColumna4_b,titColumna4_b);
		 table_b10.setShowHorizontalLines( true );
		    table_b10.setRowSelectionAllowed( true );
		    table_b10.setColumnSelectionAllowed( true );
		    // Cambiamos el color de la zona seleccionada (rojo/blanco)
		    table_b10.setSelectionForeground( Color.white );
		    table_b10.setSelectionBackground( Color.WHITE );
		    table_b10.setEnabled(false);
		    // Incorporamos la tabla a un panel que incorpora ya una barra
		    // de desplazamiento, para que la visibilidad de la tabla sea
		    // automática
		scrollPane_b9.setViewportView(table_b10);
		}

public void crearTabla9b(){ 
		table_b11 = new JTable(datoColumna3_b,titColumna3_b){
			public boolean isCellEditable(int row, int column){
			    if(row ==column ) return false;
			    return true;
			  }
		};
		 table_b11.setShowHorizontalLines( true );
		    table_b11.setRowSelectionAllowed( true );
		    table_b11.setColumnSelectionAllowed( true );

		    
		scrollPane_b10.setViewportView(table_b11);
		
		//LISTENER TABLA
		table_b11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int tam_col=table_b11.getColumnCount();
				int tam_fil=table_b11.getRowCount();
				//System.out.println(tam_col+" "+tam_fil);
				cambiar_celdasb3(tam_col, tam_fil);
			}
			
		});
		setear1entabla_b();
		
		}







public void crearTabla13b(){ 
		table_b13 = new JTable(datoColumna4_b,titColumna4_b);
		 table_b13.setShowHorizontalLines( true );
		    table_b13.setRowSelectionAllowed( true );
		    table_b13.setColumnSelectionAllowed( true );
		    // Cambiamos el color de la zona seleccionada (rojo/blanco)
		    table_b13.setSelectionForeground( Color.white );
		    table_b13.setSelectionBackground( Color.WHITE );
		    table_b13.setEnabled(false);
		    // Incorporamos la tabla a un panel que incorpora ya una barra
		    // de desplazamiento, para que la visibilidad de la tabla sea
		    // automática
		scrollPane_b13.setViewportView(table_b13);
		}

public void crearTablam14b(){ 

		table_b14 = new JTable(datoColumna5_b,titColumna5_b);
			
		 table_b14.setShowHorizontalLines( true );
		    table_b14.setRowSelectionAllowed( true );
		    table_b14.setColumnSelectionAllowed( true );
		    
		  
			scrollPane_b14.setViewportView(table_b14);
			
			
						int micorredor=0;
						
						for(int y=0;y<datoColumna5_b.length;y++){
							  for(int W=0;W<datoColumna5_b.length;W++){

								  datoColumna5_b[y][W]=String.valueOf(valor(lista_tabla1b).get(micorredor));
								  micorredor++;
							  }   }			}


public void crearTabla15b(){ 
		table_b15 = new JTable(datoColumna4_b,titColumna4_b);
		 table_b15.setShowHorizontalLines( true );
		    table_b15.setRowSelectionAllowed( true );
		    table_b15.setColumnSelectionAllowed( true );
		    // Cambiamos el color de la zona seleccionada (rojo/blanco)
		    table_b15.setSelectionForeground( Color.white );
		    table_b15.setSelectionBackground( Color.WHITE );
		    table_b15.setEnabled(false);
		    // Incorporamos la tabla a un panel que incorpora ya una barra
		    // de desplazamiento, para que la visibilidad de la tabla sea
		    // automática
		scrollPane_b15.setViewportView(table_b15);
		}


public void crearTablak16b(){ 

		table_b16 = new JTable(datoColumna5_b,titColumna5_b);
			
		 table_b16.setShowHorizontalLines( true );
		    table_b16.setRowSelectionAllowed( true );
		    table_b16.setColumnSelectionAllowed( true );
		    
		  
			scrollPane_b16.setViewportView(table_b16);
			
			
						int micorredor=0;
						
						for(int y=0;y<datoColumna5_b.length;y++){
							  for(int W=0;W<datoColumna5_b.length;W++){

								  datoColumna5_b[y][W]=String.valueOf(valor(lista_tabla1b).get(micorredor));
								  micorredor++;
							  }  
						  }	
		}



public void cambiar_celdasb3(int columnas, int filas){
		String valor_alterado;
		int columna_seleccionada=table_b11.getSelectedColumn();
		int fila_seleccionada=table_b11.getSelectedRow();
		System.out.println(columna_seleccionada+" "+fila_seleccionada);
		try {
			//table_1.getModel().addTableModelListener(table_1);
			table_b11.getCellEditor().stopCellEditing();
			String valor_cambiado = String.valueOf(table_b11.getModel().getValueAt(fila_seleccionada, columna_seleccionada)) ;
			//String valor_cambiado = String.valueOf(table_1.getValueAt(fila_seleccionada, columna_seleccionada)) ;
			System.out.println("Valor "+valor_cambiado);
			valor_alterado=invertirString(valor_cambiado);
			table_b11.setValueAt(valor_alterado, columna_seleccionada, fila_seleccionada);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}


public void setear1entabla_b(){
		int columna_seleccionada=table_b11.getColumnCount();
		for (int i = 0; i < columna_seleccionada; i++) {
			System.out.println(i);
			table_b11.setValueAt("1/1", i, i);
		}
		
	}




public void cuadradab(){
	
	  Operaciones obj=new Operaciones();
		obj.matriz_principal(valore_real1(lista_tabla1b,table_b16.getColumnCount(), table_b16.getRowCount()),table_b16.getColumnCount(), table_b16.getRowCount());
		table_b17.setModel(obj.recibirmodelo());
		ponderacion_b(obj.suma_filas());
		
	  
	  
}


public void ponderacion_b(double[] A){
		for (int i = 0; i < A.length; i++) {
			String vectnew[]={""+A[i]};
			modb1.addRow(vectnew);
		}
		table_b18.setModel(modb1);
		
		
		double [] B=ponderacion(A, A.length);
		for (int i = 0; i < B.length; i++) {
			String vectnew[]={""+B[i]};
			modb2.addRow(vectnew);
		}
		table_b19.setModel(modb2);
				
	}




//alternativas


public void CargaDatos3_b() {
	  int arr2 = array2.size(); 
  datoColumna3_b = new String[arr2][arr2];

  datoColumna5_b = new String[arr2][arr2];
}





public void CargaDatos4_b() {
	  int arr2 = array2.size(); 
  datoColumna4_b = new String[arr2][1];
 
  for( int iY=0; iY < arr2; iY++ ) {
    for( int iX=0; iX < 1; iX++ ) {
	datoColumna4_b[iY][iX] = array2.get(iY);
    }
  }
}



public void CargaDatos5_b() {
	  int arr2 = array2.size(); 
  datoColumna5_b = new String[arr2][1];
 
  for( int iY=0; iY < arr2; iY++ ) {
    for( int iX=0; iX < 1; iX++ ) {
	datoColumna5_b[iY][iX] = array2.get(iY);
    }
  }
}




public void guardar_arrayb1(){
	  ReproducirSonido("imagenes/sound2.wav");
		for (int i = 0; i < table_b11.getColumnCount(); i++) {
			for (int j = 0; j < table_b11.getRowCount(); j++) {
				lista_tabla1b.add(String.valueOf(table_b11.getValueAt(i, j)));
				System.out.print(String.valueOf(table_b11.getValueAt(i, j))+" ");
			}
			System.out.println();
		}


	}




public void CreaColumnas3_b() {
	 int arr = array2.size(); 
  titColumna3_b = new String[arr];
  titColumna5_b = new String[arr];
  
  for( int i=0; i < arr; i++ ) {
    titColumna3_b[i] = array2.get(i);

    titColumna5_b[i] = array2.get(i);
  }
}

public void CreaColumnas4_b() {
  titColumna4_b = new String[1];
  
  for( int i=0; i < 1; i++ ) {
    titColumna4_b[i] = "A:";
  }
}

public void CreaColumnas5_b() {
  titColumna5_b = new String[1];
  
  for( int i=0; i < 1; i++ ) {
    titColumna5_b[i] = "Criterios:";
  }
}







public ArrayList<Double> Solucion_final(String[][] Matriz_Alt_Crite){
   //aqui tengo los valores de la ponderacion de CRITERIOS o la ponderacion de la matriz cuadrada.
	for (int j = 0; j < table_8.getRowCount(); j++) {
		vector_AR_ponderacion.add(Double.parseDouble((String) (table_8.getValueAt(j,0))));	
	}
	ArrayList<Double> respuesta_tamanoALT;
	respuesta_tamanoALT= new ArrayList<Double>();
	
	/*
			double[][] Matriz_Alt_Crite={
					{0.11, 	0.37,	 0.20},
					{0.26, 	0.29,	 0.20},
					{0.05, 	0.07,	 0.40},
					{0.58, 	0.26,	 0.20}
					};
		*/
	/*
			double[] Vector_criterios={0.32, 0.56, 0.12};
			*/
			
			for (int i = 0; i < Matriz_Alt_Crite.length; i++) {
				double acum=0;
				for (int j = 0; j < Matriz_Alt_Crite[i].length; j++) {
					acum=acum+Double.parseDouble(Matriz_Alt_Crite[i][j])*vector_AR_ponderacion.get(j);
				}
				respuesta_tamanoALT.add(acum);
			}
			
			System.out.println("-----------------------------------");
			System.out.println("-----------------------------------");
			System.out.println("SOLUCION FINAL");
			for (int i = 0; i < respuesta_tamanoALT.size(); i++) {
				System.out.println(respuesta_tamanoALT.get(i));
			}
			return respuesta_tamanoALT;
}


////////////////////////////////////////////////////////////////
	
	public void leerArrayPonderacion(int n){
		System.out.println("----------PONDERACIONES----------------");
		switch(n){
		case 1:
			for (int i = 0; i < table_k19.getColumnCount(); i++) {
				for (int j = 0; j < table_k19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_k19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_k19.getValueAt(j, i))));	
				}
			}
			break;
		case 2:
			for (int i = 0; i < table_k19.getColumnCount(); i++) {
				for (int j = 0; j < table_k19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_k19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_k19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_b19.getColumnCount(); i++) {
				for (int j = 0; j < table_b19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_b19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_b19.getValueAt(j, i))));	
				}
			}
			break;
		case 3:
			for (int i = 0; i < table_k19.getColumnCount(); i++) {
				for (int j = 0; j < table_k19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_k19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_k19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_b19.getColumnCount(); i++) {
				for (int j = 0; j < table_b19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_b19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_b19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_28j.getColumnCount(); i++) {
				for (int j = 0; j < table_28j.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_28j.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_28j.getValueAt(j, i))));	
				}
			}
			break;
		case 4:
			for (int i = 0; i < table_k19.getColumnCount(); i++) {
				for (int j = 0; j < table_k19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_k19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_k19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_b19.getColumnCount(); i++) {
				for (int j = 0; j < table_b19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_b19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_b19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_28j.getColumnCount(); i++) {
				for (int j = 0; j < table_28j.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_28j.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_28j.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_j19.getColumnCount(); i++) {
				for (int j = 0; j < table_j19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_j19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_j19.getValueAt(j, i))));	
				}
			}
			break;
		case 5:
			for (int i = 0; i < table_k19.getColumnCount(); i++) {
				for (int j = 0; j < table_k19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_k19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_k19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_b19.getColumnCount(); i++) {
				for (int j = 0; j < table_b19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_b19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_b19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_28j.getColumnCount(); i++) {
				for (int j = 0; j < table_28j.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_28j.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_28j.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_j19.getColumnCount(); i++) {
				for (int j = 0; j < table_j19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_j19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_j19.getValueAt(j, i))));	
				}
			}
			for (int i = 0; i < table_m19.getColumnCount(); i++) {
				for (int j = 0; j < table_m19.getRowCount(); j++) {
					lista_ponderaciones.add(String.valueOf(table_m19.getValueAt(j, i)));
					lista_doble_ponderacion.add(Double.parseDouble((String) (table_m19.getValueAt(j, i))));	
				}
			}
			break;
		}
		stringPonderaciones= new String[array1.size()][array2.size()];
		
		for (int i = 0; i < lista_ponderaciones.size(); i++) {
			System.out.print(lista_ponderaciones.get(i)+" ");
		}
		
		int recorredor02 = 0;
		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j < array2.size(); j++) {
				stringPonderaciones[i][j]=lista_ponderaciones.get(recorredor02);
				recorredor02++;
			}
		}
		System.out.println();
		System.out.println("Matriz impresa "+array2.size()+" "+array1.size());
		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j < array2.size(); j++) {
				System.out.print(stringPonderaciones[i][j]+" ");
			}
			System.out.println();
		}
		array_tablasolucion();
		//de_matriz_a_tabla2();
		Solucion_final(stringPonderaciones);
	
	}
	
	public void array_tablasolucion(){
		int mirecorredor=0;
		for (int i = 0; i < tableUltima1.getColumnCount(); i++) {
			for (int j = 0; j < tableUltima1.getRowCount(); j++) {
				tableUltima1.setValueAt(lista_ponderaciones.get(mirecorredor), j, i);
				mirecorredor++;
			}
		}
	}
	//NO HACER CASO A ESTOS 2 METODOS DE MOMENTOS
	public void de_matriz_a_tabla(){
		
		for (int i = 0; i < tableUltima1.getRowCount(); i++) {
			for (int j = 0; j < tableUltima1.getColumnCount(); j++) {
				tableUltima1.setValueAt(stringPonderaciones[i][j], j, i);
			}
		}
	}
	
	public void de_matriz_a_tabla2(){
		
		for (int i = 0; i < tableUltima1.getColumnCount(); i++) {
			for (int j = 0; j < tableUltima1.getRowCount(); j++) {
				tableUltima1.setValueAt(stringPonderaciones[i][j], j, i);
			}
		}
	}

}