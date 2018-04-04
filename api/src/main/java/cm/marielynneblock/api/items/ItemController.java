package cm.marielynneblock.api.items;

import cm.marielynneblock.domain.items.Item;
import cm.marielynneblock.service.items.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = {"/item"})
public class ItemController {
    private ItemService itemService;
    private ItemMapper itemMapper;

    @Inject
    public ItemController(ItemService itemService, ItemMapper itemMapper) {
        this.itemService = itemService;
        this.itemMapper = itemMapper;
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDto addNewCustomer(@RequestBody ItemDto itemDto) {
        return itemMapper.toDto(
                itemService.addNewItem(
                        itemMapper.toDomain(itemDto)));
    }

    @PutMapping(path = "/itemId", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ItemDto updateItem(@PathVariable int itemId, @RequestBody ItemDto updatedItemDto) {
        return itemMapper.toDto(
                itemService.updateItem(
                        itemMapper.toDomain(updatedItemDto.withId(itemId))));
    }

}
