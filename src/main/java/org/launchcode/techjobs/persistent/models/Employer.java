package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is Required")
    @Size(min=1, max = 200, message="The location should be between 1 to 200 characters long")
    private String location;

    @OneToMany()
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<Job>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public Employer() {
    }
    public Employer(String location) {
        super();
        this.location = location;
    }
}
