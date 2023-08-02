public class searchInASortedMatrix {
    public static boolean stairCaseApproach(int [][] multiArray , int key){
        boolean flag = false ;                   // Indicator

        int row = 0 ;
        int col = multiArray[0].length - 1;

        while (row < multiArray.length && col >= 0){       // Loop Logic

            if (key == multiArray[row][col]){
                System.out.println("Key Found At Index : "+row+","+col);
                flag = true ;
            }
                if (key > multiArray[row][col])
                    row++ ;
                else
                    col-- ;
        }
        return flag ;
    }
    public static void main(String[] args) {
        int [][] multiArray = {{10,20,30,40},         // Row wise & col wise sorted array.
                                {15,25,35,45},
                                {27,29,37,48},
                                {32,33,39,50}} ;
        int key = 50 ;

        boolean flag= stairCaseApproach(multiArray , key) ;
        if (flag) System.out.println("Successful!");
        else      System.out.println("Key Not Found!");
    }
}
