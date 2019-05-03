import java.util.LinkedList;
 
public class t_4DZ {
    private LinkedList linkedList=new LinkedList();
 
    //Ñ¹Õ»
    public void  push(Object value){//Ñ¹
        linkedList.addFirst(value);
    }
 
    //³öÕ»
    public Object pop(){//µ¯
        Object value=linkedList.getFirst();
        linkedList.removeFirst();
        return value;
    }
 
    //ÈÝÆ÷´óÐ¡
    public int size(){
        return linkedList.size();
    }
 
    public static void main(String[] args) {
        t_4DZ dz=new t_4DZ();
        dz.push("»ð");
        dz.push("Èý");
        dz.push("°®");
        dz.push("ÎÒ");
 
        while(dz.size()!=0){
            System.out.println(dz.pop());
        }
    }
}
