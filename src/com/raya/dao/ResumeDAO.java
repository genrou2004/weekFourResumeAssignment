package com.raya.dao;

import java.util.List;

import com.raya.model.Resume;

public interface ResumeDAO {

    public void addResume( Resume resume );
    public void deleteResume( int resumeID );
    public void updateResume( Resume resume );
    public List<Resume> getAllResumes();
    public Resume getResumeById( int ResumeID );
}
