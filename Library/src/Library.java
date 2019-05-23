import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Library {
	ArrayList<Media> listOfMedia = new ArrayList<Media>();	
	UserDatabase userDB = new UserDatabase();
	
	public UserDatabase getUserDB() {
		return userDB;
	}
	
	public void checkOut(Media media, User user) {
		if(media.isCheckedOut()) {
			System.out.println("Already checked out.");
		}
		else if(user.getWithdrawals().stream().count() < user.getMaxWithdraws()) {
			media.setCheckedOut(true);
			user.addWithdrawal(media);
		}
		else {
			System.out.println("User has already checked out the maximum amount.");
		}
	}
	
	public void checkOut(String mediaID, int userID) {
//		if(media.isCheckedOut()) {
//			System.out.println("Already checked out.");
//		}
//		else if(user.getWithdrawals().stream().count() < user.getMaxWithdraws()) {
//			media.setCheckedOut(true);
//			user.addWithdrawal(media);
//		}
//		else {
//			System.out.println("User has already checked out the maximum amount.");
//		}
	}
	public void checkIn(Media media, User user) {
		if(!media.isCheckedOut()) {
			System.out.println("Already checked in.");
		}
		user.getWithdrawals().removeIf(i->i == media);
		media.setCheckedOut(false);
	}
	
	public void updateMedia(String ID, Media newMedia) {
		
	}
	
	public void updateMedia(Media media, Media newMedia) {
		newMedia.ID = media.ID;
		for(int i = 0; i < listOfMedia.size(); i++) {			
			if(listOfMedia.get(i) == media) {
				listOfMedia.remove(i);
				listOfMedia.add(i, newMedia);
			}
		}
	}
	
	//fix this
	public ArrayList<Media> sortMediaBy(String field, boolean asc) 
	{
		
		
//		Media m = new Media();
//		Field f = m.getClass().getDeclaredField(field);
//		return (ArrayList<Media>) listOfMedia.stream()
//				.sorted(Comparator.comparing()))
//				.collect(Collectors.toList());
		
		//field.toLowerCase();
//		if(asc)
//			return (ArrayList<Media>) listOfMedia.stream()
//					.sorted(Comparator.comparing(i->i.getDeclaredField(field).toString()))
//					.collect(Collectors.toList());
		return null;
	}
	
	public ArrayList<Media> sortMediaByName(boolean asc) {
		if (asc)
			return (ArrayList<Media>) listOfMedia.stream()
					.sorted(Comparator.comparing(Media::getTitle))
					.collect(Collectors.toList());
		
		return (ArrayList<Media>) listOfMedia.stream()
				.sorted(Comparator.comparing(Media::getTitle).reversed())
				.collect(Collectors.toList());
	}
	
	public ArrayList<Media> sortSelectByName(String selection, boolean asc) {
		if (asc)
			return (ArrayList<Media>) listOfMedia.stream()
					.filter(i->i.getType().equals(selection))
					.sorted(Comparator.comparing(Media::getTitle))
					.collect(Collectors.toList());
		
		return (ArrayList<Media>) listOfMedia.stream()
				.filter(i->i.getType().equals(selection))
				.sorted(Comparator.comparing(Media::getTitle).reversed())
				.collect(Collectors.toList());
	}
	
	public ArrayList<Media> sortSelectByType(String type, boolean asc) {
		if(asc)
			return (ArrayList<Media>) listOfMedia.stream()
					.filter(i->i.getType().equals(type))
					.sorted(Comparator.comparing(Media::getType))
					.collect(Collectors.toList());
	
		return (ArrayList<Media>) listOfMedia.stream()
				.filter(i->i.getType().equals(type))
				.sorted(Comparator.comparing(Media::getType).reversed())
				.collect(Collectors.toList());
	}
	
	public void addMedia(Media media) {
		listOfMedia.add(media);
	}
	
	public ArrayList<Media> getAllMedia(){
		return (ArrayList<Media>) listOfMedia.stream()
				.collect(Collectors.toList());
	}
}
