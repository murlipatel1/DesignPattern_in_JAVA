public class  Review implements Cloneable{
    private String opinion;
    private int rating;

    public String getOpinion() {
        return opinion;
    }
    public void setOpinion(String opinion){
        this.opinion = opinion;
    }

    public int getRate() {
        return rating;
    }
    public void setRate(int rating){
        this.rating = rating;

    }
    public String toString() {
        return "Review [Opinion=" + opinion + ", rating=" + rating + "]";
        }
    
    // abstract void opinion();

    public Object clone() {
        Object clone = null;
        
        try {
           clone = super.clone();
           
        } catch (CloneNotSupportedException e) {
           e.printStackTrace();
        }
        return clone;
     }
  

}
