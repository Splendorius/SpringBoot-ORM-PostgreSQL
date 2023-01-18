package orm.com.Service;

import org.junit.jupiter.api.Test;
import orm.com.orm.service.NickService;

import static org.assertj.core.api.Assertions.assertThat;

public class NickServiceTest {

    @Test
    void IsItEmail(){
        assertThat(NickService.validate("test@gmail.com")).isTrue();
        assertThat(NickService.validate("test6464@gmail.com")).isTrue();
        assertThat(NickService.validate("te456st@gmail.com")).isTrue();

        assertThat(NickService.validate("testgmail.com")).isFalse();
        assertThat(NickService.validate("testgmail.com@")).isFalse();
        assertThat(NickService.validate("@testgmail.com")).isFalse();
        assertThat(NickService.validate("@t@@@estgmail.com")).isFalse();
        assertThat(NickService.validate("")).isFalse();
    }

    @Test
        void Length(){
        assertThat(NickService.validateNickLen("test@gmail.com")).isTrue();
        assertThat(NickService.validateNickLen("test6464@gmail.com")).isTrue();
        assertThat(NickService.validateNickLen("te456st@gmail.com")).isTrue();

        assertThat(NickService.validateNickLen("testgmailrthgfffffffffffffffffffffffffhfhfgh@.comfsdfsdfsssssssffffffffffffffffffffffewtrettrytrytrytry.com")).isFalse();
        assertThat(NickService.validateNickLen("testgmailrthgfffffffffffffffffffffffffhfhfgh@.comfsdfsdfsssssssffffffffffffffffffffffewtrettrytrytfsrytry.com")).isFalse();
        assertThat(NickService.validateNickLen("")).isFalse();
    }

}
