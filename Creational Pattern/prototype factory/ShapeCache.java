import java.util.List;
import java.util.ArrayList;

public class ShapeCache implements Cloneable {
	
   private String webName;

	List<Review> reviews = new ArrayList<>();
	public String getWebName() {
		return webName;
	}
	public void setWebName(String shopName) {
		this.webName = shopName;
	}
	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	public void loadData(){
		getWebName();
		for(int i=1; i<=10; i++){
			Review b =  new Review();
			b.setOpinion("opinions");
			b.setRate(i);
			getReviews().add(b);
		}
	}

	@Override
	public String toString() {
	return "ReviewApp [WebName=" + webName + ", review=" + reviews + "]";
	}

   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
      }
      

}