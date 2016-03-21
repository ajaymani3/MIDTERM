package com.cisc181.core;
import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SectonID;
	private int RoomID;
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public UUID getSectonID() {
		return SectonID;
	}
	public void setSectonID(UUID sectonID) {
		SectonID = sectonID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	
}
