import java.lang.Math;
import java.util.Random;

public class FCFS {
    public static int FirstCome(int head) {
        int totalMovement = 0; //start total movement out at 0
        Random rand = new Random(); //declaring the random generator


        int[] array = new int[1000]; //array of 1000 integers (supposed to simulate disk requests)
        for(int i = 0;i<array.length;i++){
            array[i] = rand.nextInt(5000); //giving a new number for every index in array
        }
        for (int i = 0; i < array.length; i++) {
            totalMovement = Math.abs(array[i] - head); //Movement = distance between array location and your head
            head = array[i]; //make this index your new head and repeat
        }
        return totalMovement;
    }
    public static void main(String args[]){
        System.out.println(FirstCome(100));
    } //number inputted is where the head starts 
}

