package grupo3.fullstack.apuestas.DTO;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

	public UserDTO(Long user_id, String user_name, String email, String pw, Double wallet, ArrayList<BetDTO> myBets) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.pw = pw;
		this.wallet = wallet;
		this.myBets = myBets;
	}


	private Long user_id;
	private String user_name;
	private String email;
	private String pw;
	private Double wallet;
	private ArrayList<BetDTO> myBets;
	
	
	public UserDTO(String user_name, String email, String pw) {
		this.user_name = user_name;
		this.email = email;
		this.pw = pw;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public Double getWallet() {
		return wallet;
	}


	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}


	public ArrayList<BetDTO> getMyBets() {
		return myBets;
	}


	public void setMyBets(ArrayList<BetDTO> myBets) {
		this.myBets = myBets;
	}

}
