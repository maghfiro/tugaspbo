package arsipku;
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ar = new Arsipku();
        ar.kelompok();
        ar.nama();
        ar.tempatLahir();
        ar.hobi();
        ar.agama();
        ar.bahasaIndonesia();
        ar.matematika();
        
    }
    
   public void nama(){
       System.out.println("Namaku = Maghfiro Nur Eka S");
   }
   
   public void tempatLahir(){
       System.out.println("Tempat Lahir = Jember");
   }
   
   public void hobi(){
       System.out.println("Hobi = Membaca");
   }
   
   public void agama(){
       System.out.println("Agama = 100");
   }
   
   public void bahasaIndonesia(){
       System.out.println("Bahasa Indonesia = 100");
   }
   
   public void matematika(){
       System.out.println("Matematika = 100");
   }
   
    public void kelompok(){
       System.out.println("Nama Kelompok: ");
       System.out.println(" 1.Didik Setyawan");
       System.out.println(" 2.Choiriyatuz Zahro");
       System.out.println(" 3.Dela Maharani");
       System.out.println(" 4.Dwi Putri Wulan G");
       System.out.println(" 5.Gayuh Sukma");
       System.out.println(" 6.Lelita Amelia");
       System.out.println(" 7.Maghfiro Nur Eka S");
    }      
    }

