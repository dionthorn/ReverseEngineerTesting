import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import javax.imageio.ImageTypeSpecifier;

public class TESTEXTRACT {

    public static int SCREEN_WIDTH = 480;
    public static int SCREEN_HEIGHT = 480;

    public static void main(String[] args) {
        // mask 0xf 0xf0 0xf00 0xf000
        ImageTypeSpecifier pixelType = ImageTypeSpecifier.createPacked(ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB), 0xf0, 0xf00, 0xf00, 0xf, DataBuffer.TYPE_USHORT, false);
        BufferedImage testImage = null;
        ProgSeven test = null;
        try {
            test = ProgSeven.getProgSevenFromString("/trainer_male_mid.cus");
            // System.out.println(test.getIntA() + " " + test.getIntB());
            testImage = pixelType.createBufferedImage(SCREEN_WIDTH, SCREEN_HEIGHT);

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
        jFrame.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());

        BufferedImage finalTestImage = testImage;
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.black);
                g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
                g.drawImage(finalTestImage, SCREEN_WIDTH/3, SCREEN_HEIGHT/3, null);
            }
        };
        pane.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        jFrame.add(pane);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
