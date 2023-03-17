package com.web.controllers;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.models.Model;

import metier.session.SessionLocal;


@WebServlet(name = "User", urlPatterns = { "/user", "/user.php" })
@MultipartConfig(fileSizeThreshold = 1048576, maxFileSize = 5242880L, maxRequestSize = 26214400L)
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	@EJB
    private SessionLocal metier;
	
    private Model model;


    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.model = new Model();
		
		this.model.setList_users(this.metier.getUsers());
		
		
		request.setAttribute("model", (Object)this.model);
		request.getRequestDispatcher("/WEB-INF/Users.jsp").forward((ServletRequest)request, (ServletResponse)response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
