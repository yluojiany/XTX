import java.util.function.Consumer;

public class lambda {
	
	public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Apple[] apples = {
				new Apple("red",200),
				new Apple("green",180)
		};
		
		ConsumerApple(apples, (apple) -> System.out.println(apple));
		
        ConsumerApple(apples, new Consumer<Apple>() {
        	 public void accept(Apple apple) {
                 System.out.println(apple);
             }
         });
	}

}

