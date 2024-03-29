package org.wine.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString



public class SellerBoardPageDTO {

	private int startPage; 
	private int endPage; 
	private boolean prev, next; 
	
	private int total; 
	private CriteriaSellerBoard crisb;
	
	public SellerBoardPageDTO(CriteriaSellerBoard crisb, int total) {
		
		this.crisb = crisb; 
		this.total = total;
		
		this.endPage = (int) (Math.ceil(crisb.getPageNum() / 10.0))* 10;
		
		this.startPage = this.endPage - 9;
		
		int realEnd = (int) (Math.ceil((total * 1.0) / crisb.getAmount()));
		
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		
		this.next = this.endPage < realEnd;
	}
	
	
}
