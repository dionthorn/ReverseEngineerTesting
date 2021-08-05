import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgTwo
{
    String stringA;
    byte byteA;
    byte byteB;
    byte byteC;
    byte byteD;
    byte byteE;
    byte byteF;
    String stringB;
    static int i;
    static ProgTwo[] progTwoArray;

    ProgTwo() {
    }

    static int nMinus2(final int n) {
        return n - 1;
    }

    static ProgTwo getProgTwoFromArray(final int n) {
        return ProgTwo.progTwoArray[nMinus2(n)];
    }

    static boolean isNbiggerThan1LessThani(final int n) {
        return n >= 1 && n <= ProgTwo.i;
    }

    static boolean progTwoFromArrayByteDCheck(final int n) {
        return ProgTwo.progTwoArray[nMinus2(n)].byteD == 2;
    }

    static void loadSpells() {
        try {
            final DataInputStream a = ProgSix.getDISFromName("/spellsin.dat");
            ProgTwo.i = a.readShort();
            ProgTwo.progTwoArray = new ProgTwo[ProgTwo.i];
            for (int i = 0; i < ProgTwo.i; ++i) {
                ProgTwo.progTwoArray[i] = new ProgTwo();
            }
            System.out.println("Number of spells is " + ProgTwo.i);
            for (int j = 0; j < ProgTwo.i; ++j) {
                ProgTwo.progTwoArray[j].stringA = a.readUTF();
            }
            for (int k = 0; k < ProgTwo.i; ++k) {
                ProgTwo.progTwoArray[k].byteA = a.readByte();
            }
            for (int l = 0; l < ProgTwo.i; ++l) {
                ProgTwo.progTwoArray[l].byteB = a.readByte();
            }
            for (int n = 0; n < ProgTwo.i; ++n) {
                ProgTwo.progTwoArray[n].byteC = a.readByte();
            }
            for (int n2 = 0; n2 < ProgTwo.i; ++n2) {
                ProgTwo.progTwoArray[n2].byteD = a.readByte();
            }
            for (int n3 = 0; n3 < ProgTwo.i; ++n3) {
                ProgTwo.progTwoArray[n3].byteE = a.readByte();
            }
            for (int n4 = 0; n4 < ProgTwo.i; ++n4) {
                ProgTwo.progTwoArray[n4].byteF = a.readByte();
            }
            for (int n5 = 0; n5 < ProgTwo.i; ++n5) {
                ProgTwo.progTwoArray[n5].stringB = a.readUTF();
            }
            a.close();
        }
        catch (Exception x) {
            System.out.println("ERROR: cannot load spells!");
            System.out.println(x.getMessage());
        }
    }

}