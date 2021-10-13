package ti.techacademy.review.comments.services;
 
import reactor.core.publisher.Mono;
import ti.techacademy.review.comments.domain.Comments; 
 
public interface CommentsService { 

    public Mono<Comments> get(String id);
}
