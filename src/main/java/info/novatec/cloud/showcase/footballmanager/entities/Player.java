package info.novatec.cloud.showcase.footballmanager.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String lastname;

    private String firstname;

    private String position;

    @ManyToOne
    private Club club;
}