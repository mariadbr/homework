package hw_2.ex9;

class PDFAdapter extends DOCFile {
    private PDFFile pdfFile;

    public PDFAdapter(PDFFile pdfFile) {
        this.pdfFile = pdfFile;
    }

    @Override
    public void process() {
        pdfFile.process();
    }
}
