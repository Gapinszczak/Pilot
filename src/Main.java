import java.util.Scanner;

/**
 * Created by Michal on 2017-07-03.
 */
public class Main {
    public static void main (String[] args)
    {


        Pilot Gapi = new Pilot();
        Gapi.getOnOff();
        System.out.println("Czy chcesz włączyć TV? 1-Tak, 2-Nie");
        Scanner red = new Scanner(System.in);
        int a=red.nextInt();
        if (a==1)
        {
            Gapi.setOnOff(true);
        }
        else if(a==2) {
            Gapi.getOnOff();
        }
        else{
            System.out.println("Wybierz 1 lub 2");
        }
        Gapi.getOnOff();

        System.out.println(("Wybierz kanał 1-3"));
        Scanner kanaly = new Scanner(System.in);
        int b= kanaly.nextInt();
        if(b==1)
        {
            Gapi.setKanaly(1);
            System.out.println("TVP");
        }
        else if (b==2){
            Gapi.setKanaly(2);
            System.out.println("TVP2");
        }
        else if(b==3){
            Gapi.setKanaly(3);
        }
        else{
            System.out.println("Podaj cyfrę od 1 do 3");
        }
       Gapi.getGlosnosc();
        System.out.println("Czy podglosnic? 1-tak));
        Scanner glosnosc =new Scanner(System.in);
        int c=glosnosc.nextInt();
        if (c==1){
            Gapi.setGlosnosc(2);
        }


    }
}
