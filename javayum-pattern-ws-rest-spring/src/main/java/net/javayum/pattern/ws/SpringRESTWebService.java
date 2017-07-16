package net.javayum.pattern.ws;

import net.javayum.pattern.domain.Header;
import net.javayum.pattern.domain.HeaderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

@RestController
public class SpringRESTWebService implements WebService<String, Header> {

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Header read(@PathVariable String id) {

        Header header;

        header = new HeaderDTO();
        ((HeaderDTO)header).setId(id);
        ((HeaderDTO)header).setName("name");

        return header;
    }
}
