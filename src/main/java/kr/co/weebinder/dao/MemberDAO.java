package kr.co.weebinder.dao;

import kr.co.weebinder.dto.Member;

import java.util.List;

public interface MemberDAO {
    public List<Member> memberList() throws Exception;
    public Member getMember(String id) throws Exception;
    public int memberCount() throws Exception;
    public void memberInsert(Member member) throws Exception;
    public void memberEdit(Member member) throws Exception;
    public void memberDelete(String id) throws Exception;
    public Member signIn(String id) throws Exception;
    public Member loginCheck(String id) throws Exception;
    public Member loginAjax(Member member) throws Exception;
}
