package grupo3.fullstack.apuestas.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class MatchDTO {
	
	private Long match_id;
	private Date match_date;
	private Integer time;
	private String[] teams;
	private Double[] cuotes; // Creacion de un objeto cuota para guardar los tres tipos de cuota en una sola variable
	// private boolean directo;
	public Long getMatch_id() {
		return match_id;
	}
	public void setMatch_id(Long match_id) {
		this.match_id = match_id;
	}
	public Date getMatch_date() {
		return match_date;
	}
	public void setMatch_date(Date match_date) {
		this.match_date = match_date;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public String[] getTeams() {
		return teams;
	}
	public void setTeams(String[] teams) {
		this.teams = teams;
	}
	public Double[] getCuotes() {
		return cuotes;
	}
	public void setCuotes(Double[] cuotes) {
		this.cuotes = cuotes;
	}

}
