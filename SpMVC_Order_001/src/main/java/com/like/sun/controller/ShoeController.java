package com.like.sun.controller;

import com.like.sun.model.ShoeVO;
import com.like.sun.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ShoeController {

    @Autowired
    private ShoeService shoeService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String shoeList(Model model) {
        List<ShoeVO> shoeList = shoeService.selectAll();
        model.addAttribute("NIKE", shoeList);
        return "shoe/list";
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String input() {
        return "shoe/input";
    }

    @RequestMapping(value = "/input", method = RequestMethod.POST)
    public String input(@ModelAttribute ShoeVO shoeVO, Model model) {
        shoeService.insert(shoeVO);
        return "redirect:/list";
    }

    @RequestMapping(value = "/shoe")
    public String getShoe(String seq, String name, Model model) {
        long longSeq = 0;
        try {
            longSeq = Long.valueOf(seq);
        } catch (NumberFormatException exception) {
            System.out.println("시퀀스 값이 null 혹은 잘못된 SEQ입니다!");
        }

        ShoeVO shoeVO = shoeService.findById(longSeq);
        model.addAttribute("NIKE", shoeVO);
        return "shoe/detailview";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@ModelAttribute ShoeVO shoeVO, Model model) {
        shoeService.insert(shoeVO);
        return "redirect:/list";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(String s_name, String s_date, String s_amount, String s_qty,
                         Model model) {

        ShoeVO shoeVO = new ShoeVO();
        shoeVO.setS_name(s_name);
        shoeVO.setS_date(s_date);

        try {
            shoeVO.setS_amount(Integer.valueOf(s_amount));
            shoeVO.setS_qty(Integer.valueOf(s_qty));
        } catch (NumberFormatException exception) {
            System.out.println("숫자 변환 오류");
        }
        shoeService.insert(shoeVO);
        System.out.println("상품명 : " + s_name);
        System.out.println("날짜 : " + s_date);
        System.out.println("금액 : " + s_amount);
        return "redirect:/list";
    }

    public String delete(String seq) {
        long longSeq = 0;
        try {
            longSeq = Long.valueOf(seq);
        } catch (NumberFormatException exception) {
            System.out.println("시퀀스 값은 정수만 입력 가능합니다!");
        }

        shoeService.delete(longSeq);
        return "redirect:/list";
    }
}
