package Recursive;

public class DenemeYanilma {

	public static void main(String[] args) {
		try {
			int [] number= {1,2,3,4,5};
			System.out.println(number[4]);
			System.out.println("try devam ediyor");
		}catch(Exception e) {
			System.out.println("Index disina cikildi");
		}
		System.out.println("islemlere devam ediliyor");

	}

}
