package 랜덤뽑기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main{
   public static void main(String[] args) throws IOException{
      int answer = getNum();
      String[] pickMem = getMember(answer);
      printMember(pickMem);
   }
   public static int getNum() throws IOException {
      BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("몇 명인가요? :");
      int answer = Integer.parseInt(re.readLine());
      return answer;
   }
   public static String[] getMember(int n){
      String[] member = {"검봉","Hanse","Yan","Ella","Konda","sonny","반스","Teemo","Bart","Jarry"};
      Random rd = new Random();
      String[] pickMem = new String[n];
      for(int i = 0; i < n; i++){
         pickMem[i] = member[rd.nextInt(10)];
         for(int j = 0; j < i; j++){
          if(pickMem[i].equals(pickMem[j])){
               i--;
            }
         }
      }
      return pickMem;
   }
   public static void printMember(String[] pickMem){
      for(int i = 0; i < pickMem.length; i++){
         System.out.print(pickMem[i]);
         if(i != pickMem.length-1){
            System.out.print(", ");
         }
      }
   }

}
