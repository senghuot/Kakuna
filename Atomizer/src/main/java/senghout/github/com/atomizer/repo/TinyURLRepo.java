package senghout.github.com.atomizer.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import senghout.github.com.atomizer.model.TinyURL;

public interface TinyURLRepo extends MongoRepository<TinyURL, String> {
}