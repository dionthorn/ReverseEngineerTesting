import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgNine
{
    static String[][] c;
    static final int[][] l;
    static final byte[] q;
    static final int[] n;
    byte o;
    byte a;
    short g;
    short y;
    byte[][] w;
    short[] f;
    short[] d;
    short p;
    short i;
    short r;
    short b;
    short s;
    short v;
    boolean k;
    Vector m;
    Vector j;
    Vector t;
    Random e;
    byte[] x;
    int[] u;
    boolean h;

    public ProgNine() {
        this.k = false;
        this.u = new int[2];
        this.h = false;
    }

    public ProgNine(final byte o, final byte[] x) {
        this();
        this.o = o;
        this.i();
        this.g = 35;
        this.y = 35;
        this.f = new short[2];
        this.d = new short[6];
        this.x = x;
        this.s = this.x[4];
        this.v = this.x[5];
    }

    public ProgNine(final byte o, final byte[] x, final int n, final int n2, final byte[][] w) {
        this();
        this.o = o;
        this.i();
        this.g = (short)n;
        this.y = (short)n2;
        this.w = w;
        this.f = new short[2];
        this.d = new short[6];
        this.x = x;
        this.s = this.x[4];
        this.v = this.x[5];
        int n3 = 6;
        if (ProgEleven.d) {
            ++n3;
        }
        for (int i = 0; i < n3; ++i) {
            final byte[] array = this.w[ProgEleven.j[i]];
            final byte b = ProgEleven.i[i];
            array[b] |= 0x20;
        }
        this.k = true;
    }

    void i() {
        this.a = 1;
        if (this.o >= 2 && this.o <= 37) {
            this.a = ProgNine.q[this.o - 2];
        }
    }

    void c() {
        final int size = this.t.size();
        final short n = (short)(this.o << 8);
        for (int i = 0; i < size; ++i) {
            final short[] array = this.t.elementAt(i);
            ProgFour ProgFour = null;
            if (this.o == 37 && i == size - 1) {
                ProgFour = ProgFour.getProgFourRandom(this.e, this, 41);
            }
            else {
                ProgFour = ProgFour.getProgFourRandom(this.e, this, -1);
            }
            this.a(ProgFour, array);
            ProgFour.updateHashTable();
        }
        System.gc();
    }

    void a(final ProgFour ProgFour, final short[] array) {
        ProgFour.byteC = (byte)array[4];
        ProgFour.byteD = (byte)array[5];
        final byte[] array2 = this.w[ProgFour.byteC];
        final byte m = ProgFour.byteD;
        array2[m] |= 0x2;
    }

    void c(final int n) {
        final int size = this.t.size();
        for (int i = 0; i < n; ++i) {
            short n2;
            short n3;
            ProgFour a;
            do {
                final int abs = Math.abs(this.e.nextInt() % size);
                a = ProgFour.getProgFour(this);
                final short[] array = this.t.elementAt(abs);
                final short n4 = (short)(array[2] - array[0] + 1);
                final short n5 = (short)(array[3] - array[1] + 1);
                n2 = (short)(array[0] + Math.abs(this.e.nextInt() % n4));
                n3 = (short)(array[1] + Math.abs(this.e.nextInt() % n5));
            } while (!this.d(n2, n3));
            a.byteC = (byte)n2;
            a.byteD = (byte)n3;
            this.w[a.byteC][a.byteD] = ProgSix.getPipeByte((byte)2, this.w[a.byteC][a.byteD]);
            a.updateHashTable();
        }
    }

    void a(final ProgTen ProgTen) {
        if (this.o == 1) {
            return;
        }
        final ProgFour a = ProgFour.getProgFour(this);
        final byte l = ProgTen.l;
        final byte k = ProgTen.k;
        for (int i = 0; i <= 4; ++i) {
            int n = l;
            int n2 = k;
            if (i < 2) {
                n += 2 * i - 1;
            }
            else {
                n2 += 2 * i - 5;
            }
            if (this.d(n, n2)) {
                a.byteC = (byte)n;
                a.byteD = (byte)n2;
                a.updateHashTable();
                this.w[a.byteC][a.byteD] = ProgSix.getPipeByte((byte)2, this.w[a.byteC][a.byteD]);
                break;
            }
        }
    }

    static int a(final int n, final int n2, final boolean b) {
        if (b) {
            if (n < n2) {
                return -1;
            }
            if (n > n2) {
                return 1;
            }
            return 0;
        }
        else {
            if (n > n2) {
                return -1;
            }
            if (n < n2) {
                return 1;
            }
            return 0;
        }
    }

    int[] b(final int n) {
        final int size = this.t.size();
        final int[] array = new int[size];
        final int[] array2 = new int[size];
        for (int i = 0; i < size; ++i) {
            array2[array[i] = i] = ProgSix.getRandomFromESG(this.e, 1000);
        }
        for (int j = 1; j < size; ++j) {
            final int n2 = array2[j];
            final int n3 = array[j];
            int n4;
            for (n4 = j - 1; n4 >= 0 && a(array2[n4], n2, false) > 0; --n4) {
                array2[n4 + 1] = array2[n4];
                array[n4 + 1] = array[n4];
            }
            array2[n4 + 1] = n2;
            array[n4 + 1] = n3;
        }
        final int[] array3 = new int[n];
        for (int k = 0; k < n; ++k) {
            array3[k] = array[k];
        }
        return array3;
    }

    void j() {
        final int[] b = this.b(5);
        final int n = ProgNine.n[this.a - 1];
        int n2 = 1;
        for (int i = 0; i < 5; ++i) {
            final short[] array = this.t.elementAt(b[i]);
            int n3;
            if (n2 != 0) {
                n3 = ProgOne.getRandomFromBytesAB(this.e, n);
                n2 = 0;
            }
            else {
                n3 = ProgOne.getRandomFromByteZAndMatrix(this.e, this.a, 2);
            }
            short n4;
            short n5;
            short n6;
            short n7;
            for (n4 = (short)(array[2] - array[0] + 1), n5 = (short)(array[3] - array[1] + 1), n6 = (short)(array[0] + Math.abs(this.e.nextInt() % n4)), n7 = (short)(array[1] + Math.abs(this.e.nextInt() % n5)); (this.w[n6][n7] & 0x8) != 0x0; n6 = (short)(array[0] + Math.abs(this.e.nextInt() % n4)), n7 = (short)(array[1] + Math.abs(this.e.nextInt() % n5))) {}
            final byte[] array2 = { (byte)n6, (byte)n7, (byte)((n2 != 0) ? 1 : 0), (byte)((byte)(Math.abs(this.e.nextInt() % 3) << 6) | this.a), 0, 0, 0, 0 };
            final byte b2 = (byte)(n3 & 0xFF);
            byte b3 = 0;
            if (b2 == 86) {
                b3 = (byte)(n3 >>> 8 & 0xFF);
            }
            array2[4] = b2;
            array2[7] = b3;
            final short a = ProgOne.incrementShortZ();
            final byte b4 = (byte)(a >>> 8 & 0xFF);
            final byte b5 = (byte)(a & 0xFF);
            array2[5] = b4;
            array2[6] = b5;
            this.a(array2);
        }
    }

    void a(final byte[] value) {
        final byte b = value[0];
        final byte b2 = value[1];
        ESGame.S[this.o - 1].put(ProgSix.getStringFromTwoIntAddAComma(b, (int)b2), value);
        final byte[] array = this.w[b];
        final byte b3 = b2;
        array[b3] |= 0x10;
    }

    void c(final byte[] obj) {
        final byte b = obj[0];
        final byte b2 = obj[1];
        ESGame.au[this.o - 1].addElement(obj);
        final byte[] array = this.w[b];
        final byte b3 = b2;
        array[b3] |= 0x4;
    }

    public void b() {
        final long n = this.o * 5000;
        this.w = new byte[this.g][this.y];
        final short n2 = this.x[4];
        final short n3 = this.x[5];
        this.t = new Vector();
        this.a(n, n2, n3);
    }

    void e() {
        this.c();
        this.j();
    }

    void h() {
        final Hashtable hashtable = ESGame.G[this.o - 1];
        if (hashtable != null) {
            final Enumeration<byte[]> elements = hashtable.elements();
            while (elements.hasMoreElements()) {
                final ProgFour a = ProgFour.makeStaticProgFourFromByteArray(elements.nextElement());
                final byte[] array = this.w[a.byteC];
                final byte m = a.byteD;
                array[m] |= 0x2;
            }
            System.gc();
        }
        final Hashtable hashtable2 = ESGame.S[this.o - 1];
        if (hashtable2 != null) {
            final Enumeration<byte[]> elements2 = hashtable2.elements();
            while (elements2.hasMoreElements()) {
                final byte[] array2 = elements2.nextElement();
                final byte[] array3 = this.w[array2[0]];
                final byte b = array2[1];
                array3[b] |= 0x10;
            }
        }
        final Enumeration<byte[]> elements3 = (Enumeration<byte[]>)ESGame.au[this.o - 1].elements();
        while (elements3.hasMoreElements()) {
            final byte[] array4 = elements3.nextElement();
            final byte[] array5 = this.w[array4[0]];
            final byte b2 = array4[1];
            array5[b2] |= 0x4;
        }
        if (this.o == 1 && ProgEleven.d) {
            final byte b3 = ProgEleven.j[6];
            final byte b4 = ProgEleven.i[6];
            final byte[] array6 = this.w[b3];
            final byte b5 = b4;
            array6[b5] |= 0x20;
        }
    }

    boolean b(final short n) {
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public void a(final long seed, final short s, final short v) {
        this.s = s;
        this.v = v;
        this.e = new Random(seed);
        for (int i = 0; i < 35; ++i) {
            for (int j = 0; j < 35; ++j) {
                this.w[i][j] = 1;
            }
        }
        this.m = new Vector();
        this.j = new Vector();
        this.p = 3;
        this.b = 3;
        this.i = 31;
        this.r = 31;
        if (this.b(s)) {
            final int a = this.a(s);
            if (a >= 0) {
                this.d(a);
            }
        }
        if (this.b(v)) {
            final int a2 = this.a(v);
            if (a2 >= 0) {
                this.d(a2);
            }
        }
        int n = 0;
        int k = 0;
        while (k < 15) {
            this.d = this.f();
            if (this.a(this.d)) {
                ++k;
                this.d(this.a(this.d[4], this.d[5]));
                if (k < 2 || n != 0) {
                    continue;
                }
                final short n2 = this.d[4];
                final short n3 = this.d[5];
                final short n4 = (short)(this.d[2] - this.d[0] + 1);
                final short n5 = (short)(this.d[3] - this.d[1] + 1);
                if (n4 < 3 || n5 < 3) {
                    continue;
                }
                final short n6 = (short)(this.d[0] + n4 / 2);
                final short n7 = (short)(this.d[1] + n5 / 2);
                if (n6 == n2 && n7 == n3) {
                    continue;
                }
                final byte[] array = this.w[n6];
                final short n8 = n7;
                array[n8] |= 0x8;
                n = 1;
            }
        }
        this.d();
    }

    private short[] f() {
        final int n = 4;
        final int n2 = 2 + Math.abs(this.e.nextInt()) % n;
        final int n3 = 2 + Math.abs(this.e.nextInt()) % n;
        final int n4 = this.i - this.b + 1 - (n2 - 1);
        final int n5 = this.r - this.p + 1 - (n3 - 1);
        this.d[0] = (short)(this.b + Math.abs(this.e.nextInt()) % n4);
        this.d[1] = (short)(this.p + Math.abs(this.e.nextInt()) % n5);
        this.d[2] = (short)(this.d[0] + (n2 - 1));
        this.d[3] = (short)(this.d[1] + (n3 - 1));
        this.d[4] = (short)(this.d[0] + Math.abs(this.e.nextInt()) % n2);
        this.d[5] = (short)(this.d[1] + Math.abs(this.e.nextInt()) % n3);
        return this.d;
    }

    private boolean a(final short[] array) {
        final int n = (array[0] - 1 >= 0) ? (array[0] - 1) : 0;
        final int n2 = (array[2] + 1 <= 34) ? (array[2] + 1) : 34;
        final int n3 = (array[1] - 1 >= 0) ? (array[1] - 1) : 0;
        final int n4 = (array[3] + 1 <= 34) ? (array[3] + 1) : 34;
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (this.w[i][j] == 0) {
                    return false;
                }
            }
        }
        this.a(array[0], (short)(array[2] - array[0] + 1), array[1], (short)(array[3] - array[1] + 1));
        if (array[2] != array[0] && array[3] != array[1]) {
            final short[] obj = new short[6];
            for (int k = 0; k < 6; ++k) {
                obj[k] = array[k];
            }
            this.t.addElement(obj);
        }
        return true;
    }

    private void d() {
        for (int size = this.m.size(), i = 0; i < size; ++i) {
            final Integer obj = this.m.elementAt(i);
            final int size2 = this.j.size();
            int n = Integer.MAX_VALUE;
            Integer n2 = null;
            int index = -1;
            for (int j = 0; j < size2; ++j) {
                final Integer n3 = this.j.elementAt(j);
                if (!n3.equals(obj)) {
                    final int g = this.g(obj, n3);
                    if (g < n) {
                        n = g;
                        n2 = n3;
                    }
                }
                else {
                    index = j;
                }
            }
            if (n2 != null) {
                this.h(obj, n2);
            }
            if (index != -1) {
                this.j.removeElementAt(index);
            }
        }
    }

    private int a(final short n) {
        int n2 = -1;
        if (n == 1) {
            this.a(17, 1, 0, 5);
            n2 = this.a((short)17, (short)4);
        }
        else if (n == 3) {
            this.a(17, 1, 30, 5);
            n2 = this.a((short)17, (short)30);
        }
        else if (n == 4) {
            this.a(0, 5, 17, 1);
            n2 = this.a((short)4, (short)17);
        }
        else if (n == 2) {
            this.a(30, 5, 17, 1);
            n2 = this.a((short)30, (short)17);
        }
        return n2;
    }

    private void h(final int n, final int n2) {
        final short[] a = this.a(n);
        final short n3 = a[0];
        final short n4 = a[1];
        final short[] a2 = this.a(n2);
        final short n5 = a2[0];
        final short n6 = a2[1];
        if (Math.abs(this.e.nextInt() % 2) == 0) {
            if (n5 > n3) {
                this.a(n3, n5 - n3 + 1, n4, 1);
            }
            else {
                this.a(n5, n3 - n5 + 1, n4, 1);
            }
            if (n6 > n4) {
                this.a(n5, 1, n4, n6 - n4 + 1);
            }
            else {
                this.a(n5, 1, n6, n4 - n6 + 1);
            }
        }
        else {
            if (n6 > n4) {
                this.a(n3, 1, n4, n6 - n4 + 1);
            }
            else {
                this.a(n3, 1, n6, n4 - n6 + 1);
            }
            if (n5 > n3) {
                this.a(n3, n5 - n3 + 1, n6, 1);
            }
            else {
                this.a(n5, n3 - n5 + 1, n6, 1);
            }
        }
    }

    private void a(final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n + n2; ++i) {
            for (int j = n3; j < n3 + n4; ++j) {
                if (this.w[i][j] != 8) {
                    this.w[i][j] = 0;
                }
            }
        }
    }

    private int a(final short n, final short n2) {
        return n << 16 | n2;
    }

    private short[] a(final int n) {
        this.f[0] = (short)((0xFFFF0000 & n) >>> 16);
        this.f[1] = (short)(0xFFFF & n);
        return this.f;
    }

    private void d(final int value) {
        final Integer n = new Integer(value);
        this.m.addElement(n);
        this.j.addElement(n);
    }

    private int g(final int n, final int n2) {
        final short[] a = this.a(n);
        final short n3 = a[0];
        final short n4 = a[1];
        final short[] a2 = this.a(n2);
        final short n5 = a2[0];
        final short n6 = a2[1];
        return (n5 - n3) * (n5 - n3) + (n6 - n4) * (n6 - n4);
    }

    boolean d(final int n, final int n2) {
        final byte b = this.w[n][n2];
        return !ProgSix.isAndNotZero((byte)1, b) && !ProgSix.isAndNotZero((byte)2, b) && !ProgSix.isAndNotZero((byte)8, b) && !ProgSix.isAndNotZero((byte)32, b);
    }

    ProgFour c(final int n, final int n2) {
        final byte b = this.w[n][n2];
        if (ProgSix.isAndNotZero((byte)1, b)) {
            return null;
        }
        if (!ProgSix.isAndNotZero((byte)2, b)) {
            return null;
        }
        final Enumeration<byte[]> elements = ESGame.G[this.o - 1].elements();
        while (elements.hasMoreElements()) {
            final ProgFour a = ProgFour.makeStaticProgFourFromByteArray(elements.nextElement());
            if (a.byteC == n && a.byteD == n2) {
                return a;
            }
        }
        return null;
    }

    void b(final byte[] array) {
        final byte b = array[0];
        final byte b2 = array[1];
        final byte b3 = this.w[b][b2];
        if (ProgSix.isAndNotZero((byte)1, b3)) {
            return;
        }
        if (!ProgSix.isAndNotZero((byte)16, b3)) {
            return;
        }
        ESGame.S[this.o - 1].remove(ProgSix.getStringFromTwoIntAddAComma(b, (int)b2));
        this.w[b][b2] = ProgSix.getAndByte((byte)16, this.w[b][b2]);
    }

    void d(final byte[] obj) {
        final byte b = obj[0];
        final byte b2 = obj[1];
        final byte b3 = this.w[b][b2];
        if (ProgSix.isAndNotZero((byte)1, b3)) {
            return;
        }
        if (!ProgSix.isAndNotZero((byte)4, b3)) {
            return;
        }
        ESGame.au[this.o - 1].removeElement(obj);
        if (this.f(b, b2) == 0) {
            this.w[b][b2] = ProgSix.getAndByte((byte)4, this.w[b][b2]);
        }
    }

    int f(final int n, final int n2) {
        int n3 = 0;
        final Enumeration<byte[]> elements = (Enumeration<byte[]>)ESGame.au[this.o - 1].elements();
        while (elements.hasMoreElements()) {
            final byte[] array = elements.nextElement();
            if (array[0] == n && array[1] == n2) {
                ++n3;
            }
        }
        return n3;
    }

    byte[] e(final int n, final int n2) {
        final Enumeration<byte[]> elements = ESGame.au[this.o - 1].elements();
        while (elements.hasMoreElements()) {
            final byte[] array = elements.nextElement();
            if (array[0] == n && array[1] == n2) {
                return array;
            }
        }
        return null;
    }

    Vector b(final int n, final int n2) {
        final Vector<byte[]> vector = new Vector<byte[]>(5);
        final Enumeration<byte[]> elements = ESGame.au[this.o - 1].elements();
        while (elements.hasMoreElements()) {
            final byte[] obj = elements.nextElement();
            if (obj[0] == n && obj[1] == n2) {
                vector.addElement(obj);
            }
        }
        return vector;
    }

    void b(final int n, final int n2, final int n3, final byte[][] array) {
        if (n3 == 1 || n3 == 3) {
            int n4;
            if (n3 == 1) {
                n4 = 1;
            }
            else {
                n4 = -1;
            }
            array[0][0] = this.i(n - n4, n2);
            array[1][0] = this.i(n, n2);
            array[2][0] = this.i(n + n4, n2);
            final int n5 = n2 - n4;
            for (int i = 0; i < 5; ++i) {
                array[i][1] = this.i(n + (i - 2) * n4, n5);
            }
            final int n6 = n2 - 2 * n4;
            for (int j = 0; j < 7; ++j) {
                array[j][2] = this.i(n + (j - 3) * n4, n6);
            }
            final int n7 = n2 - 3 * n4;
            for (int k = 0; k < 9; ++k) {
                array[k][3] = this.i(n + (k - 4) * n4, n7);
            }
            final int n8 = n2 - 4 * n4;
            for (int l = 0; l < 9; ++l) {
                array[l][4] = this.i(n + (l - 4) * n4, n8);
            }
        }
        else if (n3 == 2 || n3 == 4) {
            int n9;
            if (n3 == 2) {
                n9 = 1;
            }
            else {
                n9 = -1;
            }
            array[0][0] = this.i(n, n2 - n9);
            array[1][0] = 0;
            array[2][0] = this.i(n, n2 + n9);
            final int n10 = n + n9;
            for (int n11 = 0; n11 < 5; ++n11) {
                array[n11][1] = this.i(n10, n2 + (n11 - 2) * n9);
            }
            final int n12 = n + 2 * n9;
            for (int n13 = 0; n13 < 7; ++n13) {
                array[n13][2] = this.i(n12, n2 + (n13 - 3) * n9);
            }
            final int n14 = n + 3 * n9;
            for (int n15 = 0; n15 < 9; ++n15) {
                array[n15][3] = this.i(n14, n2 + (n15 - 4) * n9);
            }
            final int n16 = n + 4 * n9;
            for (int n17 = 0; n17 < 9; ++n17) {
                array[n17][4] = this.i(n16, n2 + (n17 - 4) * n9);
            }
        }
    }

    void c(final int n, final int n2, final int n3, final byte[][] array) {
        this.a(n, n2, n3, 7, array);
    }

    void a(final int n, final int n2, final int n3, final byte[][] array) {
        this.a(n, n2, n3, 17, array);
    }

    void a(final int n, final int n2, final int n3, final int n4, final byte[][] array) {
        final int n5 = n4 / 2;
        if (n3 == 1 || n3 == 3) {
            int n6;
            if (n3 == 1) {
                n6 = 1;
            }
            else {
                n6 = -1;
            }
            for (int i = 0; i < n4; ++i) {
                for (int j = 0; j < n4; ++j) {
                    array[j][i] = (byte)(this.i(n + (j - n5) * n6, n2 + (i - n5) * n6) & 0x1);
                    if ((array[j][i] & 0x1) == 0x0) {
                        array[j][i] = (byte)(this.i(n + (j - n5) * n6, n2 + (i - n5) * n6) & 0x8);
                    }
                }
            }
            if (this.o > 1) {
                final Enumeration<byte[]> elements = (Enumeration<byte[]>)ESGame.G[this.o - 1].elements();
                while (elements.hasMoreElements()) {
                    final ProgFour a = ProgFour.makeStaticProgFourFromByteArray(elements.nextElement());
                    final int n7 = n6 * (a.byteC - n) + n5;
                    final int n8 = n6 * (a.byteD - n2) + n5;
                    if (n7 >= 0 && n7 < n4 && n8 >= 0 && n8 < n4 && a.pFourBoolean) {
                        final byte[] array2 = array[n7];
                        final int n9 = n8;
                        array2[n9] |= 0x2;
                    }
                }
                final Enumeration<byte[]> elements2 = (Enumeration<byte[]>)ESGame.S[this.o - 1].elements();
                while (elements2.hasMoreElements()) {
                    final byte[] array3 = elements2.nextElement();
                    final int n10 = n6 * (array3[0] - n) + n5;
                    final int n11 = n6 * (array3[1] - n2) + n5;
                    final boolean b = true;
                    if (n10 >= 0 && n10 < n4 && n11 >= 0 && n11 < n4 && b) {
                        final byte[] array4 = array[n10];
                        final int n12 = n11;
                        array4[n12] |= 0x4;
                    }
                }
                final Enumeration<byte[]> elements3 = (Enumeration<byte[]>)ESGame.au[this.o - 1].elements();
                while (elements3.hasMoreElements()) {
                    final byte[] array5 = elements3.nextElement();
                    final int n13 = n6 * (array5[0] - n) + n5;
                    final int n14 = n6 * (array5[1] - n2) + n5;
                    final boolean b2 = (array5[6] & 0x1) != 0x0;
                    if (n13 >= 0 && n13 < n4 && n14 >= 0 && n14 < n4 && b2) {
                        final byte[] array6 = array[n13];
                        final int n15 = n14;
                        array6[n15] |= 0x4;
                    }
                }
            }
            else {
                for (int k = 0; k < 7; ++k) {
                    if (k == 6 && !ProgEleven.d) {
                        break;
                    }
                    if (ProgEleven.b[k]) {
                        final int n16 = n6 * (ProgEleven.j[k] - n) + n5;
                        final int n17 = n6 * (ProgEleven.i[k] - n2) + n5;
                        final boolean b3 = true;
                        if (n16 >= 0 && n16 < n4 && n17 >= 0 && n17 < n4 && b3) {
                            final byte[] array7 = array[n16];
                            final int n18 = n17;
                            array7[n18] |= 0x4;
                        }
                    }
                }
            }
        }
        else if (n3 == 2 || n3 == 4) {
            int n19;
            if (n3 == 2) {
                n19 = 1;
            }
            else {
                n19 = -1;
            }
            for (int l = 0; l < n4; ++l) {
                for (int n20 = 0; n20 < n4; ++n20) {
                    array[n20][l] = (byte)(this.i(n - (l - n5) * n19, n2 + (n20 - n5) * n19) & 0x1);
                    if ((array[n20][l] & 0x1) == 0x0) {
                        array[n20][l] = (byte)(this.i(n - (l - n5) * n19, n2 + (n20 - n5) * n19) & 0x8);
                    }
                }
            }
            if (this.o > 1) {
                final Enumeration<byte[]> elements4 = (Enumeration<byte[]>)ESGame.G[this.o - 1].elements();
                while (elements4.hasMoreElements()) {
                    final ProgFour a2 = ProgFour.makeStaticProgFourFromByteArray(elements4.nextElement());
                    final int n21 = n19 * (a2.byteD - n2) + n5;
                    final int n22 = n5 - n19 * (a2.byteC - n);
                    if (n21 >= 0 && n21 < n4 && n22 >= 0 && n22 < n4 && a2.pFourBoolean) {
                        final byte[] array8 = array[n21];
                        final int n23 = n22;
                        array8[n23] |= 0x2;
                    }
                }
                final Enumeration<byte[]> elements5 = (Enumeration<byte[]>)ESGame.S[this.o - 1].elements();
                while (elements5.hasMoreElements()) {
                    final byte[] array9 = elements5.nextElement();
                    final int n24 = n19 * (array9[1] - n2) + n5;
                    final int n25 = n5 - n19 * (array9[0] - n);
                    final boolean b4 = true;
                    if (n24 >= 0 && n24 < n4 && n25 >= 0 && n25 < n4 && b4) {
                        final byte[] array10 = array[n24];
                        final int n26 = n25;
                        array10[n26] |= 0x4;
                    }
                }
                final Enumeration<byte[]> elements6 = (Enumeration<byte[]>)ESGame.au[this.o - 1].elements();
                while (elements6.hasMoreElements()) {
                    final byte[] array11 = elements6.nextElement();
                    final int n27 = n19 * (array11[1] - n2) + n5;
                    final int n28 = n5 - n19 * (array11[0] - n);
                    final boolean b5 = (array11[6] & 0x1) != 0x0;
                    if (n27 >= 0 && n27 < n4 && n28 >= 0 && n28 < n4 && b5) {
                        final byte[] array12 = array[n27];
                        final int n29 = n28;
                        array12[n29] |= 0x4;
                    }
                }
            }
            else {
                for (int n30 = 0; n30 < 7; ++n30) {
                    if (n30 == 6 && !ProgEleven.d) {
                        break;
                    }
                    if (ProgEleven.b[n30]) {
                        final int n31 = n19 * (ProgEleven.i[n30] - n2) + n5;
                        final int n32 = n5 - n19 * (ProgEleven.j[n30] - n);
                        final boolean b6 = true;
                        if (n31 >= 0 && n31 < n4 && n32 >= 0 && n32 < n4 && b6) {
                            final byte[] array13 = array[n31];
                            final int n33 = n32;
                            array13[n33] |= 0x4;
                        }
                    }
                }
            }
        }
    }

    int[] a(final int n, final int n2, final int n3, final int n4, final int n5) {
        int n6 = 0;
        int n7 = 0;
        if (n3 == 1 || n3 == 3) {
            int n8;
            if (n3 == 1) {
                n8 = 1;
            }
            else {
                n8 = -1;
            }
            n6 = n8 * (n4 - n) + 3;
            n7 = n8 * (n5 - n2) + 3;
        }
        else if (n3 == 2 || n3 == 4) {
            int n9;
            if (n3 == 2) {
                n9 = 1;
            }
            else {
                n9 = -1;
            }
            n6 = n9 * (n5 - n2) + 3;
            n7 = 3 - n9 * (n4 - n);
        }
        this.u[0] = n6;
        this.u[1] = n7;
        return this.u;
    }

    byte i(final int n, final int n2) {
        int n3 = n;
        int n4 = n2;
        byte o = this.o;
        ProgNine ProgNine = null;
        if (n < 0) {
            o = this.x[3];
            if (o <= 0) {
                return 1;
            }
            ProgNine = ESGame.u[o - 1];
            if (o == 1 || this.o == 1) {
                n3 = (byte)(ProgNine.g - 1);
                n4 = (byte)(n4 + (ProgNine.y - this.y) / 2);
            }
            else {
                n3 = (byte)(ProgNine.g - 1);
            }
        }
        else if (n >= this.g) {
            o = this.x[1];
            if (o <= 0) {
                return 1;
            }
            ProgNine = ESGame.u[o - 1];
            if (o == 1 || this.o == 1) {
                n3 = 0;
                n4 = (byte)(n4 + (ProgNine.y - this.y) / 2);
            }
            else {
                n3 = 0;
            }
        }
        else if (n2 < 0) {
            o = this.x[0];
            if (o <= 0) {
                return 1;
            }
            ProgNine = ESGame.u[o - 1];
            if (o == 1 || this.o == 1) {
                n3 = (byte)(n3 + (ProgNine.g - this.g) / 2);
                n4 = (byte)(ProgNine.y - 1);
            }
            else {
                n4 = (byte)(ProgNine.y - 1);
            }
        }
        else if (n2 >= this.y) {
            o = this.x[2];
            if (o <= 0) {
                return 1;
            }
            ProgNine = ESGame.u[o - 1];
            if (o == 1 || this.o == 1) {
                n3 = (byte)(n3 + (ProgNine.g - this.g) / 2);
                n4 = 0;
            }
            else {
                n4 = 0;
            }
        }
        if (o == this.o) {
            return this.w[n][n2];
        }
        if (n3 < 0 || n3 >= ProgNine.g) {
            return 1;
        }
        if (n4 < 0 || n4 >= ProgNine.y) {
            return 1;
        }
        if (ProgNine.k) {
            return ProgNine.w[n3][n4];
        }
        return 1;
    }

    byte a(final int n, final int n2, final byte[][] array) {
        if (n2 < 4) {
            return array[n + n2 + 1][n2];
        }
        return array[n + n2][n2];
    }

    String[] a() {
        return ProgNine.c[this.o - 1];
    }

    static void g() throws Exception {
        final DataInputStream a = ProgSix.getDISFromName("/dungnamesin.dat");
        ProgNine.c = new String[37][2];
        for (int i = 0; i < 37; ++i) {
            for (int j = 0; j < 2; ++j) {
                ProgNine.c[i][j] = a.readUTF();
            }
        }
    }

    void a(final int n, final int n2) {
        final int max = Math.max(n - 4, 0);
        final int min = Math.min(n + 4, this.g - 1);
        final int max2 = Math.max(n2 - 4, 0);
        final int min2 = Math.min(n2 + 4, this.y - 1);
        for (int i = max; i <= min; ++i) {
            for (int j = max2; j <= min2; ++j) {
                final byte b = this.w[i][j];
                if (!ProgSix.isAndNotZero((byte)1, b)) {
                    this.w[i][j] = ProgSix.getAndByte((byte)2, b);
                }
            }
        }
        final Hashtable hashtable = ESGame.G[this.o - 1];
        if (hashtable != null) {
            final Enumeration<byte[]> elements = hashtable.elements();
            while (elements.hasMoreElements()) {
                final byte[] array = elements.nextElement();
                final byte b2 = array[4];
                final byte b3 = array[5];
                if (b2 >= max && b2 <= min && b3 >= max2 && b3 <= min2) {
                    final byte[] array2 = this.w[b2];
                    final byte b4 = b3;
                    array2[b4] |= 0x2;
                }
            }
        }
    }

    static {
        l = new int[][] { { 1, 2, 1, 3 }, { 6, 7, 8, 6 }, { 1, 2, 3, 1 }, { 6, 7, 8, 7 }, { 3, 4, 11, 12 }, { 8, 9, 11, 12 }, { 3, 4, 12, 13 }, { 8, 9, 12, 13 }, { 4, 5, 12, 13 }, { 9, 10, 12, 13 }, { 4, 5, 13, 14 }, { 9, 10, 13, 14 }, { 12, 13, 4, 5 }, { 12, 13, 9, 10 }, { 13, 14, 15, 16 }, { 14, 15, 16, 17 }, { 15, 16, 17, 18 }, { 16, 17, 18, 21 }, { 17, 18, 19, 26 }, { 18, 19, 20, 21 }, { 19, 20, 26, 27 }, { 21, 22, 26, 27 }, { 21, 22, 27, 28 }, { 22, 23, 27, 28 }, { 22, 23, 28, 29 }, { 23, 24, 28, 29 }, { 23, 24, 29, 30 }, { 24, 25, 29, 30 }, { 26, 27, 28, 31 }, { 27, 28, 31, 32 }, { 28, 29, 32, 33 }, { 29, 30, 33, 34 }, { 31, 32, 34, 35 }, { 32, 33, 36, 37 }, { 34, 35, 37, 38 }, { 38, 39, 40, 35 }, { 38, 39, 40, 35 } };
        q = new byte[] { 1, 5, 9, 13, 14, 15, 22, 23, 24, 2, 6, 10, 19, 20, 21, 31, 32, 33, 3, 7, 11, 16, 17, 18, 28, 29, 30, 4, 8, 12, 25, 26, 27, 34, 35, 36 };
        n = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 3, 1, 3, 3, 1, 3, 3, 3, 3, 5, 3, 5, 5, 3, 5, 5, 5, 5, 5, 5, 5, 5 };
    }
}