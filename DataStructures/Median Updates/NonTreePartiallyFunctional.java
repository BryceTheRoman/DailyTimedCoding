import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution{

    static void median(String a[],int x[]) {
        int n = a.length;
        ArrayList list = new ArrayList();
        for (int i = 0; i < n; i++){
            int listSize = list.size();
            if (a[i].equals("r")){
                if (listSize > 0 && list.contains(x[i])){
                    list.remove((Object)x[i]);
                }
                calcMed(listSize, list);
            } else {
                list.add(x[i]);
                calcMed(listSize, list);
            }

        }
       
    }
    
    
    public static void calcMed(int listSize, ArrayList list){
        listSize = list.size();
        Collections.sort(list);
        if (listSize == 0){
            System.out.println("Wrong!");
        } else if (listSize == 2){
            System.out.println(((Float.parseFloat(list.get(0).toString()) + Float.parseFloat(list.get((0) + 1).toString()))/2));
        } else if (listSize%2 == 0){
            System.out.println(((Float.parseFloat(list.get(listSize/2).toString()) + Float.parseFloat(list.get((listSize/2) + 1).toString()))/2));
        } else {
            System.out.println(list.get(listSize/2));

        }
    }
    
    
   public static void main( String args[] ){
      

      Scanner in = new Scanner(System.in);
      
      int N;
      N = in.nextInt();
   
      String s[] = new String[N];
      int x[] = new int[N];
      
      for(int i=0; i<N; i++){
         s[i] = in.next();
         x[i] = in.nextInt();
      }
   
      median(s,x);
    }
}

