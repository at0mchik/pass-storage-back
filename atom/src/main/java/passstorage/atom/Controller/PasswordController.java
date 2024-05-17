package passstorage.atom.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import passstorage.atom.Entity.Password;
import passstorage.atom.Service.PasswordService;

@RestController
@RequestMapping("/pass")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PasswordController {
    private final PasswordService passwordService;

    @GetMapping("/all")
    public List<Password> getAllPass(){
        return passwordService.getAllPassword();
    }

    @GetMapping("/get/id/{id}")
    public Object getPassByID(@PathVariable UUID id){
        return passwordService.getPasswordByID(id);
    }

    @DeleteMapping("/delete/id/{id}")
    public Object deletePassByID(@PathVariable UUID id){
        return passwordService.deletePasswordByID(id);
    }

    @PostMapping("/new")
    public ResponseEntity<String> createPass(@RequestBody Password password){
        return passwordService.createPassword(password);
    }

    @PutMapping("/update/id/{id}")
    public ResponseEntity<String> updatePass(@PathVariable UUID id, @RequestBody Password password){
        return passwordService.updatePassword(id, password);
    }
}
