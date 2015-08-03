<%-- 
    Document   : entryEdit
    Created on : Mar 30, 2015, 1:55:46 PM
    Author     : SYUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title><spring:message code="messages.entryedit.title"/></title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
   
    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap-theme.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../css/signin.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

     <%@include file="header.jspf" %>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1><spring:message code="messages.entryedit.greeting"/></h1>
        <p><spring:message code="messages.entryedit.info"/></p>
        <p>
            <a class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/overview.htm" id="overview"><span class="glyphicon glyphicon-home" aria-hidden="true"></span><spring:message code="messages.homebutton"/></a>
        </p>
      </div>
    </div>

    <div class="container">
      <form action="${pageContext.request.contextPath}/entryEdit/saveEntry/${entry.title}.htm" method="POST" commandName="overview">
          <div class="form-group">
            <label for="title"><spring:message code="messages.entrytitle"/></label>
            <input type="text" class="form-control" id="title" name="title" value="${entry.title}" disabled >
          </div>
          
         <div class="form-group">
            <label for="colour"><spring:message code="messages.entrycolour"/></label>
            <select class="form-control" name="colour">
              <option><spring:message code="messages.colourred"/></option>
              <option><spring:message code="messages.colourgreen"/></option>
              <option><spring:message code="messages.colourblue"/></option>
              <option><spring:message code="messages.colouryellow"/></option>
              <option><spring:message code="messages.colourwhite"/></option>
              <option><spring:message code="messages.colourblack"/></option>
              <option><spring:message code="messages.colourgrey"/></option>
            </select>
          </div>
  
         <div class="form-group">
            <label for="summary"><spring:message code="messages.entrysummary"/></label>
            <textarea class="form-control" rows="6" id="entrySummary" name="summary" ><c:out value="${entry.summary}"></c:out></textarea>
         </div>
         
      <input class="btn btn-success" type="submit" name="action" value="<spring:message code="messages.savebutton"/>"/>
     </form>
    </div>
    
    <%@include file="footer.jspf" %>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
