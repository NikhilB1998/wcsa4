package javaprograms;

public class Polymorphism {
	
		void add() {
			int a=20,b=10,c;
			c=a+b;
			System.out.println(c);
		}
		
		void add(int x,int y) {
			int c;
			c=x+y;
			
			System.out.println(c);
		}
		
		void add(int x, double y) {
			double c;
			c=x+y;
			System.out.println(c);
		}

		public static void main(String[] args) {
			Polymorphism pm=new Polymorphism();
			pm.add(); pm.add(10,10.0); pm.add(12, 10);
		}
}
