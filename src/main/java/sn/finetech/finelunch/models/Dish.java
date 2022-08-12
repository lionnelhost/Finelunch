package sn.finetech.finelunch.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private  String description;

    private Integer price;

    private String image;

    private LocalDate crate_at;

    private LocalDate  updated_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dish_type_id")
    private DishType dish_type;

    public DishType get_dish_type() {
        return dish_type;
    }

    public void set_dish_type(DishType dish_type) {
        this.dish_type = dish_type;
    }

    public Dish() {}


    public Dish(String name, String description, Integer price, String image, LocalDate crate_at, LocalDate updated_at) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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