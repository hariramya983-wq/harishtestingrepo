package Core_java;

public class Logicoper {

	public static void main(String[] args) {
		
int age =25;
int mark =65;
boolean a=false;
boolean b=true;
System.out.println(age<=18 && mark<=60); //false
System.out.println(age>=18 && mark>=60);//true
System.out.println(age>=30 && mark>=70);//false
System.out.println(age<=30 && mark<=70);//true

System.out.println(age<=18 || mark<=60);//false
System.out.println(age>=18 || mark>=60);//True
System.out.println(age>=30 || mark>=70);//false
System.out.println(age<=30 || mark<=70);//True
System.out.println(!a);
System.out.println(!b);

	}

}
