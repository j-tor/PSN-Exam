import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class EditorTexto extends JFrame implements ActionListener
{
	//Atributos da classe
	JMenuBar barraMenu = null;
	JMenu arquivo = null;
	JMenu editar =null;
	JMenu inserir =null;
	JMenu ajuda = null;
	
	JMenuItem novo=null;
	JMenuItem abrir=null;
	JMenuItem sair=null;
	JMenuItem copiar=null;
	JMenuItem colar=null;
	JMenuItem localizar=null;
	JMenuItem quebraPagina=null;
	JMenuItem figura=null;
	JMenuItem sobre=null;
	
	JScrollPane barraRolagem=null;
	
	JToolBar barraFerramentas = null;
	
	JTextArea campoTexto = null;
	
	JPanel painel = null;
	
	JComboBox tamanhoFontes = null;
	
	//Construtor
	EditorTexto()
	{	//Configurações da janela
		setTitle(" Primeira janela do sistema ");
		setSize(1320, 720);//Tamanho da janela.
		setLocation(500, 300);// Localiza��o na ela.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		//Criando campo de texto
		campoTexto = new JTextArea(50,50);
		campoTexto.setLineWrap(true); //Quebra de linha automatica
	
		barraRolagem = new JScrollPane(campoTexto);
		
		
		
		barraFerramentas = new JToolBar();
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		arquivo = new JMenu("Arquivo");
		editar = new JMenu("Editar");
		inserir = new JMenu("Inserir");
		ajuda = new JMenu("Ajuda");
		
		barraMenu.add(arquivo);
		barraMenu.add(editar);
		barraMenu.add(inserir);
		barraMenu.add(ajuda);
		
		novo = new JMenuItem("Novo");
		abrir = new JMenuItem("Abrir");
		sair = new JMenuItem("Sair");
		copiar = new JMenuItem("Copiar");
		colar = new JMenuItem("Colar");
		localizar = new JMenuItem("Localizar");
		quebraPagina = new JMenuItem("Quebra Pagina");
		figura = new JMenuItem("Figura");
		sobre = new JMenuItem("Sobre");
		
		//Array que guarda tamanhos das fontes
		 Integer[] tamanhoFont = {10,11,12,14,16,18,20};
		 tamanhoFontes = new JComboBox(tamanhoFont);
		 tamanhoFontes.setSelectedIndex(2);
		
		
		 //Elementos da barra de MEnu
		arquivo.add(novo);
		arquivo.add(abrir);
		arquivo.add(sair);
		editar.add(copiar);
		editar.add(colar);
		editar.add(localizar);
		inserir.add(quebraPagina);
		inserir.add(figura);
		ajuda.add(sobre);
		
		
		
		painel = new JPanel();
		painel.setLayout(new FlowLayout());
		
		//Elementos da barra de ferramentas
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a1.jpg"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a2.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a3.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a4.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a5.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a6.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a7.png"))));
		barraFerramentas.add(tamanhoFontes);
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a8.ico"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a9.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a10.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a11.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a12.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a13.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a14.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a15.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a16.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a1.jpg"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a2.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a3.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a4.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a5.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a6.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a9.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a10.png"))));
		barraFerramentas.add(new JButton(new ImageIcon(getClass().getResource("a11.png"))));
		
		//Inserindo elementos no painel
		painel.add(barraRolagem);
		//Inserindo um painel dentro de outro
		//"painel"(FlowLayout) dentro do "BorderLayout"
		add(barraFerramentas, BorderLayout.NORTH);
		add(painel, BorderLayout.CENTER);
		
		//Recebendo ação de clique em determinados botões
		sobre.addActionListener(this);
		sair.addActionListener(new ActionListener() 
				{	public void actionPerformed(ActionEvent evento) 
					{
			int escolha = JOptionPane.showConfirmDialog(null, "Tem certeza?");
          System.out.println(escolha);	
          if(escolha==0)
          				{
        	  System.exit(1);
          				}
					}
				});
		abrir.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent evento) 
			{
				
				JOptionPane.showMessageDialog(null,  "Abrindo...");
				
			}
		});
		novo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Selecione um aquivo...");
				
			}
		});
		
		
		setVisible(true);
	}


	public void actionPerformed(ActionEvent evento)
	{
	if(evento.getSource()==sobre)
	{
		JOptionPane.showMessageDialog(this, "Pêra Word =::: Versão: 0.1.000.1.01");
	}
	}
	
}
