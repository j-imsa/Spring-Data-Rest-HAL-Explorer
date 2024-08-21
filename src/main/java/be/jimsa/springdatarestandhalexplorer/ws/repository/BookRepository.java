package be.jimsa.springdatarestandhalexplorer.ws.repository;

import be.jimsa.springdatarestandhalexplorer.ws.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RepositoryRestResource(path = "books")
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO books (name, page) VALUES (:name, :page)",
            nativeQuery = true
    )
    int addNewBook(String name, int page);
    // Modifying queries can only use void or int/Integer as return type;
}
