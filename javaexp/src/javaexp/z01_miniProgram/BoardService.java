package javaexp.z01_miniProgram;

import java.util.ArrayList;
import java.util.List;

public class BoardService {
	
	// 게시글 리스트
	public void getBoradList(List<Board> boards) {
		System.out.println("번호\t제목\t\t작성자");
		System.out.println("----------------------------------------");
		for (int i = 0; i < boards.size(); i++) {
			boards.get(i).getBoardList();
			System.out.println();
			System.out.println("----------------------------------------");
		}
	}
	
	// 게시글 세부내용
	public void getBoardDetail(List<Board> boards, int boardNum) {
		if (boardNum != 0) {
			boards.get(boardNum - 1).getBoardDetail();
		}
	}

}
