package fr.gostyle.app.dal;


import fr.gostyle.app.domain.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {

    @InjectMocks
    private User User;

    @Mock
    private UserRepository UserRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void findByEmailAndMdp() {
        User = new User("UUIDici","Test", "george", "User.testgmail.com","1234","adresse", false, null);

        when(UserRepository.findByEmailAndMdp(User.getEmail(), User.getMdp())).thenReturn(User);

        User UserFound = UserRepository.findByEmailAndMdp("User.testgmail.com","1234");
        verify(UserRepository).findByEmailAndMdp("User.testgmail.com", "1234");
        assertNotNull(UserFound);
        assertEquals("User.testgmail.com", UserFound.getEmail());
    }
}
