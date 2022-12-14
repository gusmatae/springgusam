package kr.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import kr.board.entity.Board;

//@Mapper - Mybatis API가 가지고 있는 옵션이라 추가를 해줘야 사용 가능하다.
//매퍼인터페이스와 매퍼파일의 이름이 기본적으로 같아야 한다.
//configuratin file 마이바티스할때 필요한데 스프링에서는 필요없다.
@Mapper
public interface BoardMapper {
	public List<Board> getLists(); //전체리스트 가져오는 메서드
	public void boardInsert(Board vo);
	public Board boardContent(int idx);
	public void boardDelete(int idx);
	public void boardUpdate(Board vo);
	
	@Update("update myboard set count=count+1 where idx=#{idx}")	
	public void boardCount(int idx);
}
