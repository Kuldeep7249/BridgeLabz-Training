import java.util.*;
public class BMICalculator {
    public static int calculate(int[]data){
        try{
        return data[1]/(data[0]*data[0]);
        }
        catch(ArithmeticException e){
            return -1;
        }
    }
    public static int[][] fill(int[][] bmidata){
        int [][] cal=new int[10][3];
        for(int i=0;i<10;i++){
            cal[i][0]=bmidata[i][0];
            cal[i][1]=bmidata[i][1];
            cal[i][2]=calculate(bmidata[i]);
        }
        return cal;
    }
    public static void displayResult(int [][] fulldata){
        System.out.println("Student\theight\tweight\tBMI");
        System.out.println("---------------------------------");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+"\t"+fulldata[i][0]+"\t"+fulldata[i][1]+"\t"+fulldata[i][2]);
        }
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int studentdata[][]=new int[10][2];
        for(int i=0;i<10;i++){
            System.out.println("Enter the height of "+(i+1)+" person :");
            studentdata[i][0]=(int)(Math.random()*10);
             System.out.println("Enter the weight of "+(i+1)+" person :");
            studentdata[i][1]=(int)(Math.random()*100);
        }
        int[][]finallist=fill(studentdata);
        displayResult(finallist);
    }

}
