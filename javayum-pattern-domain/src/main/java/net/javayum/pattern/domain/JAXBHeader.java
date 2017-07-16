package net.javayum.pattern.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import net.javayum.pattern.domain.Entity;
import net.javayum.pattern.domain.Header;
import net.javayum.pattern.domain.Line;

@XmlRootElement(name="Header") // , namespace="http://javayum.net/Header") not needed becaus ns defined in package-info.java
public class JAXBHeader implements Header {

	//	@XmlElement not needed because public getters are automatically take into account
	private String id;
	private String name;
	
	@XmlElementWrapper(name="Lines")
	@XmlElement(name="Line", type=JAXBLine.class)
	private List<Line> lines = new ArrayList();

	public JAXBHeader(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public JAXBHeader() {
		super();
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	//	@XmlElement not needed because public getters are automatically take into account
	public String getId() {

		return id;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public List<Line> getLines() {

		return new ArrayList<Line>(lines);
	}

	@Override
	public void addLines(List<Line> lines) {

		this.lines.addAll(lines);
	}

	@Override
	public void addLine(Line line) {

		lines.add(line);
	}

}
