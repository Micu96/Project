package com.example.Project.project.Rest;

import com.example.Project.project.DTO.AddBook;
import com.example.Project.project.Library;
import com.example.Project.project.Service.LibraryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/Library")
public class LibraryRest {

    @Autowired
    private LibraryService libraryService;
    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<AddBook> findAll() {
        return libraryService.findAll();

    }
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public @ResponseBody AddBook create(@RequestBody AddBook addBook){
        return libraryService.create(addBook);
    }
    @RequestMapping(path ="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(Library library){
        libraryService.delete(library);
    }



}
