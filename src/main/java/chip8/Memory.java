package main.java.chip8;

public class Memory {

    private byte[] RAM;
    private short I;
    private Font fontData;



    public Memory() {
        RAM = new byte[4096];
        fontData = new Font();
        addFontToMemory();
    }

    public byte[] getRAM() {
        return RAM;
    }

    public void addFontToMemory() {
        for (int i = 0; i < fontData.font.length; i++) {
            System.arraycopy(fontData.font[i], 0, RAM, i * 4, 4);
        }
    }
}
