import java.util.*;
public class Week_HW2 {
    public static void main(String[] args) throws Exception{
        
         var hmap=new HashMap<>();
         hmap.put(1,"January");
         hmap.put(2,"February");
         hmap.put(3,"March");
         hmap.put(4,"April");
         hmap.put(5,"May");
         hmap.put(6,"June");
         hmap.put(7,"July");
         hmap.put(8,"August");
         hmap.put(9,"September");
         hmap.put(10,"October");
         hmap.put(11,"November");
         hmap.put(12,"December");
         
         Scanner sc=new Scanner(System.in);
         System.out.print("請輸入1~12? ");
         int number=sc.nextInt();
         if(number<1||number>12){
            System.out.println("範圍錯誤!");
            System.out.print("請輸入1~12?");
            number=sc.nextInt();
         }
         System.out.printf("第 %d 月的英文單字為 %s",number,hmap.get(number));


    }    
}
