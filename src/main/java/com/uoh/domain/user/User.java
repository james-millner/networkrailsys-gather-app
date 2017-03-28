package com.uoh.domain.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ella Knight on 12/02/2017.
 */
@Entity
@Getter
@Setter
@Data public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    private boolean enabled;

    @Column(length = 20)
    private String role;

}
