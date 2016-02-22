package models;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

@Named
@Singleton
public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAll();
    List<Post> findAllByAtClimateService(String name);
}
