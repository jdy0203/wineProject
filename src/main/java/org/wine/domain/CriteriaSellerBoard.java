package org.wine.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CriteriaSellerBoard {
	
	private int pageNum;
	private int amount;
	
	public CriteriaSellerBoard() {
		this(1,10);
	}
	
	public CriteriaSellerBoard(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;		
	}
	
	
	
	
	
}
