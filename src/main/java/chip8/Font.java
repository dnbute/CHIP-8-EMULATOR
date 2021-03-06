package main.java.chip8;

public class Font {
//            0xF0, 0x90, 0x90, 0x90, 0xF0, // 0
//            0x20, 0x60, 0x20, 0x20, 0x70, // 1
//            0xF0, 0x10, 0xF0, 0x80, 0xF0, // 2
//            0xF0, 0x10, 0xF0, 0x10, 0xF0, // 3
//            0x90, 0x90, 0xF0, 0x10, 0x10, // 4
//            0xF0, 0x80, 0xF0, 0x10, 0xF0, // 5
//            0xF0, 0x80, 0xF0, 0x90, 0xF0, // 6
//            0xF0, 0x10, 0x20, 0x40, 0x40, // 7
//            0xF0, 0x90, 0xF0, 0x90, 0xF0, // 8
//            0xF0, 0x90, 0xF0, 0x10, 0xF0, // 9
//            0xF0, 0x90, 0xF0, 0x90, 0x90, // A
//            0xE0, 0x90, 0xE0, 0x90, 0xE0, // B
//            0xF0, 0x80, 0x80, 0x80, 0xF0, // C
//            0xE0, 0x90, 0x90, 0x90, 0xE0, // D
//            0xF0, 0x80, 0xF0, 0x80, 0xF0, // E
//            0xF0, 0x80, 0xF0, 0x80, 0x80  // F
    public byte[] font0 = new byte[]{(byte)0xF0, (byte)0x90, (byte)0x90, (byte)0x90, (byte)0xF0};
    public byte[] font1 = new byte[]{(byte)0x20, (byte)0x60, (byte)0x20, (byte)0x20, (byte)0x70};
    public byte[] font2 = new byte[]{(byte)0xF0, (byte)0x10, (byte)0xF0, (byte)0x80, (byte)0xF0};
    public byte[] font3 = new byte[]{(byte)0xF0, (byte)0x10, (byte)0xF0, (byte)0x10, (byte)0xF0};
    public byte[] font4 = new byte[]{(byte)0x90, (byte)0x90, (byte)0xF0, (byte)0x10, (byte)0x10};
    public byte[] font5 = new byte[]{(byte)0xF0, (byte)0x80, (byte)0xF0, (byte)0x10, (byte)0xF0};
    public byte[] font6 = new byte[]{(byte)0xF0, (byte)0x80, (byte)0xF0, (byte)0x90, (byte)0xF0};
    public byte[] font7 = new byte[]{(byte)0xF0, (byte)0x10, (byte)0x20, (byte)0x40, (byte)0x40};
    public byte[] font8 = new byte[]{(byte)0xF0, (byte)0x90, (byte)0xF0, (byte)0x90, (byte)0xF0};
    public byte[] font9 = new byte[]{(byte)0xF0, (byte)0x90, (byte)0xF0, (byte)0x10, (byte)0xF0};
    public byte[] fontA = new byte[]{(byte)0xF0, (byte)0x90, (byte)0xF0, (byte)0x90, (byte)0x90};
    public byte[] fontB = new byte[]{(byte)0xE0, (byte)0x90, (byte)0xE0, (byte)0x90, (byte)0xE0};
    public byte[] fontC = new byte[]{(byte)0xF0, (byte)0x80, (byte)0x80, (byte)0x80, (byte)0xF0};
    public byte[] fontD = new byte[]{(byte)0xE0, (byte)0x90, (byte)0x90, (byte)0x90, (byte)0xE0};
    public byte[] fontE = new byte[]{(byte)0xF0, (byte)0x80, (byte)0xF0, (byte)0x80, (byte)0xF0};
    public byte[] fontF = new byte[]{(byte)0xF0, (byte)0x80, (byte)0xF0, (byte)0x80, (byte)0x80};
    public byte[][] font;

    public Font() {
        font = new byte[16][4];

        font[0] = font0;
        font[1] = font1;
        font[2] = font2;
        font[3] = font3;
        font[4] = font4;
        font[5] = font5;
        font[6] = font6;
        font[7] = font7;
        font[8] = font8;
        font[9] = font9;
        font[10] = fontA;
        font[11] = fontB;
        font[12] = fontC;
        font[13] = fontD;
        font[14] = fontE;
        font[15] = fontF;
    }


}
