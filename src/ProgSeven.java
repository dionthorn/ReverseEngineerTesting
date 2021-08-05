import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgSeven
{
    int intA;
    int intB;
    int intC;
    boolean booleanA;
    short shortA;
    short shortB;
    short[] shortArray;
    static short[] staticShortArray;

    private ProgSeven() {
        final int n = 0;
        this.intB = n;
        this.intA = n;
        this.shortArray = null;
        this.shortB = -1;
    }

    static ProgSeven getProgSevenFromString(final String s) throws Exception {
        final InputStream resourceAsStream = Object.class.getResourceAsStream(getFormalizedString(s));
        if (resourceAsStream == null) {
            throw new Exception("Image " + s + " is null!");
        }
        final ProgSeven ProgSeven = new ProgSeven();
        ProgSeven.intA = getBigINS(resourceAsStream);
        ProgSeven.intB = getBigINS(resourceAsStream);
        ProgSeven.intC = ProgSeven.intA;
        ProgSeven.booleanA = (resourceAsStream.read() & 0xFF) != 0x0;
        ProgSeven.shortA = getSmallINS(resourceAsStream);
        final int n = resourceAsStream.read() & 0xFF;
        if (n > 255) {
            throw new Exception("Too many colors in image " + s);
        }
        for (int i = 0; i < n; ++i) {
            final short a = getSmallINS(resourceAsStream);
            staticShortArray[i] = a;
            if (ProgSeven.booleanA && ProgSeven.shortB < 0 && ProgSeven.shortA == a) {
                ProgSeven.shortB = (short)i;
            }
        }
        final int n2 = ProgSeven.intA * ProgSeven.intB;
        ProgSeven.shortArray = new short[n2];
        for (int j = 0; j < n2; ++j) {
            final int n3 = resourceAsStream.read() & 0xFF;
            final short n4 = staticShortArray[n3];
            short n5;
            if (ProgSeven.booleanA && n3 == ProgSeven.shortB) {
                n5 = (short)(n4 & 0xFFFF0FFF);
            }
            else {
                n5 = (short)(n4 | 0xF000);
            }
            ProgSeven.shortArray[j] = n5;
        }
        return ProgSeven;
    }

    int getIntA() {
        return this.intA;
    }

    int getIntB() {
        return this.intB;
    }

    private static String getFormalizedString(final String str) {
        if (str.startsWith("/")) {
            return str;
        }
        return "/" + str;
    }

    private static int getBigINS(final InputStream inputStream) throws Exception {
        return 0x0 | inputStream.read() << 24 | inputStream.read() << 16 | inputStream.read() << 8 | inputStream.read();
    }

    private static short getSmallINS(final InputStream inputStream) throws Exception {
        return (short)((0x0 | inputStream.read() << 8 | inputStream.read()) & 0xFFFF);
    }

    static {
        ProgSeven.staticShortArray = new short[256];
    }
}