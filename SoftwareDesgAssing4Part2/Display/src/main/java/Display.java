
import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

	static JFrame frame = new JFrame("Display");
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel("Item Name: ");
	static JLabel label2 = new JLabel("Price: $");

	public static void createDisplay(){

		frame.setSize(450, 475);
		frame.setLocation(120, 60);
		panel.setLayout(new FlowLayout());
		label.setPreferredSize(new Dimension(275, 100));
		label.setBounds(150, 100, 275, 100 );
		label.setFont(new Font("Serif", Font.PLAIN, 27));
		panel.add(label);
		label2.setPreferredSize(new Dimension(275, 100));
		label2.setBounds(150, 200, 275, 100 );
		label2.setFont(new Font("Serif", Font.PLAIN, 27));
		panel.add(label2);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


	public static void updateDisplay(String name, int price){
		label.setText("Item Name: "+ name);
		label2.setText("Price: $"+ price);
	}
	
}
