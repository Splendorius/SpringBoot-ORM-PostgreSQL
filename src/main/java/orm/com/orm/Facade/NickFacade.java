package orm.com.orm.Facade;

import orm.com.orm.model.Users;
import orm.com.orm.reps.UsersRepository;
import orm.com.orm.service.NickService;

public class  NickFacade {

    private final UsersRepository repository;

    public NickFacade(UsersRepository repository) {
        this.repository = repository;
    }
    public static Users NickOk(Users users) {
        NickService.NickLength(users);
        NickService.EmailOk(users);
        NickService.NickOkRole(users);
        return users;
}

}
