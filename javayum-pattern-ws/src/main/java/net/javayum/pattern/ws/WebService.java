package net.javayum.pattern.ws;

public interface WebService<REQUEST, RESPONSE> {

    RESPONSE execute(REQUEST request);
}
