import java.util.Stack; 
import java.io.*;
import AlgoTools.IO;

public class Palindrom {
  
  
  public static void main(String[] arg) {
    String s;
    s=IO.readString("Wort eingeben:");
    s=s.toLowerCase();
    s=s.replaceAll("\\s", "");
    if (testePalindrom(s))  {
      System.out.println(s + " ist ein Palindrom");
      }
    else {
      System.out.println(s + " ist kein Palindrom");
    }
    }
  
  public static boolean testePalindrom(String s) { 
    Stack<Character> st = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      st.push(s.charAt(i));
      }
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)==st.pop()) {
          
        } else {
          return false;
        } // end of if-else
      }
    return true;
    
    }
    }
    
  
  
  
  




