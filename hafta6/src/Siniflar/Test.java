package Siniflar;

public class Test {
	public static void main(String[] args) {
		
	
	String adi="ali";
	String soyadi="veli";
	String marka="Mercedes";
	int model=2022;
	
	
	Cars c=new Cars(marka,model);
	People p=new People(adi,soyadi,c); 
	System.out.println(p.getName());
	System.out.println(p.c.getMarka());
	p.c.setMarka("Volvo");
	System.out.println(p.c.getMarka());
	System.out.println(c.getMarka());
	System.out.println(p.getName()+" "+p.getSurname()+" nin "+p.c.getModel()+" model"+" "+p.c.getMarka()+" arabası vardir");
	
	}
	
	
	
}
