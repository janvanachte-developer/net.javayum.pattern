package net.javayum.pattern.ws;

public interface WebService<ID, RESPONSE> {

    RESPONSE read(ID id);
}
