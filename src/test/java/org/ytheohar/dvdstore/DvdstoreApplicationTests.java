package org.ytheohar.dvdstore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ytheohar.dvdstore.DvdstoreApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DvdstoreApplication.class)
@WebAppConfiguration
public class DvdstoreApplicationTests {

	@Test
	public void contextLoads() {
	}

}
