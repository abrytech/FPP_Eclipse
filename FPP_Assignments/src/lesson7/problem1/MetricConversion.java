package lesson7.problem1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MetricConversion extends JFrame {

	private JPanel panel;
	private JTextField tMile;
	private JTextField tPound;
	private JTextField tGallon;
	private JTextField tFhrenheit;
	private JTextField tKilometer;
	private JTextField tKilogram;
	private JTextField tLitre;
	private JTextField tCentigrade;
	JButton convert;

	public MetricConversion() {
		setBounds(100, 100, 450, 300);
		setTitle("Metric Conversion Assistant");
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);

		JLabel lMile = new JLabel("Mile:");
		lMile.setBounds(10, 36, 69, 22);
		lMile.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lMile.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lMile);

		JLabel lPound = new JLabel("Pound:");
		lPound.setBounds(10, 78, 69, 22);
		lPound.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lPound.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lPound);

		JLabel lKilometer = new JLabel("Kilometer:");
		lKilometer.setBounds(226, 36, 79, 22);
		lKilometer.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lKilometer.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lKilometer);

		JLabel lGallon = new JLabel("Gallon:");
		lGallon.setBounds(10, 120, 69, 22);
		lGallon.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lGallon.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lGallon);

		JLabel lFahrenheit = new JLabel("Fahrenheit:");
		lFahrenheit.setBounds(10, 162, 69, 22);
		lFahrenheit.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lFahrenheit.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lFahrenheit);

		JLabel lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setBounds(226, 78, 79, 22);
		lblKilogram.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblKilogram.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblKilogram);

		JLabel lblLitre = new JLabel("Litre:");
		lblLitre.setBounds(226, 120, 79, 22);
		lblLitre.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblLitre.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblLitre);

		JLabel lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setBounds(226, 162, 79, 22);
		lblCentigrade.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblCentigrade.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblCentigrade);

		tMile = new JTextField();
		tMile.setBounds(89, 36, 108, 22);
		panel.add(tMile);
		tMile.setColumns(10);

		tKilometer = new JTextField();
		tKilometer.setBounds(315, 36, 109, 22);
		panel.add(tKilometer);
		tKilometer.setColumns(10);

		tKilogram = new JTextField();
		tKilogram.setBounds(315, 78, 109, 22);
		panel.add(tKilogram);
		tKilogram.setColumns(10);

		tLitre = new JTextField();
		tLitre.setBounds(315, 120, 109, 22);
		panel.add(tLitre);
		tLitre.setColumns(10);

		tCentigrade = new JTextField();
		tCentigrade.setBounds(315, 162, 109, 22);
		panel.add(tCentigrade);
		tCentigrade.setColumns(10);

		tPound = new JTextField();
		tPound.setBounds(87, 78, 110, 22);
		panel.add(tPound);
		tPound.setColumns(10);

		tGallon = new JTextField();
		tGallon.setBounds(89, 120, 108, 22);
		panel.add(tGallon);
		tGallon.setColumns(10);

		tFhrenheit = new JTextField();
		tFhrenheit.setBounds(89, 162, 108, 22);
		panel.add(tFhrenheit);
		tFhrenheit.setColumns(10);

		convert = new JButton("Convert");
		convert.setBounds(170, 218, 100, 30);
		panel.add(convert);

		convert.addActionListener(e -> {
			String sMile = tMile.getText();
			String sPound = tPound.getText();
			String sGallon = tGallon.getText();
			String sFahrenheit = tFhrenheit.getText();
			String sKilometer = tKilometer.getText();
			String sKilogram = tKilogram.getText();
			String sLitre = tLitre.getText();
			String sCentigrade = tCentigrade.getText();

			double dMile = 0;
			double dPound = 0;
			double dGallon = 0;
			double dFahrenheit = 0;

			double dKilometer = 0;
			double dKilogram = 0;
			double dLitre = 0;
			double dCentigrade = 0;

			if (sMile != null && !sMile.isEmpty() && !isNumber(sMile))
				JOptionPane.showMessageDialog(null, "Error: Mile must be number. Check for your input.");
			else {
				if (sMile.isEmpty())
					dMile = 0;
				else
					dMile = Double.parseDouble(sMile);
			}
			if (sPound != null && !sPound.isEmpty() && !isNumber(sPound))
				JOptionPane.showMessageDialog(null, "Error: Pound must be number. Check for your input.");
			else {
				if (sPound.isEmpty())
					dPound = 0;
				else
					dPound = Double.parseDouble(sPound);
			}
			if (sGallon != null && !sGallon.isEmpty() && !isNumber(sGallon))
				JOptionPane.showMessageDialog(null, "Error: Gallon must be number. Check for your input.");
			else {
				if (sGallon.isEmpty())
					dGallon = 0;
				else
					dGallon = Double.parseDouble(sGallon);
			}

			if (sFahrenheit != null && !sFahrenheit.isEmpty() && !isNumber(sFahrenheit))
				JOptionPane.showMessageDialog(null, "Error: Fahrenheit must be number. Check for your input.");
			else {
				if (sFahrenheit.isEmpty())
					dFahrenheit = 0;
				else
					dFahrenheit = Double.parseDouble(sFahrenheit);
			}

			if (sKilometer != null && !sKilometer.isEmpty() && !isNumber(sKilometer))
				JOptionPane.showMessageDialog(null, "Error: Kilometer must be number. Check for your input.");
			else {
				if (sKilometer.isEmpty())
					dKilometer = 0;
				else
					dKilometer = Double.parseDouble(sKilometer);

			}
			if (sKilogram != null && !sKilogram.isEmpty() && !isNumber(sKilogram))
				JOptionPane.showMessageDialog(null, "Error: Kilogram must be number. Check for your input.");
			else {
				if (sKilogram.isEmpty())
					dKilogram = 0;
				else
					dKilogram = Double.parseDouble(sKilogram);

			}
			if (sLitre != null && !sLitre.isEmpty() && !isNumber(sLitre))
				JOptionPane.showMessageDialog(null, "Error: Litre must be number. Check for your input.");
			else {
				if (sLitre.isEmpty())
					dLitre = 0;
				else
					dLitre = Double.parseDouble(sLitre);
			}

			if (sCentigrade != null && !sCentigrade.isEmpty() && !isNumber(sCentigrade))
				JOptionPane.showMessageDialog(null, "Error: Centigrade must be number. Check for your input.");
			else {
				if (sCentigrade.isEmpty())
					dCentigrade = 0;
				else
					dCentigrade = Double.parseDouble(sCentigrade);
			}

			if (dMile < 0 || dPound < 0 || dGallon < 0 || dKilometer < 0 || dKilogram < 0 || dLitre < 0) {
				JOptionPane.showMessageDialog(null,
						"Error: Input must be non-negative number. Please check your field ");

			}

			if (dMile == 0 && dKilometer > 0)
				dMile = 0.62 * dKilometer;
			else if (dMile > 0 && dKilometer == 0)
				dKilometer = 1.6 * dMile;
			else {
				dMile = 0.62 * dKilometer;
				dKilometer = 1.6 * dMile;
			}

			if (dPound == 0 && dKilogram > 0)
				dPound = 2.2 * dKilogram;
			else if (dPound > 0 && dKilogram == 0)
				dKilogram = 0.45 * dPound;

			if (dGallon == 0 && dLitre > 0)
				dGallon = 0.264 * dLitre;

			else if (dGallon > 0 && dLitre == 0)
				dLitre = 3.785 * dGallon;

			if (dFahrenheit == 0 && dCentigrade > 0)
				dFahrenheit = (dCentigrade * 1.8) + 32;

			else if (dFahrenheit > 0 && dCentigrade == 0)
				dCentigrade = (dFahrenheit - 32) / 1.8;
			else {
				dFahrenheit = (dCentigrade * 1.8) + 32;
				dCentigrade = (dFahrenheit - 32) / 1.8;
			}

			tMile.setText(Double.toString(dMile));
			tPound.setText(Double.toString(dPound));
			tGallon.setText(Double.toString(dGallon));
			tFhrenheit.setText(Double.toString(dFahrenheit));
			tKilometer.setText(Double.toString(dKilometer));
			tKilogram.setText(Double.toString(dKilogram));
			tLitre.setText(Double.toString(dLitre));
			tCentigrade.setText(Double.toString(dCentigrade));
		});
	}

	boolean isNumber(String input) {
		try {
			Double.parseDouble(input);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

}
