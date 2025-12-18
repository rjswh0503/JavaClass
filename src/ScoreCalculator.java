
public class ScoreCalculator {
	int score;
	
	
	ScoreCalculator(int score){
		this.score = score;
	}
	
	
	int addBonus() {
		this.score += 15;
		return this.multiplyScore();
	}
	
	int multiplyScore() {
		this.score *= 2;
		return this.calculate(5);
	}
	
	int calculate(int bonus) {
		return score + bonus;
	}
	
}
