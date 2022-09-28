import java.util.*;
public class Week_HW1 {
    public static void main(String[] args) throws Exception{
        System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼....");
        Random r=new Random();
        int[] num=new int[10];
        int[] num2=new int[10];
        TreeSet<Integer> tSet = new TreeSet<>();
        TreeSet<Integer> tSet2 = new TreeSet<>();
        int i=0;
        int t;
        for(int count=0;count<10;count++){
            num[count]=r.nextInt(100)+1;
            for(int j=0;j<count;){
                if(num[j]==num[count]){
                    num[count]=r.nextInt(100)+1;
                    j=0;
                }else{
                    j++;
                }
            }
            System.out.println(num[count]);
            
            if(num[count]>=30 && num[count]<=70){
                num2[i]=num[count];
                i++;
            }
        }

        for (int k : num) {
            tSet.add(k);
        }
        for(int h : num2){
            tSet2.add(h);
            tSet2.remove(0);
            
        }
        System.out.println("物件內元素個數為:"+tSet.size());
        System.out.println("物件內元素的內容:"+tSet);
        System.out.println("第一個元素內容為:"+tSet.first());
        System.out.println("最後一個元素內容為:"+tSet.last());
        System.out.println("內容介於30~70者:"+tSet2);
        
        
    }    
    
}
