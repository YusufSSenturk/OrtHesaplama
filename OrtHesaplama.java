import java.util.Scanner;
public class OrtHesaplama {
    public static void main(String[] args){
        int mat, fiz, kim, tarih, geo;
        Scanner inp = new Scanner(System.in);

        System.out.println("Mat notunu gir:");
        mat = inp.nextInt();

        System.out.println("fiz notunu gir:");
        fiz = inp.nextInt();

        System.out.println("kim notunu gir:");
        kim = inp.nextInt();

        System.out.println("tarih notunu gir:");
        tarih = inp.nextInt();

        System.out.println("geo notunu gir:");
        geo = inp.nextInt();

        int sonuc = (mat + fiz + kim + tarih + geo);

        double ort = sonuc/5;
        System.out.println("Ortalaman:" + ort);






}
}
