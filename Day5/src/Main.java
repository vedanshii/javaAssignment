import java.util.*;

class studs{
    public int marks;
    public String name;

    public studs(int i, String vedant) {

        marks = i;
        name = vedant;

    }

    public studs(String Vedant){
        this(0,Vedant);

    }
    public String toString(){

        return " Name: "+ name +" " + " marks"+" "+ marks;
    }

}



public class Main{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] mks = {10,20,30,40,50,60,69};
//        int a = 10,b;
        studs s = new studs(10, "Vedant");
        studs sn = new studs("Vedant");
        System.out.println(s.toString());
        System.out.println(sn);

//        System.out.println(a.toString());
//        b= sc.nextInt().toString();

    }



}