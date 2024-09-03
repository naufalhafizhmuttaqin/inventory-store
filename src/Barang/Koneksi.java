package Barang;
//package Koneksi
import java.sql.DriverManager;

//class koneksi
public class Koneksi {
    private static java.sql.Connection koneksi;
    
    //main function koneksi
    public static java.sql.Connection getKoneksi(){
           //untuk koneksi ke database
        if (koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/crudstore";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new org.postgresql.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }   
}
