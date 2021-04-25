package ContohSederhana;

public class orang {
    private String nama;
    private double tinggi;
    private double berat;
    
    public orang (String nama, double tinggi, double berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this. berat = berat;
    }
    
    public String toString(){
        return("Nama : " +nama+"\nTinggi : "+tinggi+ "\nBerat : "+berat);
        
    }
}
