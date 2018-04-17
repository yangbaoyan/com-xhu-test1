 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="span10 last">
		<div class="topNav clearfix">
			<ul>
			   <s:if test="#session.existuser == null">
			      <li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a href="${pageContext.request.contextPath}/user_loginPage.action">登录</a>|
				 </li>
				 <li id="headerRegister" class="headerRegister" style="display: list-item;">
					<a href="${pageContext.request.contextPath}/user_registPage">注册</a>|
				 </li>
			   
			   </s:if>
			   <s:elseif test="#session.existuser != null">
			       <li id="headerLogin" class="headerLogin" style="display: list-item;">
					  欢迎${sessionScope.existuser.username}&nbsp;|
				   </li>
				   <li id="headerRegister" class="headerRegister" style="display: list-item;">
					  <a href="#">我的订单</a>|
				   </li>
				   <li id="headerRegister" class="headerRegister" style="display: list-item;">
					  <a href="${pageContext.request.contextPath}/user_quit.action">退出</a>|
				    </li>
			   </s:elseif>
			
				
				<li id="headerUsername" class="headerUsername"></li>
				<li id="headerLogout" class="headerLogout">
					<a>[退出]</a>|
				</li>
						<li>
							<a>会员中心</a>
							|
						</li>
						<li>
							<a>购物指南</a>
							|
						</li>
						<li>
							<a>关于我们</a>
							
						</li>
			</ul>
		</div>
		<div class="cart">
			<a  href="./购物车.htm">购物车</a>
		</div>
			<div class="phone">
				客服热线:
				<strong>96008/53277764</strong>
			</div>
	</div>
	
	
	
	
	<div class="span24">
		<ul class="mainNav">
					<li>
						<a href="${pageContext.request.contextPath}/index.action">首页</a>
						|
					</li>
				<s:iterator value="#session.clist" var="c">
				     <li><a href="${pageContext.request.contextPath}/product_findByCid.action?cid=<s:property value="#c.cid"/>&pageno=1"><s:property value="#c.cname"/></a> |</li>
				</s:iterator>
		</ul>
	</div>