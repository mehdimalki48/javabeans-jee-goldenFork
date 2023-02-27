package metier.interfaces;

import java.util.List;

import javax.ejb.Local;

import metier.entities.MenuType;

@Local
public interface MenuTypeLocal {
	public MenuType addMenuType(MenuType m);
	public MenuType getMenuType(int id);
	public List<MenuType> getMenuTypes();
	public void updateMenuType(MenuType m);
	public void deleteMenuType(int id);
}
