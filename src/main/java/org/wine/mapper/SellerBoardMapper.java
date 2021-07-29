package org.wine.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.wine.domain.CriteriaSellerBoard;
import org.wine.domain.SellerBoardVO;


public interface SellerBoardMapper {
	
	public List<SellerBoardVO> getList();
	
	public List<SellerBoardVO> getListWithPaging(CriteriaSellerBoard crisb);
	
	public void insert(SellerBoardVO board);
	
	public void insertSelectKey(SellerBoardVO board);
	
	public SellerBoardVO read(Long sellerBno);
	
	public SellerBoardVO readAnswer(Long parentSellerBno);
	
	public SellerBoardVO getAnswer(Long parentSellerBno);
	
	public int update(SellerBoardVO board);
	
	public int delete(Long parentSellerBno);
	
	public int answerDelete(Long parentSellerBno);
		
	public void insertAnswerSelectKey(SellerBoardVO board);
	
	public SellerBoardVO answerBtn(Long parentSellerBno);
}
