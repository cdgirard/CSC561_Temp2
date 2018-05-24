import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleWindow extends JFrame implements ActionListener
{
	/**
	 * This is my ConcreteSubject
	 */
    JButton button;
    
    public SimpleWindow()
    {
    	setLayout(new GridLayout(1,1)); // space for one button
    	button = new JButton("Hello"); // create the button
    	button.addActionListener(this); // SimpleWindow registering itself
    	                                // as an observer of button.
    	add(button); // Add the button
    	pack(); // Sets the size of the window based on needs of the button
    	setVisible(true); // Make Window Visible
    }
    
    public static void main(String[] args)
    {
    	SimpleWindow win = new SimpleWindow();
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("Hello");
		if (e.getSource() instanceof JButton)
		{
			JButton b = (JButton)e.getSource();
			if (b == button)
				System.out.println("Tightly Coupled");
		}
		
	}
}
