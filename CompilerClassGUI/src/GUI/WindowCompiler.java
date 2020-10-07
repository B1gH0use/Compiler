package GUI;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

@SuppressWarnings("serial")
public class WindowCompiler extends JDialog {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new WindowCompiler().setVisible(true);
	}
	
	//criar diretamente na fun��o? (Outline direciona para quando � criada a variavel)
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuSystem;
	private JMenuItem menuItemExit;

	private JButton btnNewFile;
	private JButton btnOpenFile;
	private JButton btnSaveFile;
	private JButton btnExecuteFile;
	private JButton btnDebug;
	
	private JTextArea txtCode;
	private JTextArea txtConsole;
	
	private JScrollPane spCode;
	private JScrollPane spConsole;
	private static JTextArea lines;
	
	public WindowCompiler()  {
		
		setSize(1280, 720);
		setTitle("Compilador");
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		buildWindow();
	}
	
	private void buildWindow() {
	
		setJMenuBar(menuBar);
		
		/*
		 * Bar Menu System
		 */
		
		menuSystem = new JMenu("Sistema");
		menuBar.add(menuSystem);
		
		menuItemExit = new JMenuItem("Sair");
		menuSystem.add(menuItemExit);
		
		//End JMenu
	
		
		//Buttons
		
		btnNewFile = new JButton();
		btnNewFile.setBounds(10, 10, 25, 25);
		btnNewFile.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
		getContentPane().add(btnNewFile);
		
		btnOpenFile = new JButton();
		btnOpenFile.setBounds(40, 10, 25, 25);
		btnOpenFile.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
		getContentPane().add(btnOpenFile);
		
		btnSaveFile = new JButton();
		btnSaveFile.setBounds(70, 10, 25, 25);
		btnSaveFile.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
		getContentPane().add(btnSaveFile);
		
		
		btnExecuteFile = new JButton();
		btnExecuteFile.setBounds(100, 10, 25, 25);
		btnExecuteFile.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
		getContentPane().add(btnExecuteFile);
		
		btnDebug = new JButton("DEBUG [OFF]");
		btnDebug.setBounds(130, 10, 125, 25);
		btnDebug.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
		getContentPane().add(btnDebug);
		
		//End Buttons
		
		
		//TextBox
		
		txtCode = new JTextArea();
		
		txtCode.setBounds(150, 75, 650, 350);
		txtCode.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
		spCode = new JScrollPane(txtCode);
		getContentPane().add(txtCode);
		
		
		txtConsole = new JTextArea();
		txtConsole.setBounds(150, 500, 650, 100);
		txtConsole.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
		spConsole = new JScrollPane(txtConsole);
		txtConsole.setEditable(false);
		getContentPane().add(txtConsole);
		
		
		
		//End TextBox
		
	}
	
	
	
}
