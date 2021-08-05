import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TESTEXTRACT {

    public static int SCREEN_WIDTH = 480;
    public static int SCREEN_HEIGHT = 480;

    public static void main(String[] args) {
        // 0xARGB
        // mask 0xf  0xf0   0xf00    0xf000
        // mask 0xf000
        //      0x0f00
        //      0x00f0
        //      0x000f
        BufferedImage testImage = null;
        ProgSeven test = null;
        try {
            test = ProgSeven.getProgSevenFromString("/wardenmid.cus");
            // System.out.println(test.getIntA() + " " + test.getIntB());
            testImage = new BufferedImage(SCREEN_WIDTH, SCREEN_HEIGHT, BufferedImage.TYPE_INT_ARGB);

        } catch (Exception e) {
            e.printStackTrace();
        }

        if(test != null && testImage != null) {
            for(int x=0; x<test.intA; x++) {
                for(int y=0; y<test.intB; y++) {
                    testImage.setRGB(x, y, _getPixel(test.shortArray[x + y * test.intC], 4444));
                }
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

    private static int _getPixel(short pixel, int format) {
        return ((pixel & 0xf000) << 16) |
                ((pixel & 0xf00) << 12) |
                ((pixel & 0xf0) << 8) |
                ((pixel & 0xf) << 4);
    }

    public static void drawPixels(BufferedImage testImage, short[] pixels, boolean transparency, int offset, int scanlength, int x, int y, int width, int height, int manipulation, int format) {
        //System.err.println("com.nokia.mid.ui._DirectGraphics.drawPixels() not implemented.");
        System.out.println(width + " " + height);
        testImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        //P(x1, y1) = pixels[offset + (x1 - x) + (y1 - y) * scanlength],
        //for each P(x1, y1), where (x <= x1 < x + width) and (y <= y1 < y +
        //height).
        for (int ix = 0; ix < width; ++ix) {
            for (int iy = 0; iy < height; ++iy) {
                testImage.setRGB(ix, iy, _getPixel(pixels[offset + ix + iy * scanlength], format));
            }
        }
    }

}
