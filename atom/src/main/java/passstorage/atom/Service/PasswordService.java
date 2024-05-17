package passstorage.atom.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import passstorage.atom.Entity.Password;
import passstorage.atom.Repo.PasswordRepo;

@Service
@RequiredArgsConstructor
public class PasswordService {
    @Autowired
    private PasswordRepo passwordRepo;

    public List<Password> getAllPassword(){
        return passwordRepo.findAll();
    }

    public Object getPasswordByID(UUID id){
        if(!passwordRepo.existsById(id)){
            return new ResponseEntity<>("No such password with this id", HttpStatusCode.valueOf(400));
        }
        else return passwordRepo.findById(id);
    }

    public ResponseEntity<String> createPassword(Password password){
        passwordRepo.saveAndFlush(password);
        return new ResponseEntity<>("Successfully added", HttpStatusCode.valueOf(201));
    }

    public Object deletePasswordByID(UUID id){
        if(!passwordRepo.existsById(id)){
            return new ResponseEntity<>("No such password with this id", HttpStatusCode.valueOf(400));
        }
        else {
            passwordRepo.deleteById(id);
            return new ResponseEntity<>("Successfully deleted", HttpStatusCode.valueOf(200));
        }
    }

    public ResponseEntity<String> updatePassword(UUID id, Password updatePassword){
        Password pass = passwordRepo.getReferenceById(id);

        pass.setName(updatePassword.getName());
        pass.setImageURL(updatePassword.getImageURL());
        pass.setPass(updatePassword.getPass());

        passwordRepo.saveAndFlush(pass);

        return new ResponseEntity<>("Successfully updated", HttpStatusCode.valueOf(201));
    }
}
