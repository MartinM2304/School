package theme_20;

public class ChildrenBook extends Book {
	
	private int age;
	
	ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
		
		super( regularPrice ,publisher,yearPublished);
		
		this.setAge(age);
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double computeSalePrice(){
        return super.getRegularPrice() * 0.7;
 }

}
