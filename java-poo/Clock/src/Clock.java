public class Clock {
	private ClockHand hours;
	private ClockHand minutes;
	private ClockHand seconds;
	private ClockHand hundredths;

	public Clock() {
		this.hours = new ClockHand(24);
		this.minutes = new ClockHand(60);
		this.seconds = new ClockHand(60);
		this.hundredths = new ClockHand(100);
	}

	public void advance() {
		this.hundredths.advance();

		if (this.hundredths.value() == 0) {
			this.seconds.advance();
			if (this.seconds.value() == 0) {
				this.minutes.advance();

				if (this.minutes.value() == 0) {
					this.hours.advance();
				}
			}
		}
	}

	public String toString() {
		return hours + ":" + minutes + ":" + seconds + ":" + hundredths;
	}
}