package c02_project;

public class JobApplication implements Comparable<JobApplication>, Cloneable {
    private String applicantName;
    private String jobTitle;
    private String applicationStatus;

    public JobApplication(String applicantName, String jobTitle, String applicationStatus) {
        this.applicantName = applicantName;
        this.jobTitle = jobTitle;
        this.applicationStatus = applicationStatus;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    @Override
    public int compareTo(JobApplication other) {
        return this.applicantName.compareTo(other.applicantName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "JobApplication{" +
                "applicantName='" + applicantName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", applicationStatus='" + applicationStatus + '\'' +
                '}';
    }
}