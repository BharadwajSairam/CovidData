<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link rel="stylesheet"
href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.cs
s">
 <script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"><
/script>
 <script
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
</script>
    <title>Insert title here</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<style>
h2{padding-left:45%;}
div{padding:10px;}
</style>
<body>
    <h2>Covid Cases</h2>
    <div>
    
<a href="/Covid/cases" class="btn btn-primary">Show All</a>
    </div>
    <table class="table table-bordered">
        <tr>
            
            <th> Country</th>
            <th>WHO Region</th>
            <th>Total Cases</th>
            <th>Cases per Million</th>
            <th>Last 7 day cases</th>
            <th>Last 24 hr cases</th>
            <th>Total Deaths</th>
            <th>Deaths per million</th>
            <th>Last 7 day deaths</th>
            <th>Last 24 hr deaths</th>
            <th>Transmission classification</th>

        </tr>
        <tbody>
                <tr>
                   
                    <td>${account.name}</td>
                    <td>${account.whoregion}</td>
                    <td>${account.totalcases}</td>
                    <td>${account.casespermillion}</td>
                    <td>${account.lastsevendaycases}</td>
                    <td>${account.last24hrcases}</td>
                    <td>${account.totaldeaths}</td>
                    <td>${account.deathspermillion}</td>
                    <td>${account.lastsevendaydeaths}</td>
                    <td>${account.last24hrsdeaths}</td>
                    <td>${account.transmissionclassifications}</td>
                </tr>
        </tbody>
    </table>
</body>
</html>