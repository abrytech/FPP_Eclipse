package lesson6.problem2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ColorDisplay extends JFrame{
	
	JButton redBtn = new JButton();
	JButton orangeBtn = new JButton();
	JButton yellowBtn = new JButton();
	JButton greenBtn = new JButton();
	JButton blueBtn = new JButton();
	JButton indigoBtn = new JButton();
	JButton violetBtn = new JButton();
	
	public static final int DEFAULT_WIDTH = 490;
	public static final int DEFAULT_HEIGHT = 130;
	
	public ColorDisplay()
	{
		super("Rainbow Color Frame");

		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		centerFrameOnDesktop(this);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		redBtn.setBackground(Color.RED);
		redBtn.setPreferredSize(new Dimension(60, 60));
		orangeBtn.setBackground(Color.ORANGE);
		orangeBtn.setPreferredSize(new Dimension(60, 60));
		yellowBtn.setBackground(Color.YELLOW);
		yellowBtn.setPreferredSize(new Dimension(60, 60));
		greenBtn.setBackground(Color.GREEN);
		greenBtn.setPreferredSize(new Dimension(60, 60));
		blueBtn.setBackground(Color.BLUE);
		blueBtn.setPreferredSize(new Dimension(60, 60));
		indigoBtn.setBackground(new Color(75, 0, 130));
		indigoBtn.setPreferredSize(new Dimension(60, 60));
		violetBtn.setBackground(new Color(128, 0, 128));
		violetBtn.setPreferredSize(new Dimension(60, 60));
		
		add(redBtn); 
		add(orangeBtn);
		add(yellowBtn);
		add(greenBtn);
		add(blueBtn);
		add(indigoBtn);
		add(violetBtn);
		
		redBtn.addActionListener(r -> {
			displayMessage("Red signifies passion, vitality, enthusiasm and security. It is the light with the longest wavelength.", Color.RED);
		});
		
		orangeBtn.addActionListener(r -> {
			displayMessage("Orange is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control.", Color.ORANGE);
		});
		
		yellowBtn.addActionListener(r -> {
			displayMessage("Yellow represents clarity of thought, wisdom, orderliness and energy.", Color.YELLOW);
		});
		
		greenBtn.addActionListener(r -> {
			displayMessage("Green is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth.", Color.GREEN);
		});
		
		blueBtn.addActionListener(r -> {
			displayMessage("Blue is the fifth color of the rainbow which makes us think of the Unknown.", Color.BLUE);
		});
		
		indigoBtn.addActionListener(r -> {
			displayMessage("It is believed that where Blue is calming, Indigo is sedating. Indigo is mystical as it bridges the Gap between Finite and Infinite.", new Color(75, 0, 130));
		});
		
		violetBtn.addActionListener(r -> {
			displayMessage("Violet is considered the highest element of spirituality. It can ignite one’s imagination and be an inspiration to artists.", new Color(128, 0, 128));
		});

	}
	
	private void displayMessage(String string, Color color) {
		 UIManager.put("OptionPane.background", color);
		 UIManager.put("Panel.background", color);
		JOptionPane.showMessageDialog(this, string, "Color Message", JOptionPane.INFORMATION_MESSAGE);
		
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}

}
