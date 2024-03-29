package org.wine.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.wine.domain.SocialWishVO;
//import org.apache.ibatis.annotations.Select;
import org.wine.domain.UserVO;

public interface UserMapper {
	

	public List<UserVO> getList();
	
	public UserVO read(Long userNum);
	
	public void join(UserVO user);
	
	public void joinSelectKey(UserVO user);
	
	public int update(UserVO user);
	
	public int idCheck(String userId); 
	
	public int nicknameCheck(String userNickName); 
	
	public UserVO userLogin(UserVO user);
	
	public UserVO getListByModifyNickName(String loginUserNickName);
	
	public List<SocialWishVO> getwishList(Long userNum);
	
	public int modifyEmail(UserVO user);
	
	public int modifyNickName(UserVO user);
	
	public void modifyBoardWriter(@Param("loginUserNickName") String loginUserNickName,@Param("userNickName") String userNickName);
	
	public void modifySellerBoardWriter(@Param("loginUserNickName") String loginUserNickName,@Param("userNickName") String userNickName);
	
	public void modifyBoardReplyer(@Param("loginUserNickName") String loginUserNickName,@Param("userNickName") String userNickName);
	
	public int modifyPassword(UserVO user);
	
	public int modifyUserInfo(UserVO user);
	
	public int getwishListCnt(Long userNum);
}
