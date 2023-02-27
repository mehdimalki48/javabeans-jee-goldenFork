package com.web.models;

import java.io.Serializable;
import java.util.List;

import metier.entities.Customer;
import metier.entities.Menu;
import metier.entities.MenuType;
import metier.entities.Order;
import metier.entities.OrderDetails;
import metier.entities.Payment;
import metier.entities.Rating;
import metier.entities.SiteInfo;
import metier.entities.User;

public class Model implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private List<Customer> list_customers;
	private List<Menu> list_menus;
	private List<MenuType> list_menu_types;
	private List<Order> list_orders;
	private List<OrderDetails> list_order_details;
	private List<Payment> list_payments;
	private List<Rating> list_ratings;
	private List<SiteInfo> list_site_infos;
	private List<User> list_users;
	
	
	public List<Customer> getList_customers() {
		return list_customers;
	}
	public void setList_customers(List<Customer> list_customers) {
		this.list_customers = list_customers;
	}
	public List<Menu> getList_menus() {
		return list_menus;
	}
	public void setList_menus(List<Menu> list_menus) {
		this.list_menus = list_menus;
	}
	public List<MenuType> getList_menu_types() {
		return list_menu_types;
	}
	public void setList_menu_types(List<MenuType> list_menu_types) {
		this.list_menu_types = list_menu_types;
	}
	public List<Order> getList_orders() {
		return list_orders;
	}
	public void setList_orders(List<Order> list_orders) {
		this.list_orders = list_orders;
	}
	public List<OrderDetails> getList_order_details() {
		return list_order_details;
	}
	public void setList_order_details(List<OrderDetails> list_order_details) {
		this.list_order_details = list_order_details;
	}
	public List<Payment> getList_payments() {
		return list_payments;
	}
	public void setList_payments(List<Payment> list_payments) {
		this.list_payments = list_payments;
	}
	public List<Rating> getList_ratings() {
		return list_ratings;
	}
	public void setList_ratings(List<Rating> list_ratings) {
		this.list_ratings = list_ratings;
	}
	public List<SiteInfo> getList_site_infos() {
		return list_site_infos;
	}
	public void setList_site_infos(List<SiteInfo> list_site_infos) {
		this.list_site_infos = list_site_infos;
	}
	public List<User> getList_users() {
		return list_users;
	}
	public void setList_users(List<User> list_users) {
		this.list_users = list_users;
	}
	
	
	 
}
