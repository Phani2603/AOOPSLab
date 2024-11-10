package com.w_12;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkEligibility")
public class CheckEligibilityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Voter Eligibility Result</h2>");
        if (age >= 18) {
            out.println("<p>" + name + ", you are eligible to vote.</p>");
        } else {
            out.println("<p>" + name + ", you are not eligible to vote.</p>");
        }
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}