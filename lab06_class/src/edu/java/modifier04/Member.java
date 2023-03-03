package edu.java.modifier04;

/*
 * field: 아이디, 비밀번호
 * constructor: argument 2개를 갖는 생성자.
 * method: 아이디 getter, 비밀번호 getter/setter.
 */
public class Member {
    // field
    private String userId;
    private String password;
    
    // constructor
    public Member(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
    
    // 아이디 메서드 getter
    public String getUserId() {
        return this.userId; 
    }
    
    // 비밀번호 메서드 getter
    public String getPassword() {
        return this.password; 
    }

    // 비밀번호 메서드 setter
    public void setPassword(String password) {
        this.password = password;
    }

}
