package lesson6.problem1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CountLetter extends JFrame {

	private String input = "";

	JButton countLetters;
	JButton reverseLetters;
	JButton removeDuplicates;
	JButton clear;

	JLabel inputLab;
	JLabel outputLab;

	JTextField inputFeld;
	JTextField outputFeld;

	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 200;

	public CountLetter() {

		super("String Utility");

		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		centerFrameOnDesktop(this);
		getContentPane().setBackground(Color.lightGray);
		getContentPane().setLayout(null);

		// Initialization
		countLetters = new JButton("Count Letters");
		countLetters.setBounds(20, 20, 150, 25);
		reverseLetters = new JButton("Reverse Letrers");
		reverseLetters.setBounds(20, 60, 150, 25);
		removeDuplicates = new JButton("Remove Duplicates");
		removeDuplicates.setBounds(20, 100, 150, 25);
		clear = new JButton("Clear");
		clear.setBounds(230, 120, 80, 20);

		inputFeld = new JTextField();
		inputFeld.setBounds(230, 45, 170, 25);
		outputFeld = new JTextField();
		outputFeld.setBounds(230, 85, 170, 25);
		
		inputLab = new JLabel("Input");
		inputLab.setBounds(230, 25, 100, 25);
		outputLab = new JLabel("Output");
		outputLab.setBounds(230, 65, 100, 25);

		add(countLetters);
		add(reverseLetters);
		add(removeDuplicates);
		add(inputLab);
		add(outputLab);
		add(inputFeld);
		add(outputFeld);
		add(clear);

		clear.addActionListener(e1 ->
		{
			inputFeld.setText("");
			outputFeld.setText("");
		});
		
		countLetters.addActionListener(e -> {
			input = inputFeld.getText();
			if (input.equals("") || input == null)
				outputFeld.setText("0");
			else {
				outputFeld.setText(length(input) + "");
			}
		});

		reverseLetters.addActionListener(e2 -> {
			input = inputFeld.getText();
			if (input.equals("") || input == null)
				outputFeld.setText("0");
			else {
				outputFeld.setText(reverse(input, ""));
			}
		});

		removeDuplicates.addActionListener(e3 -> {
			input = inputFeld.getText();
			if (input.equals("") || input == null)
				outputFeld.setText("0");
			else {
				outputFeld.setText(removeDups(input));
			}
		});
		// btnExit.addActionListener(btnHandler);
	}

	public static String removeDups(String s) {
		if (s.length() <= 1)
			return s;
		if (s.substring(0, s.length() - 1).contains(s.substring(s.length() - 1, s.length())))
			return removeDups(s.substring(0, s.length() - 1));
		else
			return removeDups(s.substring(0, s.length() - 1)) + s.substring(s.length() - 1, s.length());
	}

	public static int length(String str) {
		if (str == null || str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}

	public static String reverse(String str, String output) {
		if (str == null || str.equals("")) {
			return "";
		} else {
			return reverse(str.substring(1), "") + (output += str.charAt(0));
		}
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
