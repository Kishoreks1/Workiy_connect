//package com.wc.service;
////new add(8/7/24)
//import com.wc.models.Remark;
//import com.wc.models.UserInfo;
//import com.wc.repository.RemarkRepository;
//import com.wc.repository.UserInfoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class RemarkService {
//
//    @Autowired
//    private UserInfoRepository userInfoRepository;
//
//    @Autowired
//    private RemarkRepository remarkRepository;
//
//    public void addRemark(int managerId, int userId, String remarkText) {
//        Optional<UserInfo> managerOpt = userInfoRepository.findById(managerId);
//        Optional<UserInfo> userOpt = userInfoRepository.findById(userId);
//
//        if (managerOpt.isPresent() && userOpt.isPresent()) {
//            UserInfo manager = managerOpt.get();
//            UserInfo user = userOpt.get();
//
//            if ("manager".equalsIgnoreCase(manager.getRole())) {
//                Remark remark = new Remark();
//                remark.setManager(manager);
//                remark.setUser(user);
//                remark.setRemark(remarkText);
//                remarkRepository.save(remark);
//            } else {
//                throw new IllegalArgumentException("User is not a manager");
//            }
//        }
//    }
//
//    public String getRemark(int managerId, int userId) {
//        Optional<UserInfo> managerOpt = userInfoRepository.findById(managerId);
//
//        if (managerOpt.isPresent()) {
//            UserInfo manager = managerOpt.get();
//            if ("manager".equalsIgnoreCase(manager.getRole())) {
//                Optional<Remark> remarkOpt = remarkRepository.findByManagerIdAndUserId(managerId, userId);
//                if (remarkOpt.isPresent()) {
//                    return remarkOpt.get().getRemark();
//                }
//            } else {
//                throw new IllegalArgumentException("User is not a manager");
//            }
//        }
//        return null;
//    }
//}
