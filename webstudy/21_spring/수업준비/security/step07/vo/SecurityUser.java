package kr.co.mlec.security.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

@Getter
public class SecurityUser extends User {
	private static final long serialVersionUID = 1L;
	private Member member;
	public SecurityUser(Member vo, Collection<? extends GrantedAuthority> list) {
		super(vo.getId(), vo.getPassword(), list);
		this.member = vo;
	}
}
