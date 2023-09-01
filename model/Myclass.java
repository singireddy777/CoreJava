package com.example.helloworld.model;

public class Myclass {
	

	public String workItemId;
	public String workItemUser;
	public String sequence;
	public String pullRequestURL;
	public String status;
	public String prArea;
	
	
	public Myclass(String workItemId, String workItemUser, String sequence, String pullRequestURL, String status,
			String prArea) {
		super();
		this.workItemId = workItemId;
		this.workItemUser = workItemUser;
		this.sequence = sequence;
		this.pullRequestURL = pullRequestURL;
		this.status = status;
		this.prArea = prArea;
	}
	public String getWorkItemId() {
		return workItemId;
	}
	public void setWorkItemId(String workItemId) {
		this.workItemId = workItemId;
	}
	public String getWorkItemUser() {
		return workItemUser;
	}
	public void setWorkItemUser(String workItemUser) {
		this.workItemUser = workItemUser;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getPullRequestURL() {
		return pullRequestURL;
	}
	public void setPullRequestURL(String pullRequestURL) {
		this.pullRequestURL = pullRequestURL;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrArea() {
		return prArea;
	}
	public void setPrArea(String prArea) {
		this.prArea = prArea;
	}
	@Override
	public String toString() {
		return "Myclass [workItemId=" + workItemId + ", workItemUser=" + workItemUser + ", sequence=" + sequence
				+ ", pullRequestURL=" + pullRequestURL + ", status=" + status + ", prArea=" + prArea + "]";
	}
		
}
