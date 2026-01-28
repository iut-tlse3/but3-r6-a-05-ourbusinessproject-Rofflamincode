package ourbusinessproject;

import jakarta.persistence.*;
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
    @ManyToOne
    @NotNull
    private Enterprise enterprise;


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

    /**
     *
     * @return id
     */
    public Long getId() {

        return this.id;
    }

    /**
     *
     * @param enterprise entreprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     *
     * @return enterprise
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }
}
