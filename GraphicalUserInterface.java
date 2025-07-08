import java.awt.Component;
import javax.swing.JOptionPane;
public class GraphicalUserInterface {
        public static void main(String[] args) {
            String name = JOptionPane.showInputDialog("Enter your name");
            JOptionPane.showMessageDialog((Component)null, " Hello " + name);
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
            JOptionPane.showMessageDialog((Component)null, "you are " + age + " years old");
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
            JOptionPane.showMessageDialog((Component)null, "you are o" + height + "  cm tall");
        }
    }

