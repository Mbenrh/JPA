package com.mariem.jpa.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //(strategy =GenerationType.SEQUENCE,generator = "auth_seq")
    // (strategy =GenerationType.TABLE,generator = "auth_tab")
    //@SequenceGenerator(name="auth_seq",sequenceName = "auth_seq",allocationSize = 1)
    //@TableGenerator(name="auth_tab",table ="id_gen",pkColumnName = "id_name",valueColumnName = "id_value",allocationSize=1)
    private Integer id;
    @Column(length = 30)
    private String name;
    private String surname;
    @Column(unique=true)
    private int age;
    @Column(unique=true, nullable=false)
    private String email;
    @Column(updatable = false, nullable=false)
    private LocalDateTime createdAt;
    @Column(insertable = false, nullable=false)
    private LocalDateTime lastModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
