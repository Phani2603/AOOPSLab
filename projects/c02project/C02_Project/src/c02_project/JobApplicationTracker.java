package c02_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JobApplicationTracker {
    private List<JobApplication> jobApplications;

    public JobApplicationTracker() {
        this.jobApplications = new ArrayList<>();
    }

    public void addJobApplication(JobApplication jobApplication) {
        jobApplications.add(jobApplication);
    }

    public void sortJobApplications() {
        Collections.sort(jobApplications);
    }

    public void printJobApplications() {
        Iterator<JobApplication> iterator = jobApplications.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        JobApplicationTracker tracker = new JobApplicationTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter applicant name:");
            String applicantName = scanner.nextLine();
            System.out.println("Enter job title:");
            String jobTitle = scanner.nextLine();
            System.out.println("Enter application status:");
            String applicationStatus = scanner.nextLine();

            JobApplication jobApplication = new JobApplication(applicantName, jobTitle, applicationStatus);
            tracker.addJobApplication(jobApplication);

            System.out.println("Do you want to add another job application? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
            scanner.close();
        }

        tracker.sortJobApplications();
        tracker.printJobApplications();
    }
}