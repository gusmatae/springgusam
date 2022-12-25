package kr.board.entity;
// 게시판 하나의 구조를 설계
// Lombok API - 세터와 게터를 자동으로 생성
//@Data
public class Board {
	private int idx; //번호
	private String title; //제목
	private String content; //내용
	private String writer; //작성자
	private String indate; //작성일
	private int count; //조회수
	// setter, getter
	public int getIdx() {return idx;}
	public void setIdx(int idx) {this.idx = idx;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	public String getIndate() {return indate;}
	public void setIndate(String indate) {this.indate = indate;}
	public int getCount() {return count;}
	public void setCount(int count) {this.count = count;}
}
