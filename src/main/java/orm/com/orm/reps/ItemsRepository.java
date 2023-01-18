package orm.com.orm.reps;

import org.springframework.data.jpa.repository.JpaRepository;
import orm.com.orm.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
