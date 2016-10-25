/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/**
 *
 * @author sylvain
 */
@WebServlet("/auth/twitter/callBack")
public class TwitterCallBackOAuth extends HttpServlet {
     public TwitterCallBackOAuth() {
        super();
    }
    
     
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
         System.out.println("Start TwitterCallBackOAuth.doPost");
         
         response.getWriter().print("DO POST");
         
         System.out.println("End TwitterCallBackOAuth.doPost");
     }
     
     /**
      * Call when the user successfuly connect to twitter
      * @param request
      * @param response
      * @throws IOException 
      */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Start TwitterCallBackOAuth.doGet");
        
        response.getWriter().print("hello world");
        System.out.println("parameters");
        
        String token = request.getParameter("oauth_token");
        String verifier = request.getParameter("oauth_verifier");
        
        
        
           
        System.out.println("End TwitterCallBackOAuth.doGet");
    }
}
