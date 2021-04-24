package Overriding;

public class B extends A{
    public void tampilkanKeLayar(){
        
        super.tampilkanKeLayar(); //Memanggil method milik dari superclass.
        
        System.out.println("Method milik class B dipanggil");
    }
}
