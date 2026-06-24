package hw_2.ex9;

public class Main {
    public static void main(String[] args) {
        DocumentSystem documentSystem = new DocumentSystem();

        PDFAdapter PDFAdapter = new PDFAdapter(new PDFFile());

        documentSystem.processDocument(PDFAdapter);
    }
}
