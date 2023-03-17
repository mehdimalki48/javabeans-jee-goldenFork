package com.web.controllers;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.models.Model;

import metier.entities.User;
import metier.session.SessionLocal;


@WebServlet(name = "Signup", urlPatterns = { "/signup", "/signup.php" })
@MultipartConfig(fileSizeThreshold = 1048576, maxFileSize = 5242880L, maxRequestSize = 26214400L)
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private SessionLocal metier;
	
	private Model model;
	
	


	public void init(ServletConfig config) throws ServletException {
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/Signin.jsp").forward((ServletRequest)request, (ServletResponse)response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String action = request.getParameter("action");
		this.model = new Model();
		
		this.model.setList_users(this.metier.getUsers());
		
		if (action.equals("sign up")) {
			final String password = request.getParameter("password");
			final String cpassword = request.getParameter("cpassword");
			if(password.equals(cpassword)) {
				final String email = request.getParameter("email");
				
				if(this.metier.getUserByEmail(email) == null) {
					final String fullname = request.getParameter("firstName") +" "+ request.getParameter("familyName");
					final String contact_number = request.getParameter("contact");
					
					final String username = request.getParameter("firstName");
					
					User user1 = new User(fullname, contact_number, email, username, password);
					
					this.metier.addUser(user1);

		            request.setAttribute("model", (Object)this.model);
		            request.getRequestDispatcher("/WEB-INF/index.jsp").forward((ServletRequest)request, (ServletResponse)response);
		            
				} {
					// user with the same email route
					System.out.println("User with this email address already exists...");
				}
			} else {
				// pass != cpass route
				System.out.println("Password is not the same as the Confim field");
			}
			
		}
	}

}
