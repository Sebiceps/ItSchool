package session11.practice.data_transfer_information;

public class PDFReport extends Report implements PDFExportable{

    @Override
    public void showPreview() {

    }

//it's not mandatory to override this method
    @Override
    public void displayMetadata() {
        super.displayMetadata();
    }

    @Override
    public void exportToPdf() {

    }
}
