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
	
	public void checkOut(String ID, User user) {

		Media m = (Media) listOfMedia.stream().filter(i->i.ID.equals(ID)).findAny().orElse(null);
		if (m.isCheckedOut()){
			System.out.println("Already checked out.");
		}
		else if(user.getWithdrawals().stream().count() < user.getMaxWithdraws()) {
			m.setCheckedOut(true);
			user.addWithdrawal(m);
		}
		else {
			System.out.println("User has already checked out the maximum amount.");
		}
	}
	
	
	public void checkOut(String mediaID, int userID) {
		Media m = (Media) listOfMedia.stream().filter(i->i.ID.equals(mediaID)).findAny().orElse(null);
		User u = (User) userDB.getAllUsers().stream().filter(i->i.getID() == userID).findAny().orElse(null);
		
		if (m.isCheckedOut()){
			System.out.println(m.getTitle() + " is already checked out.");
		}
		else if(u.getWithdrawals().stream().count() < u.getMaxWithdraws()) {
			m.setCheckedOut(true);
			u.addWithdrawal(m);
			System.out.println(u.getName() + " has checked out " + m.getTitle());
		}
		else {
			System.out.println("User has already checked out the maximum amount.");
		}
		
	}
	
	public void checkIn(Media media, User user) {
		if(!media.isCheckedOut()) {
			System.out.println("Already checked in.");
		}
		user.getWithdrawals().removeIf(i->i == media);
		media.setCheckedOut(false);
	}
	
	public void checkIn(String mediaID, int userID) {
		Media m = (Media) listOfMedia.stream().filter(i->i.ID.equals(mediaID)).findAny().orElse(null);
		User u = (User) userDB.getAllUsers().stream().filter(i->i.getID() == userID).findAny().orElse(null);
		
		if(!m.isCheckedOut()) {
			System.out.println("Already checked in.");
		}
		u.getWithdrawals().removeIf(i->i == m);
		m.setCheckedOut(false);
		System.out.println(u.getName() + " checked in " + m.getTitle());
	}
	
	public void updateMedia(String ID,int publishDate, int pageCount, String author, String title, String extra) {
		Media m = (Media) listOfMedia.stream().filter(i->i.ID.equals(ID)).findAny().orElse(null);
		if(ID.substring(0,1).equals("B")) {
			((Book) m).updateAllInfo(publishDate, pageCount, author, title, Boolean.valueOf(extra));
			System.out.println("Updated book!");
		}
		else if(ID.substring(0,1).equals("N")) {
			((Newspaper) m).updateAllInfo(publishDate, pageCount, author, title, extra);
		}
		else if(ID.substring(0,1).equals("M")) {
			((Map) m).updateAllInfo(publishDate, pageCount, author, title, extra);
		}
		else {
			System.out.println("Invalid ID.");
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
