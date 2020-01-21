import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.util.Date;

//Java GUI Panel
public class Frame1 {

	private JFrame frame;
	private JTextField textFirstName; //Textbox for First Name
	private JTextField textNumberOfAttendees; //Textbox for number of attendees
	private JTextField texLastName;//Textbox for Last Name
	private JTextField textReservationDate;// Textbox for reservation date
	private JComboBox comboBoxStartTime; // Combobox for start time
	private JComboBox comboBoxEndTime1; // Combobox for end time
	private JPanel panel; 
	private JCheckBox chckbxSmallRoom,chckbxMediumRoom,chckbxLargeRoom, chckbxCoffee,chckbxSoda, chckbxCookies,chckbxSandwiches,chckbxPaperProduct; //Check box for size of rooms and products 
	private JTextArea textArea; // Textarea to show results. 
	private JScrollPane scrollPane; //Scrollpanel for textArea
	private JLabel lblNote;
	

	/**
	 * Launch the application.
	 */
	//Main class
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 788, 845);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// Calculate button 
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new CalculateButtonListner() {
			
		});
		btnCalculate.setBounds(39, 524, 114, 45);
		frame.getContentPane().add(btnCalculate);
		
		// First Name Label
		JLabel lblName = new JLabel("First Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(77, 91, 76, 19);
		frame.getContentPane().add(lblName);
		
		//Lasts Name Label
		JLabel lblNumberOf = new JLabel("Number of attendees:");
		lblNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumberOf.setBounds(77, 168, 145, 19);
		frame.getContentPane().add(lblNumberOf);
		
		// Panel
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(393, 131, 231, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		// Start time lable. 
		JLabel lblStartTime = new JLabel("Start Time: ");
		lblStartTime.setBounds(6, 16, 79, 19);
		panel.add(lblStartTime);
		lblStartTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		// Start time Combobox
		comboBoxStartTime = new JComboBox();
		comboBoxStartTime.setBounds(91, 16, 70, 19);
		comboBoxStartTime.setModel(new DefaultComboBoxModel(new String[] {"7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM"}));
		panel.add(comboBoxStartTime);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(393, 187, 231, 45);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		// End time Label
		JLabel lblEndTime = new JLabel("End Time:");
		lblEndTime.setBounds(6, 16, 79, 19);
		panel_1.add(lblEndTime);
		lblEndTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		// End time Combobox
		comboBoxEndTime1 = new JComboBox();
		comboBoxEndTime1.setModel(new DefaultComboBoxModel(new String[] {"7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM"}));
		comboBoxEndTime1.setBounds(87, 11, 79, 22);
		panel_1.add(comboBoxEndTime1);
		
		// First name text box. 
		textFirstName = new JTextField();
		textFirstName.setBounds(163, 92, 135, 20);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(25);
		
		// Number of Attendees Textbox
		textNumberOfAttendees = new JTextField();
		textNumberOfAttendees.setColumns(4);
		textNumberOfAttendees.setBounds(229, 169, 38, 20);
		frame.getContentPane().add(textNumberOfAttendees);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Conference room pricing :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(25, 243, 373, 97);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		//checkbox for small room
		chckbxSmallRoom = new JCheckBox("Small conference room - $50/hour and holds 25 people");
		chckbxSmallRoom.setBounds(6, 16, 346, 23);
		panel_2.add(chckbxSmallRoom);
		
		//checkbox for medium room
		chckbxMediumRoom = new JCheckBox("Medium conference room - $100/hour and holds 50 people");
		chckbxMediumRoom.setBounds(6, 42, 361, 23);
		panel_2.add(chckbxMediumRoom);
		
		//checkbox for small room
		chckbxLargeRoom = new JCheckBox("Large conference room - $150/hour and holds 75 people");
		chckbxLargeRoom.setBounds(6, 68, 346, 23);
		panel_2.add(chckbxLargeRoom);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Beverages/Food/Paper Products/Utensils options pricing :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(25, 351, 373, 147);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		//checkbox for coffee
		chckbxCoffee = new JCheckBox("Coffee/Tea - $1/person");
		chckbxCoffee.setBounds(6, 16, 139, 23);
		panel_3.add(chckbxCoffee);
		
		//checkbox for soda
		chckbxSoda = new JCheckBox("Soda - $1.50/person");
		chckbxSoda.setBounds(6, 42, 139, 23);
		panel_3.add(chckbxSoda);
		
		//checkbox for cookies
		chckbxCookies = new JCheckBox("Cookies/Cakes - $2/person");
		chckbxCookies.setBounds(6, 68, 155, 23);
		panel_3.add(chckbxCookies);
		
		//checkbox for Sandwiches
		chckbxSandwiches = new JCheckBox("Sandwiches - $4/person");
		chckbxSandwiches.setBounds(6, 94, 141, 23);
		panel_3.add(chckbxSandwiches);
		
		//checkbox for paper products
		chckbxPaperProduct = new JCheckBox("Paper products/utensils -$2.50/person");
		chckbxPaperProduct.setBounds(6, 118, 211, 23);
		panel_3.add(chckbxPaperProduct);
		
		//Title label 
		JLabel lblNewLabel = new JLabel("Conference Room Registration");
		lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 36));
		lblNewLabel.setBounds(166, 26, 326, 44);
		frame.getContentPane().add(lblNewLabel);
		
		// last Name label
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(77, 131, 76, 19);
		frame.getContentPane().add(lblLastName);
		
		// Last Name textBox
		texLastName = new JTextField();
		texLastName.setColumns(25);
		texLastName.setBounds(163, 132, 135, 20);
		frame.getContentPane().add(texLastName);
		
		//Reservation date label
		JLabel lblNewLabel_1 = new JLabel("Date of Reservation:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(393, 91, 135, 19);
		frame.getContentPane().add(lblNewLabel_1);

		//Reservation date textbox
		textReservationDate = new JTextField();
		textReservationDate.setBounds(538, 92, 86, 20);
		frame.getContentPane().add(textReservationDate);
		textReservationDate.setColumns(10);
		
		// Scroll Panel for TextArea
		scrollPane = new JScrollPane();
		scrollPane.setBounds(425, 253, 313, 395);
		frame.getContentPane().add(scrollPane);
		
		// TextArea
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		
		
		//Clear Button and its Action Listener
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFirstName.setText("");
				texLastName.setText("");
				textNumberOfAttendees.setText("");
				textReservationDate.setText("");
				if(chckbxSmallRoom.isSelected())
				{chckbxSmallRoom.doClick();}
				
				if(chckbxMediumRoom.isSelected())
				{chckbxMediumRoom.doClick();}
				
				if(chckbxLargeRoom.isSelected())
				{chckbxLargeRoom.doClick();}
				
				if(chckbxCoffee.isSelected())
				{chckbxCoffee.doClick();}
				
				if(chckbxSoda.isSelected())
				{chckbxSoda.doClick();}
				
				if(chckbxCookies.isSelected())
				{chckbxCookies.doClick();}
				
				if(chckbxSandwiches.isSelected())
				{chckbxSandwiches.doClick();}
				
				if(chckbxPaperProduct.isSelected())
				{chckbxPaperProduct.doClick();}
				
				textArea.setText("");
				
				comboBoxStartTime.setSelectedIndex(0);
				comboBoxEndTime1.setSelectedIndex(0);
			}
		});
		btnClear.setBounds(163, 524, 104, 44);
		frame.getContentPane().add(btnClear);
		
		// Exit button and its Listener
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(277, 524, 104, 44);
		frame.getContentPane().add(btnExit);
		
		JLabel lblmmddyyyy = new JLabel("(MM/DD/YYYY)");
		lblmmddyyyy.setBounds(634, 95, 104, 14);
		frame.getContentPane().add(lblmmddyyyy);
		
		JLabel lblThisFacilityHolds = new JLabel("- The max number of people this facility holds is 75.");
		lblThisFacilityHolds.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThisFacilityHolds.setBounds(51, 666, 339, 19);
		frame.getContentPane().add(lblThisFacilityHolds);
		
		JLabel lblYouMay = new JLabel("- You may choose any size room, as long as it does not exceed that room max limit. ");
		lblYouMay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYouMay.setBounds(51, 698, 563, 19);
		frame.getContentPane().add(lblYouMay);
		
		lblNote = new JLabel("Note:");
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNote.setBounds(51, 638, 36, 19);
		frame.getContentPane().add(lblNote);
		
		}
		
		
	
		// Calculate button listner
		public class CalculateButtonListner implements ActionListener
		{
			
			
			public void actionPerformed(ActionEvent e) 
			{
				String clientFirstName;  //First name
				String clientLastName; 	// Last name
				String input;  //User input
				
				int tempDate = 0;
				int numberOfAttendees;
				int selectedEndTime =0, selectedStartTime=0;
				double sum=0;
				int totalHours = 0;
				final int SMALL_ROOM_PRICE = 50, MEDIUM_ROOM_PRICE = 100, LARGE_ROOM_PRICE = 150;
				final double COFFEE_PRICE = 1, SODA_PRICE = 1.50, COOKIES_PRICE = 2, SANDWICHES_PRICE = 4, PAPER_PRODUCT_PRICE = 2.50; 
				
				textArea.setText("");
				//validating first name input
				input = textFirstName.getText();
				if(isOnlyAlphabet(input))
				{
				clientFirstName = input;
				
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Input valid first name.");
				
				textFirstName.setText("");
				return;
				}
				
				//validating last name input
				input = texLastName.getText();
				if(isOnlyAlphabet(input))
				{
				clientLastName = input;
				
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Input valid last name.");
				
				texLastName.setText("");
				return;
				}
					
				
				
				//validating number of attendees input
				input = textNumberOfAttendees.getText();
				if(isNumber(input))
				{
					int tempnumberOfAttendees = Integer.parseInt(input);
						if(tempnumberOfAttendees > 0 && tempnumberOfAttendees < 76)
							{
							numberOfAttendees = tempnumberOfAttendees;
														}
						else
							{
							JOptionPane.showMessageDialog(null,"Input valid number. \nThis facility holds up to 75 peoplee \nEnter number between 0 to 75");
							textNumberOfAttendees.setText("");
							return;
							}
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Input valid number of attendees.");
				
				textNumberOfAttendees.setText("");
				return;
				}
				//Validating Data input			
				String reservationDate = textReservationDate.getText();
				try 
				{
					Date date = (Date) new SimpleDateFormat("MM/dd/yyyy").parse(reservationDate);
					
					
					
					//finding the data of the week
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(date);
					 tempDate = calendar.get(Calendar.DAY_OF_WEEK);
					 ;
					
				} 
				catch (ParseException e1)
				{
				
				JOptionPane.showMessageDialog(null,"Please, enter date in corret format, MM/DD/YYYY");
				textReservationDate.setText("");
				return;
				}
				//If statement to set restriction on combobox.  
				if( tempDate == 1 || tempDate == 7 )
				{
					 selectedStartTime = comboBoxStartTime.getSelectedIndex();
					 
					
					if(selectedStartTime == 0) {
					JOptionPane.showMessageDialog(null,"Conference room is not available at chosen time.\n Available time:\n Monday to Friday: 7 AM to 9 PM\n Saturday and Sunday: 8 AM to 11 PM.");	
					return;}
					
				}
				
				
				if( tempDate > 1 && tempDate < 7 )
				{
					
					
					selectedEndTime = comboBoxEndTime1.getSelectedIndex();
					if(selectedEndTime == 15 || selectedEndTime == 16 ) {
					JOptionPane.showMessageDialog(null,"Conference room is not available at chosen time.\n Available time:\n Monday to Friday: 7 AM to 9 PM\n Saturday and Sunday: 8 AM to 11 PM.");	
					return;}
				}
				
				
				
				
				
				
				//Combobox input verification
				if(comboBoxEndTime1.getSelectedIndex() < comboBoxStartTime.getSelectedIndex()) 
				{
					
					
					JOptionPane.showMessageDialog(null,"Please, check the time you have selected. End time that you have selected is early then the start time.");
					return;
				}
				else if (comboBoxEndTime1.getSelectedIndex() == comboBoxStartTime.getSelectedIndex()) 
				{
					
					
					JOptionPane.showMessageDialog(null,"Please, check the time you have selected. Start and end time can not be equal.");
					return;
				}
				
				//Printing out reservation info. 
				totalHours = comboBoxEndTime1.getSelectedIndex() - comboBoxStartTime.getSelectedIndex();
				textArea.append("Reservation information:");
				textArea.append("\nFirst Name: "+ clientFirstName + "\nLast Name: " + clientLastName + "\nDate: " + reservationDate + "\nNumber of attendees: " +numberOfAttendees);
				textArea.append("\n-------------------------------");
				textArea.append("\nServices Selected");
				
				//Verification of number of attendees. 
				if(numberOfAttendees > 25) {
					if(chckbxSmallRoom.isSelected()) 
					{
						JOptionPane.showMessageDialog(null,"Small conference room only holds upto 25 people ");
						return;
					}
						
				}
				else if (chckbxSmallRoom.isSelected()) 
				{
					sum += totalHours * SMALL_ROOM_PRICE;
					textArea.append("\nSmall Room: 50/hour");
				}	
				if(numberOfAttendees > 50) {
					if(chckbxMediumRoom.isSelected()) 
					{
						JOptionPane.showMessageDialog(null,"Midium conference room only holds upto 50 people ");
						return;
					}
				}
				else if (chckbxMediumRoom.isSelected()) 
				{
					sum += totalHours * MEDIUM_ROOM_PRICE;
					textArea.append("\nMedium Room: 100/hour");
				}
				if(numberOfAttendees > 75) {
					if(chckbxLargeRoom.isSelected()) 
					{
						JOptionPane.showMessageDialog(null,"Large conference room only holds upto 75 people ");
						return;
					}
				}
				else if (chckbxLargeRoom.isSelected()) 
				{
					sum += totalHours * LARGE_ROOM_PRICE;
					textArea.append("\nLarge Room: 150/hour");
				}
				
				
				if(!chckbxSmallRoom.isSelected() && !chckbxMediumRoom.isSelected() && !chckbxLargeRoom.isSelected() ) 
				{
					JOptionPane.showMessageDialog(null,"You must select one size of room");
					return;
				}
				totalHours = comboBoxEndTime1.getSelectedIndex() - comboBoxStartTime.getSelectedIndex(); 
				
				//Verification of products input
				if(chckbxCoffee.isSelected()) 
				{
					sum += numberOfAttendees * COFFEE_PRICE;
					textArea.append("\nCoffee/Tea: $1/person");
				}
				if(chckbxSoda.isSelected()) 
				{
					sum += numberOfAttendees * SODA_PRICE;
					textArea.append("\nSoda: $1.50/person");
				}
				if(chckbxCookies.isSelected()) 
				{
					sum += numberOfAttendees * COOKIES_PRICE;
					textArea.append("\nCookies/Cakes: $2/person");
				}
				if(chckbxSandwiches.isSelected()) 
				{
					sum += numberOfAttendees * SANDWICHES_PRICE;
					textArea.append("\nSandwiches: $4/person");
				}
				if(chckbxPaperProduct.isSelected()) 
				{
					sum += numberOfAttendees * PAPER_PRODUCT_PRICE;
					textArea.append("\nPaper products/utensils: $2.50/person");
				}
				
				
				textArea.append("\n-------------------------------");
				textArea.append("\nTotal cost: $"+ sum);
				
				
				
				
			}
		 
			public boolean isNumber(String in)
			{
				try
				{
					Integer.parseInt(in);
					return true;
				}
				catch (Exception E)
				{
				return false;
				}
			}
			public int parseInt(String selectedItem) {
				
				
				return Integer.parseInt(selectedItem);
			}
			
			private boolean isOnlyAlphabet(String al) 
			{
				return ((!al.equals("")) && (al.matches("^[a-zA-Z]*$"))&& (al != null));
			}
			
	}
}
