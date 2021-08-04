import java.util.Random;
import java.io.DataInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgSix
{
    private static Object b;
    static int a;

    private ProgSix() {
    }

    static byte[] a(final int n, final InputStream inputStream) throws Exception {
        if (n > 0) {
            final byte[] b = new byte[n];
            inputStream.read(b);
            return b;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read;
        while ((read = inputStream.read()) != -1) {
            byteArrayOutputStream.write(read);
        }
        return byteArrayOutputStream.toByteArray();
    }

    static String b(final String str) {
        if (str.startsWith("/")) {
            return str;
        }
        return "/" + str;
    }

    static DataInputStream a(final String s) throws Exception {
        return ESGame.a(s);
    }

    static int a(final int n) {
        return ESGame.f(n);
    }

    static int a(final Random random, final int n) {
        return ESGame.a(random, n);
    }

    static String b(final int i, final int j) {
        return i + "," + j;
    }

    static String a(final String s, final String s2, final int i) {
        return a(s, s2, "" + i);
    }

    static String a(final String s, final String s2, final String[] array) {
        final int length = array.length;
        String a = s;
        for (int i = 0; i < length; ++i) {
            a = a(a, s2, array[i]);
        }
        return a;
    }

    static String a(final String s, final String str, final String str2) {
        if (s == null || str == null) {
            return s;
        }
        final int index = s.indexOf(str);
        if (index < 0) {
            return s;
        }
        String substring = s.substring(0, index);
        if (substring == null) {
            substring = "";
        }
        String substring2 = s.substring(index + str.length());
        if (substring2 == null) {
            substring2 = "";
        }
        return substring + str2 + substring2;
    }

    static int a(final int n, int n2) {
        n2 |= 1 << n;
        return n2;
    }

    static int c(final int n, int n2) {
        n2 &= ~(1 << n);
        return n2;
    }

    static byte b(final byte b, final byte b2) {
        return (byte)(b2 | b);
    }

    static byte c(final byte b, final byte b2) {
        return (byte)(b2 & ~b);
    }

    static boolean a(final byte b, final byte b2) {
        return (b2 & b) != 0x0;
    }

    static long a(final byte[] array, final int n) {
        long n2 = 0L;
        for (int i = 0; i < 8; ++i) {
            n2 |= (long)(array[i + n] & 0xFF) << (7 - i) * 8;
        }
        return n2;
    }

    public static String[] c(String trim) {
        trim = trim.trim();
        int n = 1;
        final int length = trim.length();
        int n2 = 0;
        for (int i = 0; i < length; ++i) {
            if (trim.charAt(i) == ' ') {
                if (n2 == 0) {
                    ++n;
                    n2 = 1;
                }
            }
            else {
                n2 = 0;
            }
        }
        final String[] array = new String[n];
        int n3 = 0;
        int n4 = 0;
        for (int j = 0; j < length; ++j) {
            if (trim.charAt(j) == ' ') {
                if (n2 == 0) {
                    array[n4++] = trim.substring(n3, j);
                    n3 = j + 1;
                    n2 = 1;
                }
                else {
                    ++n3;
                }
            }
            else {
                n2 = 0;
            }
        }
        array[n4] = trim.substring(n3, length);
        return array;
    }

    static {
        ProgSix.a = 0;
        ProgSix.b = new Object();
    }
}