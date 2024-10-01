package c02_project;

import java.util.Comparator;

public class JobApplicationComparator implements Comparator<JobApplication> {
    @Override
    public int compare(JobApplication o1, JobApplication o2) {
        return o1.getApplicantName().compareTo(o2.getApplicantName());
    }
}