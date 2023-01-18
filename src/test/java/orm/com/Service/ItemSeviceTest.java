package orm.com.Service;

import org.junit.jupiter.api.Test;
import orm.com.orm.service.ItemService;
import orm.com.orm.service.NickService;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemSeviceTest {

    @Test
    void ItemName() {
        assertThat(ItemService.validateItemLen("testgmailrthgfffffffffffffffffffffffffhfhfgh@.comfsdfsdfsssssssffffffffffffffffffffffewtrettrytrytrytry.com",Boolean.TRUE)).isFalse();
    }

    @Test
    void ItemDescription() {
    assertThat(ItemService.validateItemLen("testgmailrthgfffffffffffffffffffffffffhfhfgh@." +
            "comfsdfsdfsssssssffffffffffffffffffffffewtrettrytrytrytry.com" +
            "\"testgmailrthgfffffffffffffffffffffffffhfhfgh@.comfsdfsdfsssssssffffffffffffffffffffffewtrettrytrytrytry.com\"" +
            "\"testgmailrthgfffffffffffffffffffffffffhfhfgh@.comfsdfsdfsssssssffffffffffffffffffffffewtrettrytrytrytry.com\"" +
            "\"testgmailrthgfffffffffffffffffffffffffhfhfgh@.comfsdfsdfsssssssffffffffffffffffffffffewtrettrytrytrytry.com\"",Boolean.FALSE)).isFalse();

    }
}
