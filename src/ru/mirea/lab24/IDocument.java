package ru.mirea.lab24;

public interface IDocument {
    public String getFilepath();
    public String getFilename();
    public byte[] getData();
    public void setFilepath(String filepath);
    public void setFilename(String filename);
    public void setData(byte[] data);
    public String getType();
}
