import java.util.*;
public class Pen_Distribution {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int pen=r.nextInt();
        int students=r.nextInt();
        System.out.print("The pen per student is "+(pen/students)+" and the remaining pen not distributed is "+(pen%students));
    }
}
