package passstorage.atom.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import passstorage.atom.Entity.Password;

public interface PasswordRepo extends JpaRepository<Password, UUID>{
}
