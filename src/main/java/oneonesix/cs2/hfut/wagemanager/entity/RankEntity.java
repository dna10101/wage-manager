package oneonesix.cs2.hfut.wagemanager.entity;

import java.math.BigDecimal;

public class RankEntity {
	private int id;
	private String name;
	private BigDecimal rank_wage;
	public RankEntity(int id, String name, BigDecimal rank_wage) {
		this.id = id;
		this.name = name;
		this.rank_wage = rank_wage;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getRank_wage() {
		return rank_wage;
	}
	
	public void setRank_wage(BigDecimal rank_wage) {
		this.rank_wage = rank_wage;
	}
}
