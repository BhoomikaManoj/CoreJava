package com.uttara.TaskManager;

import java.util.Date;
import java.util.Objects;

public class TaskBean implements Comparable<TaskBean>{

	private String taskName;
	private String desc;
	private String tags;
	private Date startDate;
	private int priority;
	private Date endDate;
	
	
	
	public TaskBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaskBean(String taskName, String desc, String tags, Date startDate, int priority,  Date endDate) {
		super();
		this.taskName = taskName;
		this.desc = desc;
		this.tags = tags;
		this.startDate = startDate;
		this.priority = priority;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "TaskBean [taskName=" + taskName + ", desc=" + desc + ", tags=" + tags + ", startDate=" + startDate
				+ ", priority=" + priority + ", endDate=" + endDate + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(desc, endDate, priority, startDate, tags, taskName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskBean other = (TaskBean) obj;
		return Objects.equals(desc, other.desc) && Objects.equals(endDate, other.endDate) && priority == other.priority
				&& Objects.equals(startDate, other.startDate) && Objects.equals(tags, other.tags)
				&& Objects.equals(taskName, other.taskName);
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Override
	public int compareTo(TaskBean o) {
		return this.getTaskName().compareTo(o.getTaskName());
	}
	
	
}
