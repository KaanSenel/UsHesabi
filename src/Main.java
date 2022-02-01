import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban=scanner.nextInt();
        System.out.print("Üs degeri giriniz : ");
        int us=scanner.nextInt();
        int result=usHesapla(taban,us);
        System.out.println("Sonuç : "+result);
    }
    static int usHesapla(int a,int b){

        if(b==0){
            return 1;
        }
        return a*usHesapla(a,b-1);
    }
}
