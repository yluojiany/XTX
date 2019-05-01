import java.util.LinkedList;
 
public class t_4DL {
    private LinkedList<Object> link;
 
    public t_4DL(){
        link = new LinkedList();
    }
 
    public void myAdd(Object obj){
        link.addFirst(obj);
    }
    public Object myGet(){
        return link.removeLast();
    }
 
    public boolean isNull(){
        return link.isEmpty();
    }
 
    public static void main(String[] args)
    {
        t_4DL dl = new t_4DL();
        dl.myAdd("ÎÒ");
        dl.myAdd("°®");
        dl.myAdd("Èý");
        dl.myAdd("»ð");
       
        System.out.println("============");
        while (!dl.isNull())
        {
            System.out.println(dl.myGet());
        }
    }
}
