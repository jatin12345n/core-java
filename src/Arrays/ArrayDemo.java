package Arrays;

public class ArrayDemo {

    public void Demointarrays() {
        // SYNTAX of Array : DataType  []  variable_name={,,,,};

        int[] MarksArrays = {450, 471, 478, 968, 458, 235, 457, 693, 546,};

        //index 0,1,2,3,4,5......

        System.out.println(MarksArrays[0]);
        System.out.println(MarksArrays[1]);
        System.out.println(MarksArrays[2]);
        System.out.println(MarksArrays[3]);
        System.out.println(MarksArrays[4]);
        System.out.println(MarksArrays[5]);
        System.out.println(MarksArrays[6]);
        System.out.println(MarksArrays[7]);
        System.out.println(MarksArrays[8]);


        for (int i = 0; i < MarksArrays.length; i++) {

            System.out.println(" Inside for Loop " + MarksArrays[i]);


        }
        //Advance for Loop
        //SYNTAX : for (DataType var_name : arrays){
        // }

        for (int var  :  MarksArrays){

            System.out.println("Inside Advance for Loop "+var);


               }
          }

        public static void main (String[]args)  {
            ArrayDemo obj = new ArrayDemo();
            obj.Demointarrays();

        }
    }
