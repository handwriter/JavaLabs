package ru.mirea.lab24;

public interface ICreateDocument {
    public IDocument createNew();
    public IDocument createOpen(String filepath, String filename, byte[] data);
}
