package orm.com.orm.Facade;

import orm.com.orm.model.Items;
import orm.com.orm.reps.ItemsRepository;
import orm.com.orm.service.ItemService;

public class ItemFacade {

    private final ItemsRepository repository;

    public ItemFacade(ItemsRepository repository) {
        this.repository = repository;
    }

    public static Items ItemOk(Items items) {
        ItemService.ItemNameLength(items);
        ItemService.ItemDescLength(items);
        return items;
    }
}
