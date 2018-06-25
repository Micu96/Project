package com.example.Project.project.Service;

import com.example.Project.project.DTO.AddBook;
import com.example.Project.project.Library;
import com.example.Project.project.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<AddBook> findAll(){
        return libraryRepository.findAll()
                .stream()
                .map(AddBook::new)
                .collect(toList());
    }

    public AddBook create(AddBook addBook){

        addBook.validate();
        return new AddBook(libraryRepository.save(new Library(addBook)));
    }

    public void delete(Library library){
        libraryRepository.delete(library);
    }


}
