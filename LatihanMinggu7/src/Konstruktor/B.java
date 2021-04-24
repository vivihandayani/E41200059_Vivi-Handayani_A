package Konstruktor;

public class B extends A{
  B() {
      // Pemanggilan konstruktor superclass dengan keyword super tidak
      // dilakukan sehingga Java akan menambahkan secara otomatis kode untuk
      // memanggil konstruktor default milik superclassnua disini.
      
      super("test"); //tambahan
      
      System.out.println("Konstruktor class B dieksekusi ...");
  }  
}
