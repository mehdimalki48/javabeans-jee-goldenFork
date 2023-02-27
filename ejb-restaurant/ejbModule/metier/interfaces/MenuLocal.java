package metier.interfaces;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Menu;

@Local
public interface MenuLocal {
	public Menu addMenu(Menu m);
	public Menu getMenu(int id);
	public List<Menu> getMenus();
	public void updateMenu(Menu m);
	public void deleteMenu(int id);
}
