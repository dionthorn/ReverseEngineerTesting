import java.util.Random;
import java.io.DataOutputStream;
import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgFour
{
    private static int pFourInt;
    private static String[] pFourStringArray;
    private static byte[][] byteMatrix;
    short shortA;
    byte byteA;
    byte byteB;
    byte byteC;
    byte byteD;
    boolean pFourBoolean;
    byte byteE;
    byte[] byteArray;
    byte byteF;
    byte byteG;
    long longA;
    static ProgFour pFourStaticRef;
    static short shortStaticRef;

    static short incrementShortStaticRef() {
        return (++ProgFour.shortStaticRef);
    }

    byte[] getByteArray() {
        final byte[] array = { (byte)(this.shortA >>> 8 & 0xFF), (byte)(this.shortA & 0xFF), this.byteA, this.byteB, this.byteC, this.byteD, (byte)(this.pFourBoolean ? 1 : 0), this.byteE, this.byteF, this.byteG, (byte)(this.longA >>> 56 & 0xFFL), (byte)(this.longA >>> 48 & 0xFFL), (byte)(this.longA >>> 40 & 0xFFL), (byte)(this.longA >>> 32 & 0xFFL), (byte)(this.longA >>> 24 & 0xFFL), (byte)(this.longA >>> 16 & 0xFFL), (byte)(this.longA >>> 8 & 0xFFL), (byte)(this.longA & 0xFFL), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < 10; ++i) {
            array[18 + i] = this.byteArray[i];
        }
        return array;
    }

    public ProgFour() {
        this.byteArray = new byte[10];
        this.pFourBoolean = false;
    }

    public ProgFour(final int n, final int n2, final int n3) {
        this.shortA = (short)n;
        this.byteA = (byte)n2;
        this.byteB = ProgFour.byteMatrix[this.byteA - 1][14];
        this.byteArray = new byte[10];
        this.pFourBoolean = false;
        this.byteE = (byte)n3;
        this.byteG = 0;
    }

    static ProgFour makeStaticProgFourFromByteArray(final byte[] array) {
        ProgFour.pFourStaticRef.shortA = (short)((short)(array[0] & 0xFF) << 8 | (short)(array[1] & 0xFF));
        ProgFour.pFourStaticRef.byteA = array[2];
        ProgFour.pFourStaticRef.byteB = array[3];
        ProgFour.pFourStaticRef.byteC = array[4];
        ProgFour.pFourStaticRef.byteD = array[5];
        ProgFour.pFourStaticRef.pFourBoolean = (array[6] != 0);
        ProgFour.pFourStaticRef.byteE = array[7];
        ProgFour.pFourStaticRef.byteF = array[8];
        ProgFour.pFourStaticRef.byteG = array[9];
        ProgFour.pFourStaticRef.longA = ProgSix.getLongFromByteArray(array, 10);
        for (int i = 0; i < 10; ++i) {
            ProgFour.pFourStaticRef.byteArray[i] = array[18 + i];
        }
        return ProgFour.pFourStaticRef;
    }

    static ProgFour makeProgFourFromProgFourAndByteArray(final ProgFour ProgFour, final byte[] array) {
        ProgFour.shortA = (short)((short)(array[0] & 0xFF) << 8 | (short)(array[1] & 0xFF));
        ProgFour.byteA = array[2];
        ProgFour.byteB = array[3];
        ProgFour.byteC = array[4];
        ProgFour.byteD = array[5];
        ProgFour.pFourBoolean = (array[6] != 0);
        ProgFour.byteE = array[7];
        ProgFour.byteF = array[8];
        ProgFour.byteG = array[9];
        ProgFour.longA = ProgSix.getLongFromByteArray(array, 10);
        for (int i = 0; i < 10; ++i) {
            ProgFour.byteArray[i] = array[18 + i];
        }
        return ProgFour;
    }

    void updateHashTable() {
        ESGame.G[this.byteE - 1].put(String.valueOf(this.shortA), this.getByteArray());
    }

    String getStringForByteA() {
        return ProgFour.pFourStringArray[this.byteA - 1];
    }

    int getIntFromMatrixForByteA(final int n) {
        return ProgFour.byteMatrix[this.byteA - 1][n] & 0xFF;
    }

    boolean isByteAMoreThan6LessThan8() {
        return this.byteA >= 6 && this.byteA <= 8;
    }

    void updateByteB(int n) {
        final int n2 = this.byteB & 0xFF;
        if (n > n2) {
            n = n2;
        }
        this.byteB = (byte)(n2 - n);
    }

    boolean byteCheckCD(final int n) {
        byte b = 1;
        final byte o = this.byteC;
        final byte m = this.byteD;
        final ProgNine ProgNine = ESGame.u[this.byteE - 1];
        byte o2 = 0;
        byte j = 0;
        switch (n) {
            case 1: {
                b = -1;
            }
            case 3: {
                o2 = this.byteC;
                j = (byte)(this.byteD + b);
                break;
            }
            case 4: {
                b = -1;
            }
            case 2: {
                j = this.byteD;
                o2 = (byte)(this.byteC + b);
                break;
            }
            default: {
                return false;
            }
        }
        if (o2 < 0 || j < 0) {
            return false;
        }
        if (o2 >= ProgNine.g || j >= ProgNine.y) {
            return false;
        }
        if (this.checkProgNineWithByteE(o2, j)) {
            return false;
        }
        if (!ProgNine.d((int)o2, (int)j)) {
            return false;
        }
        ProgNine.w[this.byteC][this.byteD] = ProgSix.getAndByte((byte)2, ProgNine.w[this.byteC][this.byteD]);
        ProgNine.w[o2][j] = ProgSix.getPipeByte((byte)2, ProgNine.w[o2][j]);
        this.byteC = o2;
        this.byteD = j;
        return true;
    }

    void updateProgTenWithByteF(final ProgTen ProgTen) {
        if (this.isProgTenLessThan4(ProgTen)) {
            if (this.byteF == 0) {
                this.updateProgTenWithByteCD(ProgTen);
                ++this.byteF;
            }
            else if (this.byteF >= 4) {
                this.byteF = 0;
            }
            else {
                ++this.byteF;
            }
        }
    }

    private void updateProgTenWithByteCD(final ProgTen ProgTen) {
        final int abs = Math.abs(ProgTen.l - this.byteC);
        final int abs2 = Math.abs(ProgTen.k - this.byteD);
        int n;
        if (this.byteC < ProgTen.l) {
            n = 2;
        }
        else if (this.byteC > ProgTen.l) {
            n = 4;
        }
        else {
            n = -1;
        }
        int n2;
        if (this.byteD < ProgTen.k) {
            n2 = 3;
        }
        else if (this.byteD > ProgTen.k) {
            n2 = 1;
        }
        else {
            n2 = -1;
        }
        int n3;
        int n4;
        if (abs > abs2) {
            n3 = n;
            n4 = n2;
        }
        else if (abs < abs2) {
            n3 = n2;
            n4 = n;
        }
        else if (ESGame.h(2) == 0) {
            n3 = n;
            n4 = n2;
        }
        else {
            n3 = n2;
            n4 = n;
        }
        if (this.byteCheckCD(n3)) {
            return;
        }
        if (this.byteCheckCD(n4)) {
            return;
        }
    }

    private boolean checkProgNineWithByteE(final int n, final int n2) {
        final ProgNine ProgNine = ESGame.u[this.byteE - 1];
        if (ProgNine.s == 1 || ProgNine.v == 1) {
            if (n == 17 && n2 == 5) {
                return true;
            }
        }
        else if (ProgNine.s == 3 || ProgNine.v == 3) {
            if (n == 17 && n2 == 30) {
                return true;
            }
        }
        else if (ProgNine.s == 4 || ProgNine.v == 4) {
            if (n == 5 && n2 == 17) {
                return true;
            }
        }
        else if ((ProgNine.s == 2 || ProgNine.v == 2) && n == 30 && n2 == 17) {
            return true;
        }
        return false;
    }

    boolean isProgTenLessThan4(final ProgTen ProgTen) {
        return this.getProgTenABSByteCD(ProgTen) <= 3;
    }

    int getProgTenABSByteCD(final ProgTen ProgTen) {
        return Math.abs(ProgTen.l - this.byteC) + Math.abs(ProgTen.k - this.byteD);
    }

    boolean isProgTenOneThenByteGZero(final ProgTen ProgTen) {
        if (this.getProgTenABSByteCD(ProgTen) == 1) {
            return true;
        }
        this.byteG = 0;
        return false;
    }

    void updateProgTen(final ProgTen ProgTen, final long k) {
        this.byteG = 2;
        this.longA = k;
        final int min = Math.min(ProgTen.f(true) - ProgFour.byteMatrix[this.byteA - 1][4], ProgFour.byteMatrix[this.byteA - 1][2]);
        final int a = ProgFour.byteMatrix[this.byteA - 1][3] - min * 5;
        final int a2 = ProgTen.I() + min * 5;
        final int min2 = Math.min(Math.max(a, 10), 95);
        final int min3 = Math.min(Math.max(a2, 10), 95);
        final int a3 = ProgSix.getIntFromESG(100);
        final int a4 = ProgSix.getIntFromESG(100);
        final boolean b = a3 <= min2;
        final boolean b2 = a4 <= min3;
        int n;
        if (b && !b2) {
            n = 3;
        }
        else if (b && b2) {
            if (a3 >= a4) {
                n = 2;
            }
            else {
                n = 1;
            }
        }
        else if (!b && !b2) {
            if (a3 >= a4) {
                n = 2;
            }
            else {
                n = 1;
            }
        }
        else {
            n = 0;
        }
        if (n == 0) {
            this.byteG = 1;
            return;
        }
        final byte b3 = ProgFour.byteMatrix[this.byteA - 1][5];
        int v = ProgTen.v();
        if (n == 1) {
            v *= 2;
        }
        final int n2 = Math.max(b3 - v, 4) * ProgTen.U[3] / 100;
        final short[] u = ProgTen.U;
        final int n3 = 2;
        u[n3] -= (short)n2;
        ProgTen.U[2] = (short)Math.max(ProgTen.U[2], 0);
        if (b2) {
            ProgTen.a(ProgTen.y(), 1);
        }
        if (n < 3) {
            this.byteG = 1;
            return;
        }
        if (ProgSix.getIntFromESG(100) <= 30) {
            final byte b4 = ProgFour.byteMatrix[this.byteA - 1][11];
            if (b4 > 0) {
                ProgTen.A |= (byte)(1 << b4 - 1);
                if (b4 != 1) {
                    if (b4 == 2) {
                        ESGame.u[this.byteE - 1].c(3);
                    }
                    else if (b4 != 3) {
                        if (b4 == 4) {
                            ProgTen.ah = 30000;
                        }
                        else if (b4 == 5) {
                            ProgTen.F = 30000;
                        }
                        else if (b4 != 6) {
                            if (b4 != 7) {
                                if (b4 == 8) {}
                            }
                        }
                    }
                }
            }
        }
        this.byteG = 1;
    }

    static void loadMonsters() throws Exception {
        final DataInputStream a = ProgSix.getDISFromName("/monstersin.dat");
        ProgFour.shortStaticRef = 0;
        ProgFour.pFourInt = a.readInt();
        ProgFour.pFourStringArray = new String[ProgFour.pFourInt];
        ProgFour.byteMatrix = new byte[ProgFour.pFourInt][17];
        for (int i = 0; i < ProgFour.pFourInt; ++i) {
            ProgFour.pFourStringArray[i] = a.readUTF();
        }
        for (int j = 0; j < ProgFour.pFourInt; ++j) {
            for (int k = 0; k < 17; ++k) {
                ProgFour.byteMatrix[j][k] = a.readByte();
            }
        }
    }

    static ProgFour getProgFourFromDIS(final DataInputStream dataInputStream) throws Exception {
        final ProgFour ProgFour = new ProgFour();
        ProgFour.shortA = dataInputStream.readShort();
        ProgFour.byteA = dataInputStream.readByte();
        ProgFour.byteB = dataInputStream.readByte();
        ProgFour.byteC = dataInputStream.readByte();
        ProgFour.byteD = dataInputStream.readByte();
        ProgFour.pFourBoolean = dataInputStream.readBoolean();
        ProgFour.byteE = dataInputStream.readByte();
        ProgFour.byteF = dataInputStream.readByte();
        ProgFour.byteG = dataInputStream.readByte();
        ProgFour.longA = dataInputStream.readLong();
        for (int i = 0; i < 10; ++i) {
            ProgFour.byteArray[i] = dataInputStream.readByte();
        }
        return ProgFour;
    }

    void writeInfotoDOS(final DataOutputStream dataOutputStream) throws Exception {
        dataOutputStream.writeShort(this.shortA);
        dataOutputStream.writeByte(this.byteA);
        dataOutputStream.writeByte(this.byteB);
        dataOutputStream.writeByte(this.byteC);
        dataOutputStream.writeByte(this.byteD);
        dataOutputStream.writeBoolean(this.pFourBoolean);
        dataOutputStream.writeByte(this.byteE);
        dataOutputStream.writeByte(this.byteF);
        dataOutputStream.writeByte(this.byteG);
        dataOutputStream.writeLong(this.longA);
        for (int i = 0; i < 10; ++i) {
            dataOutputStream.writeByte(this.byteArray[i]);
        }
    }

    void non() {
    }

    void updateProgNine(final boolean b) {
        int n = ProgFour.byteMatrix[this.byteA - 1][15];
        if (b) {
            n = 100;
        }
        final byte b2 = ProgFour.byteMatrix[this.byteA - 1][16];
        if (ProgSix.getIntFromESG(100) <= n || b) {
            final ProgNine ProgNine = ESGame.u[this.byteE - 1];
            final int a = ProgOne.getRandomFromByteZAndMatrix(ESGame.P, ProgNine.a, b2);
            final byte b3 = (byte)(a & 0xFF);
            byte b4 = 0;
            if (b3 == 86) {
                b4 = (byte)(a >>> 8 & 0xFF);
            }
            final byte[] array = { this.byteC, this.byteD, b3, 0, 0, b4, 0 };
            final short a2 = ProgOne.incrementShortZ();
            final byte b5 = (byte)(a2 >>> 8 & 0xFF);
            final byte b6 = (byte)(a2 & 0xFF);
            array[3] = b5;
            array[4] = b6;
            array[6] = 1;
            if (b) {
                final byte[] array2 = array;
                final int n2 = 6;
                array2[n2] |= 0x4;
            }
            ProgNine.c(array);
        }
    }

    static ProgFour getProgFour(final ProgNine ProgNine) {
        return getProgFourRandom(ESGame.P, ProgNine, -1);
    }

    static ProgFour getProgFourRandom(final Random random, final ProgNine ProgNine, final int n) {
        final short b = incrementShortStaticRef();
        int n2 = n;
        if (n2 < 0) {
            int n3 = ProgNine.a - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            if (n3 > 36) {
                n3 = 36;
            }
            final int a = ESGame.a(random, 10);
            int n4;
            if (a <= 4) {
                n4 = 0;
            }
            else if (a <= 7) {
                n4 = 1;
            }
            else if (a <= 9) {
                n4 = 2;
            }
            else {
                n4 = 3;
            }
            n2 = ProgNine.l[n3][n4];
        }
        return new ProgFour(b, n2, ProgNine.o);
    }

    static {
        ProgFour.pFourStaticRef = new ProgFour();
    }
}