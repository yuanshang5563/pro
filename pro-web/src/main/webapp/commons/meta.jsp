<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
request.setAttribute("root", basePath);
%>
<script type="text/javascript" src="${root}/commons/js/jslib/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${root}/commons/js/jslib/jquery.form.js"></script>

