import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);

       //ÜS BULMA
        /*double taban,üs,sonuc=1;
        System.out.println("Tabanı giriniz");
        taban= klavye.nextDouble();
        System.out.println("Üssü giriniz");
        üs= klavye.nextDouble();

        for (int i = 0; i < üs; i++) {
            sonuc*=taban;
        }
        System.out.println("Sonuç: "+sonuc);*/

        //ASAL SAYI BULMA
        /*System.out.println("Sayıyı giriniz");
        int sayi1= klavye.nextInt();


        List<Integer> Bolenler=new ArrayList<Integer>();

        for (int i = 1; i <= sayi1; i++) {
            if (sayi1%i==0){
                Bolenler.add(sayi1/i);
            }
        }
       if(Bolenler.size()==2){
           System.out.println("Asal");
       }else{
           System.out.println("Asal Değil");
       }*/
        System.out.println("Sayı Giriniz");
        int a= klavye.nextInt();

        recursiveMethod(a);


    }

    private static void recursiveMethod(int a) {
        System.out.print(a+ " ");

        if (a <= 0) {
            System.out.print("0 ");
            return;
        }

        recursiveMethod(a - 5);
        System.out.print(a + " ");
    }

}

