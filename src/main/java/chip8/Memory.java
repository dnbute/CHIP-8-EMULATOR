package main.java.chip8;

public class Memory {
    private byte[] RAM;
    private short I;


    public Memory() {
        RAM = new byte[4096];
    }
}
