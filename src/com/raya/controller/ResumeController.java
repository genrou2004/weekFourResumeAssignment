package com.raya.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raya.dao.ResumeDAO;
import com.raya.dao.ResumeDAOImplementation;
import com.raya.model.Resume;

/**
 * Servlet implementation class ResumeController
 */
@WebServlet("/ResumeController")
public class ResumeController extends HttpServlet {

    private ResumeDAO dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_RESUME = "/listResume.jsp";
    public static final String INSERT_OR_EDIT = "/resume.jsp";

    public ResumeController() {
        dao = new ResumeDAOImplementation();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete&resumeID")) {
            forward = lIST_RESUME;
            int resumeID = Integer.parseInt(request.getParameter("resumeID"));
            dao.deleteResume(resumeID);
            request.setAttribute("resumes", dao.getAllResumes());
        } else if (action.equalsIgnoreCase("edit&resumeID")) {
            forward = INSERT_OR_EDIT;
            int resumeID = Integer.parseInt(request.getParameter("resumeID"));
            Resume resume = dao.getResumeById(resumeID);
            request.setAttribute("Resume", resume);
        } else if (action.equalsIgnoreCase("insert")) {
            forward = INSERT_OR_EDIT;
        } else {
            forward = lIST_RESUME;
            request.setAttribute("resumes", dao.getAllResumes());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Resume resume = new Resume();
        resume.setFirstName(request.getParameter("firstName"));
        resume.setLastName(request.getParameter("lastName"));
        resume.setEmailAddress(request.getParameter("email"));
        resume.setSchoolName(request.getParameter("schoolName"));
        resume.setLevelOfEducation(request.getParameter("levelOfEducation"));
        resume.setWorkExperiance(request.getParameter("workExperience"));
        resume.setLevelOfExperty(request.getParameter("levelOfExperty"));
        resume.setSkillSetName(request.getParameter("skillSetName"));
        resume.setLevelOfSkillSet(request.getParameter("levelOfSkillSet"));
        String resumeID = request.getParameter("resumeID");

        if (resumeID == null || resumeID.isEmpty())
            dao.addResume(resume);
        else {
            resume.setResumeID(Integer.parseInt(resumeID));
            dao.updateResume(resume);
        }
        RequestDispatcher view = request.getRequestDispatcher(lIST_RESUME);
        request.setAttribute("resumes", dao.getAllResumes());
        view.forward(request, response);
    }
}
