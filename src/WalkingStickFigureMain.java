import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingStickFigureMain {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Walking stick figure");
		myFrame.setLayout(null);
		myFrame.setBounds(400, 0, 500, 700);
		
		WalkingStickFigure man = new WalkingStickFigure();
		man.setLocation(11, 11);
		myFrame.add(man);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Timer t1 = new Timer(100, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				man.move();
				man.repaint();
			}
			
		});
		t1.start();
	}
}