package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	int rand =0;

	public static void main(String[] args) {
	}
    public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        frame.pack();
      

   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Woohoo");
		rand = new Random().nextInt(5);
	System.out.println(rand);
	if (rand == 0) {
		JOptionPane.showMessageDialog(null, "You will encounter a new oppurtunity today...");
	}
	else if (rand == 1) {
		JOptionPane.showMessageDialog(null, "You will realize a new aspect of life...");
	}
	else if (rand == 2) {
		JOptionPane.showMessageDialog(null, "You will have a wish come true today...");
	}
	else {
		JOptionPane.showMessageDialog(null, "Ignore prevoius fortune...");
	}
	}
}


