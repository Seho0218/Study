<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//서버에서 실행되므로 서버로 가져온다는 표현 사용
int num = Integer.parseInt(request.getParameter("num"));
String username = request.getParameter("username");
String tel = request.getParameter("tel");
%>
<hr/>
번호 : <%=num %><br/>
이름 : <%=username %><br/>
연락처 : <%=tel%>

