import java.io.*;
import java.util.*;

public class main
{
    public static void main(String[]args)
    {
        insertsoft insert = new insertsoft();
        int[] arr= new int[5];
        arr[0]=2;
        arr[1]=8;
        arr[2]=7;
        arr[3]=4;
        arr[4]=9;
        int n = arr.length;
        insert.InsertionSoft(arr, n);
    }
}