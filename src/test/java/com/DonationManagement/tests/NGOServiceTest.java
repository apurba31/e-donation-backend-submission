package com.DonationManagement.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.DonationManagement.Dto.NGODto;
import com.DonationManagement.Repository.NGORepository;
import com.DonationManagement.Service.NGOServiceImpl;
import com.DonationManagement.testUtils.MasterData;


@WebMvcTest(NGOServiceImpl.class)
@AutoConfigureMockMvc
public class NGOServiceTest {

	@Autowired
	NGOServiceImpl ngoService;
	
	@MockBean
	NGORepository ngoRepository;
	
	@Test
	public void testListAllNGOService() {
		
		List<NGODto> ngoList = MasterData.getNGOList();
		
		when(this.ngoRepository.findAll()).thenReturn(ngoList);
		
		List<NGODto> ngoActual = ngoService.getAllNGOs();
		assertEquals(ngoList, ngoActual);
		
	}
	
}
