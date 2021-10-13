package ti.techacademy.review.comments.web;
 
 
import reactor.core.publisher.Mono;
import ti.techacademy.review.comments.domain.Comments; 
import ti.techacademy.review.comments.services.CommentsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class CommentsController {
    
    private CommentsService service;

    /*@GetMapping
    public Flux<Comments> getAll(){
        return repository.findAll();
    }*/

    @GetMapping( path = "comments/{id}")
    public Mono<Comments> getAll(@PathVariable("id") String id){
        return service.get(id);
    }

}
