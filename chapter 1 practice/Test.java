

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "https://cdn.artstation.com/p/assets/images/images/001/084/641/large/deryl-braun-samus-5.jpg?1439730503");
        JOptionPane.showMessageDialog(null, "Hello", "Samus",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(ImageLocation));
        }
    }