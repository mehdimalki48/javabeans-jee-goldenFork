package metier.interfaces;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Payment;

@Local
public interface PaymentLocal {
	public Payment addPayment(Payment p);
	public Payment getPayment(int id);
	public List<Payment> getPayments();
	public void updatePayment(Payment p);
	public void deletePayment(int id);
}
