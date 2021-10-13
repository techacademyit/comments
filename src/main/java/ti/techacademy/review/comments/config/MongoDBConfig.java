package ti.techacademy.review.comments.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = {"ti.techacademy.review.comments.domain"})
public class MongoDBConfig extends AbstractReactiveMongoConfiguration{
    
    protected String getDatabaseName(){
        return "techacademy";
    }

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create("mongodb+srv://mongou:a1234567890@cluster0.cgkyr.mongodb.net/techacademy");
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
    }
    

}
