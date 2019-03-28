import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class basicMenu extends JFrame 
{
	
	public basicMenu()
	{
		JLabel lbl1 = new JLabel("This is the JLabel");
		add(lbl1);
		
		//JMenuBar is the bar at the top which houses the options
		JMenuBar menubar = new JMenuBar();
		
		//JMenu has visible text which drops down to give clickable options
		//or other JMenu
		JMenu menu1 = new JMenu("Options 1-3");
		
		//JMenuItems are the final level.  These get action listeners 
		//and are clickable. They get added to a JMenu or directly
		//to the JMenuBar
		JMenuItem option1 = new JMenuItem("Option 1");
		menu1.add(option1);
		
		JMenuItem option2 = new JMenuItem("Option 2");
		menu1.add(option2);
		
		JMenuItem option3 = new JMenuItem("Option 3");
		menu1.add(option3);
		
		//add menu1 to the menubar
		menubar.add(menu1);
		
		//add a second menu
		JMenu menu2 = new JMenu("Options 4-7");
		
		//build the menu
		JMenuItem option4 = new JMenuItem("Option 4");
		menu2.add(option4);
		
		//build submenu
		JMenu menuRemainingOptions = new JMenu("Options 5-7");
		JMenuItem option5 = new JMenuItem("Option 5");
		JMenuItem option6 = new JMenuItem("Option 6");
		JMenuItem option7 = new JMenuItem("Option 7");
		menuRemainingOptions.add(option5);
		menuRemainingOptions.add(option6);
		menuRemainingOptions.add(option7);
		menu2.add(menuRemainingOptions);
		menubar.add(menu2);
		
		//can add JMenuItem directly to MenuBar
		JMenuItem option8 = new JMenuItem("Option 8");
		menubar.add(option8);
		
		
		this.setJMenuBar(menubar);
		
		this.setBounds(100,100,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		option1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		option8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		new basicMenu();
	}
	
}