import attractions.Attraction;
import behaviours.IEntertainment;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IEntertainment> entertaiment;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(String name){
        this.name = name;
        this.entertaiment = new ArrayList<IEntertainment>();
        this.reviewed = new ArrayList<IReviewed>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<IEntertainment> getEntertaiment() {
        return this.entertaiment;
    }

    public int entertainmentCount(){
        return this.entertaiment.size();
    }

    public void addEntertainment(IEntertainment site){
        this.entertaiment.add(site);
    }

    public int reviewedCount() {
        return this.reviewed.size();
    }

    public void getAllReviewed(IReviewed review){
            if (review.getRating() >= 0) {
                this.reviewed.add(review);
            }
    }

    public void visit(Visitor visitor, Attraction attraction){
        
        for()
    }


}
