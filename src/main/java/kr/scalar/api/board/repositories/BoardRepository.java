package kr.scalar.api.board.repositories;

import kr.scalar.api.board.domains.Article;
import kr.scalar.api.board.domains.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.scalar.api.board.repositories
 * fileName   : BoardRepository
 * author     : parkjungkwan
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   parkjungkwan  최초 생성
 */
interface BoardCustomRepository{
    // 000. 게시판 이름 boardName 을 변경하시오
}
@Repository
public interface BoardRepository extends JpaRepository<Board,Long>{
}
