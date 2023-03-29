
interface Review {	
	void reviewed();
}

 class ExpensesReview implements Review {
	@Override public void reviewed()
	{
		System.out.println("Review: ExpensesReview");
	}
}


// HotelReview.java
class HotelReview implements Review {
	@Override
	public void reviewed()
	{
		System.out.println("Review: HotelReview");
	}
}

 abstract class ReviewDecorator implements Review {
	protected Review decoratedReview;
	public ReviewDecorator(Review decoratedReview)
	{
		this.decoratedReview = decoratedReview;
	}
	public void reviewed() { decoratedReview.reviewed(); }
}

 class AreaReviewDecorator extends ReviewDecorator {

	public AreaReviewDecorator(Review decoratedReview)
	{
		super(decoratedReview);
	}
	@Override public void reviewed()
	{
		decoratedReview.reviewed();
		setRedBorder(decoratedReview);
	}
	private void setRedBorder(Review decoratedReview)
	{
		System.out.println(" Area is Ahmedabad");
	}
}

public class DecoratorPatternDemo {
	public static void main(String[] args)
	{	
		Review circle = new HotelReview();
		Review areaHotelReview
			= new AreaReviewDecorator(new HotelReview());
		Review areaExpensesReview
			= new AreaReviewDecorator(new ExpensesReview());
		System.out.println("HotelReview without area");
		circle.reviewed();
		System.out.println("\nHotelReview of given area");
		areaHotelReview.reviewed();
		System.out.println("\nExpensesReview of given area");
		areaExpensesReview.reviewed();
	}
}
