package metier.interfaces;

import java.util.List;

import javax.ejb.Local;

import metier.entities.User;

@Local
public interface UserLocal {
	public User addUser(User u);
	public User getUser(int id);
	public List<User> getUsers();
	public void updateUser(User u);
	public void deleteUser(int id);
}
