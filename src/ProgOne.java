import java.util.Random;
import java.io.DataInputStream;

//
// Decompiled by Procyon v0.5.36
//

public class ProgOne
{
    static int x;
    static String[] linesA;
    static int y;
    static String[] linesB;
    static byte[] bytesA;
    static byte[] bytesB;
    static byte[] bytesC;
    static short[] shortsA;
    static short[] shortsB;
    static byte[] bytesD;
    static String[][] stringMatrix;
    static byte[][] byteMatrix;
    static byte byteZ;
    static short shortZ;

    ProgOne() {
    }

    static short incrementShortZ() {
        return (++ProgOne.shortZ);
    }

    static int nMinus(final int n) {
        return n - 1;
    }

    static boolean bytesDCheck(final int n) {
        return ProgOne.bytesD[nMinus(n)] != -1;
    }

    static boolean bytesACheck(final int n) {
        switch (ProgOne.bytesA[nMinus(n)]) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    static int getBytesDint(final int n) {
        return ProgOne.bytesD[nMinus(n)];
    }

    static String getLinesBString(final int n) {
        return ProgOne.linesB[nMinus(n)];
    }

    static int getIntFromBytesAndShorts(final int n, final int n2) {
        final int e = nMinus(n2);
        int n3;
        switch (n) {
            case 1 -> n3 = ProgOne.bytesA[e];
            case 2 -> n3 = ProgOne.bytesB[e];
            case 3 -> n3 = ProgOne.bytesC[e];
            case 4 -> n3 = ProgOne.shortsA[e];
            case 5 -> n3 = ProgOne.shortsB[e];
            case 6 -> n3 = ProgOne.bytesD[e];
            default -> n3 = -1;
        }
        return n3;
    }

    static void loadItems() throws Exception {
        ProgOne.shortZ = 0;
        loadItemsIn();
        loadDroppedItems();
    }

    static void loadItemsIn() throws Exception {
        final DataInputStream a = ProgSix.getDISFromName("/itemsin.dat");
        ProgOne.x = a.readShort();
        ProgOne.linesA = new String[ProgOne.x];
        for (int i = 0; i < ProgOne.x; ++i) {
            ProgOne.linesA[i] = a.readUTF();
        }
        ProgOne.y = a.readShort();
        ProgOne.linesB = new String[ProgOne.y];
        ProgOne.bytesA = new byte[ProgOne.y];
        ProgOne.bytesB = new byte[ProgOne.y];
        ProgOne.bytesC = new byte[ProgOne.y];
        ProgOne.shortsA = new short[ProgOne.y];
        ProgOne.shortsB = new short[ProgOne.y];
        ProgOne.bytesD = new byte[ProgOne.y];
        for (int j = 0; j < ProgOne.y; ++j) {
            ProgOne.linesB[j] = a.readUTF();
        }
        for (int k = 0; k < ProgOne.y; ++k) {
            ProgOne.bytesA[k] = a.readByte();
        }
        for (int l = 0; l < ProgOne.y; ++l) {
            ProgOne.bytesB[l] = a.readByte();
        }
        for (int n = 0; n < ProgOne.y; ++n) {
            ProgOne.bytesC[n] = a.readByte();
        }
        for (int n2 = 0; n2 < ProgOne.y; ++n2) {
            ProgOne.shortsA[n2] = a.readShort();
        }
        for (int n3 = 0; n3 < ProgOne.y; ++n3) {
            ProgOne.shortsB[n3] = a.readShort();
        }
        for (int n4 = 0; n4 < ProgOne.y; ++n4) {
            ProgOne.bytesD[n4] = a.readByte();
        }
        a.close();
    }

    static void loadDroppedItems() throws Exception {
        final DataInputStream a = ProgSix.getDISFromName("/droppeditemsin.dat");
        final short short1 = a.readShort();
        ProgOne.byteZ = (byte)short1;
        System.out.println("numTableRows=" + ProgOne.byteZ);
        final short short2 = a.readShort();
        ProgOne.byteMatrix = new byte[short1][short2];
        for (short n = 0; n < short1; ++n) {
            for (short n2 = 0; n2 < short2; ++n2) {
                ProgOne.byteMatrix[n][n2] = a.readByte();
            }
        }
        a.close();
    }

    static int getRandomFromBytesAB(final Random random, final int n) {
        int n2 = -1;
        int n3 = -1;
        for (int i = 0; i < ProgOne.y; ++i) {
            if (ProgOne.bytesA[i] == 11 && ProgOne.bytesB[i] == (byte)n) {
                if (n2 == -1) {
                    n2 = i;
                }
                n3 = i;
            }
        }
        return 1 + (n2 + Math.abs(random.nextInt() % (n3 - n2 + 1)));
    }

    static int getRandomFromByteZAndMatrix(final Random random, final int n, final int n2) {
        int a = ProgSix.getRandomFromESG(random, 100);
        for (int i = 1; i < n2; ++i) {
            final int a2 = ProgSix.getRandomFromESG(random, 100);
            if (a2 > a) {
                a = a2;
            }
        }
        final int n3 = a;
        int n4;
        if (n3 <= 64) {
            n4 = 0;
        }
        else if (n3 <= 75) {
            n4 = 1;
        }
        else if (n3 <= 90) {
            n4 = 3;
        }
        else {
            n4 = 4;
        }
        int n5 = ProgSix.getRandomFromESG(random, 10) + (n - 2);
        if (n5 > ProgOne.byteZ - 1) {
            n5 = ProgOne.byteZ - 1;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        int j = ProgOne.byteMatrix[n5][n4];
        if (n4 == 1) {
            j |= ProgOne.byteMatrix[n5][2] << 8;
        }
        System.out.println("in getRandomItem, res = " + j);
        return j;
    }

    static String[] getLines() {
        final String[] array = new String[13];
        for (int i = 0; i < 13; ++i) {
            array[i] = ProgOne.linesB[86 + i];
        }
        return array;
    }

    static {
        ProgOne.stringMatrix = new String[][] { { "Warp to camp", "" }, { "Cures ailment", "" }, { "Restores Health", "" }, { "Restores Magicka", "" }, { "", "" }, { "Grants level", "experience" }, { "Health & Magicka", "" }, { "Increase harm", "" }, { "Increase armor", "" }, { "Safe camping", "" }, { "Kill monster", "" }, { "Kill monster", "" }, { "Kill monster", "" } };
    }
}