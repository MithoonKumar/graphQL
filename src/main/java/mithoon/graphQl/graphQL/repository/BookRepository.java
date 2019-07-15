package mithoon.graphQl.graphQL.repository;

import mithoon.graphQl.graphQL.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
