package EmailApp;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppGUI {
 
  private JFrame loginWindow = new JFrame("SafeIT");
  private JFrame registerWindow = new JFrame("SafeIT");
  AppGUI(){
	  final JTextField username=new JTextField();
	  final JTextField password=new JTextField();
	  final JTextField company=new JTextField();
	  final  JLabel usernameShow = new JLabel("Enter First Name");
	  final  JLabel passwordShow = new JLabel("Enter Last Name");
	  final JLabel com = new JLabel("Enter Company Name");
	  final  JLabel Info = new JLabel("Random Email Id and Password Generator");
	  username.setBounds(100,50, 150,20);
	    
	    password.setBounds(100,100, 150,20); 
	    company.setBounds(100,150, 150,20); 
	
	    usernameShow.setBounds(100,30,150,20);
	    passwordShow.setBounds(100,80 ,150, 20);
	    Info.setBounds(50,5, 300, 20);
	    com.setBounds(100, 130, 150, 20);
	  //  this.loginWindow.add(usernameShow);
	   // this.loginWindow.add(usernameShow);
	    //JButton reg=new JButton("New User (Registration)");
	    		 
	    JButton log=new JButton("Generate");
	    		//new ImageIcon("C:\\Users\\Alline\\Downloads\\icons8-key-128.png"));  
	    log.setBounds(100,200,150,30);  
	    //reg.setBounds(100,200,95,30);
	    log.addActionListener((ActionListener) new ActionListener(){  
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	Email email =	new Email(username.getText(),password.getText(),company.getText());
	String[] gen = email.showInfo();
     infoScreen(gen);
	}  
	    });
	    //this.loginWindow.setBackground();
	    this.loginWindow.add(log);
	    this.loginWindow.setBackground(Color.cyan);
	    this.loginWindow.setForeground(Color.darkGray);
	   // this.loginWindow.add(reg);
	    this.loginWindow.add(Info);
	    this.loginWindow.add(username);
	    this.loginWindow.add(password);
	    this.loginWindow.add(company);
	    this.loginWindow.add(com);
	    this.loginWindow.add(usernameShow);
	    this.loginWindow.add(passwordShow);
	    this.loginWindow.setSize(400,400);  
	    this.loginWindow.setLayout(null);  
	    this.loginWindow.setVisible(true);  
	    
  }
  public void infoScreen(String[] string)
  {
	  final  JLabel ShowUsername = new JLabel("Username :"+string[0]);
	  final  JLabel ShowPassword = new JLabel("password :"+string[1]);
	  //final  JLabel ShowCompnay = new JLabel("password :"+string[1]);
	  ShowUsername.setBounds(50,50,300,100);
	  ShowPassword.setBounds(50,100,200,100);
	  this.registerWindow.add(ShowUsername);
	  this.registerWindow.add(ShowPassword);
	  this.registerWindow.setSize(400,400);  
	  this.registerWindow.setLayout(null);  
	    this.registerWindow.setVisible(true);  
	    this.registerWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
}
