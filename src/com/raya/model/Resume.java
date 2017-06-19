package com.raya.model;

public class Resume {

    private int resumeID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String schoolName;
    private String levelOfEducation;
    private String workExperiance;
    private String levelOfExperty;
    private String skillSetName;
    private String levelOfSkillSet;

    public int getResumeID() {
        return resumeID;
    }

    public void setResumeID(int resumeID) {
        this.resumeID = resumeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public String getWorkExperiance() {
        return workExperiance;
    }

    public void setWorkExperiance(String workExperiance) {
        this.workExperiance = workExperiance;
    }

    public String getLevelOfExperty() {
        return levelOfExperty;
    }

    public void setLevelOfExperty(String levelOfExperty) {
        this.levelOfExperty = levelOfExperty;
    }

    public String getSkillSetName() {
        return skillSetName;
    }

    public void setSkillSetName(String skillSetName) {
        this.skillSetName = skillSetName;
    }

    public String getLevelOfSkillSet() {
        return levelOfSkillSet;
    }

    public void setLevelOfSkillSet(String levelOfSkillSet) {
        this.levelOfSkillSet = levelOfSkillSet;
    }

    @Override
    public String toString() {
        return "Resume [resumeID=" + resumeID + ", firstName=" + firstName + ", lastName=" + lastName
                + ", emailAddress=" + emailAddress + ", schoolName=" + schoolName + ", levelOfEducation="
                + levelOfEducation + ", workExperiance=" + workExperiance + ", levelOfExperty=" + levelOfExperty
                + ", skillSetName=" + skillSetName + ", levelOfSkillSet=" + levelOfSkillSet + "]";
    }

}
