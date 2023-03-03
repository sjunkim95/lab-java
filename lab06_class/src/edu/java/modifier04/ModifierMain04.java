package edu.java.modifier04;

public class ModifierMain04 {

    public static void main(String[] args) {

        Member member = new Member("sj", "123");
                
        System.out.println("아이디 " +member.getUserId());
        System.out.println("비밀번호 " +member.getPassword());
        System.out.println("---비밀번호 변경---");
        member.setPassword("456");
        System.out.println(member.getPassword());

    }

}
