 class Quardangle{
	private Quardangle[] qtest = new Quardangle[6];
	private int nextindex = 0;
	public void draw(Quardangle q){
		if(nextindex < qtest.length){
			qtest[nextindex] = q;
			System.out.println(nextindex);
			System.out.println(qtest[nextindex]);
			nextindex++;
			
		}
	}
	public void yangzheng(){
		//this.show();
	}
}
 class Square extends Quardangle{
	public Square(){
		System.out.println("������");
	}
	void show(){
		System.out.println("ȷʵ��������");
	}
}
class Chang extends Quardangle{
	public Chang(){
		System.out.println("������");
	}
}
class DuotaiDemo{
	public static void main(String[]args){
		Quardangle q = new Quardangle();
		q.draw(new Square());
		q.draw(new Chang());
		Square s = new Square();
		s.show();
	}
}