package com.psl.bean;

import java.util.Date;



public class MeetingRequest {

	int meetingId;
	String senderUsername;
	String recieverUsername;
	Date dateTime;
	RequestStatus reqStatus;
	CheckedStatus chkStatus;
	Date reqSendDate;
	
	public MeetingRequest() {
		// TODO Auto-generated constructor stub
	}

	public MeetingRequest(int meetingId, String senderUsername,
			String recieverUsername, Date dateTime, RequestStatus reqStatus,
			CheckedStatus chkStatus, Date reqSendDate) {
		super();
		this.meetingId = meetingId;
		this.senderUsername = senderUsername;
		this.recieverUsername = recieverUsername;
		this.dateTime = dateTime;
		this.reqStatus = reqStatus;
		this.chkStatus = chkStatus;
		this.reqSendDate = reqSendDate;
	}

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getSenderUsername() {
		return senderUsername;
	}

	public void setSenderUsername(String senderUsername) {
		this.senderUsername = senderUsername;
	}

	public String getRecieverUsername() {
		return recieverUsername;
	}

	public void setRecieverUsername(String recieverUsername) {
		this.recieverUsername = recieverUsername;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public RequestStatus getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(RequestStatus reqStatus) {
		this.reqStatus = reqStatus;
	}

	public CheckedStatus getChkStatus() {
		return chkStatus;
	}

	public void setChkStatus(CheckedStatus chkStatus) {
		this.chkStatus = chkStatus;
	}

	public Date getReqSendDate() {
		return reqSendDate;
	}

	public void setReqSendDate(Date reqSendDate) {
		this.reqSendDate = reqSendDate;
	}
	
	
}
