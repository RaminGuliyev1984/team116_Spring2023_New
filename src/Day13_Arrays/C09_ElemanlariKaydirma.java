package Day13_Arrays;

import java.util.Arrays;

public class C09_ElemanlariKaydirma {
  public static void enSonuOneGetrir(int [] array){
      int a = array.length;
      int temp = array[a-1];

      for (int i = a-1; i >0; i--) {
        array[i]=array[i-1];
      }
      array[0]=temp;
  }


        // Soru 3-  Verilen bir array’deki tum elementleri bir saga kaydirip,
        //          sondaki elementi de basa tasiyacak bir method olusturun,
        //          array’i yeni haliyle kaydedin.
        //		Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]





            public static void main(String[] args) {

                int[] arr = {4, 5, 6, 7};
                System.out.println("Original array: " + Arrays.toString(arr));
               enSonuOneGetrir(arr);
                System.out.println("new array" +Arrays.toString(arr));
                }

            }
