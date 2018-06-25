package com.example.Project.project;

import com.example.Project.project.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.validation.constraints.AssertFalse;
import java.util.LinkedList;
import java.util.List;

@Component
class RunAtStart {

    private final LibraryRepository libraryRepository;

    @Autowired
    public RunAtStart(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @PostConstruct
    public void run(){

    List<Library> libraries = new LinkedList<>();
        libraries.add(new Library("Oracle","Kevin Loney"));
        libraries.add(new Library("Spring w akcji","Craig Walls"));
        libraries.add(new Library("Java 9","Bert Bates"));
        libraries.add(new Library("JUnit","Radosław Sokol"));

//        Library library = new Library();
//        library.setName("Oracle");
//        library.setAuthor("Kevin Loney");
//        Library library1 = new Library();
//        library1.setName("Spring w akcji");
//        library1.setAuthor("Craig Walls");


        libraryRepository.saveAll(libraries);

    }
}
