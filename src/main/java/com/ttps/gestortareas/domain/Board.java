package com.ttps.gestortareas.domain;

import java.sql.Date;
import java.util.List;

public class Board {
	
	private Long id;
	private String name;
	private Date startDate;
	private Date finishDate;
	private List<User> userMembers;
	private List<Team> teamMembers;
	private List<TaskList> tasklists;
	private User owner;
	
	public Board(String name, Date startDate, Date finishDate, List<User> userMembers, List<Team> teamMembers,
			User owner) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.userMembers = userMembers;
		this.teamMembers = teamMembers;
		this.owner = owner;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public List<User> getUserMembers() {
		return userMembers;
	}
	public void setUserMembers(List<User> members) {
		this.userMembers = members;
	}
	public List<Team> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<Team> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public List<TaskList> getTasklists() {
		return tasklists;
	}
	public void setTasklists(List<TaskList> tasklists) {
		this.tasklists = tasklists;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
}
