package com.web.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Dictionary;
import java.util.List;

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

import metier.entities.Menu;
import metier.session.SessionLocal;


@WebServlet(name="MainController", urlPatterns = { "/main", "/main.php", "/" })
@MultipartConfig
public class MainController extends HttpServlet {
	@EJB
	private SessionLocal metier;
	
	private Model model;
	public static final String IMAGES_FOLDER = "MenusAssets";
	private String uploadFullPath;
	public String uploadPath;
	
	private static final long serialVersionUID = 1L;
	//@Override
	public void init() throws ServletException {
		this.model = new Model();
        
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.model = new Model();
		model.setList_menus(this.metier.getMenus());
		this.uploadPath = this.getServletContext().getRealPath("MenusAssets");
		this.uploadFullPath = String.valueOf(this.uploadPath);
		
//		for (Menu menu : this.model.getList_menus()) {
//			this.imagesPath.put(menu.getMenu_id() , "MenusAssets"+ File.separator + menu.getMenu_image());
//		}
		request.setAttribute("model", (Object)this.model);
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward((ServletRequest)request, (ServletResponse)response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
