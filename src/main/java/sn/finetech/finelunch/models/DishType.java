package sn.finetech.finelunch.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dish_type")
public class DishType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private LocalDate crate_at;

    private LocalDate  updated_at;


    public DishType() {}

    public DishType(String name, String description, LocalDate crate_at, LocalDate updated_at) {
        this.name = name;
        this.description = description;
        this.crate_at = crate_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCrate_at() {
        return crate_at;
    }

    public void setCrate_at(LocalDate crate_at) {
        this.crate_at = crate_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }
}