package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        // Java dan excel dokumanina ulastik... Bir baglanti olusturuyoruz

        try {
            fis = new FileInputStream("B:/myfile.txt");
        } catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not " +
                    "present at the given path");
        } finally {
            System.out.println("Hata alinsin alinmasin bu blok icerisi islem gorur...");
            // Baglanti kapatiliyor...
            fis.close();
        }
        int k;
        try {
            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }
            fis.close();
        } catch(IOException ioe){
            System.out.println("I/O error occurred: "+ioe);
        }
    }
}
