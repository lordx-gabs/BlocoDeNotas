package inter;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;

import java.awt.Toolkit;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.Serial;

public class BlocoDeNotas extends JFrame {

	@Serial
	private static final long serialVersionUID = 1L;

    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlocoDeNotas frame = new BlocoDeNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public BlocoDeNotas() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		ImageIcon icone = new ImageIcon(Toolkit.getDefaultToolkit().getImage(BlocoDeNotas.class.getResource("/icons/Icone Bloco de Notas.png")));
	    java.awt.Image imagem = icone.getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon novoIcone = new ImageIcon(imagem);
		setIconImage(novoIcone.getImage());
		setTitle("Sem titulo - Bloco de Notas");
		UIManager.setLookAndFeel(new FlatLightLaf());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 394);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Novo");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Nova Janela");
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Abrir...");
		mntmNewMenuItem_2.setAlignmentX(0.2f);
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Salvar");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Salvar Como...");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();

		        // Configuração para selecionar apenas arquivos
		        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

		        // Cria um filtro para aceitar apenas arquivos com extensão .jpg e .png
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens", "jpg", "png");
		        fileChooser.setFileFilter(filter);

		        // Exibe o seletor de arquivos e aguarda a escolha do usuário
		        int result = fileChooser.showOpenDialog(null);

		        // Verifica se o usuário escolheu um arquivo
		        if (result == JFileChooser.APPROVE_OPTION) {
		            // Obtém o arquivo selecionado
		            File selectedFile = fileChooser.getSelectedFile();

		            // Aqui você pode implementar a logica para processar o arquivo selecionado
		            System.out.println("Arquivo selecionado: " + selectedFile.getAbsolutePath());
		        } else {
		            System.out.println("Nenhum arquivo selecionado.");
		        }
			}
		});
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JSeparator separator = new JSeparator();
		separator.setAlignmentX(0.1f);
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Configurar Página...");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Imprimir...");
		mntmNewMenuItem_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Sair");
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("Editar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Desfazer");
		mntmNewMenuItem_8.setEnabled(false);
		mntmNewMenuItem_8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1.add(separator_2);
		
		JMenuItem mntmRecortar = new JMenuItem("Recortar");
		mntmRecortar.setEnabled(false);
		mntmRecortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmRecortar);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Copiar");
		mntmNewMenuItem_9.setEnabled(false);
		mntmNewMenuItem_9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Colar");
		mntmNewMenuItem_10.setEnabled(false);
		mntmNewMenuItem_10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Excluir");
		mntmNewMenuItem_11.setEnabled(false);
		mntmNewMenuItem_11.setAlignmentX(0.0f);
		mntmNewMenuItem_11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_1.add(separator_3);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Buscar com o Bing...");
		mntmNewMenuItem_12.setEnabled(false);
		mntmNewMenuItem_12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Localizar...");
		mntmNewMenuItem_13.setEnabled(false);
		mntmNewMenuItem_13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Localizar próxima");
		mntmNewMenuItem_14.setEnabled(false);
		mntmNewMenuItem_14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mnNewMenu_1.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Localizar Anterior");
		mntmNewMenuItem_15.setEnabled(false);
		mntmNewMenuItem_15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Substituir...");
		mntmNewMenuItem_16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Ir para...");
		mntmNewMenuItem_17.setEnabled(false);
		mntmNewMenuItem_17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_17);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_1.add(separator_4);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Selecionar tudo");
		mntmNewMenuItem_18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Hora/data");
		mntmNewMenuItem_19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnNewMenu_1.add(mntmNewMenuItem_19);
		
		JMenu mnNewMenu_2 = new JMenu("Formatar");
		menuBar.add(mnNewMenu_2);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Quebra automática de linha");
		chckbxmntmNewCheckItem.setAlignmentX(0.7f);
		chckbxmntmNewCheckItem.setSelected(true);
		mnNewMenu_2.add(chckbxmntmNewCheckItem);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Fonte...");
		mnNewMenu_2.add(mntmNewMenuItem_20);
		
		JMenu mnNewMenu_3 = new JMenu("Exibir");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_5 = new JMenu("Zoom");
		mnNewMenu_3.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("Ampliar");
		mntmNewMenuItem_22.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_5.add(mntmNewMenuItem_22);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("Reduzir");
		mntmNewMenuItem_23.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_5.add(mntmNewMenuItem_23);
		
		JMenuItem mntmNewMenuItem_24 = new JMenuItem("Restaurar Zoom Padrão");
		mntmNewMenuItem_24.setAlignmentX(0.0f);
		mntmNewMenuItem_24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_5.add(mntmNewMenuItem_24);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("Barra de status");
		mntmNewMenuItem_21.setAlignmentX(0.9f);
		mnNewMenu_3.add(mntmNewMenuItem_21);
		
		JMenu mnNewMenu_4 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_25 = new JMenuItem("Exibir Ajuda");
		mnNewMenu_4.add(mntmNewMenuItem_25);
		
		JMenuItem mntmNewMenuItem_26 = new JMenuItem("Enviar Comentários");
		mnNewMenu_4.add(mntmNewMenuItem_26);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_4.add(separator_5);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("Sobre o Bloco de notas");
		mntmNewMenuItem_27.setAlignmentX(0.2f);
		mnNewMenu_4.add(mntmNewMenuItem_27);
        JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}
}
