package edu.java.inheritance06;

public class User {
    // field: 사용자 아이디, 비밀번호
    private String id;
    private String pwd;
    
    // 생성자: 기본 생성자, argument를 갖는 생성자.
    public User(){}
    
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        
    }
    
    // getters/setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
    // toString() 재정의: User 객체를 출력할 때, 아이디와 비밀번호가 출력될 수 있도록
    @Override
    public String toString() {
        String printIdPwd = String.format("User(id = %s, pwd = %s)", id, pwd);
        return printIdPwd;

    } 
    

    // equals() 재정의: 아이디가 일치하는 User 객체는 같은 객체.
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        
        if (obj instanceof User) {
            User user = ((User)obj);
            result = this.id.equals(user.id);
            //result = (this.id == user.id);
        }
        return result;
    }
    
    
    // hashCode() 재정의: 아이디가 같으면, 해쉬코드(int)도 같으면 됨.
    @Override
    public int hashCode() {

        return this.id.hashCode();
    }
    
}
