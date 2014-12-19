/*
 * GreenRide.net window app created by Jonathan Cameron

 * 11/25/2014
 * 
 * NOTE: Windowbuilder is really buggy. I cannot move items around
 * after I create them unless I want to clean up the code that
 * gets messed up from it. Frustrating, but workable. I'm not able
 * to keep the code clean due to this. I had everything neatly organized
 * and it reverted back to it's original spots in the Source code... >(
 * 
 * This app will allow Greenride.net to be able to send data
 * to multiple areas without having to reenter data in those
 * multiple areas. The format should be:
 * 
 * Name:
 * Time of Pickup:
 * Phone:
 * From:
 * To:
 * # of PPL:
 * 
 * There are many different programs that are being used to
 * enter data in from the dispatchers. With this app, the 
 * data will be unified, and it will allow the dispatchers to
 * handle more call traffic, as well as dispatch more drivers.
 * 
 * The programs that are used are:
 * Microsoft Exchange/Outlook
 * Google Mail/Maps
 * Flywheel
 * 
 * Version 1(alpha/beta) - Completed 11/30/2014 23:12
 * This version allows the dispatcher to enter in the data that they
 * would normally enter, but allows them to copy all contents from the
 * window to the flywheel
 */

import java.awt.EventQueue;





//library was restricted, but removed library, then
//readded for it to work
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox; 


public class GreenRideWindow {

		//Window object
	private JFrame frame;
		//Text fields
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{        
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					//create window object
					GreenRideWindow window = new GreenRideWindow();
					//display the window
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GreenRideWindow() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
			//Labels and text fields
		//name of the window
		frame = new JFrame("- GreenRide.net - Dispatch Utility");
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(57, 45, 124, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Name label
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(10, 17, 46, 14);
		frame.getContentPane().add(lblName);
		
		//Name text field label
		textField_1 = new JTextField();
		textField_1.setBounds(57, 14, 189, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		//Time text field label
		JLabel lblTimeOfDeparture = new JLabel("Time:");
		lblTimeOfDeparture.setBounds(10, 45, 99, 14);
		frame.getContentPane().add(lblTimeOfDeparture);
		
		//Phone text field label
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(10, 70, 46, 14);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setBounds(10, 95, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblTo);
		
		JLabel lblOfPpl = new JLabel("# of PPL:");
		lblOfPpl.setBounds(10, 145, 46, 14);
		frame.getContentPane().add(lblOfPpl);
		
		textField_2 = new JTextField();
		textField_2.setBounds(57, 67, 181, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(57, 95, 253, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(57, 117, 254, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
			//slider
		final JSlider slider = new JSlider();

			//Turn on labels at major tick marks.
		slider.setMajorTickSpacing(3);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		slider.setValue(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinimum(1);
		slider.setMaximum(6);
		slider.setBounds(57, 145, 200, 23);
		frame.getContentPane().add(slider);
		
		JLabel lblBoundary = new JLabel("Boundary:");
		lblBoundary.setBounds(325, 17, 57, 14);
		frame.getContentPane().add(lblBoundary);
		
		textField_6 = new JTextField();
		textField_6.setBounds(382, 14, 109, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		//price label
		JLabel lblPrice = new JLabel("Price: ");
		lblPrice.setBounds(336, 163, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		//price text field
		final JTextField textField_7 = new JTextField();
		textField_7.setBounds(374, 160, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblInitials = new JLabel("Initials:");
		lblInitials.setBounds(10, 182, 46, 14);
		frame.getContentPane().add(lblInitials);
		
		//Initials text field
		textField_5 = new JTextField();
		textField_5.setBounds(47, 179, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
//----------------------------------------------------------------------	
		//NOW checkbox
		final JCheckBox chckbxNow = new JCheckBox("NOW");
		chckbxNow.setBounds(187, 44, 97, 23);
		frame.getContentPane().add(chckbxNow);
		
		
		//Copy all fields into the clipboard button
		//Copy All button label plus text fields to copy
		JButton btnCopyAll = new JButton("Copy All");
		btnCopyAll.addActionListener(new ActionListener() 
		{
			//The format needs to be:
			//Boundary (time of entry) @ (time for pickup)
			//From (address)
			//To (address)
			//For (name)
			//Phone
			//# of ppl
			//initials (JC-11(price))
			//price
			public void actionPerformed(ActionEvent arg0) 
			{
				//***Get current timestamp***
				
				//Calendar instance
				Calendar calendar = Calendar.getInstance();
				
				//time stamps
				/*
				 * NOTE: If argument passed over is 0, the date is 12-31-1969
				 * I created an instance of the Calendar object to pull in the
				 * current time. I needed a military time format, and used
				 * "kk" for the hour, and "mm" for the minutes
				 * The SimpleDateFormat object allows me to format this, and the
				 * Date object is used to pass the calendar time through
				 * WOOT!
				 */
				Date dt = new Date(calendar.getTime().getTime());		
			    SimpleDateFormat ft = new SimpleDateFormat ("kk:mm");

//			    System.out.println("Current Date: " + ft.format(dt));
			    
			    if(chckbxNow.isSelected())
			    {
			    	java.awt.datatransfer.StringSelection strsel = new java.awt.datatransfer.StringSelection(
							textField_6.getText() + " " + ft.format(dt) + " " + "@" + " " + "NOW" +
							" FROM " + textField_3.getText() + " " + "TO " + textField_4.getText() + " " + 
							"FOR " + textField_1.getText() + " " + "#PPL " + slider.getValue() + " " + 
							"PH# " + textField_2.getText() + " " + textField_5.getText() + "-11" + 
							textField_7.getText());
			        java.awt.datatransfer.Clipboard clbrd = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
			        clbrd.setContents(strsel, strsel);
			    }else
			    {
			    	java.awt.datatransfer.StringSelection strsel = new java.awt.datatransfer.StringSelection(
							textField_6.getText() + " " + ft.format(dt) + " " + "@" + " " + textField.getText() +
							" FROM " + textField_3.getText() + " " + "TO " + textField_4.getText() + " " + 
							"FOR " + textField_1.getText() + " " + "#PPL " + slider.getValue() + " " + 
							"PH# " + textField_2.getText() + " " + textField_5.getText() + "-11" + 
							textField_7.getText());
			        java.awt.datatransfer.Clipboard clbrd = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
			        clbrd.setContents(strsel, strsel);
			    }
				
			}
		});
		
		btnCopyAll.setBounds(10, 228, 89, 23);
		frame.getContentPane().add(btnCopyAll);

	}
}
