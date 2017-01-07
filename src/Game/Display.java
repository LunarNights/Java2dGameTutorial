package Game;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Display extends Canvas {
        private static final long serialVersionUID = -240840600533728354L;
        public Display(int width,int height, String title, Game game){
                JFrame frame = new JFrame(title);
                frame.setPreferredSize(new Dimension(width,height));
                frame.setMaximumSize(new Dimension(width,height));
                frame.setMinimumSize(new Dimension(width,height));             
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setLayout(new BorderLayout());
                frame.setLocationRelativeTo(null);
                frame.add(game, BorderLayout.CENTER);
                frame.pack();
                frame.setVisible(true);
                game.start();
        }
}