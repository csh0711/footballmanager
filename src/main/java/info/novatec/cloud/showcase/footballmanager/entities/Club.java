package info.novatec.cloud.showcase.footballmanager.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Club {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String founded;

    private String league;

    @OneToMany(mappedBy = "club")
    private List<Player> players = new ArrayList<>();
}
