package grupo3.fullstack.apuestas.persistence.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity(name="match")

public class MatchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long match_id;
	private String match_name;
	private Date match_date;
	private Integer time;
	private String[] teams;
	private Double[] cuotes; 
	
	@OneToMany
	@JoinColumn(name="bets")
	private List<BetEntity> bets = new ArrayList();
	public Long getMatch_id() {
		return match_id;
	}
	public void setMatch_id(Long match_id) {
		this.match_id = match_id;
	}
	public String getMatch_name() {
		return match_name;
	}
	public void setMatch_name(String match_name) {
		this.match_name = match_name;
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
