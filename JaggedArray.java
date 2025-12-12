import java.util.Scanner;
public class JaggedArray{
    public static void main(String args[])
    {
        int[][] JaggedArray;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for Jagged Array: ");
        int rows=sc.nextInt();
        JaggedArray=new int[rows][];
        for(int i=0;i<rows;i++){
            System.out.println("Enter the number of columns for Jagged Array");
            int cols=sc.nextInt();
            JaggedArray[i]=new int[cols];
        }
        for(int i=0;i<JaggedArray.length;i++){
            for(int j=0;j<JaggedArray[i].length;j++){
                System.out.print("Enter the elements at ["+i+"]["+j+"] : ");
                JaggedArray[i][j]=sc.nextInt();
            }
        }
         System.out.println("Jagged Array is : ");
        for(int i=0;i<JaggedArray.length;i++){
            for(int j=0;j<JaggedArray[i].length;j++){
               
                System.out.print(JaggedArray[i][j]);
            }
            System.out.println(" \n");
        }
        sc.close();
    }
}