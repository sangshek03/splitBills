package com.splitbills.splitbillsnow.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {
    
    @Id
    private String userId;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    private String imageUrl;
    
    @ManyToMany(mappedBy = "users")
    private List<Group> groups;
    
    public User() {
        this.userId = UUID.randomUUID().toString();
    }
    
    public User(String name, String imageUrl) {
        this();
        this.name = name;
        this.imageUrl = imageUrl;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + ", imageUrl=" + imageUrl + "]";
    }
}
