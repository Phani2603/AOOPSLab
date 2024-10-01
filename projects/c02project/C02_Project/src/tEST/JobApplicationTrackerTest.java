package tEST;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import c02_project.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobApplicationTrackerTest {
    @Test
    public void testAddJobApplication() {
        JobApplicationTracker tracker = new JobApplicationTracker();
        JobApplication jobApplication = new JobApplication("John Doe", "Software Engineer", "Pending");
        tracker.addJobApplication(jobApplication);
        assertEquals(1, tracker.jobApplication.size());
    }

    @Test
    public void testSortJobApplications() {
        JobApplicationTracker tracker = new JobApplicationTracker();
        JobApplication jobApplication1 = new JobApplication("John Doe", "Software Engineer", "Pending");
        JobApplication jobApplication2 = new JobApplication("Jane Doe", "Software Engineer", "Approved");
        tracker.addJobApplication(jobApplication1);
        tracker.addJobApplication(jobApplication2);
        tracker.sortJobApplications();
        assertEquals("Jane Doe", tracker.jobApplication.get(0).getApplicantName());
    }
}