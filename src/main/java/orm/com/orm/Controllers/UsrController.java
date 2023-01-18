package orm.com.orm.Controllers;

import org.springframework.web.bind.annotation.*;
import orm.com.orm.Facade.NickFacade;
import orm.com.orm.model.Users;
import orm.com.orm.reps.UsersRepository;

import java.util.List;

@RestController
public class UsrController {

    private final UsersRepository repository;
    UsrController(UsersRepository repository){
        this.repository=repository;
    }

    @GetMapping("/usr")
    List<Users> all(){
        return repository.findAll();
    }

    @PostMapping("/usr")
    Users newUsr(@RequestBody Users newUsr){

        NickFacade.NickOk(newUsr);
        return repository.save(newUsr);
    }

    @GetMapping("usr/{id}")
    Users one(@PathVariable int id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    @PutMapping("/usr/{id}")
    Users replaceUser (@RequestBody Users newUser, @PathVariable int id) {
        NickFacade.NickOk(newUser);
        return repository.findById(id)
                .map(users -> {
                    users.setusernick(newUser.getusernick());
                    users.setuserpassword(newUser.getuserpassword());
                    users.setRole(newUser.getRole());
                    return repository.save(newUser);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }

    @DeleteMapping("/usr/{id}")
        void deleteUsr(@PathVariable int id){
        repository.deleteById(id);
        }
    }
