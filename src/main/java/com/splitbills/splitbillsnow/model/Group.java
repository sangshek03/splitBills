package com.splitbills.splitbillsnow.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Group {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int groupId;
	
	@ManyToMany
    @JoinTable(
        name = "group_user",
        joinColumns = @JoinColumn(name = "group_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users;
	
	private String title;
	private String description;
	
	public Group(int groupId, List<User> users, String title, String description) {
		super();
		this.groupId = groupId;
		this.users = users;
		this.title = title;
		this.description = description;
	}
	
	public int getGroupId() {
		return groupId;
	}
	
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", users=" + users + ", title=" + title + ", description=" + description
				+ "]";
	}
	
}
