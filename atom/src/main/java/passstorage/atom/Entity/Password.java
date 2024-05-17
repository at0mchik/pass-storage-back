package passstorage.atom.Entity;

import java.util.UUID;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Component
@NoArgsConstructor
@Table(name = "passwords")
public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    String name;
    String imageURL;
    String pass;
}
