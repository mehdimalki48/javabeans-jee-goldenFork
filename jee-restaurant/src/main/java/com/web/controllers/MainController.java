package com.web.controllers;

import java.io.File;
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
import javax.servlet.http.Part;

import com.web.models.Model;

import metier.session.SessionBeanImpl;
import metier.session.SessionLocal;


@WebServlet(name="MainController", urlPatterns = { "/main", "/main.php" })
@MultipartConfig(fileSizeThreshold = 1048576, maxFileSize = 5242880L, maxRequestSize = 26214400L)
public class MainController extends HttpServlet {
	@EJB
	private SessionLocal metier;
	
	private Model model;
	public static final String IMAGES_FOLDER = "assets";
	public String uploadPath;
	
	private static final long serialVersionUID = 1L;
    
	
	public void init() throws ServletException {
		this.model = new Model();
        this.uploadPath = this.getServletContext().getRealPath("assets");
        final File uploadDir = new File(this.uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/MenuType.jsp").forward((ServletRequest)request, (ServletResponse)response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}


	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private String getFileName(final Part part) {
        String[] split;
        for (int length = (split = part.getHeader("content-disposition").split(";")).length, i = 0; i < length; ++i) {
            final String content = split[i];
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf("=") + 2, content.length() - 1);
            }
        }
        return null;
    }

}
