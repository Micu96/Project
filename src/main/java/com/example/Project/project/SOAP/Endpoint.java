package com.example.Project.project.SOAP;

import com.example.Project.project.DTO.AddBook;
import com.example.Project.project.Library;
import com.example.Project.project.Repository.LibraryRepository;
import mypackage.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
import java.util.Optional;

@org.springframework.ws.server.endpoint.annotation.Endpoint
public class Endpoint {

    @Autowired
    LibraryRepository libraryRepository;

    @PayloadRoot(namespace="http://in28minutes.com/courses", localPart ="GetLibraryDetailsRequest")
    @ResponsePayload
    public GetLibraryDetailsResponse getLibraryDetailsResponse(@RequestPayload GetLibraryDetailsRequest request) {

        List<Library> books = libraryRepository.findAll();
        GetLibraryDetailsResponse response = getBooks(books);

        return response;

    }

    public GetLibraryDetailsResponse getBooks(List<Library> books){

        GetLibraryDetailsResponse response = new GetLibraryDetailsResponse();

        for(Library library : books){

            LibraryDetails details = mapbooks(library);
            response.getLibraryDetails().add(details);

        }
        return response;
    }

    private LibraryDetails mapbooks(Library library) {

            LibraryDetails details = new LibraryDetails();
            details.setName(library.getName());
            details.setAuthor(library.getAuthor());

            return details;


    }

    @PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetLibraryDetailsRequestByID")
    @ResponsePayload
    public GetLibraryDetailResponseByID getLibraryDetailResponseByID(@RequestPayload GetLibraryDetailsRequestByID requestByID){

        Library library =  libraryRepository.findById(requestByID.getId());
        GetLibraryDetailResponseByID response = new GetLibraryDetailResponseByID();

        LibraryDetailsByID details = new LibraryDetailsByID();
        details.setName(library.getName());
        details.setAuthor(library.getAuthor());
        response.setLibraryDetailsByID(details);

        return response;


    }


}
