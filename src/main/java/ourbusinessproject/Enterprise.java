package ourbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Enterprise {
    @NotBlank
    private String Name;
    @Size(min=10)
    private String Description;
    @NotBlank
    private String ContactName;
    @NotBlank @Email
    private String ContactEmail;


    /**
     * set the Name
     * @param name
     */

    public void setName(String name) {
        Name = name;
    }

    /**
     * set the Description
     * @param description
     */

    public void setDescription(String description) {
        Description = description;
    }

    /**
     * Set ContactName
     * @param contactName
     */
    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    /**
     * Set ContactEmail
     * @param contactEmail
     */

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }
}
