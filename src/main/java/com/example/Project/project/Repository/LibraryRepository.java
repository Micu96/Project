package com.example.Project.project.Repository;

import com.example.Project.project.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository <Library, Long> {

    public Library findById(int id);

}
