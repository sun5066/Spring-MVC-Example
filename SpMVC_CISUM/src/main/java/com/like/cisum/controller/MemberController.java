package com.like.cisum.controller;

import com.like.cisum.model.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/cisum")
public class MemberController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("LOGIN_VO") MemberVO memberVO, Model model) {
        model.addAttribute("BODY", "LOGIN");
        return "home";
    }
}