package ru.mirea.lab22.task3;
public interface IDocumentFactory {
    IDocument createNewDocument();
    IDocument openExistingDocument(String info);
}