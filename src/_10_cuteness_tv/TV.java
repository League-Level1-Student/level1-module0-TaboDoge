package _10_cuteness_tv;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	Boolean pressed1 = false;
	Boolean pressed2 = false;
	Boolean pressed3 = false;
	
 void soundbar() {
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.setVisible(true);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	
}	
 void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}
public static void playVideo(String videoID) {
	// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't work on
	// some Linux implementations
    try{
	if (System.getProperty("os.name").toLowerCase().contains("linux")) {
			if (Runtime.getRuntime().exec(new String[] { "which", "xdg-open" }).getInputStream().read() != -1) {
				Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
			}
	} else {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
	}	
        } catch (Exception e) {
			e.printStackTrace();
		}
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton) e.getSource();
		if (button1  == buttonclicked) {
	showDucks();
		}
		if (button2 == buttonclicked) {
showFrog();
}
		if (button3 == buttonclicked) {
			showFluffyUnicorns();
		}
	}

}


