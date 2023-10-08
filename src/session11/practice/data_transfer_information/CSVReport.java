package session11.practice.data_transfer_information;

import session11.practice.data_transfer_information.CSVExportable;
import session11.practice.data_transfer_information.Report;

public class CSVReport extends Report implements CSVExportable {

    @Override
    public void showPreview() {
        //from abstract class
    }

//    @Override
//    public void displayMetadata() {
//        super.displayMetadata();
//    }

    @Override
    public void exportToCsv() {
        //from interface
    }
}