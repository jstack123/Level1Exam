import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1ExamCodingExcercise implements ActionListener {
	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	public Level1ExamCodingExcercise() {
		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		yellow.addActionListener(this);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.addActionListener(this);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		blue.addActionListener(this);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		green.addActionListener(this);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) {
		Level1ExamCodingExcercise exam = new Level1ExamCodingExcercise();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==yellow) {
			try {
				Runtime.getRuntime().exec("say yellow");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource()==red) {
			try {
				Runtime.getRuntime().exec("say red");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource()==blue) {
			try {
				Runtime.getRuntime().exec("say blue");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource()==green) {
			try {
				Runtime.getRuntime().exec("say green");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
