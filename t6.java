
import java.util.Random;
 
public class t6 {
    public static void main(String[] args) {
        int[] array=new int[10];
        int i=0;
        while(i<10){
            int temp= (int)(Math.random()*100);
            if(i==0){
                array[i]=temp;
                i++;
            }
            if(i>0){
                if(hasExisteted(array,i,temp))
                    continue;
                else{
                    array[i]=temp;
                    i++;
                }
            }
        }
 
        for(int o:array){
            System.out.print(o+",");
        }
    }
    private static boolean hasExisteted(int[] ary,int cap,int value){
        boolean result=false;
        for(int i=0;i<cap&&i<ary.length;i++){
             if(ary[i]==value)
                 return true;
        }
        return result;
    }
}