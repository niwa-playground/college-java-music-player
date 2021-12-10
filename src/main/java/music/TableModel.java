package music;

import java.io.File;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

    QueueL antrian = new QueueL();

    public TableModel(QueueL antrian) {
        this.antrian = antrian;
    }

    @Override
    public int getRowCount() {
        return antrian.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        File data = antrian.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return data.getName();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Judul";
            default:
                return "";
        }
    }

}
