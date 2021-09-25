package com.example.spring_boot_jwt_doanthithanhhong.authen;


import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;




@Getter
@Setter
public class UserPrincipal implements UserDetails {
    private Long userId;
    private String username;
    private String password;
    private Collection authorities;

    public UserPrincipal(Long userId, String username, String password, Collection authorities) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
