<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Special version of Bootstrap that only affects content wrapped in .bootstrap-iso -->
<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" /> 

<!-- Inline CSS based on choices in "Settings" tab -->
<style>.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p, .bootstrap-iso form{font-family: Arial, Helvetica, sans-serif; color: black}.bootstrap-iso form button, .bootstrap-iso form button:hover{color: white !important;} .asteriskField{color: red;}</style>

<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
<div class="bootstrap-iso">
 <div class="container-fluid">
  <div class="row">
   <div class="col-md-6 col-sm-6 col-xs-12">
    <form method="post" action="/saveCourse">
     <div class="form-group ">
      <label class="control-label " for="CourseId">
       Course Id
      </label>
      <input class="form-control" id="CourseId" name="CourseId" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label " for="CourseName">
       Course Name
      </label>
      <input class="form-control" id="CourseName" name="CourseName" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label " for="CourseDesc">
       Course Description
      </label>
      <textarea class="form-control" cols="40" id="CourseDesc" name="CourseDesc" rows="10"></textarea>
     </div>
     <div class="form-group">
      <div>
       <button class="btn btn-primary " name="submit" type="submit">
        Submit
       </button>
      </div>
     </div>
    </form>
   </div>
  </div>
 </div>
</div>

</body>
</html>