package grupo3.fullstack.apuestas.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class BetDTO {

	private Long bet_id;
	private Long user_id;
	private Long match_id;
	// private String bet_type; //De momento no hace falta ya que solo vamos a desarrollar un tipo de apuesta
	private double bet_cash;
	private String bet; // 1x2
	public Long getBet_id() {
		return bet_id;
	}
	public void setBet_id(Long bet_id) {
		this.bet_id = bet_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getMatch_id() {
		return match_id;
	}
	public void setMatch_id(Long match_id) {
		this.match_id = match_id;
	}
	public double getBet_cash() {
		return bet_cash;
	}
	public void setBet_cash(double bet_cash) {
		this.bet_cash = bet_cash;
	}
	public String getBet() {
		return bet;
	}
	public void setBet(String bet) {
		this.bet = bet;
	}
	
}
