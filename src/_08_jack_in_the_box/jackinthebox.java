package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jackinthebox implements ActionListener {
	int presses = 0;
	  JFrame frame = new JFrame();
	  JFrame frame2 = new JFrame();
	  JPanel panel = new JPanel();
	void createUI() {
		frame2.setPreferredSize(new Dimension(500, 100));
		JButton button = new JButton();
		frame2.setVisible(true);
		panel.add(button);
		frame2.add(panel);
		frame2.pack();
		button.addActionListener(this);
	}
	 void showPicture(String fileName) {
	    try {
	        JLabel imageLabel = createLabelImage(fileName);
	      frame.setPreferredSize(new Dimension(500, 500));
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(imageLabel);
	        frame.setVisible(true); frame.pack();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private  JLabel createLabelImage(String fileName) {
		try {
	            java.net.URL imageURL = getClass().getResource(fileName);
	            if (imageURL == null) {
		       System.err.println("Could not find image " + fileName);
		       return new JLabel();
	            } else {
	                Icon icon = new ImageIcon(imageURL);
	                JLabel imageLabel = new JLabel(icon);
	                return imageLabel;
	            }
	        } catch (Exception e) {
	            System.err.println("Could not find image " + fileName);
	            return new JLabel();
	        }
	}
	private void playSound(String soundFile) { 
	    try {
	        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	        sound.play();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jackinthebox jack = new jackinthebox();
		presses++;
		if (presses == 5) {
			jack.showPicture("jackInTheBox.png");
			frame.pack();
		}
	}
}



