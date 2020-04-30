package senghuot.github.com.kakuna.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import senghuot.github.com.kakuna.model.TinyURL;

public interface TinyUrlRepo extends JpaRepository<TinyURL, String> {
}
