package com.r2ha.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardDisplayTest {
	@Test
	public void displayTenAsString() {
		Card card = new Card(Suit.CLUBS, Rank.TEN);
		assertThat(ConsoleCard.display(card)).isEqualTo("[30m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
	}
	
	@Test
	public void displayNonTenAsString() {
		Card card = new Card(Suit.CLUBS, Rank.SEVEN);
		assertThat(ConsoleCard.display(card)).isEqualTo("[30m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘");
	}
}
