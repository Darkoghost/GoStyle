package fr.gostyle.app.dal;

import fr.gostyle.app.domain.Produit;
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

public class ProduitRepositoryTest {
    @InjectMocks
    private Produit Produit;

    @Mock
    private ProduitRepository ProduitRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void findByNom() {
        Produit = new Produit("UUIDici","Produit", "desc", null);

        when(ProduitRepository.findByNom(Produit.getNom())).thenReturn((List<fr.gostyle.app.domain.Produit>) Produit);

        List<Produit> ProduitFound = ProduitRepository.findByNom("Produit");
        verify(ProduitRepository).findByNom("Produit");
        assertNotNull(ProduitFound);
        assertEquals("Produit", ProduitFound.getClass().getName());
    }
}
