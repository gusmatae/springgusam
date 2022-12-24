package kr.board.mapper;

import java.util.List;

import kr.board.entity.Board;

//@Mapper - Mybatis API
//매퍼인터페이스와 매퍼파일의 이름이 기본적으로 같아야 한다.
//configuratin file 마이바티스할때 필요한데 스프링에서는 필요없다.
public interface BoardMapper {
	public List<Board> getLists();
}
