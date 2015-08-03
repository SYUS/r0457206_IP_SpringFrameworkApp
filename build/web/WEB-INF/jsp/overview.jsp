<%-- 
    Document   : overview
    Created on : Mar 30, 2015, 1:52:58 PM
    Author     : SYUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title><spring:message code="messages.overview.title"/></title>

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
          <h1><spring:message code="messages.overview.greeting"/><br><c:out value="${sessionScope.userName}"/>!</h1>
        <p><spring:message code="messages.overview.info"/></p>
        <!-- <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p> -->
      </div>
    </div>
        
    <c:if test="${entries ne null}">
    <div class="container">
       
      <!-- Example row of columns -->
      <h1><spring:message code="messages.overview.recentinfo"/></h1>
      <div class="row">
          
        <!-- I should try to display the latest entries instead of the first ones in the list -->  
        <div class="col-md-4">
          <h2><c:out value="${entries[0].title}"/></h2>
          <h3><c:out value="${entries[0].date}"/></h3>
          <p><c:out value="${entries[0].summary}"/></p>
          <p>
            <a class="btn btn-success" role="button" href="${pageContext.request.contextPath}/entryView/${entries[0].title}.htm" id="entryView"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span><spring:message code="messages.viewbutton"/></a>
            <a class="btn btn-warning" role="button" href="${pageContext.request.contextPath}/entryEdit/${entries[0].title}.htm" id="entryEdit"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span><spring:message code="messages.editbutton"/></a>
          </p>
        </div>
        
        <div class="col-md-4">
          <h2><c:out value="${entries[1].title}"/></h2>
          <h3><c:out value="${entries[1].date}"/></h3>
          <p><c:out value="${entries[1].summary}"/></p>
          <p>
            <a class="btn btn-success" role="button" href="${pageContext.request.contextPath}/entryView/${entries[1].title}.htm" id="entryView"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span><spring:message code="messages.viewbutton"/></a>
            <a class="btn btn-warning" role="button" href="${pageContext.request.contextPath}/entryEdit/${entries[1].title}.htm" id="entryEdit"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span><spring:message code="messages.editbutton"/></a>
          </p>
        </div>
        
        <div class="col-md-4">
          <h2><c:out value="${entries[2].title}"/></h2>
          <h3><c:out value="${entries[2].date}"/></h3>
          <p><c:out value="${entries[2].summary}"/></p>
          <p>
            <a class="btn btn-success" role="button" href="${pageContext.request.contextPath}/entryView/${entries[2].title}.htm" id="entryView"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span><spring:message code="messages.viewbutton"/></a>
            <a class="btn btn-warning" role="button" href="${pageContext.request.contextPath}/entryEdit/${entries[2].title}.htm" id="entryEdit"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span><spring:message code="messages.editbutton"/></a>
          </p>
        </div>
        
      </div>
      <hr>
    </div>
    </c:if>
    
    <c:if test="${entries eq null}">
        <div class="jumbotron">
      <div class="container">
          <h1><spring:message code="messages.entrynew.direct"/></h1>
          <h2><a class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/entryNew.htm" id="overview"><span class="glyphicon glyphicon-home" aria-hidden="true"></span><spring:message code="messages.header.menuentrynew"/></a></h2>
      </div>
    </div>
    </c:if>
        
    <c:if test="${entries ne null}">    
    <div class="container">
     <!-- Example row of columns -->
     <h1><spring:message code="messages.overview.overviewinfo"/></h1>
    <table class="table table-hover">
        <thead>
            <tr>
                <th><spring:message code="messages.entrytitle"/></th>
                <th><spring:message code="messages.entrycolour"/></th>
                <th><spring:message code="messages.entrydate"/></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="entry" items="${entries}">
                <tr>
                    <td><c:out value="${entry.title}"/></td>
                    <td><c:out value="${entry.colour}"/></td>
                    <td><c:out value="${entry.date}"/></td>
                    <td><a class="btn btn-success" role="button" href="${pageContext.request.contextPath}/entryView/${entry.title}.htm" id="entryView"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span><spring:message code="messages.viewbutton"/></a></td>
                    <td><a class="btn btn-warning" role="button" href="${pageContext.request.contextPath}/entryEdit/${entry.title}.htm" id="entryEdit"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span><spring:message code="messages.editbutton"/></a></td>
                    <!-- <td><a class="btn btn-danger" role="button" href="${pageContext.request.contextPath}/entryDelete/${entry.title}.htm" id="entryDelete"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Delete</a></td> -->
		</tr>
            </c:forEach>
        </tbody>
    </table>
    </div>
    </c:if>
    
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