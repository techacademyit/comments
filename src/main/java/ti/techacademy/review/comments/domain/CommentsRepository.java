package ti.techacademy.review.comments.domain;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CommentsRepository extends ReactiveMongoRepository<Comments, String> {
    
}
