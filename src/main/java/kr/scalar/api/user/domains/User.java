package kr.scalar.api.user.domains;

import com.sun.istack.NotNull;
import kr.scalar.api.board.domains.Article;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName: net.zerotodev.api.domains
 * fileName   : User
 * author     : parkjungkwan
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   parkjungkwan  최초 생성
 */

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Entity
@Table(name="users")
public class  User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;

    @OneToMany(mappedBy = "u")
    List<Article> a = new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role> roles;
}
