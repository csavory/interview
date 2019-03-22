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
public class ClockUtilsTests {


	@Test
	public void itShould_getAngleForTwelveOclock() {
		assertThat( ClockUtils.getAcuteAngle( 0, 0 ), is( 0.0f ) );
	}

	@Test
	public void itShould_getAngleForOneThirty() {

	}

	@Test
	public void itShould_getAngleForNineThirty() {

	}

	@Test
	public void itShould_getAngleForSixOclock() {
		assertThat( ClockUtils.getAcuteAngle( 0, 0 ), is( 180.0f ) );
	}
}
