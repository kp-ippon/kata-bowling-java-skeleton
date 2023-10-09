package tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BowlingGameTest {

	@Test
	void should_be_true_if_installation_work() {
		assertThat(new BowlingGame()).isNotNull();
	}
}
