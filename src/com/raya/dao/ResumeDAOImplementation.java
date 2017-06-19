package com.raya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.raya.model.Resume;
import com.raya.util.DBUtil;

public class ResumeDAOImplementation implements ResumeDAO {

    private Connection conn;

    public ResumeDAOImplementation() {
        conn = DBUtil.getConnection();
    }

    @Override
    public void addResume(Resume resume) {

        try {
            String query = "insert into Resume (FirstName, LastName, EmailAddress, SchoolName, LevelOfEducation, WorkExperiance, LevelOfExperty, SkillSetName, LevelOfSkillSet) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, resume.getFirstName());
            preparedStatement.setString(2, resume.getLastName());
            preparedStatement.setString(3, resume.getEmailAddress());
            preparedStatement.setString(4, resume.getSchoolName());
            preparedStatement.setString(5, resume.getLevelOfEducation());
            preparedStatement.setString(6, resume.getWorkExperiance());
            preparedStatement.setString(7, resume.getLevelOfExperty());
            preparedStatement.setString(8, resume.getSkillSetName());
            preparedStatement.setString(9, resume.getLevelOfSkillSet());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteResume(int resumeID) {

        try {
            String query = "delete from Resume where ResumeID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, resumeID);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateResume(Resume resume) {

        try {
            String query = "update Resume set FirstName=?, LastName=?, EmailAddress=?, SchoolName=?, LevelOfEducation =?, WorkExperiance=?, LevelOfExperty=?, SkillSetName=?, LevelOfSkillSet=? where ResumeID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, resume.getFirstName());
            preparedStatement.setString(2, resume.getLastName());
            preparedStatement.setString(3, resume.getEmailAddress());
            preparedStatement.setString(4, resume.getSchoolName());
            preparedStatement.setString(5, resume.getLevelOfEducation());
            preparedStatement.setString(6, resume.getWorkExperiance());
            preparedStatement.setString(7, resume.getLevelOfExperty());
            preparedStatement.setString(8, resume.getSkillSetName());
            preparedStatement.setString(9, resume.getLevelOfSkillSet());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Resume> getAllResumes() {
        List<Resume> resumes = new ArrayList<Resume>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Resume");
            while (resultSet.next()) {
                Resume resume = new Resume();
                resume.setResumeID(resultSet.getInt("ResumeID"));
                resume.setFirstName(resultSet.getString("FirstName"));
                resume.setLastName(resultSet.getString("LastName"));
                resume.setEmailAddress(resultSet.getString("EmailAddress"));
                resume.setSchoolName(resultSet.getString("SchoolName"));
                resume.setLevelOfEducation(resultSet.getString("LevelOfEducation"));
                resume.setWorkExperiance(resultSet.getString("WorkExperiance"));
                resume.setLevelOfExperty(resultSet.getString("LevelOfExperty"));
                resume.setSkillSetName(resultSet.getString("SkillSetName"));
                resume.setLevelOfSkillSet(resultSet.getString("LevelOfSkillSet"));
                resumes.add(resume);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resumes;
    }

    @Override
    public Resume getResumeById(int resumeID) {
        Resume resume = new Resume();
        try {
            String query = "select * from Resume where ResumeID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, resumeID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resume.setResumeID(resultSet.getInt("ResumeID"));
                resume.setFirstName(resultSet.getString("FirstName"));
                resume.setLastName(resultSet.getString("LastName"));
                resume.setEmailAddress(resultSet.getString("EmailAddress"));
                resume.setSchoolName(resultSet.getString("SchoolName"));
                resume.setLevelOfEducation(resultSet.getString("LevelOfEducation"));
                resume.setWorkExperiance(resultSet.getString("WorkExperiance"));
                resume.setLevelOfExperty(resultSet.getString("LevelOfExperty"));
                resume.setSkillSetName(resultSet.getString("SkillSetName"));
                resume.setLevelOfSkillSet(resultSet.getString("LevelOfSkillSet"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resume;
    }
}
