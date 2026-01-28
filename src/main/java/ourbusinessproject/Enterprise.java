package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String Name;
    @Size(min=10)
    private String Description;
    @NotBlank
    private String ContactName;
    @NotBlank @Email
    private String ContactEmail;

    @OneToMany(mappedBy = "enterprise")
    private Collection<Project> projects;


    /**
     * set the Name
     * @param name nom
     */

    public void setName(String name) {
        Name = name;
    }

    /**
     * set the Description
     * @param description description
     */

    public void setDescription(String description) {
        Description = description;
    }

    /**
     * Set ContactName
     * @param contactName contatName
     */
    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    /**
     * Set ContactEmail
     * @param contactEmail contactEmail
     */

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    /**
     *
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     *
     * @return projects
     */

    public Collection<Project> getProjects() {
        return this.projects;
    }

    public void addProject(Project project) {
        if (this.projects == null){
            this.projects = new ArrayList<>();
        }
        this.projects.add(project);
    }
}
