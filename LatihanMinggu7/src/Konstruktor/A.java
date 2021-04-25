package Konstruktor;

public class A {
    //A(){} // Konstruktor default, diperlukan hanya agar program dapat
           // dikompilasi.
    
    A(String param1) { //Konstruktor untuk class A sudah didefinisikan sehingga
                       // Java tidak membuat konstruktor default untuk clas ini
                       
                       
            // super(); Tambaham kode secara otomatis oleh Java untuk memanggil
            //          Konstruktor dari SuperClassnya
          
            
          //super(); // Konstruktor default dari class
                    // Object dipanggil
                    
        //System.out.println("Konstruktor class A dieksekusi ...");
        System.out.println("Konstruktor class A dengan Parameter " 
                + param1 + " dieksekusi...");
    }
}
