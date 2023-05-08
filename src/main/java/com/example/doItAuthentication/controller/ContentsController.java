package com.example.doItAuthentication.controller;

import com.example.doItAuthentication.domain.Contents;
import com.example.doItAuthentication.service.ContentsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ContentsController {

    private final ContentsService contentsService;

    @GetMapping("/contents")
    public String contentsList(Model model){
        List<Contents> contentsList = contentsService.contentsList();
        model.addAttribute("contentsList",contentsList);
        if (contentsList != null && contentsList.size() > 0) return "contents/contentsList";
        return "redirect:/";
    }

    @GetMapping("/contents/{contentsId}/edit")
    public String editProductForm(@PathVariable String contentsId, Model model){
        Contents contents = contentsService.findOne(contentsId);
        model.addAttribute("contents",contents);
        return "contents/editContents";
    }

    @PostMapping("/contents/{contentsId}/edit")
    public String editProduct(@PathVariable String contentsId, @RequestParam String selected, @ModelAttribute("contents") ContentsForm form) throws IOException {
        Contents contents = new Contents();
        contentsService.updateItem(form.getId(), form.getContents());
        return "redirect:/contents/";
    }
}
