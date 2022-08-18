package Backend;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author HarryYo
 */
public class Scaling {

    public static ImageIcon scale(ImageIcon img, JLabel label) {
        Image image = img.getImage();
        image = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public static ImageIcon scale(ImageIcon img, JButton btn) {
        Image image = img.getImage();
        image = image.getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }
    
    public static ImageIcon scale(ImageIcon img,int length,int width){
         Image image = img.getImage();
        image = image.getScaledInstance(length, width, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

}
