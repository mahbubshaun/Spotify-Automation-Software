import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.text.DefaultCaret;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class sp_music {

	private JFrame frame;
	protected static ChromeDriver driver2;
	protected static ChromeOptions options2;
    public static JTextArea text;
    public static String path;
    
    public static ChromeOptions options;
    
    public static WebDriver driver;
    
  
    
    public static String l;
    
    public static String ip;
    static SheetsQuickstart sp = new SheetsQuickstart();
    public static String port;
    
    public static String user;
    
    public static String passw;
    public static ArrayList<String> ar = new ArrayList<String>();
    public static ArrayList<String> ar3 = new ArrayList<String>();
    public static int off;
    
    public static String addr;
    public static String l_cat;
    public static String country;
    public static boolean ex;
    private JTextField txtztmxpgkxfbvlvyaccbqmnueswaspmsvw;
	public static String city;
	public static String state;
	protected static int p;
    
    public static JComboBox comboBox;
    
    public static String page_n;
    public static boolean re_p;
    public static int total;
    public static JTextField textField;
    public static String facebook;
	public static String instagram;
	public static String fb_like;
	public static String ins_fol;
	public static int ins_fin;
	public static double d;
	public static String montly_lisener;
	public static String follower_sp;
	public static String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					try{
						Connection myConn =null;
						
				        Statement myStmt=null;
				        ResultSet myRs=null;
				  
				        String dburl="jdbc:mysql://database-1.cuzswbxyyf4l.us-east-2.rds.amazonaws.com:3306/bots";
				        String user="root";
				        String pass="Hacershaun1";
					 myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
			           myStmt=(Statement) myConn.createStatement();
			           String sql ="Select license from bot_v where bot_name='Tom Lovett'";
			           myRs= myStmt.executeQuery(sql);
			           
			           if((myRs.next()))
			           {
			        	   String li = myRs.getString("license");
			        	   if(li.equals("true")){
			        		   sp_music window = new sp_music();
								window.frame.setVisible(true);
			        	   }
			        	   else{
			        		   JOptionPane.showMessageDialog(null, "NO internet connection or something is not right..");
			        	   }
			           }
			           
			           myConn.close();
			           myStmt.close();
			           
			           myRs.close();
			           
					}catch(Exception b)
					{
					 b.printStackTrace();
					}
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sp_music() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 667, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SPOTIFY SCRAPING SOFTWARE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 17, 371, 27);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				 String value1 = comboBox.getSelectedItem().toString();
				 
				 if ((value1.equals("SELECT HOUR"))  || txtztmxpgkxfbvlvyaccbqmnueswaspmsvw.getText().equals("") )
				 {
					 JOptionPane.showMessageDialog(null,"PLEASE SELECT REPEAT HOUR / INSERT SPREADSHEET ID");
					 
				 }
				 else{
					 
					JOptionPane.showMessageDialog(null,"Bot started");
					lblNewLabel_1.setEnabled(false);
					
				String id =	txtztmxpgkxfbvlvyaccbqmnueswaspmsvw.getText();
				
				sp.assing4(id);
					rebeet();
				 }
				
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
		lblNewLabel_1.setBounds(10, 246, 641, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 329, 641, 138);
		frame.getContentPane().add(scrollPane);
		 text = new JTextArea();
		 DefaultCaret caret = (DefaultCaret) text.getCaret();
		 caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		 text.setBackground(Color.LIGHT_GRAY);
		 text.setEditable(false);
			text.setLineWrap(true);
		       text.setWrapStyleWord(true);
		       text.setFont(new Font("Times New Roman", Font.BOLD, 15));
		       scrollPane.setViewportView(text);
		
		JLabel lblRealTimeLog = new JLabel("REALTIME LOG");
		lblRealTimeLog.setForeground(Color.WHITE);
		lblRealTimeLog.setBackground(Color.YELLOW);
		lblRealTimeLog.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRealTimeLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblRealTimeLog.setBounds(10, 304, 641, 14);
		frame.getContentPane().add(lblRealTimeLog);
		
		JLabel lblV = new JLabel("V 1.6");
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblV.setBounds(10, 19, 60, 19);
		frame.getContentPane().add(lblV);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					 
					 
					 Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"taskkill.exe /F /IM chromedriver.exe /T");
				 }catch(Exception rr)
				 {
					 
				 }
				 System.exit(0);
				
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 61, 123, 47);
		
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("images/button (29).png")));
		
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//	frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("REPEAT SEARCH IN");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 49, 641, 47);
		frame.getContentPane().add(lblNewLabel_3);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT HOUR", "1", "3", "6", "12", "24", "48", "72", "96"}));
		comboBox.setBounds(234, 103, 188, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSpreadsheetId = new JLabel("SPREADSHEET ID");
		lblSpreadsheetId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSpreadsheetId.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpreadsheetId.setForeground(Color.WHITE);
		lblSpreadsheetId.setBounds(10, 162, 641, 14);
		frame.getContentPane().add(lblSpreadsheetId);
		
		txtztmxpgkxfbvlvyaccbqmnueswaspmsvw = new JTextField();
		txtztmxpgkxfbvlvyaccbqmnueswaspmsvw.setBackground(Color.LIGHT_GRAY);
		txtztmxpgkxfbvlvyaccbqmnueswaspmsvw.setBounds(234, 215, 188, 20);
		frame.getContentPane().add(txtztmxpgkxfbvlvyaccbqmnueswaspmsvw);
		txtztmxpgkxfbvlvyaccbqmnueswaspmsvw.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 478, 641, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					 
					 
					 Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"taskkill.exe /F /IM chromedriver.exe /T");
				 }catch(Exception rr)
				 {
					 
				 }
				 System.exit(0);
			}
		});
		btnCancel.setBounds(522, 21, 117, 27);
		frame.getContentPane().add(btnCancel);
		
	
		
		
		
		
		
	
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(0, -13, 617, 592);
	//	frame.getContentPane().add(label);
		
		 ImageIcon img =new ImageIcon(getClass().getResource("images/spotify.png"));
	        
	       
	        
	        frame.setIconImage(img.getImage());
	        
	        label.setIcon(new ImageIcon(getClass().getResource("images/ps.jpg")));
	}
	
	public static void rebeet(){
		SwingWorker<Void,Void> email = new SwingWorker<Void,Void>()
				{

					private int s;
					private int i;
					private String facebook;
					private String instagram;
					private String fb_like;
					private String ins_fol;
					private int ins_fin;
					private double d;
					private String montly_lisener;
					private String follower_sp;
					private String name;
			

					@Override
					protected Void doInBackground() throws Exception {
					
						try{
							String path = new File(".").getCanonicalPath();
							System.out.println("Application path is: "+path);
							if(System.getProperty("os.name").contains("Windows"))
							{
							System.setProperty("webdriver.chrome.driver",""+path+"\\chromedriver\\chromedriver.exe");

							}else
							{
								System.setProperty("webdriver.chrome.driver",""+path+"/chromedriver/chromedriver");
							}
					//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
							
							ChromeOptions options2 = new ChromeOptions();
							options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
							options2.setExperimentalOption("useAutomationExtension", false);
						//	options2.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
		                    options2.addArguments("--disable-blink-features=AutomationControlled");
		                    options2.setCapability("requireWindowFocus", true);
		                    options2.addArguments("--ignore-certificate-errors");
		                    options2.addArguments("start-maximized");
		                   options2.addArguments("--user-data-dir=vpn_browser");
		                 //   options2.addArguments("--incognito");
		                    
		                    
		                   driver2 = new ChromeDriver(options2);
		                    
		                    String st;
		                    Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
		                    System.out.println(timestamp2);
		                    String t2 = String.valueOf(timestamp2);
                            st= "["+t2+"] Collecting links from spreadsheet";
					    	
					    	update(st);
					    	
					    	Random r = new Random();
							 int low = 5000;
							 int high = 10000;
							 
							 int ran   = r.nextInt(high-low) + low;
					   
					        
					        
					    
					       sp.assing2();
		                    sp.main(null);

		                    WebDriverWait wait=new WebDriverWait(driver2, 60);
		                    WebDriverWait wait2=new WebDriverWait(driver2, 600);
		                    Actions mo = new Actions(driver2);
		                    JavascriptExecutor jse = (JavascriptExecutor)driver2;
		                   
							 for(int l=0;l<10;l++)
							 {
				
								 for( s=0;s<ar.size();s++)
								 {
								try{
							//	System.out.println("going to:"+ar.get(s));
								timestamp2 = new Timestamp(System.currentTimeMillis());
			                    System.out.println(timestamp2);
			                     t2 = String.valueOf(timestamp2);
	                            st= "["+t2+"] Going to link: "+ar.get(s);
						    	
						    	update(st);
						    	
		                    driver2.get(ar.get(s));
		                    for (int i=0; i<100; i++){ 
								   try {
								    Thread.sleep(1000);
								    }catch (InterruptedException e) {} 
								   //To check page ready state.
								   if (jse.executeScript("return document.readyState").toString().equals("complete")){ 
									   System.out.println("page loaded ");
								    break; 
								   }   
								  }
		                    timestamp2 = new Timestamp(System.currentTimeMillis());
		                    System.out.println(timestamp2);
		                     t2 = String.valueOf(timestamp2);
                            st= "["+t2+"] Collecting information ";
					    	
					    	update(st);
		                    jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		                    name =  driver2.findElement(By.xpath("//span[contains(text(), 'monthly listeners')]/preceding-sibling::span[1]//h1")).getText();
		                    try{
		                    	
		                    WebElement rk= driver2.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[4]/main/div/div[2]/div/div/div[2]/section/div/div[4]/div[2]/div/button/div"));
		                    
		                    
		                   mo.moveToElement(rk).click().build().perform();
		                   
		                   System.out.println("element clicked");
		                   Robot clicks = new Robot();
							
							  
							
							
							
							
							
							
							clicks.keyPress(KeyEvent.VK_WINDOWS); 
			        		 clicks.keyPress(KeyEvent.VK_M);
			        		 clicks.keyRelease(KeyEvent.VK_M);
			        		 clicks.keyRelease(KeyEvent.VK_WINDOWS);
			        		 Thread.sleep(3000);
			        		 String defaultWindow = driver2.getWindowHandle();
			        		 driver2.switchTo().window(defaultWindow);
			        		 
		                    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[contains(text(), 'Monthly Listeners')]/preceding-sibling::div"))));
		                    Thread.sleep(3000);
		                     montly_lisener =  driver2.findElement(By.xpath("//div[contains(text(), 'Monthly Listeners')]/preceding-sibling::div")).getText();
		                    montly_lisener=montly_lisener.replaceAll("[^\\d.]", "");
		                    
		                    //    driver2.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/div/main/div[2]/div/aside/div/div[2]/div/div/div[2]/button[2]")).click();
		                    System.out.println(montly_lisener);
		                    follower_sp =  driver2.findElement(By.xpath("//div[contains(text(), 'Followers')]/preceding-sibling::div")).getText();
			                //    driver2.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/div/main/div[2]/div/aside/div/div[2]/div/div/div[2]/button[2]")).click();
		                    follower_sp=follower_sp.replaceAll("[^\\d.]", "");    
		                    System.out.println(follower_sp);
		                    
		                    Thread.sleep(3000);
		                    }catch(Exception gg)
		                    {
		                    	gg.printStackTrace();

								
								/*
								 StringWriter sw = new StringWriter();
								 gg.printStackTrace(new PrintWriter(sw));
						            String exceptionAsString = sw.toString();
						            System.out.println(exceptionAsString);
							 JOptionPane.showMessageDialog(null, ""+exceptionAsString+"",
								      "ERROR!", JOptionPane.ERROR_MESSAGE);
								      */
		                    	 montly_lisener =  driver2.findElement(By.xpath("//span[contains(text(), 'monthly listeners')]")).getText();
				                  montly_lisener=montly_lisener.replaceAll("[^\\d.]", "");
				                  follower_sp =  driver2.findElement(By.xpath("//div[contains(text(), 'Followers')]/preceding-sibling::div")).getText();
					                //    driver2.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/div/main/div[2]/div/aside/div/div[2]/div/div/div[2]/button[2]")).click();
				                    follower_sp=follower_sp.replaceAll("[^\\d.]", "");    
		                    }
		                    try{
		                    			
		                    facebook =  driver2.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]")).getAttribute("href");	
		                   
		                   System.out.println(facebook);
		                   
		                   
                           instagram =  driver2.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[2]")).getAttribute("href");
		                   
		                   System.out.println(instagram);
		                    
		                   driver2.get(facebook);
                        
		                //  driver2.get("https://www.facebook.com/aliciakeys/");
		                 
		                   
                  fb_like=  driver2.findElement(By.xpath("//*[contains(text(), 'people like this')]")).getText();
		                   
		                  
		                   
		                   fb_like=fb_like.replaceAll("[^\\d.]", "");
		                   
		                   System.out.println(fb_like);
		                   
		                   driver2.get(instagram);
		            //   driver2.get("https://www.instagram.com/aliciakeys/?hl=en");    
                      ins_fol=  driver2.findElement(By.xpath("/html/body/div[1]/section/main/div/header/section/ul/li[2]/a/span")).getText();
		                 d=0;
		                 
                      if(ins_fol.contains("k"))
                      {
                    	  ins_fol=ins_fol.replaceAll("[^\\d.]", "");
                    	// ins_fin = Integer.parseInt(ins_fol);
                    	  d=Double.parseDouble(ins_fol);   
                      	d= d*1000;
                    	// ins_fin = ins_fin*1000;
                    	  
                      }
                      
                      if(ins_fol.contains("m"))
                      {
                    	  ins_fol=ins_fol.replaceAll("[^\\d.]", "");
                    //	 ins_fin = Integer.parseInt(ins_fol);
                    	   d=Double.parseDouble(ins_fol);   
                    	d= d*1000000;
                    	  
                      }
		                //   System.out.println(d);
		                    		}catch(Exception fh)
		                    		{
		                    			fh.printStackTrace();
		                    			
		                    			 facebook="NOT FOUND";
		                    			 instagram="NOT FOUND";
		                    			 fb_like="NOT FOUND";
		                    			 ins_fol="NOT FOUND";
		                    			 d=0;
		                    		}

		                    				
							    	int ss=0;
							   	ss=s+2;
								
							sp.assing(ar.get(s),name,montly_lisener,follower_sp,facebook,fb_like,instagram,String.valueOf(d),String.valueOf(ss));
							   	
							  //  sp.assing(ar.get(s),"","","",fb_like,"",String.valueOf(d),String.valueOf(ss));
				                    sp.assing3();
				                    sp.main(null);
		                  
				                    timestamp2 = new Timestamp(System.currentTimeMillis());
				                    System.out.println(timestamp2);
				                     t2 = String.valueOf(timestamp2);
		                            st= "["+t2+"] All the fields are collected & saved in the sheet ,continuing next link";
		                        	update(st);
								}catch(Exception gfhy)
								{
									s=s-1;
								}
							
							 }
								
								 timestamp2 = new Timestamp(System.currentTimeMillis());
				                    System.out.println(timestamp2);
				                     t2 = String.valueOf(timestamp2);
		                            st= "["+t2+"] All profiles have been scraped , bot is now waiting for re-run after selected time interval";
		                        	update(st);
								  String value1 = comboBox.getSelectedItem().toString();
									
									int haa = Integer.parseInt(value1);
									 
									 AnnoyingBeep(haa);
									 
									 int w = haa*3600000;
									Thread.sleep(w);
								 l=0;
							 }
							 
		                    
						}catch(Exception y)
						{
							y.printStackTrace();
							
							 StringWriter sw = new StringWriter();
							 y.printStackTrace(new PrintWriter(sw));
					            String exceptionAsString = sw.toString();
					            System.out.println(exceptionAsString);
						 JOptionPane.showMessageDialog(null, ""+exceptionAsString+"",
							      "ERROR!", JOptionPane.ERROR_MESSAGE);
							      
							ar.clear();
						// driver2.close();
						// driver2.quit();
						 Thread.sleep(10000);
						// rebeet();
						}
						
						
							return null;
					}
			
				};
				email.execute();
				
	}
	
	private static void update(String st) {
		
		text.append("\n"+st);

		text.update(text.getGraphics());
		
		text.repaint();
		
}
	  public static void exist( )  {
		   	 ex=true;
		   	

		 	}
	  
	  public static void allarr(ArrayList<String> ar2 )  {
		   	 
for(int y=0;y<ar2.size();y++)
{
	ar.add(ar2.get(y));
	System.out.println(ar2.get(y));
}
		 	}
	  
	  private static int hour2;
	  static Toolkit toolkit;
	    static Timer timer;
	  
	    
	  static sp_music sts = new sp_music();
	  private JTextField textField_3;
	  private static JTextField textField_4;
	  
	  private static JTextField textField_7;
	  private static JCheckBox chckbxNewCheckBox;
	  private static JCheckBox chckbxAc;
	  private static JCheckBox chckbxNewCheckBox_1;
	private static boolean re_p2;
	  private JLabel lblNetflixQcTaker;
	
	
	
	
	  

	    public static void AnnoyingBeep(int ha) {
	    //	 hour2= (int) ha;
	    	ha = ha*3600;
	    	hour2 = ha;
		toolkit = Toolkit.getDefaultToolkit();
	        timer = new Timer();
	        timer.schedule(sts.new RemindTask(),
		               0,        //initial delay
		               1*1000);  //subsequent rate  3600000
	    }
	   
	//price_comparison f = new price_comparison(); 
	    class RemindTask extends TimerTask {
		int numWarningBeeps = hour2;
		
		//System.out.println(numWarningBeeps);
	        public void run() {
	        	//System.out.println(numWarningBeeps);
	        	
		    if (numWarningBeeps > 0) {
		    //    toolkit.beep();
		    	
		    int	hours = numWarningBeeps / 3600;
		    int	minutes = (numWarningBeeps % 3600) / 60;
		    int	seconds = numWarningBeeps % 60;

		    String	timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		        
		        textField.setText( "Time Remaining : "+timeString );
		        
		        textField.getGraphics();
		     //   f.price_comparison1(textField_12, numWarningBeeps);
		//	System.out.println("Beep!");
			numWarningBeeps--;
		    } else {
		     //   toolkit.beep(); 
textField.setText(0+ " seconds remaining,checking page again!" );
		        
				textField.getGraphics();
			
				
				
	           //     System.out.println("Time's up!");
	            //    numWarningBeeps = hour2;
	       
		        timer.cancel(); //Not necessary because we call System.exit
		    //   System.exit(0);   //Stops the AWT thread (and everything else)
		    }
	        
	        	
	        }

			
	    }
	  
	    public static void exist2(String category, String coun,String page )  {
		
		   	country = coun;
		   	l_cat=category;
		   	page_n = page;
		   	re_p = true;
		   	re_p2 = true;
		 	}
}
