import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ContactFormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String health-condition = request.getParameter("health-condition");

        // Process the form (for example, send an email, save to a database, etc.)
        if (sendMessage(name, age, health-condition)) {
            // If the message is successfully sent or processed, do something
            response.getWriter().println("Thank you for contacting us, " + name + "!");
            // Redirect the user or reload the page (for example, to a confirmation page)
            response.sendRedirect("thank-you.html"); // Redirect to a thank you page
        } else {
            // If there was an error
            response.getWriter().println("Sorry, something went wrong. Please try again.");
        }
    }

    // Dummy function to simulate sending a message (e.g., email or storing in DB)
    private boolean sendMessage(String name, String age, String health-condition) {
        // Here you could add logic to send an email or store the message in a database.
        // For now, we will just print the message to the console.
        System.out.println("Message from " + name + " (" + age + "): " + health-condition);
        return true; // Assuming the message was sent successfully
    }
}