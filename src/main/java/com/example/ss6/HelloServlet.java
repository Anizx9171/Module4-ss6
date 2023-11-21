package com.example.ss6;

//import java.io.*;
//import javax.servlet.ServletException;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;

//@WebServlet(name = "login", value = "/login")
//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        if ("admin".equals(username) && "admin".equals(password)) {
//            writer.println("<h1>Welcome " + username + " to website</h1>");
//        } else {
//            writer.println("<h1>Login Error</h1>");
//        }
//
//        writer.println("</html>");
//    }
//}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//@WebServlet(name = "ConverterServlet", value = "/convert")
//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        float rate = Float.parseFloat(request.getParameter("rate"));
//        float usd = Float.parseFloat(request.getParameter("usd"));
//
//        float vnd = rate * usd;
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Rate: " + rate + "</h1>");
//        writer.println("<h1>USD: " + usd + "</h1>");
//        writer.println("<h1>VND: " + vnd + "</h1>");
//        writer.println("</html>");
//    }
//}

//@WebServlet(name = "ConverterServlet", value = "/calculate")
//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        float price = Float.parseFloat(request.getParameter("price"));
//        float discount = Float.parseFloat(request.getParameter("discount"));
//        String description = request.getParameter("description");
//
//        float discountAmount = (float) (price * discount * 0.01);
//        float discountPrice = (float) (price - discountAmount);
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
//        writer.println("<h1>Discount Price: " + discountPrice + "</h1>");
//        writer.println("<h1>Description: " + description + "</h1>");
//        writer.println("</html>");
//    }
//}

//@WebServlet(name = "TranslationServlet", value = "/translate")
//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("hello", "Xin chào");
//        dictionary.put("how", "Thế nào");
//        dictionary.put("book", "Quyển vở");
//        dictionary.put("computer", "Máy tính");
//
//        String search = request.getParameter("txtSearch");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        String result = dictionary.get(search);
//        if(result != null){
//            writer.println("Word: " + search);
//            writer.println("Result: " + result);
//        } else {
//            writer.println("Not found");
//        }
//
//        writer.println("</html>");
//    }
//}

@WebServlet(name = "name", value = "/value")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        Date today = new Date();

        writer.println("<h1>" + today + "</h1>");
        writer.println("</html>");
    }
}