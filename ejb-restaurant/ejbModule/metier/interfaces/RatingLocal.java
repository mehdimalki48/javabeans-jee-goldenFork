package metier.interfaces;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Rating;

@Local
public interface RatingLocal {
	public Rating addRating(Rating r);
	public Rating getRating(int id);
	public List<Rating> getRatings();
	public void updateRating(Rating r);
	public void deleteRating(int id);
}
