import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class TESTEXTRACT {

    public static void main(String[] args) {
        BufferedImage testImage = null;
        ProgSeven test = null;
        try {
            test = ProgSeven.getProgSevenFromString("/trainer_male_mid.cus");
            // System.out.println(test.getIntA() + " " + test.getIntB());
            testImage = new BufferedImage(240,240, BufferedImage.TYPE_4BYTE_ABGR);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(test != null && testImage != null) {
            int x = 0;
            int y = 0;
            for(short testShort: test.shortArray) {
                // System.out.print(x + ", " + y + " " + testShort + " ");
                testImage.setRGB(x, y, testShort);
                // System.out.print(testImage.getRGB(x, y) + " | ");
                if(x == test.intC) {
                    x = 0;
                    System.out.println();
                    y++;
                }
                x++;
            }
        }

        JFrame jFrame = new JFrame("TESTEXTRACT");
        jFrame.setPreferredSize(new Dimension(240,240));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());

        BufferedImage finalTestImage = testImage;
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(finalTestImage, 0, 0, null);
            }
        };
        pane.setPreferredSize(new Dimension(240, 240));
        jFrame.add(pane);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
