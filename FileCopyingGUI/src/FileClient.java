import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;


public class FileClient {

	JFrame frm;
	JLabel lblSource , lblDest;
	JTextField txtSource, txtDest;
	JButton startButton, stopButton;
	 
	JTextArea textArea;
	
	JProgressBar progressBar;
    
	String source, dest, content;
	
	public static void main(String[] args) {
		FileClient fileClient=new FileClient();
		fileClient.setUI();
	}

	public void setUI(){
		frm=new JFrame("File Copy");
		frm.setSize(200,200);
		frm.setVisible(true);
		frm.setLayout(new FlowLayout());
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//init components
		
		lblSource=new JLabel("Source Path");
		lblDest=new JLabel("Dest Path");
		
		txtSource=new JTextField(10);
		txtDest=new JTextField(10);
		
		textArea=new JTextArea(" ",10,20);
		
		startButton=new JButton("START");
		stopButton=new JButton("STOP");
		stopButton.setVisible(false);
		
		frm.add(lblSource);
		frm.add(txtSource);
		frm.add(lblDest);
		frm.add(txtDest);
		
		frm.add(startButton);
		frm.add(stopButton);
		
		frm.add(textArea);
		
		//add action listener
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				source=txtSource.getText();
				dest=txtDest.getText();
				
				try {
					copyFile(source,dest);
					startProgress();
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
		//action Listener for Stop
		
		stopButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				progressBar.setVisible(false);
				textArea.setText(content);
			}
		});
		
		
	}
	
	public void copyFile(String src,String dest) throws Exception {
		content=new String(Files.readAllBytes(Paths.get(src)));
		System.out.println(content);
		PrintWriter outPrintWriter=new PrintWriter(dest);
		outPrintWriter.println(content);
		outPrintWriter.close();
	}
	
	public void startProgress() {
		progressBar=new JProgressBar(0,100);
		progressBar.setString("Copying");
		progressBar.setStringPainted(true);
        progressBar.setIndeterminate(true);
		progressBar.setVisible(true);
		stopButton.setVisible(true);
		frm.add(progressBar);
	}

}
