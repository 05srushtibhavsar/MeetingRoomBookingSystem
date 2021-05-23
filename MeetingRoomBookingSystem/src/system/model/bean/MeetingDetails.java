package system.model.bean;

public class MeetingDetails {
	
	private int meetingId;
	private int empId;
	private int meetingRoomId;
	private String meetingDate;
	private String meetingInTime;
	private String meetingOutTime;
	private int meetingAttendies;
	private int adminWhoApproved;
	private String meetingRoomType;
	
	
	
	
	public MeetingDetails(int meetingId, int empId, int meetingRoomId, String meetingDate, String meetingInTime,
			String meetingOutTime, int meetingAttendies, int adminWhoApproved, String meetingRoomType) {
		super();
		this.meetingId = meetingId;
		this.empId = empId;
		this.meetingRoomId = meetingRoomId;
		this.meetingDate = meetingDate;
		this.meetingInTime = meetingInTime;
		this.meetingOutTime = meetingOutTime;
		this.meetingAttendies = meetingAttendies;
		this.adminWhoApproved = adminWhoApproved;
		this.meetingRoomType = meetingRoomType;
	}

	public String getMeetingRoomType() {
		return meetingRoomType;
	}

	public void setMeetingRoomType(String meetingRoomType) {
		this.meetingRoomType = meetingRoomType;
	}

	public int getMeetingId() {
		return meetingId;
	}


	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public int getMeetingRoomId() {
		return meetingRoomId;
	}


	public void setMeetingRoomId(int meetingRoomId) {
		this.meetingRoomId = meetingRoomId;
	}


	public String getMeetingDate() {
		return meetingDate;
	}


	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}


	public String getMeetingInTime() {
		return meetingInTime;
	}


	public void setMeetingInTime(String meetingInTime) {
		this.meetingInTime = meetingInTime;
	}


	public String getMeetingOutTime() {
		return meetingOutTime;
	}


	public void setMeetingOutTime(String meetingOutTime) {
		this.meetingOutTime = meetingOutTime;
	}


	public int getMeetingAttendies() {
		return meetingAttendies;
	}


	public void setMeetingAttendies(int meetingAttendies) {
		this.meetingAttendies = meetingAttendies;
	}


	public int getAdminWhoApproved() {
		return adminWhoApproved;
	}


	public void setAdminWhoApproved(int adminWhoApproved) {
		this.adminWhoApproved = adminWhoApproved;
	}
	
	
	
	
	
	


}
