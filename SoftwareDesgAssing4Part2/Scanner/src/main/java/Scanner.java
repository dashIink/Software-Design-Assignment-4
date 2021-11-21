import javax.swing.*;
import java.awt.*;

public class Scanner {

    static JFrame frame = new JFrame("Scanner");
    JPanel panel = new JPanel();
    static JTextField field = new JTextField(10);
    public static void createScanner(){
        frame.setSize(450, 475);
        frame.setLocation(120, 60);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(field, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static int getText(){
        int x = 0;
            if(field.getText().equals("")){
                return 0;
            }
            else{
                x = Integer.parseInt(field.getText());
            }

        return x;
    }
	
}
