package net.javayum.pattern.domain;

import java.util.List;

public interface Header extends Entity {
	
	List<Line> getLines();
	
	void addLines(List<Line> lines);
	
	void addLine(Line line);
}
