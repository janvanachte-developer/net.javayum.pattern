package net.javayum.pattern.domain;

import javax.xml.bind.annotation.XmlElement;

import net.javayum.pattern.domain.Line;

public class JAXBLine implements Line {

	//	@XmlElement not needed because public getters are automatically take into account
	private String id;
	private String name;

	public JAXBLine(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public JAXBLine() {
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
	@XmlElement(namespace="http://javayum.net/line") // Overrides default ns in package-info.java
	public String getName() {

		return name;
	}

}
