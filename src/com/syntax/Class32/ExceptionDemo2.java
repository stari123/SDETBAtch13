package com.syntax.Class32;


public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
          // String name = null;
          // System.out.println(name.length());

           int [] arr={2};
           System.out.println(arr[5]);

           int[] arr2 = new int[-5];
        } catch (NullPointerException npe) {
            System.out.println ( "You are trying to " + "call a method on a null object" );
        } catch (IndexOutOfBoundsException ariff) {
            System.out.println ( "Please check the index that you are trying to access" );
        } catch (Exception genna) {
            System.out.println ( "Something went wrong" );
        }
    }
}