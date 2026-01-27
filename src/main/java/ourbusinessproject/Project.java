package ourbusinessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(min=1)
    private String title;
    private String description;

    /**
     * set Desciption
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * set Title
     * @param title title
     */

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return this.id;
    }
}
