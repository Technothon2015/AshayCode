package com.psl.bean;

import java.util.Date;

public class Reminder {

	int eventId;
	String username;
	EventType eventType;
	String eventDescription;
	Date eventDateTime;
	EventStatus eventStatus;
	EventPriority eventPriority;
	
	public Reminder() {
	}

	

	public Reminder(int eventId, String username, EventType eventType,
			String eventDescription, Date eventDateTime,
			EventStatus eventStatus, EventPriority eventPriority) {
		super();
		this.eventId = eventId;
		this.username = username;
		this.eventType = eventType;
		this.eventDescription = eventDescription;
		this.eventDateTime = eventDateTime;
		this.eventStatus = eventStatus;
		this.eventPriority = eventPriority;
	}



	public Date getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Date getPostDate() {
		return eventDateTime;
	}

	public void setPostDate(Date postDate) {
		this.eventDateTime = postDate;
	}

	public EventStatus getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(EventStatus eventStatus) {
		this.eventStatus = eventStatus;
	}

	public EventPriority getEventPriority() {
		return eventPriority;
	}

	public void setEventPriority(EventPriority eventPriority) {
		this.eventPriority = eventPriority;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", username=" + username
				+ ", eventType=" + eventType + ", eventDescription="
				+ eventDescription + ", postDate=" + eventDateTime
				+ ", eventStatus=" + eventStatus + ", eventPriority="
				+ eventPriority + "]";
	}
	
	
	
}
