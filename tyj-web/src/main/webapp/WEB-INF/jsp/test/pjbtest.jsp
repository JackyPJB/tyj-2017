<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/2
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pjbTest</title>
</head>
<body>
<h3>Hello WosfsdfsdfdsfdsfPPPPPPPPPPPPPPPPPPPPrld!</h3>
<h2>test111 : ${test111}</h2>
<h2>inserResult : ${insertResult}</h2>
<h1>dizhi : ${dizhi}</h1>
<h1>Date of Birth testClass.date: ${testClass.date}</h1>
<form:form commandName="testClass" action="/test/pjbtest.do" method="post">
    <fieldset>
        <legend>Add an employee</legend>
        <p>
            <form:errors path="name" cssClass="error"/>
        </p>
        <p>
            <label for="name">Date Of Birth: </label>
            <form:input path="name" id="name" />
        </p>

        <p>
            <form:errors path="date" cssClass="error"/>
        </p>
        <p>
            <label for="date">Date Of Birth: </label>
            <form:input path="date" id="date" />
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5"
                   value="Add Employee">
        </p>
    </fieldset>
</form:form>
</body>
</html>
