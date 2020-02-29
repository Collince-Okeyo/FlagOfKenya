import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlagOfKenya extends JFrame implements ActionListener
{
	public static final int WIDTH=400;
	public static final int  HEIGHT=300;
	
	private JPanel redPanel;
	private JPanel whitePanel;
	private JPanel greenPanel;
	private JPanel blackPanel;

	
	public FlagOfKenya()
	{
		super("I Love Kenya, its my pride");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
	    JPanel biggerPanel=new JPanel();
	    biggerPanel.setLayout(new GridLayout(1,4));
	    
	    redPanel=new JPanel();
	    redPanel.setBackground(Color.LIGHT_GRAY);
	    biggerPanel.add(redPanel);
	    
	    whitePanel=new JPanel();
	    whitePanel.setBackground(Color.LIGHT_GRAY);
	    biggerPanel.add(whitePanel);
	    
	    greenPanel=new JPanel();
	    greenPanel.setBackground(Color.LIGHT_GRAY);
	    biggerPanel.add(greenPanel);
	  
	    
	    blackPanel=new JPanel();
	    blackPanel.setBackground(Color.LIGHT_GRAY);
	    biggerPanel.add(blackPanel);
	    
	    add(biggerPanel,BorderLayout.CENTER);
	    
	    JPanel buttonPanel=new JPanel();
	    buttonPanel.setBackground(Color.LIGHT_GRAY);
	    buttonPanel.setLayout(new FlowLayout());
	    
		
		JButton redButton=new JButton("Red");
		redButton.setBackground(Color.RED);
		redButton.addActionListener(this);
		buttonPanel.add(redButton);
		
		JButton whiteButton=new JButton("white");
		whiteButton.setBackground(Color.WHITE);
		whiteButton.addActionListener(this);
		buttonPanel.add(whiteButton);
		
		JButton greenButton=new JButton("Green");
		greenButton.setBackground(Color.GREEN);
		greenButton.addActionListener(this);
		buttonPanel.add(greenButton);
	
		
		JButton blackButton=new JButton("Black");
		blackButton.setBackground(Color.BLACK);
		blackButton.addActionListener(this);
		buttonPanel.add(blackButton);
		
		add(buttonPanel,BorderLayout.SOUTH);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		String buttonStr=e.getActionCommand();
		
		if(buttonStr.equals("Red")){
			redPanel.setBackground(Color.RED);}
		else if{(buttonStr.equals("white"))
			whitePanel.setBackground(Color.WHITE);}
		else if{(buttonStr.equals("Green"))
			greenPanel.setBackground(Color.GREEN);}
		else if{(buttonStr.equals("Black"))
			blackPanel.setBackground(Color.BLACK);}
		else
			System.out.println("An Error Occurred");
	}
	
		public static void main(String[] args)
		
	{
		FlagOfKenya flag=new FlagOfKenya();
		flag.setVisible(true);
	}
}


