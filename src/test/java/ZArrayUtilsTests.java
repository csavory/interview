/*
 *
 * Copyright EdLogics, LLC. All Rights Reserved.
 *
 * This software is the proprietary information of EdLogics, LLC.
 * Use is subject to license terms.
 *
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ZArrayUtilsTests {

	@Test
	public void itShould_test1() {
		assertThat( ZArrayUtils.getNonRepatedNubmer( new int[]{1,5,2,1,3,3,4,5,2}), is( 4 ) );
	}

}
