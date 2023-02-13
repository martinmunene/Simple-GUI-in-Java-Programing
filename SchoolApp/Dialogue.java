import javax.swing.JOptionPane;
public class Dialogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				String name = JOptionPane.showInputDialog("What is your name");
				JOptionPane.showMessageDialog(null, "Hello: " + name);
				
				int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
				
				JOptionPane.showMessageDialog(null, "You are "+ age + " years old");
				
				
				double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
				JOptionPane.showMessageDialog(null, "You are "+ height + " cm tall");
			

		}


	}


