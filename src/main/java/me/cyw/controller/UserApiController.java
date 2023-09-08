package me.cyw.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import me.cyw.dto.AddUserRequest;
import me.cyw.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String singUp(AddUserRequest request) {
        userService.save(request); // 회원가입 메소드 호출
        return "redirect:/login"; // 회원 가입이 완료된 이후에 로그인 페이지로 이동
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest req, HttpServletResponse resp) {
        new SecurityContextLogoutHandler().logout(req, resp, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}
