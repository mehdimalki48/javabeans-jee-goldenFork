package metier.session;

import java.sql.Blob;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import metier.entities.Customer;
import metier.entities.Menu;
import metier.entities.MenuType;
import metier.entities.Order;
import metier.entities.OrderDetails;
import metier.entities.Payment;
import metier.entities.Rating;
import metier.entities.SiteInfo;
import metier.entities.User;

@Stateless
@Path("/rest")
public class SessionBeanImpl implements SessionLocal {
	
	@PersistenceContext(unitName = "ejb-restaurant")
	private EntityManager em;
	
	
	
	// ********************** CUSTOMER ************************
	@POST
	@Produces({ "application/JSON" })
	@Path("/addCustomer")
	@Override
	public Customer addCustomer(Customer c) {
		this.em.persist(c);
		return c;
	}

	@GET
    @Produces({ "application/json" })
    @Path("/Customer/{customer_id}")
	@Override
	public Customer getCustomer(@PathParam("customer_id") final int customer_id ) {
		return this.em.find(Customer.class, customer_id);
	}

	@GET
    @Produces({ "application/json" })
    @Path("/Customers")
	@Override
	public List<Customer> getCustomers() {
		final Query query = this.em.createQuery("SELECT c FROM Customer c");
		return (List<Customer>)query.getResultList();
	}
	
	@POST
	@Produces({ "application/json" })
	//@Path("/Customer/update/")
	@Override
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		
	}
	
	@GET
	@Produces({ "application/json" })
	@Path("/deleteCustomer/{customer_id}")
	@Override
	public void deleteCustomer(@PathParam("customer_id")final int customer_id) {
		this.em.remove(customer_id);
	}
	
	
// ********************** MENU *********************

	
	@GET
	@Produces({ "application/json" })
	@Path("/addMenu")
	@Override
	public Menu addMenu(Menu m) {
		this.em.persist(m);
		return m;
	}
	
	@GET
    @Produces({ "application/json" })
    @Path("/Menu/{menu_id}")
	@Override
	public Menu getMenu(@PathParam("menu_id") final int menu_id) {
		return this.em.find(Menu.class, menu_id);
	}
	
	
	@GET
    @Produces({ "application/json" })
    @Path("/Menus")
	@Override
	public List<Menu> getMenus() {
		final Query query = this.em.createQuery("SELECT m FROM Menu m");
		return (List<Menu>)query.getResultList();
	}

	@Override
	public void updateMenu(Menu m) {
		// TODO Auto-generated method stub
		
	}
	
	
	@GET
	@Produces({ "application/json" })
	@Path("/deleteMenu/{menu_id}")
	@Override
	public void deleteMenu(@PathParam("menu_id") final int menu_id) {
		this.em.remove(menu_id);
	}
	
	
	
// ********************* MENU_TYPE ************************
	@POST
	@Produces({ "application/json" })
	@Path("/addMenuType")
	@Override
	public MenuType addMenuType(MenuType mt) {
		this.em.persist(mt);
		return mt;
	}

	
	@GET
    @Produces({ "application/json" })
    @Path("/MenuType/{menu_type_id}")
	@Override
	public MenuType getMenuType(@PathParam("menu_type_id") final int menu_type_id) {
		return this.em.find(MenuType.class, menu_type_id);
	}
	
	@GET
    @Produces({ "application/json" })
    @Path("/MenuTypes")
	@Override
	public List<MenuType> getMenuTypes() {
		final Query query = this.em.createQuery("SELECT mt FROM MenuType mt");
		return (List<MenuType>)query.getResultList();
	}

	@Override
	public void updateMenuType(MenuType m) {
		// TODO Auto-generated method stub
		
	}

	@GET
	@Produces({ "application/json" })
	@Path("/deleteMenuType/{menu_type_id}")
	@Override
	public void deleteMenuType(@PathParam("menu_type_id") final int menu_type_id) {
		// TODO Auto-generated method stub
		
	}

	
// *********************** ORDER ************************** 
	
	@POST
	@Produces({ "application/json" })
	@Path("/addOrder")
	@Override
	public Order addOrder(Order o) {
		this.em.persist(o);
		return o;
	}
	
	@GET
	@Produces({ "application/json" })
	@Path("/Order/{order_id}")
	@Override
	public Order getOrder(@PathParam("order_id")final int order_id) {
		return this.em.find(Order.class, order_id);
	}
	
	@GET
	@Produces({"application/json"})
	@Path("/Orders")
	@Override
	public List<Order> getOrders() {
		Query query = this.em.createQuery("SELECT o FROM Order o");
		return (List<Order>)query.getResultList();
	}

	@Override
	public void updateOrder(Order o) {
		// TODO Auto-generated method stub
		
	}
	
	
	@GET
	@Produces({ "application/json" })
	@Path("/deleteOrder/{order_id}")
	@Override
	public void deleteOrder(@PathParam("order_id") final int order_id) {
		this.em.remove(order_id);
	}

	
	
	
// ********************* ORDER DETAILS ************************
	
	@POST
	@Produces({ "application/json" })
	@Path("/addOrderDetails")
	@Override
	public OrderDetails addOrderDetails(OrderDetails od) {
		this.em.persist(od);
		return od;
	}

	@GET
	@Produces({ "application/json" })
	@Path("/OrderDetails/{order_details_id}")
	@Override
	public OrderDetails getOrderDetails(@PathParam("order_details_id")final int order_details_id) {
		return this.em.find(OrderDetails.class, order_details_id);
	}

	@GET
	@Produces({ "application/json" })
	@Path("/AllOrdersDetails")
	@Override
	public List<OrderDetails> getAllOrderDetails() {
		Query query = this.em.createQuery("SELECT od FROM OrderDetails od");
		return (List<OrderDetails>)query.getResultList();
	}

	@Override
	public void updateOrderDetails(OrderDetails od) {
		// TODO Auto-generated method stub
		
	}

	@GET
	@Produces({ "application/json" })
	@Path("/deleteOrderDetails/{order_details_id}")
	@Override
	public void deleteOrderDetails(@PathParam("order_details_id")final int order_details_id) {
		this.em.remove(order_details_id);
	}

	
	
// ********************* PAYMENT ***************************
	@POST
	@Produces({ "application/json" })
	@Path("/addPayment")
	@Override
	public Payment addPayment(Payment p) {
		this.em.persist(p);
		return p;
	}

	@GET
	@Produces({ "application/json" })
	@Path("Payment/{payment_id}")
	@Override
	public Payment getPayment(@PathParam("payment_id")final int payment_id) {
		return this.em.find(Payment.class, payment_id);
	}
	
	
	@GET
	@Produces({ "application/json" })
	@Path("/Payments")
	@Override
	public List<Payment> getPayments() {
		Query query = this.em.createQuery("SELECT p FROM Payment");
		return (List<Payment>)query.getResultList();
	}

	@Override
	public void updatePayment(Payment p) {
		// TODO Auto-generated method stub
		
	}

	
	@GET
	@Produces({ "application/json" })
	@Path("/deletePayment/{payment_id}")
	@Override
	public void deletePayment(@PathParam("payment_id")final int payment_id) {
		this.em.remove(payment_id);
	}

	
	
// ****************** RATING *************************
	
	@POST
	@Produces({ "application/json" })
	@Path("/addRating")
	@Override
	public Rating addRating(Rating r) {
		this.em.persist(r);
		return r;
	}

	
	@GET
	@Produces({ "application/json" })
	@Path("/Rating/{rating_id}")
	@Override
	public Rating getRating(@PathParam("rating_id") final int rating_id) {
		return this.em.find(Rating.class, rating_id);
	}

	@GET
	@Produces({ "application/json" })
	@Path("/Ratings")
	@Override
	public List<Rating> getRatings() {
		Query query = this.em.createQuery("SELECT r FROM Rating r");
		return (List<Rating>)query.getResultList();
	}

	@Override
	public void updateRating(Rating r) {
		// TODO Auto-generated method stub
		
	}

	
	@GET
	@Produces({ "application/json" })
	@Path("/deleteRating/{rating_id}")
	@Override
	public void deleteRating(@PathParam("rating_id") final int rating_id) {
		this.em.remove(rating_id);
	}

	
	
// ******************** SITE_INFO **********************
	@POST
	@Produces({ "application/json" })
	@Path("/addSiteInfo")
	@Override
	public SiteInfo addSiteInfo(SiteInfo si) {
		this.em.persist(si);
		return si;
	}

	@GET
	@Produces({ "application/json" })
	@Path("SiteInfo/{site_info_id}")
	@Override
	public SiteInfo getSiteInfo(@PathParam("site_info_id")final int site_info_id) {
		return this.em.find(SiteInfo.class, site_info_id);
	}

	
	@GET
	@Path("/SiteInfos")
	@Produces({ "application/json" })
	@Override
	public List<SiteInfo> getSiteInfos() {
		Query query = this.em.createQuery("SELECT si FROM SiteInfo si");
		return (List<SiteInfo>)query.getResultList();
	}

	@Override
	public void updateSiteInfo(SiteInfo si) {
		// TODO Auto-generated method stub
		
	}

	@GET
	@Produces({ "application/json" })
	@Path("/deleteSiteInfo/{site_info_id}")
	@Override
	public void deleteSiteInfo(@PathParam("site_info_id") final int site_info_id) {
		this.em.remove(site_info_id);
	}
	
	

// ****************** USER *************************
	@POST
	@Produces({ "application/json" })
	@Path("/addUser")
	@Override
	public User addUser(User u) {
		this.em.persist(u);
		return u;
	}
	
	@GET
	@Produces({ "application/json" })
	@Path("/User/{user_id}")
	@Override
	public User getUser(@PathParam("user_id") final int user_id) {
		return this.em.find(User.class, user_id);
	}

	
	@GET
	@Produces({ "application/json" })
	@Path("/Users")
	@Override
	public List<User> getUsers() {
		Query query = this.em.createQuery("SELECT u FROM User u");
		return (List<User>)query.getResultList();
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		
	}
	
	@GET
	@Produces({ "application/json" })
	@Path("/deleteUser/{user_id}")
	@Override
	public void deleteUser(@PathParam("user_id") final int user_id) {
		this.em.remove(user_id);
	}

}
