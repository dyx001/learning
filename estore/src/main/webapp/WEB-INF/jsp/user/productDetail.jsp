<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--文件头开始-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
		<%@include file="../header.jsp" %>

<!--文件体开始-->
		<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
		<td height=25 valign=middle>
                  <img src="images/Forum_nav.gif" align="middle">
                  <a href=index.jsp>杰普电子商务门户</a> → 产品明细
                </td>
                </tr>
		</table>
              <br>

		<table cellpadding=3 cellspacing=1 align=center class=tableborder1>
		<tr>
			<td valign=middle align=center height=25 background="images/bg2.gif" colspan="2"><p><font color="#ffffff"><b>${book.name }</b></font></td>
		</tr>
		<tr>
			<td class=tablebody1 valign=middle align=center width="20%">【
			作&nbsp; 者 】</td>
			<td class=tablebody1 valign=middle width="80%">&nbsp;&nbsp;${book.author }</td>
		</tr>
		<tr>
			<td class=tablebody1 valign=middle align=center width="20%">【
			价&nbsp; 格 】</td>
			<td class=tablebody1 valign=middle width="80%">&nbsp;&nbsp;${book.price }</td>
		</tr>
		<tr>
			<td class=tablebody1 valign=middle align=center width="">【出 版 社】</td>
			<td class=tablebody1 valign=middle width="">&nbsp;&nbsp;${book.publisher }</td>
		</tr>
		<tr>
			<td class=tablebody1 valign=middle align=center width="">【 书&nbsp; 号
			】</td>
			<td class=tablebody1 valign=middle width="">&nbsp;&nbsp;${book.bookNum }</td>
		</tr>
		<tr>
			<td class=tablebody1 valign=middle align=center width="">【 页&nbsp; 码
			】</td>
			<td class=tablebody1 valign=middle width="">&nbsp;&nbsp;${book.pageNum }</td>
		</tr>
		<tr>
			<td class=tablebody1 valign=middle align=center width="">【所属类别】</td>
			<td class=tablebody1 valign=middle width="">&nbsp;&nbsp;${book.category }</td>
		</tr>
		<tr>
			<td class=tablebody1 align=center width="" valign="top">【 简&nbsp; 介
			】</td>
			<td class=tablebody1 valign=middle width="">${book.description }</td>
		</tr>
		<tr>
			<td class=tablebody1 valign=middle align=center width="">　</td>
			<td class=tablebody1 valign=middle width="">&nbsp;&nbsp;<img border="0" src="images/product/zcover2.gif" width="127" height="180"></td>
		</tr>
		<tr>
			<td class=tablebody2 valign=middle align=center colspan="2"><a href="/cart/add/${book.id }">
			<img border="0" src="images/buycar.gif" width="92" height="21"></a> </td>
		</tr>
		</table>

<!--文件尾开始-->
		
		<%@include file="../footer.jsp" %>
		
	</body>
</html>
