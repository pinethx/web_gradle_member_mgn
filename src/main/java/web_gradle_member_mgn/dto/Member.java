package web_gradle_member_mgn.dto;

public class Member {
	private String id;
	private String password;
	private String name;
	private int age;
	private String gender;
	private String email;
	
	public Member() {
		super();
	}

	public Member(String id) {
		super();
		this.id = id;
	}

	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public Member(String id, String name, int age, String gender, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public Member(String id, String password, String name, int age, String gender, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passwd) {
		this.password = passwd;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + "]";
	}
	
	
}
