import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;

public class StackApp
{
    public static void main(String [] args)
    {
        Stack A = new Stack();
        Stack B = new Stack();
        Stack C = new Stack();
        A.push("l"); A.push("a".toUpperCase());
        A.push("u".toUpperCase()); A.push("t"); A.push("x");
        A.push("e".toUpperCase()); A.push("t");
        //************************Structure-A
        while (!A.isEmpty()) {
            String s = A.pop();
            System.out.print(s+ " ");
            switch(s.toLowerCase())
            {
                case "a": case "e": case "i":case "O": case "u":
                B.push(s.toLowerCase()); break;
                default:
                C.push(s.toUpperCase());
            }
        }
        //************************Structure-B
        //************************Structure-C
        
        System.out.println();
        while (!B.isEmpty()) {
            String s = B.pop();
            System.out.print(s+ " ");
        }
        System.out.println();
        while (!C.isEmpty()) {
            String s = C.pop();
            System.out.print(s+ " ");
        }
