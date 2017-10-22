/**
 * Created by Michal on 2017-07-03.
 */
public class Pilot {
    private boolean OnOff;
    private int Kanaly;
    private int Glosnosc;


    public void setKanaly(int i) {
    }

    public int setGlosnosc(){return Glosnosc;}
    public int getGlosnosc(){return Glosnosc;}
    public void setOnOff(boolean a)
    {
        OnOff =a;
    }
    public void getOnOff()
    {
        if (OnOff) {

            System.out.println("TV On");
        }
            else
            System.out.println("TV Off");
        }

    public void setGlosnosc(int i) {
    }
}

