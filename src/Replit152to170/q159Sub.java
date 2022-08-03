package Replit152to170;

public class q159Sub {
   /* Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers
    In main method execute all 3 methods to match the output:
    Expected Output
            40 (should come from subtracting 4 numbers)
            30 (should come from subtracting 3 numbers)
            20 (should come from subtracting 2 numbers) */


    public int sub(int x, int y) // Overloaded sub(). This sub takes two int parameters
    {
        return (x - y);
    }
    public int sub(int x, int y, int z) // Overloaded sub(). This sub takes three int parameters
    {
        return (x - y - z);
    }
        public int sub(int x, int y, int z, int w) // Overloaded sub(). This sub takes four integer parameters
    {
        return (x - y- z- w);
    }
    // Driver code
    public static void main(String args[])
    {
        q159Sub s = new q159Sub();
        System.out.println(s.sub(80, 20, 10, 10 )+" (should come from subtracting 4 numbers)");
        System.out.println(s.sub(50, 10, 10)+" (should come from subtracting 3 numbers)");
        System.out.println(s.sub(30, 10)+" (should come from subtracting 4 numbers)");



    }
}








