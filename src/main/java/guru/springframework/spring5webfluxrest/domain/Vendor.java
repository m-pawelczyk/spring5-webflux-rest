package guru.springframework.spring5webfluxrest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.06.2020
 * created Vendor in guru.springframework.spring5webfluxrest.domain
 * in project spring5-webflux-rest
 */
@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {

    @Id
    private String id;

    private String firstName;
    private String lastName;
}
