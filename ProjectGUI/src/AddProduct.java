import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProduct extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ProductDetails");
		lblNewLabel.setBounds(166, 22, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PId");
		lblNewLabel_1.setBounds(31, 70, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(97, 67, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pname");
		lblNewLabel_2.setBounds(31, 122, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 119, 167, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 169, 163, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quaty");
		lblNewLabel_3.setBounds(31, 172, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		final JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					int quty=Integer.parseInt(textField_2.getText());
					String str1="insert into addproduct values('"+pid+"','"+pname+"','"+quty+"')";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javab14","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton,"AddData...");
				}
				catch(ClassNotFoundException t)
				{
					System.out.println(t);
				}
				catch(SQLException t1)
				{
					System.out.println(t1);
				}
			}
		});
		btnNewButton.setBounds(31, 275, 89, 23);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String str2="select * from addproduct where productid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javab14","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str2);
					rs.next();
					String t1=rs.getString(2);
					String t2=rs.getString(3);
					
					textField_1.setText(t1);
					textField_2.setText(t2);
					
					JOptionPane.showMessageDialog(btnNewButton_1,"Searching...");
				}
				catch(ClassNotFoundException t)
				{
					System.out.println(t);
				}
				catch(SQLException t1)
				{
					System.out.println(t1);
				}
			}
		});
		btnNewButton_1.setBounds(175, 275, 89, 23);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					
					String str3="update addproduct set productname='"+pname+"' where productid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javab14","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str3);
					JOptionPane.showMessageDialog(btnNewButton_2,"UpdatedData...");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_2.setBounds(304, 275, 89, 23);
		contentPane.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					
					
					String str4="delete addproduct where productid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javab14","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str4);
					JOptionPane.showMessageDialog(btnNewButton_3,"deletedData...");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_3.setBounds(304, 199, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
