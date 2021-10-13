package ti.techacademy.review.comments.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;
import ti.techacademy.review.comments.domain.Comments;
import ti.techacademy.review.comments.domain.CommentsRepository;

@AllArgsConstructor
@Service
public class CommentsServiceImpl implements CommentsService {
    
    private CommentsRepository repository;


    public Mono<Comments> get(String id){
        return repository.findById(id);
    } 
}
