import javax.swing.event.AncestorEvent;
import java.sql.Array;
import java.util.Arrays;

public class MainClass {
    public static void main (String[] args){

        int[] array = new int []{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0;i < array.length;i++) {
            if(0 != array[i]){
                array[i]=0;
            }
            else {
                array[i] = 1;
            }

        }
        System.out.println(Arrays.toString(array));

        int [] array1 = new int [8];
        for (int i = 0; i < array1.length; i++) {
        array1[i] = i * 3;

        }
       System.out.println(Arrays.toString(array1));

        int[] array2 = new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <array2.length; i++) {
            if (array2[i] < 6){
                array2[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(array2));

//        int [][] array3 = new int[][]{
//                 {1, 2, 3, 4, 5},
//                 { 6, 7, 8, 9, 10},
//                 { 11, 12, 13, 14, 15},
//                 { 16, 17, 18, 19, 20},
//                 { 21, 22, 23, 24, 25}
 //       };
        int [][] array3 = new int[5][5];
        for (int i = 0; i <array3.length; i++) {
            for (int j = 0, j2 = array3[i].length; j < array3[i].length; j++, j2--) {
            if (i == j || i == (j2 - 1)) array3[i][j] = 1;
            System.out.print(array3[i][j] + " ");

            }
            System.out.println();
        }
            int [] array4 = new int[]{10,2,3,4,5,6,7};
            int min = array4[0];
            int max = array4[0];
            for (int i = 0; i <array4.length; i++) {
            if(array4[i] < min){
            min = array4[i];

            }
            if (array4[i] > max){
                max= array4[i];
            }
            }
        System.out.println(min);
        System.out.println(max);



    }
}

