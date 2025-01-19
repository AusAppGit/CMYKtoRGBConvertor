import java.util.Scanner;

public class CMYKtoRGBConvertor
  {
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          // take CMYK input
          double c = sc.nextDouble();
          double m = sc.nextDouble();
          double y = sc.nextDouble();
          double k = sc.nextDouble();
          
          // convert to RGB
          int r = (int) Math.round(255 * (1 - c) * (1 - k));
          int g = (int) Math.round(255 * (1 - m) * (1 - k));
          int b = (int) Math.round(255 * (1 - y) * (1 - k));

          // print text in correct format to screen
          System.out.println(r + "," + g + "," + b);
          sc.close();
      }
    }
