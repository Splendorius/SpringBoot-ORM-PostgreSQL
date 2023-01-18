package orm.com.orm.Controllers;

import org.springframework.web.bind.annotation.*;
import orm.com.orm.Facade.ItemFacade;
import orm.com.orm.model.Items;
import orm.com.orm.reps.ItemsRepository;


import java.util.List;

@RestController
public class ItemController {

    private final ItemsRepository repository;

    public ItemController(ItemsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/item")
    List<Items> all(){
        return repository.findAll();
    }

    @PostMapping("/item")
    Items newitem(@RequestBody Items newitem){

        ItemFacade.ItemOk(newitem);
        return repository.save(newitem);
    }

    @GetMapping("item/{id}")
    Items one(@PathVariable int id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    @PutMapping("/item/{id}")
    Items replaceUser (@RequestBody Items newItem, @PathVariable int id) {
        return repository.findById(id)
                .map(Items -> {
                    Items.setItemname(newItem.getItemname());
                    Items.setItemname(newItem.getItemname());
                    Items.setitemdesc(newItem.getitemdesc());
                    Items.setPrice(newItem.getPrice());
                    return repository.save(newItem);
                })
                .orElseGet(() -> {
                    newItem.setItemid(id);
                    return repository.save(newItem);
                });
    }
    @DeleteMapping("/item/{id}")
    void deleteitem(@PathVariable int id){
        repository.deleteById(id);
    }
}
