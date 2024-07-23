//package com.wc.controllers;
////new add(8/7/24)
//import com.wc.models.UserInfo;
//import com.wc.service.RemarkService;
//import com.wc.repository.UserInfoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//public class RemarkController {
//
//    @Autowired
//    private RemarkService remarkService;
//
//    @Autowired
//    private UserInfoRepository userInfoRepository;
//
//    @GetMapping("/remark")
//    public String getRemarkForm(Model model) {
//        List<UserInfo> users = userInfoRepository.findAll();
//        model.addAttribute("users", users);
//        return "remarkForm";
//    }
//
//    @PostMapping("/remark")
//    public String addRemark(@RequestParam int managerId, @RequestParam int userId, @RequestParam String remark) {
//        remarkService.addRemark(managerId, userId, remark);
//        return "redirect:/remark";
//    }
//
//    @GetMapping("/remark/view")
//    public String viewRemark(@RequestParam int managerId, @RequestParam int userId, Model model) {
//        String remark = remarkService.getRemark(managerId, userId);
//        model.addAttribute("remark", remark);
//        return "viewRemark";
//    }
//}
