/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import entities.StuRecord;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessionBeans.NwcourseFacade;
import sessionBeans.StuRecordFacade;

/**
 *
 * @author S519458
 */
@WebServlet(name = "testing2", urlPatterns = {"/testing2"})
public class testing2 extends HttpServlet {

     @EJB
     private NwcourseFacade nw;
    @EJB
    private StuRecordFacade st;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         List<StuRecord> s= st.findAll();
         List<StudentHistroyHelper> sh=new ArrayList<>();
         for(StuRecord ex:s)
            {
           sh.add(new StudentHistroyHelper(ex.getStuRecordPK().getStudentKey(),ex.getStuRecordPK().getCourseNum()));
            }
         
         //Convert Java to JSON
         Gson gson = new Gson();
         JsonElement element = gson.toJsonTree(sh, new TypeToken<List<StudentHistroyHelper>>() {}.getType());
         JsonArray jsonArray = element.getAsJsonArray();
         String listData=jsonArray.toString();
         
         //Return Json in the format required by jTable plugin
          listData="{\"Result\":\"OK\",\"Records\":"+listData+"}"; 
          response.setContentType("application/json");
          response.getWriter().print(listData);
          System.out.println(listData);
          
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
