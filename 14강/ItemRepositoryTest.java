package com.example.study.repository;


import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import org.junit.jupiter.api.Assertions;
import java.util.Optional;

public class ItemRepositoryTest extends StudyApplicationTests {

    @Autowired
    private ItemRepository itemRepository;


    @Test
    public void create(){
        Item item = new Item();

        item.setName("노트북");
        item.setPrice(100000);
        item.setContent("삼성 노트북");
        item.setTitle("title");
        item.setPartnerId(1L);

        Item newItem = itemRepository.save(item);
        Assertions.assertNotNull(newItem);

    }

    @Test
    public void read(){
        Long id = 1L;

        Optional<Item> item = itemRepository.findById(id);

        Assertions.assertTrue(item.isPresent());
        item.ifPresent(i ->{
            System.out.println(i);
        });
    }
}
