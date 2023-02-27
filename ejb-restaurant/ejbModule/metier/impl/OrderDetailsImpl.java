package metier.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import metier.entities.OrderDetails;
import metier.interfaces.OrderDetailsLocal;

@Stateless(name="OrderDetailsInstance")
public class OrderDetailsImpl implements OrderDetailsLocal {

	
	// NB: Since there is only one DB (persistence-unit)
		// you don't even need to specify the name.
		@PersistenceContext(unitName = "ejb-restaurant")
		EntityManager em;
		
	@Override
	public OrderDetails addOrderDetails(OrderDetails od) {
		// TODO Auto-generated method stub
		em.persist(od);
		return od;
	}

	@Override
	public OrderDetails getOrderDetails(int id) {
		// TODO Auto-generated method stub
		OrderDetails od = em.find(OrderDetails.class, id);
		if(od == null)
			throw new RuntimeException("OrderDetails Not Found...");
		return od;
	}

	@Override
	public List<OrderDetails> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOrderDetails(OrderDetails od) {
		// TODO Auto-generated method stub
		OrderDetails orderDetails = getOrderDetails(od.getOrder_details_id());
		// Updating...
	}

	@Override
	public void deleteOrderDetails(int id) {
		// TODO Auto-generated method stub
		OrderDetails od = getOrderDetails(id);
		em.remove(od);
	}

}
