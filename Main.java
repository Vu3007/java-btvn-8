import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movies> arrMovies=new ArrayList<>();
        Movies movie1=new Movies(1,"a1","b1","c1","ngay 10",150);
        Movies movie2=new Movies(2,"a2","b2","c2","ngay 15",180);
        Movies movie3=new Movies(3,"a3","b3","c3","ngay 16",160);
    arrMovies.add(movie1);
    arrMovies.add(movie2);
    arrMovies.add(movie3);
        for (int i=0;i< arrMovies.size();i++){
            System.out.println(arrMovies.get(i));
        }
        ArrayList<Serial> arrSerial=new ArrayList<>();
        Serial serial1=new Serial(4,"a4","b4","c4","ngay 17",10 ,180);
        Serial serial2=new Serial(5,"a5","b5","c5","ngay 18",11 ,180);
        Serial serial3=new Serial(6,"a6","b6","c6","ngay 19",12 ,180);
    arrSerial.add(serial1);
    arrSerial.add(serial2);
    arrSerial.add(serial3);
       for (int i=0;i<arrSerial.size()||i< arrMovies.size();i++){
           System.out.println(arrSerial.get(i));
       }
      Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tieu de can tim: ");
        String timphim=sc.nextLine();
        for (int i=0;i< arrSerial.size();i++){
            if (arrMovies.get(i).getTieude().equalsIgnoreCase(timphim)){
                System.out.println("Phim can tim la: "+   arrMovies.get(i));
            }
            if (arrSerial.get(i).getTieude().equalsIgnoreCase(timphim)){
                    System.out.println("Phim can tim la: "+   arrSerial.get(i));
            }




        }
    }
}
