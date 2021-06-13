package fr.gostyle.app.dal;

import fr.gostyle.app.domain.Coupon;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CouponRepositoryTest {
    @InjectMocks
    private Coupon Coupon;

    @Mock
    private CouponRepository CouponRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void findByTitre() {
        /*
        Coupon = new Coupon("UUIDici","Titre", 23, null, null, null);

        when(CouponRepository.findByTitre(Coupon.getTitre())).thenReturn((List<fr.gostyle.app.domain.Coupon>) Coupon);

        List<Coupon> CouponFound = CouponRepository.findByTitre("Titre");
        verify(CouponRepository).findByTitre("Titre");
        assertNotNull(CouponFound);
        assertEquals("Titre", CouponFound.getClass().getName());

         */
    }
}
