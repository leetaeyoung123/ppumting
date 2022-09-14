# ppumting
  *  다른 사람과 같이 운동하고 싶어 하는 사람들을 위한 만남 서비스 및 전문적인 PT 서비스 제공 사이트

## 팀 구성
* 총 5명 
  * [이태영](https://github.com/leetaeyoung123) 
  * [한태우](https://github.com/workhan0918) 
  * [박상규](https://github.com/parkSangGyu98) 
  * [이성호](https://github.com/LeeSeongHo7984)
  * [백기열](https://github.com/BaekKiYeol)
  
## 개발환경 및 사용한 기술
* Window
* eclipse
* Java
* Servlet
* Jsp
* MySQL
* HTML/CSS3
* Tomcat

## 주요 기능
* 사용자
  * 로그인, 로그아웃
  * 회원가입, 수정, 탈퇴
  * 게시판 등록, 삭제, 수정
  * 포인트 계좌 생성, 조회, 충전, 차감
  * 쪽지 발송, 답장, 조회, 삭제
    
* 트레이너
  * 회원가입, 로그인, 로그아웃
  
## 담당 기능
* 회원가입
* 회원 탈퇴
* 로그인
* 로그아웃
* 개인정보 수정

## 담당 코드
* 회원가입
``` java
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String phone = request.getParameter("phone");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		
		List<String> errorMsgs = new ArrayList<>();
		if(userId == null || userId.length() == 0) {
			errorMsgs.add("id를 입력해주세요,");		
		}else if(pw == null || pw.length() == 0) {
			errorMsgs.add("비밀번호를 입력해주세요");
		}else if(name == null || name.length() == 0) {
			errorMsgs.add("이름을 입력해주세요");
		}else if(ssn == null || ssn.length() == 0) {
			errorMsgs.add("주민번호를 입력해주세요");
		}else if(phone == null || phone.length() == 0) {
			errorMsgs.add("전화번호를 입력해주세요");
		}else if(addr1 == null || addr1.length() == 0 || 
				addr2 == null || addr2.length() == 0) {
			errorMsgs.add("주소를 입력해주세요");
		}
		
		RequestDispatcher dispatcher = null;
		if(errorMsgs.size() > 0) {
			dispatcher = request.getRequestDispatcher("error.jsp");
			request.setAttribute("errorMsgs", errorMsgs);
			dispatcher.forward(request, response);
			return;
		}

		
		User user = new User();
		user.setUserId(userId);
		user.setPw(pw);
		user.setName(name);
		user.setSsn(ssn);
		user.setPhone(phone);
		user.setAddr(addr1+ " " + addr2);
		Userservice userService = new Userservice();
		userService.addUser(user);
		pointService.createAccountNum(userId);
		request.setAttribute("user", user);
		response.sendRedirect("../loginout/login");
		return;
	}
}
```

* 회원탈퇴
``` java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
			HttpSession session = request.getSession(false);
			String userId = (String) session.getAttribute("userId");

			String pw = request.getParameter("pw");
			String ssn = request.getParameter("ssn");
			pointService.deleteAccount(userId);
			userService.delete(userId, pw, ssn);
			
			session.setAttribute("userId", userId);
			response.sendRedirect("../loginout/login");
	}
	
}
```

## 담당 구현화면
### 사용자 로그인

![login](https://user-images.githubusercontent.com/100547893/190106775-c96747f2-dd55-46fd-b41b-b7884d1a5287.png)

### 회원가입

![signup](https://user-images.githubusercontent.com/100547893/190106809-e9281704-0844-4200-8212-9e2e8b8721f4.png)


### 정보수정 및 회원탈퇴


![updatedelet](https://user-images.githubusercontent.com/100547893/190106871-18d676c7-3589-4ac0-ba7c-541e70c4efd5.png)

## 전체 구현화면

### 메인

![main](https://user-images.githubusercontent.com/100547893/190107189-c5e910cd-e5aa-4a39-b76b-0a1a34fe0c12.png)

### 게시판

![board](https://user-images.githubusercontent.com/100547893/190107241-b102c764-2f3c-49d8-afe5-37ace03eb8f3.png)

### 게시글 쓰기

![boardadd](https://user-images.githubusercontent.com/100547893/190107389-11beb464-c8aa-4a04-903a-239442ef7646.png)


### 게시글 보기

![boardsee](https://user-images.githubusercontent.com/100547893/190107420-8b6d7bf5-0aa9-473c-a9e1-51a0d852e8c2.png)


### 게시글 수정

![boardupdate](https://user-images.githubusercontent.com/100547893/190107463-369e336b-1f10-478a-9420-226c16f1304d.png)

### 포인트 충전

![cash](https://user-images.githubusercontent.com/100547893/190107520-b43f6bca-a7b2-426a-a6d6-372237afa134.png)

