public class prog{
 static interface Nocturnal { 
	 default boolean isBlind() 
	 {
		 return true; } 
	 } 
	 public class Owl implements Nocturnal 
	 {   
	 public boolean isBlind() 
	 {
		 return false; 
		} 
	 public static void main(String[] args) {
	 
	 Nocturnal nocturnal = (Nocturnal)new Owl(); 
	 System.out.println(nocturnal.isBlind()); 
	 } 
		 } 
			

}




// public class prog {
// 	int x = 5;
//     public static void main(String args[]) {
//         prog progObject = new prog();
		
// 		System.out.println(progObject.addTwoNumber(5, progObject.x));

//     }

// 	int addTwoNumber(int a, int b){
// 		return a+b;
// 	}
// }

// public static class Certification{
// private String name;
// private double price;

// public Certification(String s,double d){
// name = s;
// price = d;
// }

// public double getPrice(){
// return price;
// }

// public String getName(){
// return name;
// }
// }
// static int i = 1;
// public static void main(String args[]){
// List<Certification> certs = new ArrayList<Certification>();

// certs.add(new Certification("1Z0-803",120));
// certs.add(new Certification("1Z0-804",250));
// certs.add(new Certification("1Z0-805",175));
// certs.add(new Certification("1Z0-808",150));
// certs.add(new Certification("1Z0-810",225));

// Predicate <Certification> filter = (c) -> {return c.getPrice() > 180;};

// for(Certification c : certs){
// if(filter.test(c)){
// System.out.println(c.getName());
// }
// }
// }

/*
 * public void roar(String roar1, StringBuilder roar2) {
 * roar1.concat("!!!");
 * roar2.append("!!!");
 * }
 * public static void main(String[] args) {
 * String roar1 = "roar";0
 * StringBuilder roar2 = new StringBuilder("roar");
 * new prog().roar(roar1, roar2);
 * System.out.println(roar1 + " " + roar2);
 * }
 */

/*
 * public static void method1(){
 * 
 * StringBuilder sb = new StringBuilder();
 * 
 * sb.append("aaa").insert(1, "bb").insert(4, "ccc");
 * 
 * System.out.println(sb);
 * }
 * 
 * public static void method2(){
 * String s = "Hello";
 * String t = new String(s);
 * if ("Hello".equals(s))
 * System.out.println("one");
 * if (t == s)
 * System.out.println("two");
 * if (t.equals(s))
 * System.out.println("three");
 * if ("Hello" == s)
 * System.out.println("four");
 * if ("Hello" == String.valueOf(t))
 * System.out.println("five");
 * }
 * 
 * 
 * /*
 * public static void method3(){
 * String s1 = "java";
 * StringBuilder s2 = new StringBuilder("java");
 * if (s1 == s2)
 * System.out.print("1");
 * if (s1.equals(s2))
 * System.out.print("2");
 * }
 * 
 * 
 * }
 */
