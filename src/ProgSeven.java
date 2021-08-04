import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgSeven
{
    int e;
    int a;
    int h;
    boolean c;
    short d;
    short f;
    short[] g;
    static short[] b;

    private ProgSeven() {
        final int n = 0;
        this.a = n;
        this.e = n;
        this.g = null;
        this.f = -1;
    }

    static ProgSeven b(final String s) throws Exception {
        final InputStream resourceAsStream = Object.class.getResourceAsStream(a(s));
        if (resourceAsStream == null) {
            throw new Exception("Image " + s + " is null!");
        }
        final ProgSeven ProgSeven = new ProgSeven();
        ProgSeven.e = b(resourceAsStream);
        ProgSeven.a = b(resourceAsStream);
        ProgSeven.h = ProgSeven.e;
        if ((resourceAsStream.read() & 0xFF) != 0x0) {
            ProgSeven.c = true;
        }
        else {
            ProgSeven.c = false;
        }
        ProgSeven.d = a(resourceAsStream);
        final int n = resourceAsStream.read() & 0xFF;
        if (n > 255) {
            throw new Exception("Too many colors in image " + s);
        }
        for (int i = 0; i < n; ++i) {
            final short a = a(resourceAsStream);
            ProgSeven.b[i] = a;
            if (ProgSeven.c && ProgSeven.f < 0 && ProgSeven.d == a) {
                ProgSeven.f = (short)i;
            }
        }
        final int n2 = ProgSeven.e * ProgSeven.a;
        ProgSeven.g = new short[n2];
        for (int j = 0; j < n2; ++j) {
            final int n3 = resourceAsStream.read() & 0xFF;
            final short n4 = ProgSeven.b[n3];
            short n5;
            if (ProgSeven.c && n3 == ProgSeven.f) {
                n5 = (short)(n4 & 0xFFFF0FFF);
            }
            else {
                n5 = (short)(n4 | 0xF000);
            }
            ProgSeven.g[j] = n5;
        }
        return ProgSeven;
    }

    int a() {
        return this.e;
    }

    int b() {
        return this.a;
    }

    private static String a(final String str) {
        if (str.startsWith("/")) {
            return str;
        }
        return "/" + str;
    }

    private static int b(final InputStream inputStream) throws Exception {
        return 0x0 | inputStream.read() << 24 | inputStream.read() << 16 | inputStream.read() << 8 | inputStream.read();
    }

    private static short a(final InputStream inputStream) throws Exception {
        return (short)((0x0 | inputStream.read() << 8 | inputStream.read()) & 0xFFFF);
    }

    static {
        ProgSeven.b = new short[256];
    }
}