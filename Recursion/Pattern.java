package Java.Recursion;

public class Pattern {
    public static void main(String[] args) {
        Triangle(4,0);
        Tringle2(4,0);
    }
    static void Triangle(int row , int col){
        if (row ==0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            Triangle(row,col +1);
        }else{
            System.out.println();
            Triangle(row -1 ,0);
        }
    }
    static void Tringle2(int row , int col ){
        if(row ==0){
            return;
        }
        if(col < row){
            Tringle2(row,col +1);
            System.out.print("* ");
        }else{
            Tringle2(row-1,0);
            System.out.println();;
        }
    }

}
