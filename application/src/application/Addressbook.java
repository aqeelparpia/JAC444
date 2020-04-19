/**********************************************
Workshop #3
Course: JAC444 - 4
Last Name: PARPIA
First Name: AQEEL
ID: 127921161
Section: JAC444SEE
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<march 20>
**********************************************/

package application;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.*;

public class Addressbook {

    private JFrame frame;
    private JTextField name;
    private JTextField street;
    private JTextField city;
    private JTextField state;
    private JTextField zip;

    //main
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Addressbook window = new Addressbook();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   //Application
    public Addressbook() {
        initialize();
    }

   //Gui frame display
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(10, 178, 66, 32);
        frame.getContentPane().add(btnAdd);
        
        JButton btnFirst = new JButton("First");
        btnFirst.setBounds(80, 178, 68, 32);
        frame.getContentPane().add(btnFirst);
        
        JButton btnNext = new JButton("Next");
        btnNext.setBounds(150, 178, 70, 32);
        frame.getContentPane().add(btnNext);
        
        JButton btnPrevious = new JButton("Previous");
        btnPrevious.setBounds(220, 178, 72, 32);
        frame.getContentPane().add(btnPrevious);
        
        JButton btnLast = new JButton("Last");
        btnLast.setBounds(290, 178, 74, 32);
        frame.getContentPane().add(btnLast);
        
        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(360, 178, 76, 32);
        frame.getContentPane().add(btnUpdate);
        
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(17, 22, 46, 32);
        frame.getContentPane().add(lblName);
        
        name = new JTextField();
        name.setBounds(76, 23, 171, 31);
        frame.getContentPane().add(name);
        name.setColumns(10);
        
        JLabel lblStreet = new JLabel("Street");
        lblStreet.setBounds(17, 92, 46, 29);
        frame.getContentPane().add(lblStreet);
        
        street = new JTextField();
        street.setBounds(73, 89, 174, 32);
        frame.getContentPane().add(street);
        street.setColumns(10);
        
        JLabel lblCity = new JLabel("City");
        lblCity.setBounds(17, 153, 46, 14);
        frame.getContentPane().add(lblCity);
        
        city = new JTextField();
        city.setBounds(50, 150, 104, 23);
        frame.getContentPane().add(city);
        city.setColumns(10);
        
        JLabel lblState = new JLabel("State");
        lblState.setBounds(164, 153, 46, 14);
        frame.getContentPane().add(lblState);
        
        state = new JTextField();
        state.setBounds(201, 149, 86, 23);
        frame.getContentPane().add(state);
        state.setColumns(10);
        
        JLabel lblZip = new JLabel("Zip");
        lblZip.setBounds(297, 153, 46, 14);
        frame.getContentPane().add(lblZip);
        
        zip = new JTextField();
        zip.setBounds(321, 150, 86, 23);
        frame.getContentPane().add(zip);
        zip.setColumns(10);
    }


    // Read the first address from the file
	private void first() {
		try ( // Create a random access file
			RandomAccessFile inout = 
				new RandomAccessFile("AddressBook.dat", "rw");
		) {
			if (inout.length() > 0) {
				inout.seek(0);
				read(inout);
				System.out.println("Reading address #1");
				int count = 1;
			}
			else {
				System.out.println("Address is empty!");
			}
		}
		catch (IOException ex) {}
	}

	//Read the next Address from the file 
	private void next() {
		try (
			RandomAccessFile inout = 
				new RandomAccessFile("AddressBook.dat", "rw");
		) {
			int count = 0;
			if (count * 91 < inout.length()) {
				inout.seek(count * 91);
				read(inout);
				count++;
				System.out.println("Reading address #" + count);
			}
			else {
				System.out.println("End of file!");
			}
		}
		catch (IOException ex) {}
	}

	//Read the previous Address from the file
	private void previous() {
		try ( 
			RandomAccessFile inout = 
				new RandomAccessFile("AddressBook.dat", "rw");
		) {
			int count = 0;
			if (count > 1) 
				count--;
			else
				count = 1;
			inout.seek((count * 91) - 91);
			read(inout);
			System.out.println("Reading address #" + count);
		}
		catch (IOException ex) {}
	}

	//Read last address from file 
	private void last() {
		try (
			RandomAccessFile inout = 
				new RandomAccessFile("AddressBook.dat", "rw");
		) {
			int count = ((int)inout.length()) / 91;
			inout.seek((count * 91) - 91);
			read(inout);
			System.out.println("Reading address #" + count);
		}
		catch (IOException ex) {}
	}
	
	private void read(RandomAccessFile inout) {
		// TODO Auto-generated method stub
		
	}

		//Edit and address in file 
		private void update() {
			try ( 
				RandomAccessFile inout = 
					new RandomAccessFile("AddressBook.dat", "rw");
			) {
			 	int count = 0;
				inout.seek(count * 91 - 91);
			 	write(inout);
			}
			catch (FileNotFoundException ex) {}
			catch (IOException ex) {}
		}

	private void write(RandomAccessFile inout) {
		// TODO Auto-generated method stub
		
	}

	
}