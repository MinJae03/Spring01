package com.ga.board.service.impl;

import java.util.List;

import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.ga.board.service.MemberVO;
import com.ga.board.service.impl.MemberDAOImpl;
 
// 현재 클래스를 스프링에서 관리하는 service bean으로 등록
@Service
public class MemberServiceImpl implements MemberService {
    
    // MemberDAOImpl 객체를 스프링에서 생성하여 주입시킴
    @Inject
    MemberDAOImpl memberDao;
    
    @Override
    public List<MemberVO> memberList() {
        return memberDao.memberList();
    }
 
    @Override
    public void insertMember(MemberVO vo) {
        
    }
 
    @Override
    public MemberVO viewMember() {
        return null;
    }
 
    @Override
    public void deleteMember(String userId) {
        
    }
 
    @Override
    public void updateMember(MemberVO vo) {
        
    }
 
}
