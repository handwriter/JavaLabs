package ru.mirea.lab24;

public class ImageDocument implements IDocument{
    private String filepath;
    private String filename;
    private byte[] data;

    @Override
    public String getFilepath() {
        return filepath;
    }

    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String getType() {
        return "Image Document";
    }
}
