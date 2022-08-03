package TariExamples;

public class Ex1 {
    /*Create a method that will take 2 parameters as a numbers
    and prints which number is larger.*/
    public void printlarger(int num1, int num2) {

        if (num1 > num2) {
            System.out.println ( num1 + "larger" );
        } else if (num2 > num1) {
            System.out.println ( num2 + "larger" );
        } else {
            System.out.println ( "num1 is equal to num2" );
        }
    }
        public static void main (String[]args){
            // calling directly with name if method is static
        //printlarger ( -6, -6 );

            // calling by creating object of class if method is not static
            Ex1 larger=new Ex1();
            larger.printlarger ( 14,14);

        }


    }


