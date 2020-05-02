package senghout.github.com.atomizer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import senghout.github.com.atomizer.model.TinyURL;

public interface TinyURLRepo extends JpaRepository<TinyURL, String> {
}
