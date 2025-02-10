package pac1;

import pac1.*;

public class Box {
    private double dblWidth = 10;
    private double dblHeight = 30;
    private double dblDepth = 50;
    private static int boxid;

    public double calcVolume(){
        double dblTemp;
        dblTemp = dblWidth * dblHeight * dblDepth;
        return dblTemp;
    }

    public static void main(String[] args) {

        /*Box box1 = new Box();
        double vol = box1.calcVolume();

        System.out.println(vol);*/


    }

}
