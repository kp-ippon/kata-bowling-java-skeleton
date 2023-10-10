package tdd.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BowlingGameTest {

	@Test
	void should_be_true_if_installation_work() {
		Assertions.assertThat(new BowlingGame()).isNotNull();
	}
}
