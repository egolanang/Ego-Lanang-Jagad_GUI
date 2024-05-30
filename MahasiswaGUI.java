import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class MahasiswaGUI {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mahasiswa";
        String userName = "root";
        String password = "EgoLanang._08";

        try {
            Connection myConn = DriverManager.getConnection(url, userName, password);
            Statement myStmnt = myConn.createStatement();
            ResultSet myRs = myStmnt.executeQuery("SELECT * FROM PROFIL");

            DefaultTableModel tableModel = new DefaultTableModel();
            JTable table = new JTable(tableModel);
            tableModel.addColumn("NIM");
            tableModel.addColumn("Program Studi");
            tableModel.addColumn("Nama");
            tableModel.addColumn("Angkatan");
            tableModel.addColumn("Tanggal Lahir");
            tableModel.addColumn("Alamat");
            tableModel.addColumn("Email");

            while (myRs.next()) {
                tableModel.addRow(new Object[]{
                        myRs.getString("NIM"),
                        myRs.getString("PROGRAM_STUDI"),
                        myRs.getString("NAMA"),
                        myRs.getString("ANGKATAN"),
                        myRs.getString("TGL_LAHIR"),
                        myRs.getString("ALAMAT"),
                        myRs.getString("EMAIL")
                });
            }

            JScrollPane scrollPane = new JScrollPane(table);
            JFrame frame = new JFrame("Data Mahasiswa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(scrollPane);
            frame.pack();
            frame.setVisible(true);

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}