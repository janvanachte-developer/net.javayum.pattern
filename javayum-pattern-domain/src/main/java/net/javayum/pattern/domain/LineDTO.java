package net.javayum.pattern.domain;

public class LineDTO implements Line {
	
	private String id;
	
	private String name;

	public LineDTO() {
	}
	
	public LineDTO(String id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
