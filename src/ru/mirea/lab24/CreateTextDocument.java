package ru.mirea.lab24;

public class CreateTextDocument implements ICreateDocument{

    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen(String filepath, String filename, byte[] data) {
        return new TextDocument(filepath, filename, data);
    }
}
