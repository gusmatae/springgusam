package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;

@Controller //브라우저에서 컨트롤러 부터 시작한다.
public class BoardController {

	// boardList.do라는 핸들의 왔을때 처리하는 것을 핸들러매핑이라고 한다.
	// HandlerMapping
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		Board vo = new Board();
		vo.setIdx(1);
		vo.setTitle("게시판실습");
		vo.setContent("게시판실습");
		vo.setWriter("김태경");
		vo.setIndate("2022-05-10");
		vo.setCount(0);
		
		List<Board> list = new ArrayList<Board>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		model.addAttribute("list", list);
		return "boardList";// /WEB-INF/views/boardList.jsp -> forward
	}
	
}
