package ti.techacademy.review.comments.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Comments {

    @Id
    private String id;
    
    private String message;
}
