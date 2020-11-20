package com.xworkz.map;

public class Trainee {
	
	private String name;
	private int traineeId;
	private String Course;
	
	public Trainee(String name, int traineeId, String course) {
		super();
		this.name = name;
		this.traineeId = traineeId;
		Course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", traineeId=" + traineeId + ", Course=" + Course + "]";
	}

}
