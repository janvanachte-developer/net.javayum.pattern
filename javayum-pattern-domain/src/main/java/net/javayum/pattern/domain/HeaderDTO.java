package net.javayum.pattern.domain;

import java.util.ArrayList;
import java.util.List;

public class HeaderDTO implements Header {

	private String id;

	private String name;

	private List<Line> lines = new ArrayList<Line>();;
	
	public HeaderDTO() {
		
	}

	public HeaderDTO(String id, String name) {
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

	public List<Line> getLines() {
		return new ArrayList<Line>(lines);
	}

	public void addLines(List<Line> lines) {
		lines.addAll(lines);

	}

	public void addLine(Line line) {
		lines.add(line);
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lines == null) ? 0 : lines.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!(object instanceof Header)) {
			return false;
		}
		Header other = (Header) object;
		if (id == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!id.equals(other.getId())) {
			return false;
		}
		if (name == null) {
			if (other.getName() != null) {
				return false;
			}
		} else if (!name.equals(other.getName())) {
			return false;
		}
		if (lines == null) {
			if (other.getLines() != null) {
				return false;
			}
		} //else if (!lines.equals(other.lines)) {
//			return false;
//		}
		return true;
	}

}
