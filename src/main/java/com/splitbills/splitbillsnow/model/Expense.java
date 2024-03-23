package com.splitbills.splitbillsnow.model;

import java.util.Map;
import jakarta.persistence.*;


@Entity
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int expenseId;
	private int groupId;
	private boolean isSettled;
	
	@ElementCollection
    @CollectionTable(name = "expense_balance_mapping", joinColumns = @JoinColumn(name = "expense_id"))
    @MapKeyJoinColumn(name = "user_id")
	private Map<User,Balance> balancesMap;
	
	private String title;
    private String imageURI;
	
    public Expense(int expenseId, int groupId, boolean isSettled, Map<User, Balance> balancesMap, String title,
			String imageURI) {
		super();
		this.expenseId = expenseId;
		this.groupId = groupId;
		this.isSettled = isSettled;
		this.balancesMap = balancesMap;
		this.title = title;
		this.imageURI = imageURI;
	}
	
	public int getExpenseId() {
		return expenseId;
	}
	
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	
	public int getGroupId() {
		return groupId;
	}
	
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	public boolean isSettled() {
		return isSettled;
	}
	
	public void setSettled(boolean isSettled) {
		this.isSettled = isSettled;
	}
	
	public Map<User, Balance> getBalancesMap() {
		return balancesMap;
	}
	
	public void setBalancesMap(Map<User, Balance> balancesMap) {
		this.balancesMap = balancesMap;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getImageURI() {
		return imageURI;
	}
	
	public void setImageURI(String imageURI) {
		this.imageURI = imageURI;
	}
	
	@Override
	public String toString() {
		return "Expenses [expenseId=" + expenseId + ", groupId=" + groupId + ", isSettled=" + isSettled
				+ ", balancesMap=" + balancesMap + ", title=" + title + ", imageURI=" + imageURI + "]";
	}
	
    
    
}
