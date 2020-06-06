package guru.springframework.spring5webfluxrest.repositories;

import guru.springframework.spring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.06.2020
 * created CategoryRepository in guru.springframework.spring5webfluxrest.repositories
 * in project spring5-webflux-rest
 */
public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{
}
