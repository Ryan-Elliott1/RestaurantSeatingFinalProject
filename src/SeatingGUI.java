/**************************************************************
* Name        : SeatingGUI
* Author      : Ryan Elliott
* Created     : 4/28/2020
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : Full restaurant seating project
*               Input:  Fill the waiting list or select seats  
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeatingGUI {

	/**
	 * Global Variables
	 */
	private JFrame frame;
	int custNumber = 1;
	int waitListMax = 10;
	int dinersMax = 12;
	int progressBarValue = 0;
	JProgressBar progressBar = new JProgressBar();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatingGUI window = new SeatingGUI();
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
	public SeatingGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/**
		 * Data structures and progress bar initialization
		 */
		Queue<Integer> mainQueue = new LinkedList<>(); 
		LinkedList<String> mainLinkedList = new LinkedList<>();
		progressBar.setStringPainted(true);
		progressBar.setString("Waiting List: " + progressBarValue + "/" + waitListMax);
		
		/**
		 * JFrame construction
		 */
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 1350, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * btnBooth1 
		 */
		JButton btnBooth1 = new JButton("");
		btnBooth1.setBackground(new Color(204, 204, 204));
		btnBooth1.setIcon(new ImageIcon("src/images/boothEmpty.png"));
		btnBooth1.addActionListener(new ActionListener() {
			// On button click adds or removes from linked list and changes image			 
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Booth 1")) {
					mainLinkedList.remove("Booth 1");
					btnBooth1.setIcon(new ImageIcon("src/images/boothEmpty.png"));
					JOptionPane.showMessageDialog(null, "Booth 1 is Empty.", "Booth 1", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Booth 1");
					btnBooth1.setIcon(new ImageIcon("src/images/boothFull.png"));}}
		});
		
		/**
		 * btnBooth2
		 */
		JButton btnBooth2 = new JButton("");
		btnBooth2.setBackground(new Color(204, 204, 204));
		btnBooth2.setIcon(new ImageIcon("src/images/boothEmpty.png"));
		btnBooth2.addActionListener(new ActionListener() {
			// On button click adds or removes from linked list and changes image
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Booth 2")) {
					mainLinkedList.remove("Booth 2");
					btnBooth2.setIcon(new ImageIcon("src/images/boothEmpty.png"));
					JOptionPane.showMessageDialog(null, "Booth 2 is Empty.", "Booth 2", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Booth 2");
					btnBooth2.setIcon(new ImageIcon("src/images/boothFull.png"));}}
		});
		
		/**
		 * btnBooth3 
		 */
		JButton btnBooth3 = new JButton("");
		btnBooth3.setBackground(new Color(204, 204, 204));
		btnBooth3.setIcon(new ImageIcon("src/images/boothEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnBooth3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Booth 3")) {
					mainLinkedList.remove("Booth 3");
					btnBooth3.setIcon(new ImageIcon("src/images/boothEmpty.png"));
					JOptionPane.showMessageDialog(null, "Booth 3 is Empty.", "Booth 3", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Booth 3");
					btnBooth3.setIcon(new ImageIcon("src/images/boothFull.png"));}}
		});
		
		/**
		 * btnBooth4
		 */
		JButton btnBooth4 = new JButton("");
		btnBooth4.setBackground(new Color(204, 204, 204));
		btnBooth4.setIcon(new ImageIcon("src/images/boothEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnBooth4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Booth 4")) {
					mainLinkedList.remove("Booth 4");
					btnBooth4.setIcon(new ImageIcon("src/images/boothEmpty.png"));
					JOptionPane.showMessageDialog(null, "Booth 4 is Empty.", "Booth 4", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Booth 4");
					btnBooth4.setIcon(new ImageIcon("src/images/boothFull.png"));}}
		});
		
		/**
		 * btnBooth5 
		 */
		JButton btnBooth5 = new JButton("");
		btnBooth5.setBackground(new Color(204, 204, 204));
		btnBooth5.setIcon(new ImageIcon("src/images/boothEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnBooth5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Booth 5")) {
					mainLinkedList.remove("Booth 5");
					btnBooth5.setIcon(new ImageIcon("src/images/boothEmpty.png"));
					JOptionPane.showMessageDialog(null, "Booth 5 is Empty.", "Booth 5", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Booth 5");
					btnBooth5.setIcon(new ImageIcon("src/images/boothFull.png"));}}
		});
		
		/**
		 * btnBooth6
		 */
		JButton btnBooth6 = new JButton("");
		btnBooth6.setBackground(new Color(204, 204, 204));
		btnBooth6.setIcon(new ImageIcon("src/images/boothEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnBooth6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Booth 6")) {
					mainLinkedList.remove("Booth 6");
					btnBooth6.setIcon(new ImageIcon("src/images/boothEmpty.png"));
					JOptionPane.showMessageDialog(null, "Booth 6 is Empty.", "Booth 6", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Booth 6");
					btnBooth6.setIcon(new ImageIcon("src/images/boothFull.png"));}}
		});
		
		/**
		 * btnTable1
		 */
		JButton btnTable1 = new JButton("");
		btnTable1.setBackground(new Color(204, 204, 204));
		btnTable1.setIcon(new ImageIcon("src/images/tableEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnTable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Table 1")) {
					mainLinkedList.remove("Table 1");
					btnTable1.setIcon(new ImageIcon("src/images/tableEmpty.png"));
					JOptionPane.showMessageDialog(null, "Table 1 is Empty.", "Table 1", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Table 1");
					btnTable1.setIcon(new ImageIcon("src/images/tableFull.png"));}}
		});
		
		/**
		 * btnTable2
		 */
		JButton btnTable2 = new JButton("");
		btnTable2.setBackground(new Color(204, 204, 204));
		btnTable2.setIcon(new ImageIcon("src/images/tableEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Table 2")) {
					mainLinkedList.remove("Table 2");
					btnTable2.setIcon(new ImageIcon("src/images/tableEmpty.png"));
					JOptionPane.showMessageDialog(null, "Table 2 is Empty.", "Table 2", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Table 2");
					btnTable2.setIcon(new ImageIcon("src/images/tableFull.png"));}}
		});
		
		/**
		 * btnTable3
		 */
		JButton btnTable3 = new JButton("");
		btnTable3.setBackground(new Color(204, 204, 204));
		btnTable3.setIcon(new ImageIcon("src/images/tableEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnTable3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Table 3")) {
					mainLinkedList.remove("Table 3");
					btnTable3.setIcon(new ImageIcon("src/images/tableEmpty.png"));
					JOptionPane.showMessageDialog(null, "Table 3 is Empty.", "Table 3", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Table 3");
					btnTable3.setIcon(new ImageIcon("src/images/tableFull.png"));}}
		});
		
		/**
		 * btnTable4
		 */
		JButton btnTable4 = new JButton("");
		btnTable4.setBackground(new Color(204, 204, 204));
		btnTable4.setIcon(new ImageIcon("src/images/tableEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnTable4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Table 4")) {
					mainLinkedList.remove("Table 4");
					btnTable4.setIcon(new ImageIcon("src/images/tableEmpty.png"));
					JOptionPane.showMessageDialog(null, "Table 4 is Empty.", "Table 4", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Table 4");
					btnTable4.setIcon(new ImageIcon("src/images/tableFull.png"));}}
		});
		
		/**
		 * btnTable5
		 */
		JButton btnTable5 = new JButton("");
		btnTable5.setBackground(new Color(204, 204, 204));	
		btnTable5.setIcon(new ImageIcon("src/images/tableEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnTable5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Table 5")) {
					mainLinkedList.remove("Table 5");
					btnTable5.setIcon(new ImageIcon("src/images/tableEmpty.png"));
					JOptionPane.showMessageDialog(null, "Table 5 is Empty.", "Table 5", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Table 5");
					btnTable5.setIcon(new ImageIcon("src/images/tableFull.png"));}}
			});
		
		/**
		 * btnTable6
		 */
		JButton btnTable6 = new JButton("");
		btnTable6.setBackground(new Color(204, 204, 204));	
		btnTable6.setIcon(new ImageIcon("src/images/tableEmpty.png"));
		// On button click adds or removes from linked list and changes image
		btnTable6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.contains("Table 6")) {
					mainLinkedList.remove("Table 6");
					btnTable6.setIcon(new ImageIcon("src/images/tableEmpty.png"));
					JOptionPane.showMessageDialog(null, "Table 6 is Empty.", "Table 6", JOptionPane.INFORMATION_MESSAGE);}
				else {
					mainLinkedList.add("Table 6");
					btnTable6.setIcon(new ImageIcon("src/images/tableFull.png"));}}
			});
			
		/**
		 * btnAddWaitList
		 */
		JButton btnAddWaitList = new JButton("Add Waiting List");
		btnAddWaitList.addActionListener(new ActionListener() {
			// On button click adds to waiting list if space available
			public void actionPerformed(ActionEvent e) {
				if (mainQueue.size() == waitListMax){
					JOptionPane.showMessageDialog(null, "Waiting List is full.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);
				}
				else {	
				mainQueue.add(custNumber);
				JOptionPane.showMessageDialog(null, "Customer " + custNumber + " Added.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);
				progressBarValue +=10;
				progressBar.setValue(progressBarValue);
				progressBar.setString("Waiting List: " + progressBarValue/10 + "/" + waitListMax);
				custNumber++;
				}
			}
		});
		
		/**
		 * btnRemoveWaitList
		 */
		JButton btnRemoveWaitList = new JButton("Remove Waiting List");
		btnRemoveWaitList.addActionListener(new ActionListener() {
			// On button click removes from waiting list 
			public void actionPerformed(ActionEvent e) {
				if (mainQueue.size() == 0){
					JOptionPane.showMessageDialog(null, "Waiting List is empty.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);
				}
				else {						 
				int custRemove = mainQueue.remove();
				JOptionPane.showMessageDialog(null, "Customer " + custRemove + " Removed.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);
				progressBarValue -=10;
				progressBar.setValue(progressBarValue);
				progressBar.setString("Waiting List: " + progressBarValue/10 + "/" + waitListMax);
				}
			}
		});
		
		/**
		 * btnClearWaitList
		 */
		JButton btnClearWaitList = new JButton("Clear Waiting List");
		btnClearWaitList.addActionListener(new ActionListener() {
			// On button click clears waiting list
			public void actionPerformed(ActionEvent e) {
				if (mainQueue.size() == 0){
					JOptionPane.showMessageDialog(null, "Waiting List is empty.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					int listSize = mainQueue.size();
					for (int i = 0; i < listSize; i++) {
						mainQueue.remove();
					}
					JOptionPane.showMessageDialog(null, "Waiting List cleared.", "Waiting List", JOptionPane.INFORMATION_MESSAGE);				
					progressBarValue =0;
					progressBar.setValue(progressBarValue);
					progressBar.setString("Waiting List: " + progressBarValue/10 + "/" + waitListMax);
				}
			}
		});
		
		/**
		 * btnEmptySeats
		 */
		JButton btnEmptyAllSeats = new JButton("Empty All Seats");
		btnEmptyAllSeats.addActionListener(new ActionListener() {
			// On button click clears all seats from linked list and updates images
			public void actionPerformed(ActionEvent e) {
				if (mainLinkedList.size() == 0) {
					JOptionPane.showMessageDialog(null, "All Seats Are Empty", "Seats", JOptionPane.INFORMATION_MESSAGE);
				}
				else {				
					int listSize = mainLinkedList.size();
					for (int i = 0; i < listSize; i++) {
						mainLinkedList.remove();
					}
				btnBooth1.setIcon(new ImageIcon("src/images/boothEmpty.png"));
				btnBooth2.setIcon(new ImageIcon("src/images/boothEmpty.png"));
				btnBooth3.setIcon(new ImageIcon("src/images/boothEmpty.png"));
				btnBooth4.setIcon(new ImageIcon("src/images/boothEmpty.png"));
				btnBooth5.setIcon(new ImageIcon("src/images/boothEmpty.png"));
				btnBooth6.setIcon(new ImageIcon("src/images/boothEmpty.png"));
				btnTable1.setIcon(new ImageIcon("src/images/tableEmpty.png"));
				btnTable2.setIcon(new ImageIcon("src/images/tableEmpty.png"));
				btnTable3.setIcon(new ImageIcon("src/images/tableEmpty.png"));
				btnTable4.setIcon(new ImageIcon("src/images/tableEmpty.png"));
				btnTable5.setIcon(new ImageIcon("src/images/tableEmpty.png"));
				btnTable6.setIcon(new ImageIcon("src/images/tableEmpty.png"));
				JOptionPane.showMessageDialog(null, "All Seats Are Empty", "Seats", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		
		
		/**
		 * GUI Layout Stuff
		 */   		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnAddWaitList, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnRemoveWaitList, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
								.addComponent(btnEmptyAllSeats, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
							.addGap(218)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnTable5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnTable6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnBooth4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnBooth5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnBooth1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTable1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
									.addGap(75)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnTable2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnBooth2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))
							.addGap(70)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnBooth3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBooth6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTable3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
							.addGap(62)
							.addComponent(btnTable4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(388, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnClearWaitList, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
							.addGap(1185))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(1112, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(112)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBooth1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBooth2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBooth3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEmptyAllSeats, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnTable4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnTable3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnBooth6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnTable1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnTable2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
											.addGap(39)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnTable5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnTable6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
										.addComponent(btnAddWaitList, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(41)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnBooth4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnBooth5, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(btnRemoveWaitList, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnClearWaitList, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(24)))
					.addGap(35))
		);
		frame.getContentPane().setLayout(groupLayout);
	}	
}
