<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="CP" value="${pageContext.request.contextPath }" />
<aside id="sidebar">

<style>

.sidebar {
    background: #e9daf8;
    padding: 20px;
    border-radius: 5px;
    display: flex;
    flex-direction: column; /* 버튼을 세로로 정렬 */
    align-items: center;    /* 버튼을 가로로 가운데 정렬 */
    height: calc(100vh - 100px); /* 사이드바 높이 설정 */
    padding-top: 50px; /* 사이드바 버튼을 약간 위로 올림 */
  }
  
  .sidebar ul {
    list-style-type: none;
    padding: 0;
    margin: 0;
    width: 100%;
  }
  
  .sidebar ul li {
    margin-bottom: 20px; /* 버튼 간의 간격을 20px로 설정 */
  }
  
  .sidebar ul li:last-child {
    margin-bottom: 0; /* 마지막 버튼 아래 여백 제거 */
  }
  
  .sidebar-button {
    width: 100%;
    padding: 10px 20px;
    background-color: #5c21a9;
    color: white;
    border: none;
    border-radius: 5px;
    text-align: center;
    cursor: pointer;
    font-size: 16px;
    transition: background-color 0.3s ease;
  }
  
  .sidebar-button:hover {
    background-color: #3a1571; /* 호버 시 색상 변경 */
  }
@media (max-width: 1024px) {
  .sidebar {
    padding-top: 30px; /* 중간 크기 화면에서는 버튼을 더 위로 */
  }
}

@media (max-width: 768px) {
  .sidebar {
    padding-top: 20px; /* 작은 화면에서는 더 위로 정렬 */
  }
}

@media (max-width: 480px) {
  .sidebar {
    padding-top: 10px; /* 모바일에서는 거의 상단에 가까이 */
  }
}
.profile {
  background: #e9daf8;
  display: flex;
  align-items: center;
  width: 100%;
  margin-bottom: 30px; /* 프로필 블록 하단에 30px 여백 추가 */
  padding: 10px; /* 내부 여백 유지 */
  border-radius: 5px;


}

.profile img {
width: 100px;
height: 100px;
border-radius: 50%;
margin-right: 20px; /* 이미지와 텍스트 사이 여백 */ 
}

.profile-info {
display: flex;
flex-direction: column;
}

.profile-info h3, .profile-info p {
margin: 0;
font-size: 14px;
}

</style>

<div class = "sidebar">
      <div class="user">
      <div class="profile">
        <img src="/ehr/resources/assert/images/profile.png" alt="프로필 이미지">
        <div class = "profile-info">
      <h3>부서명</h3>
      <p>이름 직급</p>
      </div>
    </div>
     </div>
  <ul>
    <li><a href="notice.jsp"><button class="sidebar-button">공지사항</button></a></li>
    <li><a href="board.jsp"><button class="sidebar-button">게시판</button></a></li>
    <li><a href="address.jsp"><button class="sidebar-button">주소록</button></a></li>
    <li><a href="payment.jsp"><button class="sidebar-button">전자결재</button></a></li>
    <li><a href="calendar.jsp"><button class="sidebar-button">일정관리</button></a></li>
  </ul>
  </div>
</aside>
